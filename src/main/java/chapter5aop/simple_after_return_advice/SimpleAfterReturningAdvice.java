package chapter5aop.simple_after_return_advice;

import chapter5aop.beforeadvice.Guitarist;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class SimpleAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("After '" + method.getName()+ "' put down guitar.");

    }

    public static void main(String[] args) {
        Guitarist target = new Guitarist();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new CheckAnotherAfterReturningAdvice());
        pf.addAdvice(new SimpleAfterReturningAdvice());
        pf.setTarget(target);

        Guitarist proxy = (Guitarist) pf.getProxy();
        proxy.sing();

    }
}

//You're gonna live forever in me
//After 'sing' put down guitar.
//this is another after returning sample sing
