package hiber.dao;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDaoImpl implements UserDAO {

    @Autowired
    private EntityManager manager;

    @Override
    public void add(User user) {
        manager.persist(user);
    }

    @Override
    public List<User> getAllUsers() {
        return manager.createQuery("from User").getResultList();
    }

    @Override
    public void deleteUser(User user) {
        manager.remove(user);
    }

    @Override
    public void editUser(User user) {
        User u = manager.find(User.class, user.getId());
        manager.detach(u);
        u.setName(user.getName());
        u.setLastName(user.getLastName());
        u.setAgo(user.getAgo());
        manager.getTransaction().begin();
        manager.merge(u);
        manager.getTransaction().commit();

    }
}
