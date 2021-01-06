package chapter5aop.static_method_matcher_pointcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class SimpleAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
            System.out.println(">> Invoking " + invocation.getMethod().getName());
            Object retVal = invocation.proceed();
            System.out.println(">> Done\n");
            return retVal;
        }
}
