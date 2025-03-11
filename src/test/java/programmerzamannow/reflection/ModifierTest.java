package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;

import java.lang.reflect.Modifier;

public class ModifierTest {
    Class<Person> personClass = Person.class;

    @Test
    void testModifier() {
        System.out.println(Modifier.isPublic(personClass.getModifiers()));
        System.out.println(Modifier.isFinal(personClass.getModifiers()));
        System.out.println(Modifier.isStatic(personClass.getModifiers()));
    }
}
