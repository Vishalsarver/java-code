import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
class jframe 
{
     public static void main(String[] args)
	{
        JFrame frame = new JFrame("vishu"); 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        JButton closeButton = new JButton("Close");
         contentPane.add(closeButton);
        frame.setBounds(120, 130, 400, 400);
        frame.setVisible(true);
    }
}