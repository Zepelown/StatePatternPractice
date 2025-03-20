package org.example.service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DoorLockScheduler {
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    public static void run(Runnable runnable, long delay, TimeUnit timeUnit){
        scheduledExecutorService.schedule(runnable,delay,timeUnit);
        scheduledExecutorService.shutdown();
    }
    public static void shutdownScheduler() {
        scheduledExecutorService.shutdown();
    }
}
