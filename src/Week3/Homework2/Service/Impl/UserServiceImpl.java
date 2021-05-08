package Week3.Homework2.Service.Impl;

import Week3.Homework2.Service.UserCheckService;
import Week3.Homework2.Service.UserService;
import Week3.Homework2.entities.User;

public class UserServiceImpl implements UserService {
    UserCheckService userCheckService = new UserCheckServiceImpl();

    @Override
    public void add(User user) {
        if (userCheckService.checkIfRealPerson(user)){
            System.out.println("Added new user:  "+user.getName());
        }
        else System.out.println("User is unverified");


    }

    @Override
    public void update(User user) {
        System.out.println("Updated "+ user.getName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Deleted " + user.getName());
    }

}
