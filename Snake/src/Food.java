
import java.awt.Color;
import java.awt.Graphics2D;

public class Food extends Node {

    private boolean special;

    public Food(boolean special, Snake snake) {
        super(0, 0);

        int x = 0;
        int y = 0;
        Node newNode;
        this.special = special;
        do {
            x = (int) (Math.random() * SingleObject.getInstance().numCols);
            y = (int) (Math.random() * SingleObject.getInstance().numRows);
            newNode = new Node(y, x);
        } while (!snake.isEmpty(newNode));

        setRow(y);
        setCol(x);
    }
    
    public Food(boolean special, Snake snake, Snake snake2) {
        super(0, 0);

        int x = 0;
        int y = 0;
        Node newNode;
        this.special = special;
        do {
            x = (int) (Math.random() * SingleObject.getInstance().numCols);
            y = (int) (Math.random() * SingleObject.getInstance().numRows);
            newNode = new Node(y, x);
        } while (!snake.isEmpty(newNode) || !snake2.isEmpty(newNode));
        setRow(y);
        setCol(x);
    }

    public void paint(Graphics2D g, int squareWidth, int squareHeight) {

        if (!isSpecial()) {
            Board.drawSquare(g, squareWidth, squareHeight, getRow(), getCol(), Color.red);
        } else {
            Board.drawSquare(g, squareWidth, squareHeight, getRow(), getCol(), Color.ORANGE);
        }
    }

    public boolean isSpecial() {
        return special;
    }
}
