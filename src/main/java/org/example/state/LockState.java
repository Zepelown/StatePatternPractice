package org.example.state;

import org.example.model.DoorLockContext;
import org.example.model.Code;

public interface LockState {
    void enterCode(DoorLockContext context, Code code);
    void closeDoor(DoorLockContext context);
}
