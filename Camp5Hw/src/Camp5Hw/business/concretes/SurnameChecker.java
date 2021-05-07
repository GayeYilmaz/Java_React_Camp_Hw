package Camp5Hw.business.concretes;

import Camp5Hw.business.abstracts.CheckerService;
import Camp5Hw.entities.concretes.User;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public class SurnameChecker implements CheckerService {
    @Override
    public boolean check(User user) {
        if(user.getName().length()<2) {
            System.out.println("Surname should be at least 2 characters");
            return false;
        }
        return true;
    }
}
