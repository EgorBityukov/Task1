package by.bityukov.epam.entity;


import by.bityukov.epam.exception.ArrayException;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray() {
        array = new int[10];
    }

    public CustomArray(int arraySize) throws ArrayException {
        if (arraySize < 0) {
            throw new ArrayException("Array size less then 0", arraySize);
        }
        array = new int[arraySize];
    }

    public int getElement(int index) throws ArrayException {
        if (index < 0 || index > array.length) {
            throw new ArrayException("Index out of range", index);
        }
        return array[index];
    }

    public void addElement(int index, int element) throws ArrayException {
        if (index < 0 || index > array.length) {
            throw new ArrayException("Index out of range", index);
        }
        array[index] = element;
    }

    public int size() {
        int size = array.length;
        return size;
    }

    public void changeSize(int arraySize) throws ArrayException {
        if (arraySize < 0) {
            throw new ArrayException("Incorrect size", arraySize);
        }

        int[] arrayBuffer = new int[arraySize];
        if (arraySize >= array.length) {
            for (int i = 0; i < array.length; i++) {
                arrayBuffer[i] = array[i];
            }
            array = arrayBuffer;
        }
        if (arraySize < array.length) {
            for (int i = 0; i < arraySize; i++) {
                arrayBuffer[i] = array[i];
            }
            array = arrayBuffer;
        }
    }

    public int[] arrayCopy() {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public void remove(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                array[i] = 0;
            }
        }
    }

    public void removeAt(int index) throws ArrayException {
        if (index < 0 || index > array.length) {
            throw new ArrayException("Index out of range", index);
        }
        array[index] = 0;
    }

    public void clear() {
        int size = array.length;
        array = new int[size];
    }

    @Override
    public String toString() {
        String stringArray;
        stringArray = Arrays.toString(array);
        return stringArray;
    }
}
