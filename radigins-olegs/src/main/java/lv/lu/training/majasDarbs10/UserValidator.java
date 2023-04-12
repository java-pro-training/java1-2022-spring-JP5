package lv.lu.training.majasDarbs10;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {
    private static final int minTextLength = 3;
    private static final int maxTextLength = 15;
    private static final int minAge = 0;
    private static final int maxAge = 120;
    List<String> errors = new ArrayList<>();
    ValidationException invalidLengthException = new ValidationException(" Name and surname has to be 3 to 15 characters long");
    ValidationException invalidAgeException = new ValidationException("Age must be within human possibility : 0-120");

    public void validate(User user) {
        errors.clear();
        try {
            if (hasInvalidLength(user.getName()) || hasInvalidLength(user.getSurname())) {
                throw invalidLengthException;
            }

        }catch (ValidationException exception){
            errors.add(invalidLengthException.getMessage());

        }try {
            if (hasInvalidAge(user.getAge())) {
                throw invalidAgeException;
            }

        }catch (ValidationException exception){
            errors.add(invalidAgeException.getMessage());

        }finally {
            System.out.println(errors);
        }

    }

    private boolean hasInvalidLength(String text){
        return text.length() < minTextLength || text.length() >maxTextLength;
    }
    private boolean hasInvalidAge( int age){
        return age < minAge || age > maxAge;
    }

}
