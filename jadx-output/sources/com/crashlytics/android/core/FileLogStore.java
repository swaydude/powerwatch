package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    com.crashlytics.android.core.ByteString getLogAsByteString();

    byte[] getLogAsBytes();

    void writeToLog(long j, java.lang.String str);
}
