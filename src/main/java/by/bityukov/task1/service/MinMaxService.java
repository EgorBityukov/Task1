package by.bityukov.task1.service;

import by.bityukov.task1.entity.CustomArray;

public class MinMaxService {

    public int max(CustomArray customArray) throws Exception {
        if (customArray.size() < 1) {
            throw new Exception();
        }
        if (customArray.size() == 1) {
            return customArray.getElement(0);
        }

        int max = customArray.getElement(0);

        for (int i = 1; i < customArray.size(); i++) {
            if (max < customArray.getElement(i)) {
                max = customArray.getElement(i);
            }
        }
        return max;
    }

    public int min(CustomArray customArray) throws Exception {
        if (customArray.size() < 1) {
            throw new Exception();
        }
        if (customArray.size() == 1) {
            return customArray.getElement(0);
        }

        int min = customArray.getElement(0);

        for (int i = 1; i < customArray.size(); i++) {
            if (min > customArray.getElement(i)) {
                min = customArray.getElement(i);
            }
        }
        return min;
    }
}
