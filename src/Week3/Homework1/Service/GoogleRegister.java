package Week3.Homework1.Service;

import Week3.Homework1.Model.User;
import Week3.Homework1.core.GoogleLoginAdapter;
import Week3.Homework1.core.impl.GoogleLoginAdapterImpl;
import Week3.Homework1.dao.UserRepository;
import Week3.Homework1.dao.impl.UserRepositoryImpl;

public class GoogleRegister implements Register{
    private GoogleLoginAdapter googleLoginAdapter = new GoogleLoginAdapterImpl();
    private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void register(User user) {
       if(googleLoginAdapter.register(user))
           userRepository.create(user);
    }
}
