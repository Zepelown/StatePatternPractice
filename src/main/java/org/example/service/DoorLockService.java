package org.example.service;

import org.example.model.DoorLockContext;

public class DoorLockService {
    DoorLockContext doorLockContext = new DoorLockContext();

    public void openDoor(){
        doorLockContext.openDoor();
    }
}
