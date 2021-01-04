package beaninheritance;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanInheritanceDriver {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("app-context-bean-inheritance.xml");
        ctx.refresh();
       // Singer parent = (Singer) ctx.getBean("parent");
        Singer child = (Singer) ctx.getBean("child");
        System.out.println("Child:\n" + child.getName() + " " + child.getAge());

    }
}
