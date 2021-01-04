package chapter4.execute_method_after_bean_created;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

public class SingerConfigDemo {

    @Configuration
    static class SingerConfig{
        @Lazy
        @Bean(initMethod = "init")
        public Singer singerOne(){
            Singer singerOne = new Singer();
            singerOne.setAge(18);
            singerOne.setName("hatef");
            return singerOne;
        }

        @Lazy
        @Bean(initMethod = "init")
        public Singer singerTwo(){
            Singer singerTwo = new Singer();
            singerTwo.setName("hatef");
            return singerTwo;
        }

        @Lazy
        @Bean(initMethod = "init")
        public Singer singerThree(){
            Singer singerThree = new Singer();
            singerThree.setAge(18);
            return singerThree;
        }

    }

    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(SingerConfig.class);
        getBean("singerOne", ctx);
        getBean("singerTwo", ctx);
        getBean("singerThree", ctx);
        ctx.close();


    }

    public static Singer getBean(String beanName, ApplicationContext ctx) {
        try {
            Singer bean = (Singer) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println("An error occured in bean configuration: "
                    + ex.getMessage());
            return null;
        }
    }
}
