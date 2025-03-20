package org.example.model;

import org.example.model.Code;
import org.example.state.LockState;
import org.example.state.LockedState;
import org.example.state.UnlockedState;
import org.example.view.DoorLockInput;

public class DoorLockContext {
    LockState lockState = LockedState.getInstance();
    DoorLockInput doorLockInput = new DoorLockInput();

    public void enterCode(Code code) {
        lockState.enterCode(this, code);
        if (lockState instanceof UnlockedState) {
            waitForClose();
        }
    }

    public void setLockState(LockState lockState) {
        this.lockState = lockState;
    }

    public void openDoor() {
        Code doorLockCode = doorLockInput.getDoorLockCode();
        enterCode(doorLockCode);
    }

    private void waitForClose() {
        if (doorLockInput.getCloseDoorInput()) {
            lockState.closeDoor(this);
        }
    }
}
