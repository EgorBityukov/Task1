package by.bityukov.epam.service;

import by.bityukov.epam.entity.CustomArray;
import by.bityukov.epam.exception.ArrayException;

public class SortService {

    public void bubbleSort(CustomArray array) throws ArrayException {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.getElement(i) > array.getElement(i+1)) {
                    temp = array.getElement(i);
                    array.addElement(i, array.getElement(i+1));
                    array.addElement(i+1, temp);
                    sorted = false;
                }
            }
        }
    }

    public void insertionSort(CustomArray array) throws ArrayException {
        for (int i = 1; i < array.size(); i++) {
            int current = array.getElement(i);
            int j = i - 1;
            while(j >= 0 && current < array.getElement(i)) {
                array.addElement(j+1, array.getElement(j));
                j--;
            }
            array.addElement(j+1, current);
        }
    }

    public void selectionSort(CustomArray array) throws ArrayException {
        for (int i = 0; i < array.size(); i++) {
            int min = array.getElement(i);
            int minId = i;
            for (int j = i+1; j < array.size(); j++) {
                if (array.getElement(j) < min) {
                    min = array.getElement(j);
                    minId = j;
                }
            }
            int temp = array.getElement(i);
            array.addElement(i, min);
            array.addElement(minId, temp);
        }
    }
}
