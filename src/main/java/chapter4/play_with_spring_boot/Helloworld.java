package chapter4.play_with_spring_boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Helloworld {

    private static Logger logger = LoggerFactory.getLogger(Helloworld.class);

    public void sayHi(){
        logger.info("Hello world!");
    }
}
