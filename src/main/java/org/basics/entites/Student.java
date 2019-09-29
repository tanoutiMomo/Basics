package org.basics.entites;

public class Student {

    private String firstName;
    private String lastName;

    public Student(final String firstName, final String lastNAme) {
        this.firstName = firstName;
        this.lastName = lastNAme;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object other) {
        System.out.println("inside the method equals");
        if( other != null && other instanceof Student) {
            Student otherStudent = (Student)other;
            return (otherStudent.getFirstName() != null && otherStudent.getFirstName().equals(this.firstName)
                    && otherStudent.getLastName() != null && otherStudent.getLastName().equals(this.lastName));
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("dans la methode hashCode");
        return firstName.length()+lastName.length();
    }

}
