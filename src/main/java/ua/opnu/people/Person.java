package ua.opnu.people;

import java.util.Objects;

public class Person {
    private String surname;
    private String name;
    private int age; 

    public Person(String surname, String name, int age) {
        this.surname = sanitize(surname);
        this.name = sanitize(name);
        this.age = Math.max(0, age);
    }

    private static String sanitize(String s) {
        return s == null ? "" : s.trim();
    }

    public String getSurname() { return surname; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setSurname(String surname) { this.surname = sanitize(surname); }
    public void setName(String name) { this.name = sanitize(name); }
    public void setAge(int age) { this.age = Math.max(0, age); }

    @Override
    public String toString() {
        return "Людина " + surname + " " + name + ", вік: " + age;
    }
}
