package chapter5aop.static_method_matcher_pointcut;

import chapter5aop.beforeadvice.Singer;

public class GreatGuitarist implements Singer {
    @Override public void sing() {
        System.out.println("I shot the sheriff, \n" +
                "But I did not shoot the deputy");
    }


    @Override
    public void hello() {
        System.out.println("hello from great guitarist");
    }
}
