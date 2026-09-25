package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public enum Priority {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    static <Y> int compareTo(io.fabric.sdk.android.services.concurrency.PriorityProvider priorityProvider, Y y) {
        io.fabric.sdk.android.services.concurrency.Priority priority;
        if (y instanceof io.fabric.sdk.android.services.concurrency.PriorityProvider) {
            priority = ((io.fabric.sdk.android.services.concurrency.PriorityProvider) y).getPriority();
        } else {
            priority = NORMAL;
        }
        return priority.ordinal() - priorityProvider.getPriority().ordinal();
    }
}
