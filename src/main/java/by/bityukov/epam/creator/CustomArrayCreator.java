package by.bityukov.epam.creator;

import by.bityukov.epam.entity.CustomArray;
import by.bityukov.epam.exception.ArrayException;

public class CustomArrayCreator {
    public CustomArray create(int[] numbers) throws ArrayException {
        if(numbers.length<1){
            throw new ArrayException("Length should be more than 0");
        }
        CustomArray array = new CustomArray(numbers.length);
        for(int i=0;i< numbers.length;i++){
            array.addElement(i, numbers[i]);
        }
        return array;
    }
}
