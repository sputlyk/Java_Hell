import java.awt.*;
import java.awt.event.*;

class factorial extends Frame implements ActionListener {
    TextField MyTextField;
    Button Mybtn;
    Label Label1, Label2, Label3;

    factorial() {
        Label1 = new Label("AWT Factorial Program");
        Label2 = new Label("Enter number");
        Label3 = new Label();

        MyTextField = new TextField();

        Mybtn = new Button("Factorial");

        Label1.setBounds(50, 40, 200, 20);
        Label2.setBounds(50, 70, 150, 20);
        Label3.setBounds(50, 170, 200, 20);

        MyTextField.setBounds(50, 90, 190, 30);

        Mybtn.setBounds(50, 130, 190, 30);

        add(Label1);
        add(Label2);
        add(Label3);
        add(MyTextField);
        add(Mybtn);

        setSize(300, 210);
        setLayout(null);        // no layout manager
        setVisible(true);       // now frame will be visible, by default not visible

        Mybtn.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        }       );
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Mybtn) {
            int num = Integer.parseInt(MyTextField.getText());
            Label3.setText("Factorial of " + num + " is " + getFactorial(num));
        }
    }

    public int getFactorial(int x) {
        int rsl = 1;
        for (int i = x; i > 0; --i) {
            rsl *= i;
        }
        return (rsl);
    }

    public static void main(String[] args) {
         new factorial();
    }
}