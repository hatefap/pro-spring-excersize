package applicationcontextnestedxml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalApplicationUsage {
    public static void main(String... args) {
        GenericXmlApplicationContext grandParent = new GenericXmlApplicationContext();
        grandParent.load("grand-parent-context.xml");
        grandParent.refresh();

        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("parent-context.xml");
        parent.setParent(grandParent);
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("child-context.xml");
        child.setParent(parent);
        child.refresh();

        Song song1 = (Song) child.getBean("song1");
        Song song2 = (Song) child.getBean("song2");
        Song song3 = (Song) child.getBean("song3");
        System.out.println(song1.getTitle());
        System.out.println(song2.getTitle());
        System.out.println( song3.getTitle());
        parent.close();
        parent.close();

    }
}