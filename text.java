import java.awt.*;
import java.awt.event.*;
class text extends frame
{
text()
{
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
System.out.println("HELLO");
}
});
}
public static void main(String args[])
{
text t= new text();
t.setSize(500,500);
t.setVisible(true);
t.setTitle("text");
t.setLayout(null);
TextField t1=new TextField("eye1");
t1.setBounds(20,40,60,30);
t.add(t1);
TextField t2,t3;
t2=new TextField("eye2");
t2.setBounds(220,40,60,30);
t3=new TextField("mouth");
t3.setBounds(100,200,90,30);
t.add(t2);
t.add(t3);
}
}

