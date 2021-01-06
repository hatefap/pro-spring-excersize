package chapter5aop.secure_method_using_before;

public class SecurityManager {
    private static ThreadLocal<UserInfo> threadLocal = new ThreadLocal<>();
    public void login(String userName, String password) {
        threadLocal.set(new UserInfo(userName, password));
    }
    public void logout() {
        threadLocal.set(null);
    }

    public UserInfo getLoggedOnUser() {
        return threadLocal.get();
    }


}