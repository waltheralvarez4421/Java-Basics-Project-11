import javax.swing.JFrame;

/** 
   Walther Alvarez
   CISC 500
   Assignment #11
   This program is used to display the moving rectngles. 
*/
public class RectangleFrameViewer
{ 
   public static void main(String[] args)
   { 
      JFrame rectangleFrame = new RectangleFrame();
      rectangleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      rectangleFrame.setTitle("Moving Rectangles");
      rectangleFrame.setVisible(true);
   }
}