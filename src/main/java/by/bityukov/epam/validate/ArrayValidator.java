package by.bityukov.epam.validate;

import java.util.regex.Pattern;

public class ArrayValidator {
    private static final String REGEX = "[^0-9 ,-]";

    public boolean isValid(String s){
        boolean valid = true;
        if(Pattern.compile(REGEX).matcher(s).find())
        {
            valid = false;
        }
        return valid;
    }
}
