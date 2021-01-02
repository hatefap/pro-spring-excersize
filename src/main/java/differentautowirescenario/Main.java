package differentautowirescenario;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context-different-wiring-scenario.xml");
        ctx.refresh();
        Target t = null;
        //System.out.println("Using byName:\n");
        t = (Target) ctx.getBean("targetByName");
        System.out.println("\nUsing byType:\n");
        t = (Target) ctx.getBean("targetByType");
        System.out.println("\nUsing constructor:\n");
        t = (Target) ctx.getBean("targetConstructor");
        ctx.close();

    }
}
