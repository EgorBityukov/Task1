package by.bityukov.task1.service;

import by.bityukov.task1.entity.CustomArray;

public class ChangeElementService {

    public void replace(CustomArray array, int arrayElement, int onElement) {
        if (array.size() > 0) {
            for (int i = 0; i < array.size(); i++) {
                if (array.getElement(i) == arrayElement) {
                    array.addElement(onElement, i);
                }
            }
        }
    }
}
