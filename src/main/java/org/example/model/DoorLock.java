package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class DoorLock {

    private final Code code;
    private final SerialNumber serialNumber;

    public DoorLock(String code, String serialNumber) {
        this.code = new Code(code);
        this.serialNumber = new SerialNumber(serialNumber);
        List<Integer> test;
    }

    public boolean isCorrectCode(Code code){
        return this.code.isMatched(code);
    }


}
