package by.bityukov.epam.reader;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LineReaderTest {

    LineReader lineReader = new LineReader();

    @Test
    public void testDefaultConstructor() throws IOException {
        String s = lineReader.readFile("C:\\Users\\Lenovo\\Desktop\\1.txt");
        Assert.assertEquals(s, "1 2 3");
    }
}
