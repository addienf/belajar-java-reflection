package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Product;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;

public class RecordTest {

    Class<Product> productClass = Product.class;

    @Test
    void testRecord() {
        System.out.println(productClass.isRecord());
        System.out.println(Arrays.toString(productClass.getDeclaredFields()));
        System.out.println(Arrays.toString(productClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(productClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(productClass.getRecordComponents()));
    }

    @Test
    void changeRecord() throws InvocationTargetException, IllegalAccessException {
        Product product = new Product("1", "iPhone", 2_000_000L);

        RecordComponent component = Arrays.stream(productClass.getRecordComponents())
                .filter(recordComponent -> recordComponent.getName().equals("id"))
                .findFirst().get();

        Method method = component.getAccessor();

        System.out.println(method.invoke(product));
    }
}
