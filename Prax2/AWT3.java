import java.awt.*;  
import java.awt.event.*;  

public class AWT3 extends Frame implements MouseListener
{
    Label Mylb;  
    
    AWT3()
    {  
        addMouseListener(this);  
          
        Mylb = new Label();  
        Mylb.setBounds(20,50,100,20);  
        add(Mylb);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    
    public void mouseClicked(MouseEvent e) 
    {
        Mylb.setText("Mouse Clicked"); 
    }
    public void mouseEntered(MouseEvent e)
    {
        Mylb.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) 
    {
        Mylb.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) 
    {
        Mylb.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) 
    {
        Mylb.setText("Mouse Released");  
    }  
    public static void main(String[] args)
    {
        new AWT3();  
    }  
}
