package Week3.Homework1.Validations;

import Week3.Homework1.Model.User;

public interface UserRegisterValidation extends UserValidationService{
    boolean checkName(User user);
    boolean checkPassword(User user);
    boolean checkEmailFormat(User user);
    boolean isExist(User user);
}
