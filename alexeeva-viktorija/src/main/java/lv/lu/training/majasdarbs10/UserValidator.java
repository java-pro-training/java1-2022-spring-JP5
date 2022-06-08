package lv.lu.training.majasdarbs10;

public class UserValidator {
    public void validate(User user) {
        if (hasInvalidLength(user.getName()) || hasInvalidLength(user.getSurname())) {
            throw new ValidationException("Name and surname has to be 3 to 15 characters long");
        }

        if (ageCheck(user.getAge())) {
            throw new ValidationException("Age must be within human possibility : 0 - 120");
        }
    }

    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;

    private boolean hasInvalidLength(String text) {
        return text.length() < MIN_TEXT_LENGTH || text.length() > MAX_TEXT_LENGTH;
    }

    private boolean ageCheck(int age) {
        return age < MIN_AGE || age > MAX_AGE;
    }

}
