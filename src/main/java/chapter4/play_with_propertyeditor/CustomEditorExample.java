package chapter4.play_with_propertyeditor;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResourceLoader;

public class CustomEditorExample {
    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    private FullName name;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("play-with-custom-property-editors.xml");
        ctx.refresh();
        FileSystemResourceLoader fs = new FileSystemResourceLoader();
        CustomEditorExample bean = ctx.getBean("exampleBean", CustomEditorExample.class);
        System.out.println(bean.name.toString());
    }


}
