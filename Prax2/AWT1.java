import java.awt.*;

public class AWT1 
{

    public static void main(String[] args)
    {
        Frame myframe = new Frame();
        Button btn = new Button("Click Me!!!!");
        btn.setBounds(100, 100, 100, 100);        
        myframe.add(btn);
        myframe.setSize(400, 300);
        myframe.setTitle("3020_AWT");
        myframe.setLayout(null);
        myframe.setVisible(true);
    }
}
