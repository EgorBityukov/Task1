package by.bityukov.task1.reader;

import by.bityukov.task1.validate.ArrayValidator;

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
