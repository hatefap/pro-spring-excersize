package playwithcollection;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private List<String> list;
    private Properties props;
    private Map<String, Integer> map;
    private Set<String> set;

    public static void main(String[] args) {

            GenericXmlApplicationContext ctx =
                    new GenericXmlApplicationContext();
            ctx.load("play-with-collection-application-context.xml");
            ctx.refresh();
            CollectionInjection instance =
                    (CollectionInjection) ctx.getBean("injectCollection");
            instance.displayInfo();
            ctx.close();


    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setProps(Properties props) {
        this.props = props;
    }


    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }


    public void displayInfo() {
        System.out.println("Map contents:\n");
        map.forEach((key1, value1) -> System.out.println(
                "Key: " + key1 + " - Value: " + value1));
        System.out.println("\nProperties contents:\n");
        props.forEach((key, value) -> System.out.println(
                "Key: " + key + " - Value: " + value));
        System.out.println("\nSet contents:\n");
        set.forEach(obj -> System.out.println("Value: " + obj));
        System.out.println("\nList contents:\n");
        list.forEach(obj -> System.out.println("Value: " + obj));
    }

}
