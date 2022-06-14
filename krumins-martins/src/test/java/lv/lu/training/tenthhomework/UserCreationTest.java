package lv.lu.training.tenthhomework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserCreationTest {

    /* šeit ir iekļautas arī pirmā uzdevuma prasības, jo jau sākotnēji izvēlējos testēt 10. nodarbības piemēru
    * pēdējais tests beidzas ar kļūdu speciāli, lai parādītu, ka pārbaude darbojas
    * */

    private UserValidator victim;
    private User user;

    @BeforeEach
    public void setUp(){
    }

    @Test
    public void shouldReturnCustomException() {
        victim = new UserValidator();
        user = new User("Martins", "Krumins", -1);

        Assertions.assertThrows(ValidationException.class, () -> victim.validate(user));
    }

    @Test
    public void shouldReturnAgeExceptionMessage() {
        victim = new UserValidator();
        user = new User("Martins", "Krumins", -1);

        ValidationException thrown = Assertions.assertThrows(ValidationException.class, () -> victim.validate(user));

        Assertions.assertEquals("Age must be within human possibility : 0 - 120", thrown.getMessage());

    }

    @Test
    public void shouldReturnLengthExceptionMessage() {
        victim = new UserValidator();
        user = new User("Martins123456789", "Krumins", -1);

        ValidationException thrown = Assertions.assertThrows(ValidationException.class, () -> victim.validate(user));

        Assertions.assertEquals("Name and surname has to be 3 to 15 characters lon", thrown.getMessage());

    }

}