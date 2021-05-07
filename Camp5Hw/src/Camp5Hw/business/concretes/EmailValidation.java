package Camp5Hw.business.concretes;

import Camp5Hw.business.abstracts.ValidationService;
import Camp5Hw.entities.concretes.User;

import java.util.Scanner;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public class EmailValidation implements ValidationService {
    @Override
    public void send(User user) {
        System.out.println("Validation mail send to "+user.getEmail()+" email adress.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Write something and press Enter.(LINK)");
        String word = scan.next();
        if(word.length()>0){
            System.out.println("Registeration done");
        }
        else{
            System.out.println("There is an error.");
        }
    }
}
