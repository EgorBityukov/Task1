package by.bityukov.epam.validate;

import java.util.regex.Pattern;

public class ArrayValidator {
    public boolean isValid(String s){
        boolean valid = true;
        if(Pattern.compile("[^0-9 ,-]").matcher(s).find())
        {
            valid = false;
        }
        return valid;
    }
}
