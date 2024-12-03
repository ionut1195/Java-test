package ex1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class DamageChecker {
    public Boolean matches(String input) {
        String regex = "^(damage|minor damages|heavy damage)$"; // I created a pattern which matches a string which
        // starts exclusively with 'damage'/'minor'/'heavy' and ends in 'damage'/'damages'

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}

