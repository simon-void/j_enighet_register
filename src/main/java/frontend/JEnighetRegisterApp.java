package frontend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JEnighetRegisterApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(JEnighetRegisterFrame.class)
                .headless(false)
                .web(false)
                .run(args);
    }
}
