package chapter4.java_config_complimentary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:message.properties")
public class SimpleConfiguration {

    @Autowired
    Environment env;

    @Bean
    public String messageProvider(){
        System.out.println(env);
        return env.getProperty("message");
    }

}
