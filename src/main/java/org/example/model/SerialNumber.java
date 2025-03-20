package org.example.model;

public class SerialNumber {
    private static final int MAX_SERIAL_NUMBER_NUMBER = 7;
    private final String serialNumber;
    public SerialNumber(String serialNumber) {
        if(!validate(serialNumber)){
            throw new IllegalArgumentException("잘못된 시리얼 번호 형식입니다.");
        }
        this.serialNumber = serialNumber;
    }

    private boolean validate(String serialNumber){
        return serialNumber.length() < MAX_SERIAL_NUMBER_NUMBER && !serialNumber.isEmpty();
    }
}
