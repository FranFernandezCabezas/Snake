
import java.awt.*;
import java.awt.event.*;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {

    private Timer timer;
    private int deltaTime = 100;
    private Snake snake;
    private Snake snake2;
    private Food food;
    private int foods;
    private int neededPoints;
    private int nextLevelticks;
    private boolean isThereAFood;
    private String currentLevel;
    private KeyAdapter keyAdapter;
    private JDialog gameOverDialog;
    private JLabel scoreLabel;
    private JLabel scoreLabel2;
    private JLabel winnerLabel;
    private JLabel nextLevelLabel;
    private JLabel easyLabel;
    private JLabel mediumLabel;
    private JLabel hardLabel;
    private boolean versus;

    public Board() {
        super();
        timer = new Timer(deltaTime, new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                mainLoop();
            }
        });
        keyAdapter = new MyKeyAdapter();
        addKeyListener(keyAdapter);
        versus = false;
        neededPoints = 0;
    }

    public void initGame() {
        foods = 0;
        snake = new Snake(3);
        if (versus) {
            snake2 = new Snake(3, true);
            food = new Food(false, snake, snake2);
        } else {
            food = new Food(false, snake);
        }
        snake.setTurning(false);
        isThereAFood = true;
        timer.start();
        neededPoints = 0;
        deltaTime = 150;
        currentLevel = "easy";
        changeLevel();
        setFocusable(true);
    }

    public void setGameOverDialog(JDialog gameOverDialog) {
        this.gameOverDialog = gameOverDialog;
    }

    public void setScoreLabel(JLabel scoreLabel) {
        this.scoreLabel = scoreLabel;
    }
    
    public void setScoreLabel2(JLabel scoreLabel) {
        this.scoreLabel2 = scoreLabel;
    }
    
    public void setWinnerLabel(JLabel winnerLabel) {
        this.winnerLabel = winnerLabel;
    }
    
    public void setNextLevelLabel(JLabel nextLevelLabel) {
        this.nextLevelLabel = nextLevelLabel;
    }
    
    public void setLevelLabels(JLabel easyLabel, JLabel mediumLabel, JLabel hardLabel) {
        this.easyLabel = easyLabel;
        this.mediumLabel = mediumLabel;
        this.hardLabel = hardLabel;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (snake != null) {
            snake.paint(g2d, getSquareWidth(), getSquareHeight());
        }
        if (versus && snake2 != null) {
            snake2.paint(g2d, getSquareWidth(), getSquareHeight());
        }
        if (food != null) {
            food.paint(g2d, getSquareWidth(), getSquareHeight());
        }
        
    }

    public void tick() {
        snakeTick(snake);
        if (versus) {
            snakeTick(snake2);
        }

        repaint();
        if (nextLevelticks > 0) {
            nextLevelLabel.setVisible(true);
            nextLevelticks--;
        } else {
            nextLevelLabel.setVisible(false);
        }
        Toolkit.getDefaultToolkit().sync();
    }

    public void snakeTick(Snake snake) {
        int player = 0;
        if (snake == this.snake) {
            snake.move(snake2);
            player = 1;
        } else {
            snake2.move(this.snake);
            player = 2;
        }
        snake.borderCollision();
        if (snake.eat(food)) {
            newFood();
            if (player == 1) {
                scoreLabel.setText(snake.getScore()+"pts");
            } else {
                scoreLabel2.setText(snake2.getScore()+"pts");
            }
            checkChangeLevel();
        }
        snake.setTurning(false);
    }

    public void mainLoop() {
        if (versus) {
            if (!snake.gameOver && !snake2.gameOver) {
                tick();
                return;
            }
        } else {
            if (!snake.gameOver) {
                tick();
                return;
            }
        }
        makeGameOver();
    }
    
    public void checkChangeLevel() {
        if (snake.getScore() >= neededPoints) {
            changeLevel();
        }
        if (versus) {
            if (snake2.getScore() + snake.getScore() >= neededPoints) {
                changeLevel();
            }
        }
    }
    
    public void changeLevel() {
        Color color;
        switch(currentLevel) {
            
            case "easy": 
                color = new Color(204, 255, 204);
                easyLabel.setForeground(color);
                color = new Color(153, 153, 153);
                mediumLabel.setForeground(color);
                hardLabel.setForeground(color);
                currentLevel = "medium";
                timer.setDelay(100);
                neededPoints += 10000;
                break;
            case "medium":
                color = new Color(204, 204, 255);
                mediumLabel.setForeground(color);
                color = new Color(153, 153, 153);
                easyLabel.setForeground(color);
                hardLabel.setForeground(color);
                currentLevel = "hard";
                timer.setDelay(75);
                neededPoints += 24000;
                nextLevelticks += 10;
                break;
            case "hard":
                color = new Color(255, 51, 51);
                hardLabel.setForeground(color);
                color = new Color(153, 153, 153);
                easyLabel.setForeground(color);
                mediumLabel.setForeground(color);
                timer.setDelay(50);
                neededPoints += 49000;
                nextLevelticks += 10;
                currentLevel = "hard";
                break;
                
          
        }
        
    }

    public void makeGameOver() {
        timer.stop();
        if (!versus) {
            winnerLabel.setVisible(false);
        } else {
            if (snake.gameOver) {
                winnerLabel.setText("Player 2 wins!");
            } else {
                winnerLabel.setText("Player 1 wins!");
            }
        }
        scoreLabel.setText("0000 pts");
        scoreLabel2.setText("0000 pts");
        gameOverDialog.setVisible(true);
    }

    public int getSquareHeight() {
        return getHeight() / SingleObject.getInstance().numRows;
    }

    public int getSquareWidth() {
        return getWidth() / SingleObject.getInstance().numCols;
    }

    public static void drawSquare(Graphics2D g, int squareWidth, int squareHeight, int row, int col, Color color) {
        int x = col * squareWidth;
        int y = row * squareHeight;
        g.setColor(color);
        g.fillRect(x + 1, y + 1, squareWidth - 2, squareHeight - 2);
        g.setColor(color.brighter());
        g.drawLine(x, y + squareHeight - 1, x, y);
        g.drawLine(x, y, x + squareWidth - 1, y);
        g.setColor(color.darker());
        g.drawLine(x + 1, y + squareHeight - 1, x + squareWidth - 1, y + squareHeight - 1);
        g.drawLine(x + squareWidth - 1, y + squareHeight - 1, x + squareWidth - 1, y + 1);
    }

    class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {

                case KeyEvent.VK_A:
                    if (snake2.getDirection() != Direction.RIGHT && !snake2.turning) {
                        snake2.setDirection(Direction.LEFT);
                        snake2.setTurning(true);
                    }
                    break;

                case KeyEvent.VK_D:
                    if (snake2.getDirection() != Direction.LEFT && !snake2.turning) {
                        snake2.setDirection(Direction.RIGHT);
                        snake2.setTurning(true);
                    }
                    break;

                case KeyEvent.VK_W:
                    if (snake2.getDirection() != Direction.DOWN && !snake2.turning) {
                        snake2.setDirection(Direction.UP);
                        snake2.setTurning(true);
                    }
                    break;

                case KeyEvent.VK_S:
                    if (snake2.getDirection() != Direction.UP && !snake2.turning) {
                        snake2.setDirection(Direction.DOWN);
                        snake2.setTurning(true);
                    }
                    break;

                case KeyEvent.VK_LEFT:
                    if (snake.getDirection() != Direction.RIGHT && !snake.turning) {
                        snake.setDirection(Direction.LEFT);
                        snake.setTurning(true);
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (snake.getDirection() != Direction.LEFT && !snake.turning) {
                        snake.setDirection(Direction.RIGHT);
                        snake.setTurning(true);
                    }
                    break;

                case KeyEvent.VK_UP:
                    if (snake.getDirection() != Direction.DOWN && !snake.turning) {
                        snake.setDirection(Direction.UP);
                        snake.setTurning(true);
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if (snake.getDirection() != Direction.UP && !snake.turning) {
                        snake.setDirection(Direction.DOWN);
                        snake.setTurning(true);
                    }
                    break;

                case KeyEvent.VK_P:
                    pause();
                    break;
            }
        }
    }

    public void pause() {
        if (timer.isRunning()) {
            timer.stop();
        } else {
            timer.start();
        }
    }

    public void newFood() {
        if (!versus) {
            if ((int) (Math.random() * 21) + foods == 20) {
                food = new Food(true, snake);
                foods = 0;
            } else {
                food = new Food(false, snake);
                foods++;
            }
        } else {
            if ((int) (Math.random() * 21) + foods == 20) {
                food = new Food(true, snake, snake2);
                foods = 0;
            } else {
                food = new Food(false, snake, snake2);
                foods++;
            }
        }
    }

    public void setVersus(boolean versus) {
        this.versus = versus;
    }
}
