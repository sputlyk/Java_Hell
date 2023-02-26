import java.awt.*;
import java.awt.event.*;

public class BorderLayout_I 
{
    Frame frame;
    Panel p1, p2;
    Label l1, l2;

    public BorderLayout_I() 
    {
        frame = new Frame("Border Layout Demonstration");
        p1 = new Panel();
        p2 = new Panel();

        l1 = new Label("Panel 1 - Default Constructor", Label.CENTER);
        l1.setBounds(0, 35, 300, 30);

        l2 = new Label("Panel 2 - Parameterized Con(2)", Label.CENTER);
        l2.setBounds(300, 35, 300, 30);

        p1.setBounds(0, 65, 300, 300);
        p1.setLayout(new BorderLayout()); // Ex of Default Constructor
        createPanel(p1);

        p2.setBounds(300, 65, 300, 300);
        p2.setLayout(new BorderLayout(40, 40)); // Ex of parameterized Constructor (2 parameter)
        p2.setBackground(Color.LIGHT_GRAY);
        createPanel(p2);
        
        frame.add(l1);
        frame.add(l2);
        
        frame.add(p1);
        frame.add(p2);
        
        frame.setLayout(null);
        frame.setSize(600, 375);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                frame.dispose();
            }
        });
    }

    public void createPanel(Panel p) 
    {
        p.add(new Button("EAST"), BorderLayout.EAST);
        p.add(new Button("WEST"), BorderLayout.WEST);
        p.add(new Button("NORTH"), BorderLayout.NORTH);
        p.add(new Button("SOUTH"), BorderLayout.SOUTH);
        p.add(new Button("CENTER"), BorderLayout.CENTER);
    }

    public static void main(String[] args) 
    {
        BorderLayout_I bl = new BorderLayout_I();
    }
}
