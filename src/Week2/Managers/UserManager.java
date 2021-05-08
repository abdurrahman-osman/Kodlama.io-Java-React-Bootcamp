package Week2.Managers;

import Week2.Models.User;

public class UserManager {
    public void register(User user){
        System.out.println("Registered new user: "+ user.getName() + "With id: "+user.getId());
    }
    public void login(User user){
        System.out.println(user.getName() + " logged in");
    }
    public void update(User user){
        System.out.println(user.getName() + " updated");
    }
    public void delete(User user){
        System.out.println(user.getName() + " deleted");
    }
}
