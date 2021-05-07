package Camp5Hw.business.concretes;

import Camp5Hw.business.abstracts.CheckerService;
import Camp5Hw.entities.concretes.User;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public class ParolaChecker implements CheckerService {
    @Override
    public boolean check(User user) {
        if(user.getParola().length()<6) {
            System.out.println("Parola should be at least 6 characters");
            return false;
        }
        return true;
    }
}
