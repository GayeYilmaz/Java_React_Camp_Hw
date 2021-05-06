/**
 * @author gaye3
 * @since 1.05.2021
 */
public class StudentManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.print("Student "); super.add(user);
    }

    @Override
    public void delete(User user) {
        System.out.print("Student ");super.delete(user);
    }

}
