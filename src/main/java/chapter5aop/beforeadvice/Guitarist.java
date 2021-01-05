package chapter5aop.beforeadvice;

public class Guitarist implements Singer {
    private String lyric="You're gonna live forever in me";
    @Override
    public void sing(){
        System.out.println(lyric);
    }

    @Override
    public void hello(){
        System.out.println("hello world!");
    }
}
