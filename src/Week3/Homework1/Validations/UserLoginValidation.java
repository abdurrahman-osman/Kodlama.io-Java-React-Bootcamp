package Week3.Homework1.Validations;


import Week3.Homework1.Model.User;

public interface UserLoginValidation extends UserValidationService{
    boolean checkPasswordAndEmail(User user);
}
