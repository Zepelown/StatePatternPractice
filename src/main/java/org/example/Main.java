package org.example;

import org.example.controller.DoorLockController;
import org.example.model.DoorLockContext;

public class Main {
    public static void main(String[] args) {
        DoorLockController doorLockController = new DoorLockController();
        doorLockController.openDoor();
    }
}