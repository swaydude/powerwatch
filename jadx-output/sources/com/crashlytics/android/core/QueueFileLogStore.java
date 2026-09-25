package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class QueueFileLogStore implements com.crashlytics.android.core.FileLogStore {
    private io.fabric.sdk.android.services.common.QueueFile logFile;
    private final int maxLogSize;
    private final java.io.File workingFile;

    public class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    public QueueFileLogStore(java.io.File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void writeToLog(long j, java.lang.String str) {
        openLogFile();
        doWriteToLog(j, str);
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public com.crashlytics.android.core.ByteString getLogAsByteString() {
        com.crashlytics.android.core.QueueFileLogStore.LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return com.crashlytics.android.core.ByteString.copyFrom(logBytes.bytes, 0, logBytes.offset);
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public byte[] getLogAsBytes() {
        com.crashlytics.android.core.QueueFileLogStore.LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return logBytes.bytes;
    }

    private com.crashlytics.android.core.QueueFileLogStore.LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        io.fabric.sdk.android.services.common.QueueFile queueFile = this.logFile;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.usedBytes()];
        try {
            this.logFile.forEach(new io.fabric.sdk.android.services.common.QueueFile.ElementReader() { // from class: com.crashlytics.android.core.QueueFileLogStore.1
                @Override // io.fabric.sdk.android.services.common.QueueFile.ElementReader
                public void read(java.io.InputStream inputStream, int i) throws java.io.IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (java.io.IOException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new com.crashlytics.android.core.QueueFileLogStore.LogBytes(bArr, iArr[0]);
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void closeLogFile() {
        io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new io.fabric.sdk.android.services.common.QueueFile(this.workingFile);
            } catch (java.io.IOException e) {
                io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Could not open log file: " + this.workingFile, e);
            }
        }
    }

    private void doWriteToLog(long j, java.lang.String str) {
        if (this.logFile == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.maxLogSize / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.logFile.add(java.lang.String.format(java.util.Locale.US, "%d %s%n", java.lang.Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
            while (!this.logFile.isEmpty() && this.logFile.usedBytes() > this.maxLogSize) {
                this.logFile.remove();
            }
        } catch (java.io.IOException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
