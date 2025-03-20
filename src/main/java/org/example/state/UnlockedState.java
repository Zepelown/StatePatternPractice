package org.example.state;

import org.example.model.DoorLockContext;
import org.example.model.Code;
import org.example.service.DoorLockScheduler;

import java.util.concurrent.TimeUnit;

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
        DoorLockScheduler.run(new Runnable() {
            @Override
            public void run() {
                context.setLockState(LockedState.getInstance());
                System.out.println("문이 자동으로 잠겼습니다.");
                DoorLockScheduler.shutdownScheduler();
            }
        }, 2, TimeUnit.SECONDS);
    }
}
