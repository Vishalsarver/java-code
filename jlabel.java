import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
class jlabel
{
    public static void main(String args[])
	{
     JFrame f = new JFrame("Label");
     f.setLayout(new FlowLayout());
     f.setSize(600, 400);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JLabel label= new JLabel("this is jlabel");
     f.add(label);
     f.setVisible(true);
    }
}