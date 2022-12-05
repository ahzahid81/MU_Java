import java.awt.Color;
import java.awt.Graphics;
// Labels
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class DrawSmiley extends JPanel
{
    private JLabel label1;

    public void paintComponent (Graphics g)
    {

        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,200);
        // Eye
        g.setColor(Color.BLACK); 
        g.fillOval(55, 65, 30, 30); 
        g.fillOval(135, 65, 30, 30);

        // Mouth
        g.fillOval(50, 110, 120, 60);



        g.setColor(Color.YELLOW); 
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
        // nose
        g.setColor(Color.BLACK); 
        g.fillRect(100, 110, 10, 10);
        g.fillOval(100, 110, 15, 15);
    }

    public DrawSmiley()
    {
        
        label1 = new JLabel( "Label with text" );
        label1.setToolTipText( "This is label1" );
        label1.setHorizontalTextPosition( SwingConstants.CENTER );
        label1.setVerticalTextPosition( SwingConstants.BOTTOM );
        add( label1 );
    }


    public static void main(String[] args) {
        
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230,250);
        application.setVisible(true);
    }
}



