//Fabena Franklin   
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class gui extends JFrame implements ActionListener
{
   String msg=”  ”;
private JTextField display;
private JRadioButton r1,r2,r3;
private ButtonGroup bg;
private Container c;
    public TrafficLight()
{
 setLayout(new FlowLayout());
setTitle(“TRAFFIC LIGHT”);
c=getContentPane();
display=newJTextField(10);
r1=newJRadioButton(“RED”);
r2=newJRadioButton(“GREEN ”);
r3=newJRadioButton(“YELLOW”);
bg=newButtonGroup();
c.add(frame);
c.add(r1);
c.add(r2);
c.add(r3);
c.add(display);
bg.add(r1);
bg.add(r2);
bg.add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
setSize(400,400);
setVisible(true);
c.setBackground(Color.PINK)

}
public void actionPerformed(ActionEvent ie)
{
  msg=ie.getActionCommand();
if(msg.equals(“RED”))
{
   c.setBackground(Color.RED);
display.setText(”TURN ON:  ”+msg);

}
else if(msg.equals(“GREEN”))
{
c.setBackground(Color.GREEN);
display.setText(“TURN ON  ”+msg);

}
else
{
c.setBackground(color.YELLOW);
display.setText(“TURN ON  :”+msg)
}
}
public static void main(String[]args)
{
TrafficLight light=new TrafficLight();
Light.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

} 





}

