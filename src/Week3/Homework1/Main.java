package Week3.Homework1;

import Week3.Homework1.Model.User;
import Week3.Homework1.Service.GoogleRegister;
import Week3.Homework1.Service.ManuelRegister;
import Week3.Homework1.Service.UserRegisterService;
import Week3.Homework1.Service.impl.UserRegisterServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserRegisterService userRegisterService;
        User user = new User("Ahmet","o","Ahmet@gmail.com","12344545656");
        User user1 = new User("aaa@gmail.com","555566666");
        userRegisterService = new UserRegisterServiceImpl(new ManuelRegister());
        userRegisterService.register(user);
        userRegisterService = new UserRegisterServiceImpl(new GoogleRegister());
        userRegisterService.register(user1);


    }
}
