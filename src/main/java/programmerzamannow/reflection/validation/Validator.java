package programmerzamannow.reflection.validation;

import programmerzamannow.reflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object person) throws IllegalAccessException{

        //Get Class
        Class<?> aClass = person.getClass();

        //Fer All Fields
        for (Field field : aClass.getDeclaredFields()){
            field.setAccessible(true);

            // Get Not Blank Annotation
            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            // Check if @NotBlank is Exists
            if (notBlank != null){
                //Get Field Value
                String value = (String) field.get(person);
                if (!notBlank.allowEmptyString()) value = value.trim();

                //Check if value is Empty String
                if (value == null || value.isEmpty()){
                    throw new RuntimeException("Field : " + field.getName() + " is blank");
                }
            }
        }
    }
}
