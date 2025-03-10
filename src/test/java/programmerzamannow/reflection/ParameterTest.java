package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {
    @Test
    void testCreateParameter() {
        Class<Person> personClass = Person.class;

        for (var method : personClass.getDeclaredMethods()){
            Parameter[] parameters = method.getParameters();
            System.out.println(method.getName());
            for (var parameter : parameters){
                System.out.println("Parameter Name : " + parameter.getName());
                System.out.println("Parameter Type : " + parameter.getType());
            }
            System.out.println("==========");
        }
    }

    @Test
    void testCallParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFistName", String.class);

        Person person = new Person("Fauzan", "Addien");
        setFirstName.invoke(person, "Joko");

        System.out.println(person.getFistName());
    }
}
