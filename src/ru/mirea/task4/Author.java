package ru.mirea.task4;

import java.util.Objects;

public class Author {

    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            this.gender = 'U';
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) at %s", name, gender, email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, gender);
    }
}

