package Camp5Hw;

import Camp5Hw.business.concretes.UserManager;
import Camp5Hw.core.abstracts.RegisterService;
import Camp5Hw.core.concretes.DefaultRegisterManager;
import Camp5Hw.core.concretes.GoogleRegisterManagerAdapter;
import Camp5Hw.entities.concretes.User;

import java.awt.image.RGBImageFilter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RegisterService registerService = new DefaultRegisterManager();
        RegisterService registerService1 = new GoogleRegisterManagerAdapter();
        User user1 =  new User(1,"Gaye","Yılmaz","gaye@gmail.com","gy2345");
        User user2 = new User(2,"hdzf","Yıl","dfk@gmail.com","85478475");
        User user3 = new User(4,"Elif","Yılmaz","elif@gmail.com","1234567");
        ArrayList<User> registeredUser = new ArrayList<>();
        registeredUser.add(user1);
        UserManager userManager = new UserManager(registeredUser,registerService);
        //userManager.register(user1, registerService);
       //userManager.register(user2,registerService);
       userManager.register(user3,registerService);
       for(User user: UserManager.listAll()){
          // System.out.println(user.getEmail());
       }
       userManager.login(user3.getEmail(),user3.getParola());
    }
}
