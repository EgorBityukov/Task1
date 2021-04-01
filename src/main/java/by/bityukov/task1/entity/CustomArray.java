package by.bityukov.task1.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CustomArray {

    private int[] array;

    public CustomArray() {
        array = new int[10];
    }

    public CustomArray(int arraySize) {
        if (arraySize < 0) {
            throw new IllegalArgumentException();
        }
        array = new int[arraySize];
    }

    public int getElement(int index) {
        if (index < 0 || index > array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public void addElement(int index, int element) {
        if (index < 0 || index > array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[index] = element;
    }

    public int size() {
        int size = array.length;
        return size;
    }

    public void changeSize(int arraySize) {
        if (arraySize < 0) {
            throw new IllegalArgumentException();
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

    public void remove(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                array[i] = 0;
            }
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index > array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[index] = 0;
    }

    public void clear() {
        int size = array.length;
        array = new int[size];
    }

    public static void main(String[] args) {
        CustomArray customArray = new CustomArray();
        customArray.changeSize(5);
        System.out.println(customArray.size());
        customArray.clear();
        System.out.println(customArray.size());
    }
}
