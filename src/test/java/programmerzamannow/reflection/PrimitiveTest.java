package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;

public class PrimitiveTest {

    @Test
    void testPrimitive() {
        Class<Integer> integerClass = int.class;
        Class<Long> longClass = long.class;
        Class<Boolean> booleanClass = boolean.class;

        System.out.println(integerClass.isPrimitive());
        System.out.println(longClass.isPrimitive());
        System.out.println(booleanClass.isPrimitive());
    }
}
