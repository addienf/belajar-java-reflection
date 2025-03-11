package programmerzamannow.reflection.entity;

import programmerzamannow.reflection.data.Nameable;
import programmerzamannow.reflection.annotation.NotBlank;

import java.io.Serializable;
import java.util.List;

public class Person implements Nameable, Serializable {

    @NotBlank
    public String fistName;

    @NotBlank(allowEmptyString = true)
    public String lastName;

    private int age;

    private List<String> hobbies;

    public Person() {
    }

    public Person(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    @Override
    public String getFirstName() {
        return fistName;
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
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
