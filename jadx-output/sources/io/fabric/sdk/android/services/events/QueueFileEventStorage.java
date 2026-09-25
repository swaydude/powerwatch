package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public class QueueFileEventStorage implements io.fabric.sdk.android.services.events.EventsStorage {
    private final android.content.Context context;
    private io.fabric.sdk.android.services.common.QueueFile queueFile;
    private java.io.File targetDirectory;
    private final java.lang.String targetDirectoryName;
    private final java.io.File workingDirectory;
    private final java.io.File workingFile;

    public QueueFileEventStorage(android.content.Context context, java.io.File file, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        this.context = context;
        this.workingDirectory = file;
        this.targetDirectoryName = str2;
        java.io.File file2 = new java.io.File(file, str);
        this.workingFile = file2;
        this.queueFile = new io.fabric.sdk.android.services.common.QueueFile(file2);
        createTargetDirectory();
    }

    private void createTargetDirectory() {
        java.io.File file = new java.io.File(this.workingDirectory, this.targetDirectoryName);
        this.targetDirectory = file;
        if (file.exists()) {
            return;
        }
        this.targetDirectory.mkdirs();
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public void add(byte[] bArr) throws java.io.IOException {
        this.queueFile.add(bArr);
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public int getWorkingFileUsedSizeInBytes() {
        return this.queueFile.usedBytes();
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public void rollOver(java.lang.String str) throws java.lang.Throwable {
        this.queueFile.close();
        move(this.workingFile, new java.io.File(this.targetDirectory, str));
        this.queueFile = new io.fabric.sdk.android.services.common.QueueFile(this.workingFile);
    }

    private void move(java.io.File file, java.io.File file2) throws java.lang.Throwable {
        java.io.OutputStream outputStream;
        java.io.FileInputStream fileInputStream = null;
        java.io.OutputStream moveOutputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                moveOutputStream = getMoveOutputStream(file2);
                io.fabric.sdk.android.services.common.CommonUtils.copyStream(fileInputStream2, moveOutputStream, new byte[1024]);
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream2, "Failed to close file input stream");
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(moveOutputStream, "Failed to close output stream");
                file.delete();
            } catch (java.lang.Throwable th) {
                th = th;
                outputStream = moveOutputStream;
                fileInputStream = fileInputStream2;
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close file input stream");
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    public java.io.OutputStream getMoveOutputStream(java.io.File file) throws java.io.IOException {
        return new java.io.FileOutputStream(file);
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public java.io.File getWorkingDirectory() {
        return this.workingDirectory;
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public java.io.File getRollOverDirectory() {
        return this.targetDirectory;
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public java.util.List<java.io.File> getBatchOfFilesToSend(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : this.targetDirectory.listFiles()) {
            arrayList.add(file);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public void deleteFilesInRollOverDirectory(java.util.List<java.io.File> list) {
        for (java.io.File file : list) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, java.lang.String.format("deleting sent analytics file %s", file.getName()));
            file.delete();
        }
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public java.util.List<java.io.File> getAllFilesInRollOverDirectory() {
        return java.util.Arrays.asList(this.targetDirectory.listFiles());
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public void deleteWorkingFile() {
        try {
            this.queueFile.close();
        } catch (java.io.IOException unused) {
        }
        this.workingFile.delete();
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public boolean isWorkingFileEmpty() {
        return this.queueFile.isEmpty();
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorage
    public boolean canWorkingFileStore(int i, int i2) {
        return this.queueFile.hasSpaceFor(i, i2);
    }
}
