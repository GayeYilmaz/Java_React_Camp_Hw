/**
 * @author gaye3
 * @since 1.05.2021
 */
public class Instructor extends User {
    private String degree;

    public Instructor(int id, String name, String surname, String email, String degree) {
        super( id,name, surname, email);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
