package Week3.Homework1.Service;

import Week3.Homework1.Model.User;

import java.util.List;

public interface UserCRUDService {
    List<User> list();
    void create(User user);
    void update(User user);
    void delete(User user);
}
