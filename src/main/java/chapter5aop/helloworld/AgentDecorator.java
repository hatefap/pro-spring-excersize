package chapter5aop.helloworld;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AgentDecorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.print("James");
        System.out.println("\n" + methodInvocation.getMethod().getName());
        Object retVal = methodInvocation.proceed();
        System.out.println("!");
        return retVal;
    }
}
