package Camp5Hw.business.abstracts;

import Camp5Hw.entities.concretes.User;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public interface CheckerService {
    boolean check(User user);
}
