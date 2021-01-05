package chapter5aop.helloworld;

import org.springframework.aop.framework.ProxyFactory;

public class AgentAOPDemo {
//    The ProxyFactory class controls the weaving and proxy creation process in Spring AOP. Before you can
//    create a proxy, you must specify the advised or target object. You can do this, as you saw earlier, by using
//    the setTarget() method. Internally, ProxyFactory delegates the proxy creation process to an instance
//    of DefaultAopProxyFactory, which in turn delegates to either Cglib2AopProxy or JdkDynamicAopProxy,
//    depending on the settings of your application. We discuss proxy creation in more detail later in this chapter.
//    The ProxyFactory class provides the addAdvice() method that you saw in the previous code sample
//    for cases where you want advice to apply to the invocation of all methods in a class, not just a selection.
//    Internally, addAdvice() wraps the advice you pass it in an instance of DefaultPointcutAdvisor, which
//    is the standard implementation of PointcutAdvisor, and configures it with a pointcut that includes all
//    methods by default. When you want more control over the Advisor that is created or when you want to
//    add an introduction to the proxy, create the Advisor yourself and use the addAdvisor() method of the
//    ProxyFactory.
//    You can use the same ProxyFactory instance to create many proxies, each with different aspects.
//    To help with this, ProxyFactory has removeAdvice() and removeAdvisor() methods, which allow you
//    to remove any advice or advisors from the ProxyFactory that you previously passed to it. To check whether
//    a ProxyFactory has particular advice attached to it, call adviceIncluded(), passing in the advice object for
//    which you want to check.

    public static void main(String[] args) {
        Agent target = new Agent();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new AgentDecorator());
        pf.setTarget(target);

        Agent proxy = (Agent) pf.getProxy();
        target.speak();
        System.out.println("");
        proxy.speak();



        target.sayhello();
        System.out.println("");
        proxy.sayhello();
//        Bond
//
//        JamesBond
//        !
//        hello world!
//
//        Jameshello world!
//        !
    }
}
