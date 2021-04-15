package hiber.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getUsers();
    void deleteUser(User user);
    void editUser(User user);
}
