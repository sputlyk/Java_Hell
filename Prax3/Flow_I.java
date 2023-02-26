import java.awt.*;
import java.awt.event.*;

public class Flow_I 
{
    Frame MyFrame;
    Panel p1, p2, p3;
    Label l1, l2, l3;

    public Flow_I() 
    {
        MyFrame = new Frame("Flow Layout Demonstration");

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();

        l1 = new Label("Panel 1 - Default Constructor", Label.CENTER);
        l1.setBounds(0, 35, 200, 30);

        l2 = new Label("Panel 2 - Parameterized Con(1)", Label.CENTER);
        l2.setBounds(200, 35, 200, 30);

        l3 = new Label("Panel 3 - Parameterized Con(3)", Label.CENTER);
        l3.setBounds(400, 35, 200, 30);

        p1.setBounds(0, 65, 200, 150);
        p1.setLayout(new FlowLayout());
        createPanel(p1);

        p2.setBounds(200, 65, 200, 150);
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p2.setBackground(Color.LIGHT_GRAY);
        createPanel(p2);

        p3.setBounds(400, 65, 200, 150);
        p3.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        p3.setBackground(Color.DARK_GRAY);
        createPanel(p3);

        MyFrame.add(l1);
        MyFrame.add(l2);
        MyFrame.add(l3);

        MyFrame.add(p1);
        MyFrame.add(p2);
        MyFrame.add(p3);

        MyFrame.setLayout(null);
        MyFrame.setSize(600, 220);
        MyFrame.setResizable(false);
        MyFrame.setVisible(true);

        MyFrame.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                MyFrame.dispose();
            }
        });
    }

    public void createPanel(Panel p) 
    {
        p.add(new Button("3"));
        p.add(new Button("0"));
        p.add(new Button("6"));
        p.add(new Button("7"));
    }

    public static void main(String[] args) 
    {
        Flow_I fl = new Flow_I();
    }
}
