package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class ParameterizedReturnTypeTest {
    Class<Person> personClass = Person.class;

    @Test
    void testGet() throws NoSuchMethodException {
        Method getHobbies = personClass.getDeclaredMethod("getHobbies");

        Type returnType = getHobbies.getGenericReturnType();

        if (returnType instanceof ParameterizedType parameterizedType){
            System.out.println(parameterizedType.getRawType());
            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
        }
    }

    @Test
    void testParameter() throws NoSuchMethodException {
        Method getHobbies = personClass.getDeclaredMethod("setHobbies", List.class);

        for (Type type : getHobbies.getGenericParameterTypes()){
            if (type instanceof ParameterizedType parameterizedType){
                System.out.println(parameterizedType.getRawType());
                System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
            }
        }
    }

    @Test
    void testField() throws NoSuchFieldException {
        Field hobbies = personClass.getDeclaredField("hobbies");
        Type type = hobbies.getGenericType();

        if (type instanceof ParameterizedType parameterizedType){
            System.out.println(parameterizedType.getRawType());
            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
        }
    }
}
