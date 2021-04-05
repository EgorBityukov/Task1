package by.bityukov.epam.validate;

import java.util.regex.Pattern;

public class ArrayValidator {
    public boolean isValid(String s){
        boolean valid = true;
        if(Pattern.matches("[^0-9 ,-]", s))
        {
            valid = false;
        }
        return valid;
    }
}
