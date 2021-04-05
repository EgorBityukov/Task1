package by.bityukov.epam.service;

import by.bityukov.epam.entity.CustomArray;
import by.bityukov.epam.exception.ArrayException;

import java.util.stream.IntStream;

public class MinMaxService {

    public int streamMax(CustomArray customArray) throws ArrayException {
        int max = customArray.getElement(0);

        if (customArray.size() == 1) {
            return max;
        }

        int[] array = customArray.arrayCopy();
        max = IntStream.of(array).max().orElse(0);

        return max;
    }

    public int streamMin(CustomArray customArray) throws ArrayException {
        int min = customArray.getElement(0);

        if (customArray.size() == 1) {
            return min;
        }

        int[] array = customArray.arrayCopy();
        min = IntStream.of(array).min().orElse(0);

        return min;
    }

    public int max(CustomArray customArray) throws Exception {
        if (customArray.size() == 0) {
            return 0;
        }

        int max = customArray.getElement(0);

        if (customArray.size() == 1) {
            return max;
        }

        for (int i = 1; i < customArray.size(); i++) {
            if (max < customArray.getElement(i)) {
                max = customArray.getElement(i);
            }
        }

        return max;
    }

    public int min(CustomArray customArray) throws Exception {
        if (customArray.size() == 0) {
            return 0;
        }

        int min = customArray.getElement(0);

        if (customArray.size() == 1) {
            return min;
        }



        for (int i = 1; i < customArray.size(); i++) {
            if (min > customArray.getElement(i)) {
                min = customArray.getElement(i);
            }
        }
        return min;
    }
}
