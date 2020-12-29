package applicationcontextSpEL;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PlayWithSpEL {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("app-context-xml-SpEL.xml");

        InjectSimpleSpec test = ctx.getBean("inject", InjectSimpleSpec.class);

        System.out.println(test.toString());
    }
}
