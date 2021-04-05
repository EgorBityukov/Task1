package by.bityukov.epam.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberParser {

    public static Logger log = LogManager.getLogger();

    public int[] parse(String line) {
        int[] numbers = new int[line.length()];
        int n = 0;

        for (String s : line.split(" - |, |,| ")) {
            try {
                numbers[n] = Integer.parseInt(s);
                n++;
            } catch (NumberFormatException e) {
                log.error("Cast error", s);
            }
        }

        return numbers;
    }
}
