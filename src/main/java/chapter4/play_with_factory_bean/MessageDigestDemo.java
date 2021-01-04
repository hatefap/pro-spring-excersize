package chapter4.play_with_factory_bean;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.security.MessageDigest;
import java.util.Arrays;

public class MessageDigestDemo {
        public static void main(String... args) throws Exception {
            GenericXmlApplicationContext ctx =
                    new GenericXmlApplicationContext();
            ctx.load("play-with-bean-factory.xml");
            ctx.refresh();
            MessageDigester digester = ctx.getBean("digester",
                    MessageDigester.class);
            digester.digest("Hello World!");

            MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean) ctx.getBean("&shaDigest");
            MessageDigest m = factoryBean.getObject();
            System.out.println("xxxxxxxxxxxxx");
            System.out.println(Arrays.toString(m.digest("hatef alipour".getBytes())));
            ctx.close();
        }
}
