package programmerzamannow.reflection.entity;

public class Person {

    public String fistName;

    public String lastName;

    public Person() {
    }

    public Person(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
