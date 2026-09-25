package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public interface EventLogger {
    void logEvent(java.lang.String str, android.os.Bundle bundle);

    void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle);
}
