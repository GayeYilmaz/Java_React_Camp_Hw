package Camp5Hw.business.abstracts;

import Camp5Hw.core.abstracts.RegisterService;
import Camp5Hw.entities.concretes.User;

import java.util.List;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public interface UserService {
    void register(User user, RegisterService registerService);
    void login(String email,String parola);
    static List<User> listAll() {
        return null;
    }
}
