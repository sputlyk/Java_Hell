import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Flow_II implements ActionListener 
{
    JFrame frame = new JFrame("3020_Flow_II");
    JButton b1, b2, b3, b4, b5;
    FlowLayout flowLay = new FlowLayout();

    public Flow_II() 
    {
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.setLayout(flowLay);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == b1) 
        {
            JOptionPane.showMessageDialog(frame, b1.getText() + " is clicked");
        } else if (e.getSource() == b2) 
        {
            JOptionPane.showMessageDialog(frame, b2.getText() + " is clicked");
        } else if (e.getSource() == b3) 
        {
            JOptionPane.showMessageDialog(frame, b3.getText() + " is clicked");
        } else if (e.getSource() == b4) 
        {
            JOptionPane.showMessageDialog(frame, b4.getText() + " is clicked");
        } else if (e.getSource() == b5) 
        {
            JOptionPane.showMessageDialog(frame, b5.getText() + " is clicked");
        }
    }
    
    public static void main(String[] args) 
    {
        new Flow_II();
    }
}