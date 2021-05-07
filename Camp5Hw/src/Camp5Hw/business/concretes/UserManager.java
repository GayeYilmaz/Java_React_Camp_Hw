package Camp5Hw.business.concretes;

import Camp5Hw.business.abstracts.CheckerService;
import Camp5Hw.business.abstracts.UserService;
import Camp5Hw.business.abstracts.ValidationService;
import Camp5Hw.core.abstracts.RegisterService;
import Camp5Hw.entities.concretes.User;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public class UserManager implements UserService {

    private static ArrayList<User> registeredUser;
    private RegisterService registerService;
    ValidationService validationService =new EmailValidation();
    public UserManager() {
    }

    public UserManager(ArrayList<User> registeredUser, RegisterService registerService) {
        this.registeredUser = registeredUser;
        this.registerService=registerService;
    }

    @Override
    public void register(User user,RegisterService registerService) {

        CheckerService checkerService [] = {new EmailChecker(),new NameChecker(),new SurnameChecker(),new ParolaChecker()};
        if(checker(checkerService,user)){
            this.registerService.register(user.getEmail(), user.getParola());
            registeredUser.add(user);
            validationService.send(user);
        }else{
            System.out.println("Check your information ");
        }



    }

    @Override
    public void login(String email,String parola) {
        for(User user1 : this.registeredUser){

            if((user1.getEmail() == email) && (user1.getParola() == parola)){
                System.out.println("Success Login");
                return;
            }


        }
        System.out.println("Failed Login,Check Your Information ");

    }
    public void add(User user){
        registeredUser.add(user);

    }

    public static List<User> listAll() {
        return registeredUser;
    }

    public boolean checker(CheckerService checkerService[],User user){

        for(CheckerService checkerService1 : checkerService){
           if(!checkerService1.check(user)){
               return false;
           }

        }
        return true;
    }
    public void validation(ValidationService validationService[],User user){
        for(ValidationService validationService1 : validationService){
            validationService1.send(user);
        }
    }

}
