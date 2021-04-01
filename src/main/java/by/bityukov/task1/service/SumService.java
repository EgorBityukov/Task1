package by.bityukov.task1.service;

import by.bityukov.task1.entity.CustomArray;

public class SumService {

    public int sum(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.getElement(i);
        }
        return sum;
    }
}
