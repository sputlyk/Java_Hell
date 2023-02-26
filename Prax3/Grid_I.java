import java.awt.*;
import java.awt.event.*;

public class Grid_I 
{
    Frame frame;
    Panel p1, p2, p3;
    Label l1, l2, l3;

    public Grid_I() 
    {
        frame = new Frame("Grid Layout Demonstration");

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();

        l1 = new Label("Panel 1 - Default Constructor", Label.CENTER);
        l1.setBounds(0, 35, 250, 30);

        l2 = new Label("Panel 2 - Parameterized Con(2)", Label.CENTER);
        l2.setBounds(250, 35, 250, 30);

        l3 = new Label("Panel 3 - Parameterized Con(4)", Label.CENTER);
        l3.setBounds(500, 35, 250, 30);

        p1.setBounds(0, 65, 250, 150);
        p1.setLayout(new GridLayout());
        createPanel(p1);

        p2.setBounds(250, 65, 250, 150);
        p2.setLayout(new GridLayout(2, 3));
        createPanel(p2);

        p3.setBounds(500, 65, 250, 150);
        p3.setLayout(new GridLayout(3, 2, 40, 25));
        createPanel(p3);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);

        frame.setLayout(null);
        frame.setSize(750, 220);
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
        p.add(new Button("F"));
        p.add(new Button("A"));
        p.add(new Button("R"));
        p.add(new Button("H"));
        p.add(new Button("A"));
        p.add(new Button("N"));
    }

    public static void main(String[] args) 
    {
        Grid_I fl = new Grid_I();
    }
}
