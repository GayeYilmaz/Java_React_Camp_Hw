package Camp5Hw.core.concretes;

import Camp5Hw.core.abstracts.RegisterService;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public class GoogleRegisterManagerAdapter implements RegisterService {


    @Override
    public void register(String email, String parola) {
        System.out.println("Regsitration done with Google account.");
    }
}
