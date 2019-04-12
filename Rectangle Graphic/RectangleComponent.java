import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;

/**
  Walther Alvarez
  CISC 500
  Assignment #11
  This component displays two rectangles that can move in opposite directions. 
*/
public class RectangleComponent extends JComponent
{ 
  private static final int RECTANGLE_WIDTH = 20;
  private static final int RECTANGLE_HEIGHT = 30;

    private int xLeft1;
    private int yTop1;
    private int xLeft2;
    private int yTop2;

    public RectangleComponent()
    {
        xLeft1 = 0;
        yTop1 = 100;

        xLeft2 = 260;
        yTop2 = 200;
    }

    public void paintComponent(Graphics r)
    {
        r.setColor(Color.ORANGE);
        r.fillRect(xLeft1, yTop1, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
        r.setColor(Color.BLUE);
        r.fillRect(xLeft2, yTop2, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
    }

/**
 * Moves the rectangle by a given amount
 * @return dx the amount to move in the x-direction
 * @return dy the amount to move in the y-direction
 */
    public void moveRectangleBy(int dx, int dy)
    {
    xLeft1 = xLeft1 + dx;
    yTop1 = yTop1 + dy;
    xLeft2 = xLeft2 - dx;
    yTop2 = yTop2 - dy;
    repaint();
    }
}