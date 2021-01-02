package applicationcontextmethodinjection;

public class StandardLookupDemoBean implements DemoBean{

    private Singer mySinger;
    @Override
    public Singer getMySinger() {
        return mySinger;
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }

    public void setMySinger(Singer mySinger) {
        this.mySinger = mySinger;
    }
}
