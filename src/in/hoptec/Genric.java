package in.hoptec;

import javax.swing.*;

public class Genric {
    private JButton addButton;
    private JButton submitButton;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel root;
    private JButton btn1Button;
    private JButton btn2Button;
    private JTextPane textPane1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Genric");
        frame.setContentPane(new Genric().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }


}
