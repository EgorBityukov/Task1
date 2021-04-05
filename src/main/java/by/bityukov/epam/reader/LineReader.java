package by.bityukov.epam.reader;

import by.bityukov.epam.validate.ArrayValidator;

import java.io.BufferedReader;
import java.io.IOException;

public class LineReader {
    public String readFile(String path) throws IOException {
        String currentString;

        BufferedReader reader = new BufferedReader(new java.io.FileReader(path));
        ArrayValidator validator = new ArrayValidator();

        while ((currentString = reader.readLine()) != null) {
            if (validator.isValid(currentString)) {
                break;
            }
        }

        return currentString;
    }
}
