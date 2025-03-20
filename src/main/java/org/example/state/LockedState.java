package org.example.state;

import org.example.model.DoorLockContext;
import org.example.datasource.DoorLockRepository;
import org.example.model.Code;

public class LockedState implements LockState{
    private static final LockState lockedState = new LockedState();
    private final DoorLockRepository doorLockRepository = DoorLockRepository.getInstance();
    public static LockState getInstance(){
        return lockedState;
    }

    @Override
    public void enterCode(DoorLockContext context, Code code) {
        if(!doorLockRepository.isCorrectCode(code)){
            System.out.println("올바르지 않은 비밀번호입니다.");
            context.openDoor();
            return;
        }
        context.setLockState(UnlockedState.getInstance());
    }

    @Override
    public void closeDoor(DoorLockContext context) {
        System.out.println("이미 잠겨있습니다.");
    }
}
