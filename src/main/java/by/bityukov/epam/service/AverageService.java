package by.bityukov.epam.service;

import by.bityukov.epam.entity.CustomArray;
import by.bityukov.epam.exception.ArrayException;

import java.util.stream.IntStream;

public class AverageService {

    public double averageValue(CustomArray array) throws ArrayException {

        if (array.size() == 0) {
            return 0;
        }
        if (array.size() == 1) {
            return array.getElement(0);
        }

        double average;
        double sum = 0;

        for (int i = 0; i < array.size(); i++) {
            sum += array.getElement(i);
        }
        average = sum / array.size();

        return average;
    }

    public double streamAverageValue(CustomArray array) throws ArrayException {
        if (array.size() == 0) {
            return 0;
        }
        if (array.size() == 1) {
            return array.getElement(0);
        }

        double average;
        average = IntStream.of(array.arrayCopy()).average().getAsDouble();
        return average;
    }
}
