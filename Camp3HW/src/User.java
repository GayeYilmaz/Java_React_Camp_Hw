/**
 * @author gaye3
 * @since 1.05.2021
 */
public class User {
    private String name;
    private String surname;
    private int id;
    private String email;

    public User(int id,String name, String surname,  String email) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
