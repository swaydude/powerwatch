package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class SystemCurrentTimeProvider implements io.fabric.sdk.android.services.common.CurrentTimeProvider {
    @Override // io.fabric.sdk.android.services.common.CurrentTimeProvider
    public long getCurrentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }
}
