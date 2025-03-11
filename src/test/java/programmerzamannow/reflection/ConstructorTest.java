package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorTest {

    @Test
    void createConstructor() {
        Class<Person> personClass = Person.class;

        for (var constructor : personClass.getDeclaredConstructors()){
            System.out.println(constructor.getName());
            for (var parameter : constructor.getParameters()){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType());
            }
        }
    }

    @Test
    void newObject() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructorEmpty = personClass.getConstructor();
        Constructor<Person> constructorParameters = personClass.getConstructor(String.class, String.class);

        Person p1 = constructorEmpty.newInstance();
        Person p2 = constructorParameters.newInstance("Fauzan", "Addien");

        System.out.println(p1);
        System.out.println(p2);
    }
}
