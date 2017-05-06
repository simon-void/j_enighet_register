package app.frontend;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class MainUI {

    public void init() {
        JFrame frame = new JFrame();
        frame.setTitle("JEnighetRegister");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(
                new JLabel(frame.getTitle())
        );
        frame.pack();
        frame.setVisible(true);
    }
}
