package org.example.state;

import org.example.DoorLockContext;
import org.example.model.Code;

public class UnlockedState implements LockState{
    private static final UnlockedState unlockedState = new UnlockedState();
    public static UnlockedState getInstance() {
        return unlockedState;
    }

    @Override
    public void enterCode(DoorLockContext context, Code code) {
        System.out.println("이미 열린 문입니다.");
    }

    @Override
    public void closeDoor(DoorLockContext context) {
        System.out.println("문을 닫습니다.");
        context.setLockState(LockedState.getInstance());
    }
}
