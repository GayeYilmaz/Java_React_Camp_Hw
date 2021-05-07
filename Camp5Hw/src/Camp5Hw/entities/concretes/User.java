package Camp5Hw.entities.concretes;

import Camp5Hw.entities.abstracts.Entity;

import java.util.ArrayList;

/**
 * @author gaye3
 * @since 7.05.2021
 */
public class User implements Entity {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String parola;

    public User() {
    }

    public User(int id, String name, String surname, String email, String parola) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.parola = parola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}
