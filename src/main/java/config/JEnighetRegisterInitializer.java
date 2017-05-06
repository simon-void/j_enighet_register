package config;

import app.frontend.MainUI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class JEnighetRegisterInitializer {

    public static void main(String[] args) {
        // use SpringBoot only for dependencies
        // not for app configuration
        String configDir = JEnighetConfig.class.getPackage().getName();
        ApplicationContext context =
                new AnnotationConfigApplicationContext(configDir);

        MainUI mainUI = context.getBean(MainUI.class);

        SwingUtilities.invokeLater(()->{
            mainUI.init();
        });
    }
}
