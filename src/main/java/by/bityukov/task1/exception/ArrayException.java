package by.bityukov.task1.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class ArrayException extends Exception{
    public static final Logger log = LogManager.getLogger();

    private int number;

    public ArrayException(){
        super("Array Exception");
        log.error("Array Exception");
    }

    public ArrayException(String message){
        super(message);
        log.error(message);
    }

    public ArrayException(String message, int number){
        super(message);
        this.number = number;
        log.error(message);
    }

    public int getNumber(){
        return number;
    }
}
