import java.awt.*;
import java.awt.event.*;

public class Card implements ActionListener 
{
    Frame frame;
    Button b1, b2, b3;
    CardLayout card;

    public Card() 
    {
        frame = new Frame("Card Layout Demonstration");
        card = new CardLayout();

        b1 = new Button("3020");
        b2 = new Button("Farhan");
        b3 = new Button("Student of SYIT RJ College");

        b1.setBounds(0, 35, 400, 250);
        b2.setBounds(0, 35, 400, 250);
        b3.setBounds(0, 35, 400, 250);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setLayout(card);
        frame.setSize(400, 280);
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

    public void actionPerformed(ActionEvent e) 
    {
        card.next(frame);
    }

    public static void main(String[] args) 
    {
        Card fl = new Card();
    }
}
