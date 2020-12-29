package applicationcontext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponent {
    public static void main(String[] args) {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("app-context-xml_1.xml");
        applicationContext.refresh();

        MessageRenderer renderer = applicationContext.getBean("renderer", MessageRenderer.class);

        renderer.render();

        applicationContext.close();
    }
}
