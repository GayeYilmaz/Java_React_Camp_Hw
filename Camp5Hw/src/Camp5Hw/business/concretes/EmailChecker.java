package Camp5Hw.business.concretes;

import Camp5Hw.business.abstracts.CheckerService;
import Camp5Hw.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public class EmailChecker implements CheckerService {
    @Override
    public boolean check(User user) {
        UserManager userManager=new UserManager();
        Pattern pattern = Pattern.compile("^(.+)@([^@]+[^.])$");
        Matcher matcher = pattern.matcher(user.getEmail());
        boolean emailFormat=false;
        boolean emailVal=false;
        if(matcher.matches()){
           emailFormat=true;
        }else{
            System.out.println("Wrong format format for email.");
            emailFormat =false;
        }
        for (User temp: UserManager.listAll()){
            if(temp.getEmail()==user.getEmail()){
                System.out.println("Email used.");
                emailVal= false;
            }
            else{emailVal=true;}
        }
        if(emailVal == true & emailFormat == true){
            return true;
        }
        return false;
    }
}
