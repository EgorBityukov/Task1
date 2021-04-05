package by.bityukov.epam.service;

import by.bityukov.epam.entity.CustomArray;
import by.bityukov.epam.exception.ArrayException;

public class ChangeElementService {

    public void replace(CustomArray array, int arrayElement, int onElement) throws ArrayException {
        if (array.size() > 0) {
            for (int i = 0; i < array.size(); i++) {
                if (array.getElement(i) == arrayElement) {
                    array.addElement(onElement, i);
                }
            }
        }
    }
}
