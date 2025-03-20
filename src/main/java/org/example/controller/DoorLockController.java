package org.example.controller;

import org.example.service.DoorLockService;

public class DoorLockController {
    private static final DoorLockService doorLockService = new DoorLockService();

    public void openDoor(){
        doorLockService.openDoor();
    }
}
