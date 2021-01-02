package differentautowirescenario;

public class Target {

    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;
    public Target() {
    }
    public Target(Foo foo) {
        System.out.println("Target(Foo) called");
    }
    public Target(Foo foo, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }

    public Target(Foo foo, Bar bar, String s){
        System.out.println("check it is called or not");
    }
    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }
    public void setFooTwo(Foo foo) {
        this.fooTwo = foo;
        System.out.println("Property fooTwo set");
    }
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

}
