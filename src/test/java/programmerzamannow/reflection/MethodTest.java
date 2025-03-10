package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodTest {

    @Test
    void testGetMethod() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();

        for (var method : methods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));
        }
    }

    @Test
    void callMethodObject() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person("Fauzan" , "Addien");
        Class<Person> personClass = Person.class;
        Method getFirstName = personClass.getDeclaredMethod("getFistName");

        Object response = getFirstName.invoke(person);
        System.out.println(response);
    }
}
