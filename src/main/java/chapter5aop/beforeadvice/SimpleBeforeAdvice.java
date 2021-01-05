package chapter5aop.beforeadvice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class SimpleBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before " + method.getName() + " tune guitar.");
        Guitarist g = (Guitarist) o;
        System.out.println("I am inside the before aop");
        g.sing();
        System.out.println("I am inside the before aop");
    }

    public static void main(String[] args) {
            Guitarist johnMayer = new Guitarist();
            ProxyFactory pf = new ProxyFactory();
            pf.addAdvice(new SimpleBeforeAdvice());
            pf.setTarget(johnMayer);
            Guitarist proxy = (Guitarist) pf.getProxy();
            proxy.sing();

            proxy.hello();

//        Before sing tune guitar.
//        You're gonna live forever in me
//        Before hello tune guitar.
//        hello world!


    }
}
