package Week3.Homework1.dao.impl;

import Week3.Homework1.Model.User;
import Week3.Homework1.dao.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static List<User> users = new ArrayList<>();
    @Override
    public List<User> list() {
        return users;
    }

    @Override
    public void create(User user) {
        users.add(user);
        System.out.println("Created new user : "+ user.getFirstName() + " "+ user.getLastname());
    }

    @Override
    public void update(User user) {
        System.out.println("Updated : "+ user.getFirstName() + " "+ user.getLastname());
    }

    @Override
    public void delete(User user) {
        users.remove(user);
        System.out.println("Deleted : "+user.getFirstName() + " "+user.getLastname());
    }
}
