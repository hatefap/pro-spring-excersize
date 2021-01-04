package chapter4.java_config_complimentary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SimpleConfiguration.class)
public class AdvancedConfiguration {
    @Bean
    public String messageAdvanced(){
        return "advanced message";
    }

}
