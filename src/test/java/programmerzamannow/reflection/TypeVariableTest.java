package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Data;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class TypeVariableTest {

    Class<Data> dataClass = Data.class;

    @Test
    void create() {
        for (TypeVariable<Class<Data>> typeParameter : dataClass.getTypeParameters()){
            System.out.println(typeParameter.getName());
            System.out.println(Arrays.toString(typeParameter.getBounds()));
        }
    }
}
