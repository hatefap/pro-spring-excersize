package chapter5aop.static_method_matcher_pointcut;

import chapter5aop.beforeadvice.Singer;

public class GoodGuitarist implements Singer {
    @Override
    public void sing() {
        System.out.println("hello I am a good guitarist");
    }

    @Override
    public void hello() {
        System.out.println("hello world! from good guitarist");

    }
}
