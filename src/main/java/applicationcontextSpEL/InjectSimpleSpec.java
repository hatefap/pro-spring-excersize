package applicationcontextSpEL;

public class InjectSimpleSpec {

    private String name;
    private String age;
    private float height;
    private boolean programmer;
    private long ageInSeconds;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "InjectSimpleSpec{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }
}
