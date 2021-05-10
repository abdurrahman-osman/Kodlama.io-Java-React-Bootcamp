package Week3.Homework1.dao;

import Week3.Homework1.Model.User;

import java.util.List;

public interface UserRepository {
    List<User> list();
    void create(User user);
    void update(User user);
    void delete(User user);
}
