package main;

import by.bityukov.epam.creator.CustomArrayCreator;
import by.bityukov.epam.entity.CustomArray;
import by.bityukov.epam.exception.ArrayException;
import by.bityukov.epam.parser.NumberParser;
import by.bityukov.epam.reader.LineReader;
import by.bityukov.epam.service.SortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {
    public static Logger log = LogManager.getLogger();

    public static void main(String[] args) throws ArrayException {
        CustomArray customArray = null;
        String stringFromFile = null;
        int[] numbers;

        LineReader lineReader = new LineReader();
        NumberParser numberParser = new NumberParser();
        CustomArrayCreator customArrayCreator = new CustomArrayCreator();

        try {
            stringFromFile = lineReader.readFile("src\\main\\resources\\1.txt");
        } catch (IOException e) {
            log.error(e.getMessage());
        }

        numbers = numberParser.parse(stringFromFile);
        customArray = customArrayCreator.create(numbers);

        log.info("Before sort: " + customArray.toString());

        SortService service = new SortService();
        service.bubbleSort(customArray);

        log.info("After sort: " + customArray.toString());

    }
}
