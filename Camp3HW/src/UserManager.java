/**
 * @author gaye3
 * @since 1.05.2021
 */
public class UserManager {
    public void add(User user){
        System.out.println(user.getName()+" "+user.getSurname()+" added.");

    }
    public void delete (User user){
        System.out.println(user.getName()+" "+user.getSurname()+"deleted.");
    }
}
