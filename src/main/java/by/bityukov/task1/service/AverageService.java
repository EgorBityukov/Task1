package by.bityukov.task1.service;

import by.bityukov.task1.entity.CustomArray;

public class AverageService {

    public double averageValue(CustomArray array) throws Exception {

        if (array.size() < 1) {
            throw new Exception();
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
}
