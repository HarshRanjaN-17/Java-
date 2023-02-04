
//  AWT TextField Example with ActionListner
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCalculator extends JFrame implements ActionListener {
    TextField tf1, tf2, tf3;
    JButton b1, b2;

    AddCalculator() {
        tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new TextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new TextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);
        b1 = new JButton("+");
        b1.setBounds(50, 200, 50, 50);
        b2 = new JButton("-");
        b2.setBounds(120, 200, 50, 50);

        Label l1 = new Label("Enter a no.");
        Label l2 = new Label("Enter another no.");
        Label l3 = new Label("Result");
        l1.setBounds(50, 30, 100, 30);
        l2.setBounds(50, 80, 100, 30);
        l3.setBounds(50, 130, 80, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);

        add(l1);
        add(l2);
        add(l3);

        setSize(300, 300);
        setTitle("Simple calculator for addition");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1)
            c = a + b;
        else if (e.getSource() == b2)
            c = a - b;

        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        new AddCalculator();
    }
}