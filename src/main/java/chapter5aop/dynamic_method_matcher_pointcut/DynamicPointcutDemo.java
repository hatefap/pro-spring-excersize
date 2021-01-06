package chapter5aop.dynamic_method_matcher_pointcut;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class DynamicPointcutDemo {
    public static void main(String... args) {
        SampleBean target = new SampleBean();
        Advisor advisor = new DefaultPointcutAdvisor(
                new SimpleDynamicPointcut(), new SimpleAdvice());
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        SampleBean proxy = (SampleBean)pf.getProxy();
        proxy.foo(1);
        proxy.foo(10);
        proxy.foo(100);
        proxy.bar();
        proxy.bar();
        proxy.bar();
    }

}
//        Static check for foo
//        Static check for bar
//        Static check for clone
//        Static check for toString
//        Static check for foo
//        Dynamic check for foo
//        >> Invoking foo
//        Invoked foo() with: 1
//        >> Done
//
//        Dynamic check for foo
//        >> Invoking foo
//        Invoked foo() with: 10
//        >> Done
//
//        Dynamic check for foo
//        Invoked foo() with: 100
//        Static check for bar
//        Invoked bar()
//        Invoked bar()
//        Invoked bar()
//
//        Process finished with exit code 0