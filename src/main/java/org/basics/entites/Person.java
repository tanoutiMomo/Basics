package org.basics.entites;

public class Person {

    private String firstName;
    private String lastName;

    public Person(final String firstName, final String lastNAme) {
        this.firstName = firstName;
        this.lastName = lastNAme;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
