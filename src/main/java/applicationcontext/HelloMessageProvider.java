package applicationcontext;

public class HelloMessageProvider implements MessageProvider {
    public String getMessage() {
        return "hello world";
    }
}
