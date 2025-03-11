package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveFieldTest {
    Class<Person> personClass = Person.class;
    Person person = new Person();
    @Test
    void testPrimitive() throws NoSuchFieldException {
        Field age = personClass.getDeclaredField("age");
        System.out.println(age.getType().isPrimitive());
    }

    @Test
    void getPrimitive() throws NoSuchFieldException, IllegalAccessException {
        Field age = personClass.getDeclaredField("age");
        person.setAge(30);

        age.setAccessible(true);
        System.out.println(age.getInt(person));
    }

    @Test
    void testInvoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method setAge = personClass.getDeclaredMethod("setAge", int.class);
        setAge.invoke(person, 25);

        System.out.println(person);
    }
}
