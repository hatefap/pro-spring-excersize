package chapter4.play_with_spring_boot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        assert ctx != null;
        logger.info("The bean you were looking for: ");

        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(logger::info);

        Helloworld hw = ctx.getBean(Helloworld.class);
        hw.sayHi();

        System.in.read();
        ctx.close();
    }

}
