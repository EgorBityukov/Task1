package by.bityukov.epam.entity;

import by.bityukov.epam.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayTest {

    private CustomArray customArray;

    @Test
    public void testDefaultConstructor() {
        customArray =  new CustomArray();
        Assert.assertEquals(customArray.size(), 10);
    }

    @Test(expectedExceptions = ArrayException.class)
    public void testMinusConstructor() throws ArrayException {
        customArray =  new CustomArray(-10);
    }
}
