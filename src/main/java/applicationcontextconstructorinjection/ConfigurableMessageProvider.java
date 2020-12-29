package applicationcontextconstructorinjection;

public class ConfigurableMessageProvider implements MessageProvider {
    private String message;
    private String s1;
    private String s2;

    public ConfigurableMessageProvider(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }


    public String getMessage() {
        return this.s1 + this.s2 + " our values";
    }
}
