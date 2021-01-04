package chapter4.java_config_complimentary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AdvancedConfiguration.class);
        String x = ctx.getBean("messageProvider", String.class);
        String xx = ctx.getBean("messageAdvanced", String.class);

        System.out.println(x);
        System.out.println(xx);

    }
}
