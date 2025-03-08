import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

class TrafficLight extends JFrame implements ActionListener {  
    private JTextField display;  
    private JRadioButton r1, r2, r3;  
    private ButtonGroup bg;  
    private Container c;  

    // Constructor  
    public TrafficLight() {  
        setLayout(new FlowLayout());  
        setTitle("TRAFFIC LIGHT");  
        c = getContentPane();  

        // Initialize components  
        display = new JTextField(10);  
        r1 = new JRadioButton("RED");  
        r2 = new JRadioButton("GREEN");  
        r3 = new JRadioButton("YELLOW");  
        bg = new ButtonGroup();  

 
