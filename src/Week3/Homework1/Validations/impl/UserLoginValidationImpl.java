package Week3.Homework1.Validations.impl;

import Week3.Homework1.Model.User;
import Week3.Homework1.Validations.UserLoginValidation;
import Week3.Homework1.dao.UserRepository;
import Week3.Homework1.dao.impl.UserRepositoryImpl;

import java.util.List;

public class UserLoginValidationImpl implements UserLoginValidation {
    private UserRepository userRepository = new UserRepositoryImpl();
    private List<User> list = userRepository.list();
    @Override
    public boolean checkPasswordAndEmail(User user) {
        for (User u: list) {
            if (u.getEmail() ==user.getEmail() && user.getPassword() == u.getPassword())
                return true;
        }
        System.out.println("Email or password wrong !");
        return false;
    }

    @Override
    public boolean isValid(User user) {
        return checkPasswordAndEmail(user);
    }
}
