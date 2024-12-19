package chapter17.service;

public interface UserService {
    void registerUser(String userId, String password, String name, String email);
    void login(String userId, String password);
    boolean isLoggedIn();
    void logout();

}
