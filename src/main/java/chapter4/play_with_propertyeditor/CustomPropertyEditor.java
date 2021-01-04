package chapter4.play_with_propertyeditor;

import org.springframework.context.ApplicationContext;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class CustomPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println(text);
        String[] name = text.split("\\s");

        setValue(new FullName(name[0], name[1]));
    }
}
