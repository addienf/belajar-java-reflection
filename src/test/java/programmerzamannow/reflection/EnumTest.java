package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Gender;

import java.util.Arrays;

public class EnumTest {

    Class<Gender> genderClass = Gender.class;

    @Test
    void testEnum() {
        System.out.println(genderClass.isEnum());
        System.out.println(genderClass.getSuperclass());
        System.out.println(Arrays.toString(genderClass.getEnumConstants()));
    }
}
