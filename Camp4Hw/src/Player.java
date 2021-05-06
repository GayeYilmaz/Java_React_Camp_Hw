/**
 * @author gaye3
 * @since 7.05.2021
 */
public class Player {
    private int id;
    private String name;
    private String surname;
    private int birthYear;
    private String tcNo;

    public Player(int id,String name, String surname, int birthYear, String tcNo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.tcNo = tcNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player() {
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
}
