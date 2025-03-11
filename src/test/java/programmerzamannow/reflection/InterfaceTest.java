package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Nameable;
import programmerzamannow.reflection.entity.Person;

import java.util.Arrays;

public class InterfaceTest {

    @Test
    void testCreate() {
        Class<Nameable> nameableClass = Nameable.class;

        System.out.println(nameableClass.isInterface());
        System.out.println(nameableClass.getSuperclass());
    }

    @Test
    void testSuperInterfaces() {
        Class<Person> personClass = Person.class;

        System.out.println(Arrays.toString(personClass.getInterfaces()));
    }
}
