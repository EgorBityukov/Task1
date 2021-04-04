package by.bityukov.task1.creator;

import by.bityukov.task1.entity.CustomArray;

public class CustomArrayCreator {
    public CustomArray create(int[] numbers){
        CustomArray array = new CustomArray(numbers.length);
        for(int i=0;i< numbers.length;i++){
            array.addElement(i, numbers[i]);
        }
        return array;
    }
}
