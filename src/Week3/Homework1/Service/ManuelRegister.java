package Week3.Homework1.Service;

import Week3.Homework1.Model.User;
import Week3.Homework1.Service.impl.UserEmailServiceImpl;
import Week3.Homework1.Validations.UserValidationService;
import Week3.Homework1.Validations.impl.UserRegisterValidationImpl;
import Week3.Homework1.dao.UserRepository;
import Week3.Homework1.dao.impl.UserRepositoryImpl;

public class ManuelRegister implements Register{
    private UserValidationService userValidationService = new UserRegisterValidationImpl();
    private UserEmailService userEmailService = new UserEmailServiceImpl();
    private UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public void register(User user) {
        if (userValidationService.isValid(user)){
            System.out.println("Registration Successful");
            userRepository.create(user);
            userEmailService.sendEmail(user);
        }
    }
}
