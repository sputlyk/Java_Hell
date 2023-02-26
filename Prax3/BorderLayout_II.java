import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class BorderLayout_II implements ActionListener 
{ 
    JFrame frame = new JFrame("Layout"); 
    JButton b1, b2, b3, b4, b5; 
    BorderLayout borderLay = new BorderLayout(); 
    
    public BorderLayout_II() 
    {
        b1 = new JButton("East"); 
        b2 = new JButton("North"); 
        b3 = new JButton("West"); 
        b4 = new JButton("South"); 
        b5 = new JButton("Origin"); 
        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        b5.addActionListener(this); 
        frame.add(b1, borderLay.EAST); 
        frame.add(b2, borderLay.NORTH); 
        frame.add(b3, borderLay.WEST); 
        frame.add(b4, borderLay.SOUTH); 
        frame.add(b5, borderLay.CENTER); 
        frame.setSize(350, 350); 
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
 
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == b1) 
    { 
        JOptionPane.showMessageDialog(frame, b1.getText() + " is clicked");  } else if (e.getSource() == b2) 
    { 
        JOptionPane.showMessageDialog(frame, b2.getText() + " is clicked");  } else if (e.getSource() == b3) 
    { 
        JOptionPane.showMessageDialog(frame, b3.getText() + " is clicked");  } else if (e.getSource() == b4) 
    { 
        JOptionPane.showMessageDialog(frame, b4.getText() + " is clicked");  } else if (e.getSource() == b5) 
    { 
        JOptionPane.showMessageDialog(frame, b5.getText() + " is clicked");
    } 
    } 
    public static void main(String[] args) 
    { 
        new BorderLayout_II(); 
    } 
}