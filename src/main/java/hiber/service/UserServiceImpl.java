package hiber.service;

import hiber.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import web.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO users;

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public List<User> getUsers() {
        return users.getUsers();
    }

    @Override
    public void deleteUser(User user) {
        users.deleteUser(user);
    }

    @Override
    public void editUser(User user) {
        users.editUser(user);
    }
}
