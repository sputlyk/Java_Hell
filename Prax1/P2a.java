import java.applet.Applet;
import java.awt.*;

public class P2a extends Applet{
    public void init() {
        setBackground(Color.CYAN);
    }
public void paint(Graphics g) {
        g.setColor(Color.magenta);
        g.drawString("Hello World", 0, 50);
        showStatus("This is Java Applet Painted");
    }
}