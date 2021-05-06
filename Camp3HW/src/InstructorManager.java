/**
 * @author gaye3
 * @since 1.05.2021
 */
public class InstructorManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.print("Instructor "); super.add(user);
    }

    @Override
    public void delete(User user) {
        System.out.print("Instructor ");super.delete(user);
    }
}
