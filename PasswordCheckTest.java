import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    PasswordCheck passwordChecker = new PasswordCheck();

    @Test
    void passwordIsValid() {
        String password = "@1Mmtttttttt";
        passwordChecker.passwordIsValid(password);
        assertEquals(6,passwordChecker.c,"Are all the conditions met?");
    }

    @Test
    void passwordIsOk() {
        String password = "@1Mmtttttttt";
        passwordChecker.passwordIsValid(password);
        assertTrue(passwordChecker.passwordIsOk());
    }
}