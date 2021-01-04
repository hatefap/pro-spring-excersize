package chapter4.execute_method_before_destruction;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;

public class DestructiveBean implements InitializingBean {

    private File file;
    private String filePath;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean");
        if (filePath == null) {
            throw new IllegalArgumentException(
                    "You must specify the filePath property of"
                            + DestructiveBean.class);
        }
        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists: " + file.exists());
    }

    public void destroy() {
        System.out.println(filePath);
        System.out.println("Destroying Bean");
        if(!file.delete()) {
            System.err.println("ERROR: failed to delete file.");
        }
        System.out.println("File exists: " + file.exists());
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public static void main(String... args) throws Exception {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("ch4-call-method-before-destruction.xml");
        ctx.refresh();
        DestructiveBean bean = (DestructiveBean) ctx.getBean("destructiveBean");
        System.out.println("Calling destroy()");
        ctx.registerShutdownHook();
        System.out.println("Called destroy()");
    }




}
