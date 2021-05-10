package Week3.Homework1.Service.impl;

import Week3.Homework1.Model.User;
import Week3.Homework1.Service.UserEmailService;

public class UserEmailServiceImpl implements UserEmailService {

    @Override
    public void sendEmail(User user) {
        System.out.println("Sent verify link to "+user.getEmail());
    }


}
