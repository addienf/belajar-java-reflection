package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;

public class SuperClassTest {

    @Test
    void testSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        Class<? super Person> superClass = personClass.getSuperclass();
        System.out.println(superClass);

        Class<? super Person> superClassTop = superClass.getSuperclass();
        System.out.println(superClassTop);
    }
}
