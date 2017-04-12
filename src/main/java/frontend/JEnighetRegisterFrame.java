package frontend;

import javax.swing.*;


public class JEnighetRegisterFrame extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new JEnighetRegisterFrame();
        });
    }

    public JEnighetRegisterFrame() {
        setTitle("JEnighetRegister");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(
                new JLabel(getTitle())
        );
        pack();
        setVisible(true);
    }
}
