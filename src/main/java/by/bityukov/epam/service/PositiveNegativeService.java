package by.bityukov.epam.service;

import by.bityukov.epam.entity.CustomArray;
import by.bityukov.epam.exception.ArrayException;

public class PositiveNegativeService {

    public int positiveElementsAmount(CustomArray array) throws ArrayException {
        int amount = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.getElement(i) >= 0) {
                amount++;
            }
        }
        return amount;
    }

    public int negativeElementsAmount(CustomArray array) throws ArrayException {
        int amount = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.getElement(i) < 0) {
                amount++;
            }
        }
        return amount;
    }

    public CustomArray positiveElements(CustomArray array) throws ArrayException {
        int currentIndex = 0;
        CustomArray positiveArray = new CustomArray(array.size());
        for (int i = 0; i < array.size(); i++) {
            if (array.getElement(i) >= 0) {
                positiveArray.addElement(currentIndex, array.getElement(i));
                currentIndex++;
            }
        }
        return positiveArray;
    }

    public CustomArray negativeElements(CustomArray array) throws ArrayException {
        int currentIndex = 0;
        CustomArray negativeArray = new CustomArray(array.size());
        for (int i = 0; i < array.size(); i++) {
            if (array.getElement(i) < 0) {
                negativeArray.addElement(currentIndex, array.getElement(i));
                currentIndex++;
            }
        }
        return negativeArray;
    }
}
