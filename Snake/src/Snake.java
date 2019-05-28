
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<Node> body;
    private Direction direction;
    private int remainGrow;
    private int score;
    public boolean gameOver;
    public boolean turning;
    public boolean player2;
    public Direction nextMove;

    public Snake(int numNodes) {
        direction = Direction.RIGHT;
        body = new ArrayList<Node>();
        for (int i = 0; i < numNodes; i++) {
            body.add(new Node((SingleObject.getInstance().numRows / 2), (SingleObject.getInstance().numCols / 2) - i));

        }
        remainGrow = 0;
        turning = false;
        gameOver = false;
    }

    public Snake(int numNodes, boolean player2) {
        direction = Direction.RIGHT;
        body = new ArrayList<Node>();
        for (int i = 0; i < numNodes; i++) {
            body.add(new Node((SingleObject.getInstance().numRows / 4), (SingleObject.getInstance().numCols / 2) - i));

        }
        this.player2 = player2;
        remainGrow = 0;
        turning = false;
        gameOver = false;
    }

    public void paint(Graphics2D g, int squareWidth, int squareHeight) {
        for (Node node : body) {
            if (!player2) {
                Board.drawSquare(g, squareWidth, squareHeight, node.getRow(), node.getCol(), Color.green);
            } else {
                Board.drawSquare(g, squareWidth, squareHeight, node.getRow(), node.getCol(), Color.MAGENTA);
            }
        }
    }

    public boolean isEmpty(Node newNode) {
        for (Node node : body) {
            if (node.getCol() == newNode.getCol() && node.getRow() == newNode.getRow()) {
                return false;
            }
        }
        return true;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction newDirection) {
        direction = newDirection;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    public void addGrows() {
        remainGrow += 1;
    }
    
    public int getScore() {
        return score;
    }

    public void move(Snake player2) {
        Node newNode = new Node(0, 0);

        switch (direction) {

            case UP:
                if (direction != Direction.DOWN) {
                    newNode = new Node(body.get(0).getRow() - 1, body.get(0).getCol());
                }
                break;

            case DOWN:
                if (direction != Direction.UP) {
                    newNode = new Node(body.get(0).getRow() + 1, body.get(0).getCol());
                }
                break;

            case LEFT:
                if (direction != Direction.RIGHT) {
                    newNode = new Node(body.get(0).getRow(), body.get(0).getCol() - 1);
                }
                break;

            case RIGHT:
                if (direction != Direction.LEFT) {
                    newNode = new Node(body.get(0).getRow(), body.get(0).getCol() + 1);
                }
                break;

            default:
                break;
        }
        for (Node node : body) {
            if (newNode.getCol() == node.getCol() && newNode.getRow() == node.getRow()) {
                gameOver = true;
            }
        }

        if (player2 != null) {
            for (Node node : player2.getBody()) {
                if (newNode.getCol() == node.getCol() && newNode.getRow() == node.getRow()) {
                    gameOver = true;
                }
            }
        }

        body.add(0, newNode);

        if (remainGrow == 0) {
            body.remove(body.size() - 1);
        } else {
            remainGrow--;
        }
    }
    
    public List<Node> getBody() {
        return body;
    }

    public void borderCollision() {
        if (body.get(0).getRow() > SingleObject.getInstance().numRows + 1 || body.get(0).getRow() < 0 || body.get(0).getCol() < 0 || body.get(0).getCol() > SingleObject.getInstance().numCols) {
            gameOver = true;
        }
    }

    public boolean eat(Food food) {
        if (body.get(0).getCol() == food.getCol() && body.get(0).getRow() == food.getRow()) {
            if (!food.isSpecial()) {
                remainGrow += 1;
                score += 1000;
            } else {
                remainGrow += 3;
                score += 3000;
            }
            return true;
        }
        return false;
    }

    public void setTurning(boolean turning) {
        this.turning = turning;
    }
}
