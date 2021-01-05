package chapter5aop.helloworld;

public class Agent {
    public void speak(){
        // we want use aop to this method print James Bond
        System.out.println("Bond");
    }

    public void sayhello(){
        System.out.println("hello world!");
    }
}
