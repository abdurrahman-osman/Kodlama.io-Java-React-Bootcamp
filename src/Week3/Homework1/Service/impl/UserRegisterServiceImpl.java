package Week3.Homework1.Service.impl;

import Week3.Homework1.Model.User;
import Week3.Homework1.Service.Register;
import Week3.Homework1.Service.UserRegisterService;


public class UserRegisterServiceImpl implements UserRegisterService {
    private Register register;

    public UserRegisterServiceImpl(Register register) {
        this.register = register;
    }

    @Override
    public void register(User user) {
      register.register(user);
    }

    @Override
    public void verify(User user) {
        System.out.println(user.getEmail()+" verified");
        user.setVerified(true);
    }
}
