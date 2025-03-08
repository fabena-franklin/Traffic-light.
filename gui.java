import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

class TrafficLight extends JFrame implements ActionListener {  
    private JTextField display;  
    private JRadioButton r1, r2, r3;  
    private ButtonGroup bg;  
    private Container c;  

    // Constructor  
    public gui() {  
        // Set frame properties  
        setTitle("TRAFFIC LIGHT");  
        setSize(400, 400);  
        setLayout(new FlowLayout());  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        // Get content pane  
        c = getContentPane();  
        c.setBackground(Color.PINK);  

        // Initialize components  
        display = new JTextField(15);  
        display.setEditable(false);  // Prevent user input  

        r1 = new JRadioButton("RED");  
        r2 = new JRadioButton("GREEN");  
        r3 = new JRadioButton("YELLOW");  

        // Group radio buttons so only one can be selected at a time  
        bg = new ButtonGroup();  
        bg.add(r1);  
        bg.add(r2);  
        bg.add(r3);  

        // Add action listeners to radio buttons  
        r1.addActionListener(this);  
        r2.addActionListener(this);  
        r3.addActionListener(this);  

        // Add components to the container  
        c.add(r1);  
        c.add(r2);  
        c.add(r3);  
        c.add(display);  

        // Make the frame visible  
        setVisible(true);  
    }  

    // Event handler for button clicks  
    public void actionPerformed(ActionEvent ie) {  
        String msg = ie.getActionCommand();  

        if (msg.equals("RED")) {  
            c.setBackground(Color.RED);  
            display.setText("TURN ON: RED");  
        } else if (msg.equals("GREEN")) {  
            c.setBackground(Color.GREEN);  
            display.setText("TURN ON: GREEN");  
        } else if (msg.equals("YELLOW")) {  
            c.setBackground(Color.YELLOW);  
            display.setText("TURN ON: YELLOW");  
        }  
    }  

    // Main method  
    public static void main(String[] args) {  
        new gui();  
    }  
}
