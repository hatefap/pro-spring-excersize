package applicationcontextconstructorinjection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PlayWithMultiValueConstructor {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("app-context-xml_constructor_injection.xml");

        ConfigurableMessageProvider multiConstructor = ctx.getBean("confprovider", ConfigurableMessageProvider.class);

        System.out.println(multiConstructor.getMessage());
    }
}
