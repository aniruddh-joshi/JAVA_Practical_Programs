import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Demo{
    JLabel label;
    JTextField a, b;
    JButton submitButton;

    Demo() {
        JFrame jf = new JFrame();
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 450);
        jf.setVisible(true);

        label = new JLabel("Label");
        a = new JTextField(10);
        b = new JTextField(10);
        submitButton = new JButton("Submit");

        jf.add(label);
        jf.add(a);
        jf.add(b);
        jf.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int x = Integer.parseInt(a.getText());
                int y = Integer.parseInt(b.getText());

                int result = x - y;

                label.setText("Output is: " + String.valueOf(result));
            }
        });
    }

    public static void main(String arg[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Demo();
            }
        });
    }
}
