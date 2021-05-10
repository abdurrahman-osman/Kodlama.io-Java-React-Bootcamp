package Week3.Homework1.Validations.impl;

import Week3.Homework1.Model.User;
import Week3.Homework1.Validations.UserRegisterValidation;
import Week3.Homework1.dao.UserRepository;
import Week3.Homework1.dao.impl.UserRepositoryImpl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisterValidationImpl implements UserRegisterValidation{
    private UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public boolean isValid(User user) {
        return (checkName(user) && checkPassword(user) && checkEmailFormat(user) && !isExist(user));
    }

    @Override
    public boolean checkName(User user) {
        if (user.getFirstName().length() >= 2 && user.getLastname().length() >= 2)
            return true;
        System.out.println("Name and last name should be 2 character or more! ");
      return false;
    }

    @Override
    public boolean checkPassword(User user) {
        return user.getPassword().length() >= 6;
    }

    @Override
    public boolean checkEmailFormat(User user) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());
        return matcher.matches();
    }

    @Override
    public boolean isExist(User user) {
        List<User> list = userRepository.list();
        for (User u: list) {
            if (u.getEmail() == user.getEmail())
                return true;
        }
        return false;
    }
}
