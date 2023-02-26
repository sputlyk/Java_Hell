import java.awt.*;
import java.awt.event.*;

class TwoB extends Frame implements ActionListener {

    TextField t1, t2, t3;
    Button b1, b2;
    Label l1, l2, l3, a1, l4, l5, a2;

    TwoB() {
        l1 = new Label("------Concating String ------");
        l2 = new Label("Enter String 1 ");
        l3 = new Label("Enter String 2 ");
        a1 = new Label();
        l4 = new Label("------Reversing Of String------ ");
        l5 = new Label("Enter String  ");
        a2 = new Label();

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        b1 = new Button("Concate");
        b2 = new Button("Reverse");

        l1.setBounds(50, 50, 200, 20);

        l2.setBounds(50, 80, 150, 20);
        t1.setBounds(50, 120, 190, 30);

        l3.setBounds(50, 150, 200, 20);
        t2.setBounds(50, 190, 190, 30);
        b1.setBounds(50, 230, 190, 30);
        a1.setBounds(50, 270, 190, 30);

        l4.setBounds(50, 300, 200, 20);

        l5.setBounds(50, 340, 200, 20);
        t3.setBounds(50, 370, 190, 30);
        b2.setBounds(50, 400, 190, 30);
        a2.setBounds(50, 430, 200, 20);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(a1);
        add(l4);
        add(l5);
        add(t3);
        add(b2);
        add(a2);

        setSize(350, 600);
        setLayout(null);// no layout manager
        setVisible(true);// now frame will be visible, by default not visible

        b1.addActionListener(this);
        b2.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        }       );
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s1 = (t1.getText() + t2.getText());
            a1.setText("Answer Is " + s1);
        } 
        else if (e.getSource() == b2) {
            String s2 = t3.getText();
            StringBuilder obj1 = new StringBuilder();
            obj1.append(s2);
            obj1.reverse();
            String s3 = obj1.toString();
            a2.setText("Answer Is " + s3);
        }
    }

    public static void main(String[] args) {
        new TwoB();
    }
}
