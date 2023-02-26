import java.awt.*;
import java.awt.event.*;

public class AWT2 implements ActionListener
{
    Button MyBtn = new Button("Click Me!!!");
    Frame MyFrame = new Frame("3020_AWT2");
    Label MyLabel = new Label();

    public AWT2()
    {
        MyBtn.setBounds(100, 100, 100, 100);
        MyLabel.setBounds(70, 200, 200, 30);
        MyLabel.setAlignment(Label.CENTER);

        MyFrame.add(MyBtn);
        MyFrame.add(MyLabel);

        MyFrame.setSize(400, 400);
        MyFrame.setLayout(null);
        MyFrame.setVisible(true);

        MyBtn.addActionListener(this);
        MyFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }
        );
    }
    
    int i=1;
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==MyBtn)
        {
            if(i%2==1)
            {
                MyLabel.setText("Button has been clicked!");
                i++;
            }
            else
            {
                MyLabel.setText("Clicked again!");
            }
        }
    }
    
    public static void main(String[] args)
    {
        new AWT2();
    }
}