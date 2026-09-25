package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public interface EventsStorage {
    void add(byte[] bArr) throws java.io.IOException;

    boolean canWorkingFileStore(int i, int i2);

    void deleteFilesInRollOverDirectory(java.util.List<java.io.File> list);

    void deleteWorkingFile();

    java.util.List<java.io.File> getAllFilesInRollOverDirectory();

    java.util.List<java.io.File> getBatchOfFilesToSend(int i);

    java.io.File getRollOverDirectory();

    java.io.File getWorkingDirectory();

    int getWorkingFileUsedSizeInBytes();

    boolean isWorkingFileEmpty();

    void rollOver(java.lang.String str) throws java.io.IOException;
}
