package chapter5aop.secure_method_using_before;

public class UserInfo {
    private String userName;
    private String password;

    public UserInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
    }
}

