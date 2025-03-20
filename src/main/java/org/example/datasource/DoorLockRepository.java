package org.example.datasource;

import org.example.model.Code;
import org.example.model.DoorLock;

public class DoorLockRepository {
    private static final DoorLockRepository doorLockRepository = new DoorLockRepository();
    private static final DoorLock doorLock = new DoorLock("1234","1222");

    public static DoorLockRepository getInstance() {
        return doorLockRepository;
    }

    public boolean isCorrectCode(Code code){
        return doorLock.isCorrectCode(code);
    }
}
