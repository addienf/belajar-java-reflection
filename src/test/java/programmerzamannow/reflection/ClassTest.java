package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassTest {

    @Test
    void testClass() throws ClassNotFoundException{
        Class<Person> personClass1 = Person.class;

        Class<?> personClass2 = Class.forName("programmerzamannow.reflection.entity.Person");

        Person person = new Person();
        Class<? extends Person> personClass3 = person.getClass();
    }

    @Test
    void classMethod() {
        Class<Person> personClass = Person.class;

        System.out.println(personClass.getSuperclass());
        System.out.println(personClass.getInterfaces());
        System.out.println(personClass.getDeclaredConstructors());
        System.out.println(personClass.getDeclaredMethods());
        System.out.println(personClass.getModifiers());
        System.out.println(personClass.getPackage());
        System.out.println(personClass.getName());
    }

    @Test
    void fieldTest() {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getDeclaredFields();

        for (var field : fields){
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void getObjectField() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("Fauzan", "Addien");
        Class<Person> personClass = Person.class;

        Field firstName = personClass.getDeclaredField("fistName");
        firstName.setAccessible(true);

        Object firstNameValue = firstName.get(person);
        System.out.println(firstNameValue);
    }

    @Test
    void changeObjectField() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("Fauzan", "Addien");
        Class<Person> personClass = Person.class;

        Field firstName = personClass.getDeclaredField("fistName");
        firstName.setAccessible(true);

        firstName.set(person, "Joko");
        System.out.println(person.getFirstName());
    }
}
