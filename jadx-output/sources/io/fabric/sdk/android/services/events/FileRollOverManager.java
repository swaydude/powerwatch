package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public interface FileRollOverManager {
    void cancelTimeBasedFileRollOver();

    boolean rollFileOver() throws java.io.IOException;

    void scheduleTimeBasedRollOverIfNeeded();
}
