package chapter5aop.simple_after_return_advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class CheckAnotherAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("this is another after returning sample " + method.getName());
    }
}
