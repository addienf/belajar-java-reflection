package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.entity.Person;
import programmerzamannow.reflection.validation.Validator;

public class ValidateTest {
    @Test
    void testValidation() throws IllegalAccessException {
        Person person = new Person("Addien", "");
        Validator.validateNotBlank(person);
    }
}
