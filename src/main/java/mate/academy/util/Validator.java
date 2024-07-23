package mate.academy.util;

import java.util.regex.Pattern;

public class Validator {
    private static final String EMAIL_REGEXP = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    public static boolean validateEmail(String email) {
        return Pattern.compile(EMAIL_REGEXP)
                .matcher(email)
                .matches();
    }
}
