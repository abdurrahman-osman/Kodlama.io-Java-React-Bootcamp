package Week3.Homework1.Service.impl;

import Week3.Homework1.Model.User;
import Week3.Homework1.Service.UserLoginService;
import Week3.Homework1.Validations.UserValidationService;
import Week3.Homework1.Validations.impl.UserLoginValidationImpl;

public class UserLoginServiceImpl implements UserLoginService {
   private UserValidationService userValidationService = new UserLoginValidationImpl();


    @Override
    public void login(User user) {
      if (userValidationService.isValid(user))
          System.out.println( user.getFirstName() + " logged in");
    }
}
