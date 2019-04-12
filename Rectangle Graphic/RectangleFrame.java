import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame; 
import javax.swing.Timer;

/**  
   Walther Alvarez
   CISC 500
   Assignment #11
   This frame contains a moving rectangle and timer tht allows for the rectangle to move. 
*/
public class RectangleFrame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 400;

   private RectangleComponent scene;

   class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         scene.moveRectangleBy(2, 0);
      }
   }

   public RectangleFrame()
   {
      scene = new RectangleComponent();
      add(scene);
 
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      ActionListener listener = new TimerListener();
 
      final int DELAY = 100; // Milliseconds between timer ticks 
      Timer t = new Timer(DELAY, listener);
      t.start();      
   }
}  
