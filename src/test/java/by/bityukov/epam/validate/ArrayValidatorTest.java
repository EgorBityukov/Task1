package by.bityukov.epam.validate;

import by.bityukov.epam.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ArrayValidatorTest {

    ArrayValidator validator = new ArrayValidator();

    @Test
    public void testDefaultConstructor() {
        String s1 = "1c3 34cs 432s";
        String s2 = "1 2 3";
        Assert.assertFalse(validator.isValid(s1));
        Assert.assertTrue(validator.isValid(s2));
    }
}
