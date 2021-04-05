package by.bityukov.epam.service;

import by.bityukov.epam.entity.CustomArray;
import by.bityukov.epam.exception.ArrayException;

public class SumService {

    public int sum(CustomArray array) throws ArrayException {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.getElement(i);
        }
        return sum;
    }
}
