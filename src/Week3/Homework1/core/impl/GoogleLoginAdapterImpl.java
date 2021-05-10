package Week3.Homework1.core.impl;

import Week3.Homework1.GoogleMailService.GmailService;
import Week3.Homework1.Model.User;
import Week3.Homework1.core.GoogleLoginAdapter;

public class GoogleLoginAdapterImpl implements GoogleLoginAdapter {
    GmailService gmailService = new GmailService();
    @Override
    public boolean register(User user) {
        return gmailService.register(user.getEmail(),user.getPassword());
    }

    @Override
    public boolean login(User user) {
        return gmailService.login(user.getEmail(),user.getPassword());
    }
}
