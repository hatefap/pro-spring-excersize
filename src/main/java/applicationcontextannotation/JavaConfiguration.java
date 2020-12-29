package applicationcontextannotation;

import applicationcontext.HelloMessageProvider;
import applicationcontext.MessageProvider;
import applicationcontext.MessageRenderer;
import applicationcontext.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean
    public MessageRenderer renderer(){
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(provider());
        return messageRenderer;
    }

    @Bean
    public MessageProvider provider(){
        return new HelloMessageProvider();
    }
}
