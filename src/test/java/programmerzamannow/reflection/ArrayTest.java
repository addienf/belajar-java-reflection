package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

    Class<String[]> stringArrayClass = String[].class;
    Class<int[][]> intArrayClass = int[][].class;

    @Test
    void testArray() {

        System.out.println(stringArrayClass.isArray());
        System.out.println(intArrayClass.isArray());
    }

    @Test
    void arrayMember() {
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredFields()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredConstructors()));
    }

    @Test
    void javaLangReflectArray() {
        Object array = Array.newInstance(stringArrayClass.getComponentType(), 10);

        Array.set(array, 0, "Addien");
        Array.set(array, 1, "Fauzan");

        System.out.println(Array.get(array, 0));
        System.out.println(Array.get(array, 1));
    }
}
