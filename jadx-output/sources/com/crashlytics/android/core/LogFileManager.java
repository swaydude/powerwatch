package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class LogFileManager {
    private static final java.lang.String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
    private static final java.lang.String LOGFILE_EXT = ".temp";
    private static final java.lang.String LOGFILE_PREFIX = "crashlytics-userlog-";
    static final int MAX_LOG_SIZE = 65536;
    private static final com.crashlytics.android.core.LogFileManager.NoopLogStore NOOP_LOG_STORE = new com.crashlytics.android.core.LogFileManager.NoopLogStore();
    private final android.content.Context context;
    private com.crashlytics.android.core.FileLogStore currentLog;
    private final com.crashlytics.android.core.LogFileManager.DirectoryProvider directoryProvider;

    public interface DirectoryProvider {
        java.io.File getLogFileDir();
    }

    LogFileManager(android.content.Context context, com.crashlytics.android.core.LogFileManager.DirectoryProvider directoryProvider) {
        this(context, directoryProvider, null);
    }

    LogFileManager(android.content.Context context, com.crashlytics.android.core.LogFileManager.DirectoryProvider directoryProvider, java.lang.String str) {
        this.context = context;
        this.directoryProvider = directoryProvider;
        this.currentLog = NOOP_LOG_STORE;
        setCurrentSession(str);
    }

    final void setCurrentSession(java.lang.String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str == null) {
            return;
        }
        if (!io.fabric.sdk.android.services.common.CommonUtils.getBooleanResourceValue(this.context, COLLECT_CUSTOM_LOGS, true)) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Preferences requested no custom logs. Aborting log file creation.");
        } else {
            setLogFile(getWorkingFileForSession(str), 65536);
        }
    }

    void writeToLog(long j, java.lang.String str) {
        this.currentLog.writeToLog(j, str);
    }

    com.crashlytics.android.core.ByteString getByteStringForLog() {
        return this.currentLog.getLogAsByteString();
    }

    byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    void clearLog() {
        this.currentLog.deleteLogFile();
    }

    void discardOldLogFiles(java.util.Set<java.lang.String> set) {
        java.io.File[] fileArrListFiles = this.directoryProvider.getLogFileDir().listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file : fileArrListFiles) {
                if (!set.contains(getSessionIdForFile(file))) {
                    file.delete();
                }
            }
        }
    }

    void setLogFile(java.io.File file, int i) {
        this.currentLog = new com.crashlytics.android.core.QueueFileLogStore(file, i);
    }

    private java.io.File getWorkingFileForSession(java.lang.String str) {
        return new java.io.File(this.directoryProvider.getLogFileDir(), LOGFILE_PREFIX + str + LOGFILE_EXT);
    }

    private java.lang.String getSessionIdForFile(java.io.File file) {
        java.lang.String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(LOGFILE_EXT);
        return iLastIndexOf == -1 ? name : name.substring(20, iLastIndexOf);
    }

    private static final class NoopLogStore implements com.crashlytics.android.core.FileLogStore {
        @Override // com.crashlytics.android.core.FileLogStore
        public void closeLogFile() {
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public void deleteLogFile() {
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public com.crashlytics.android.core.ByteString getLogAsByteString() {
            return null;
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public byte[] getLogAsBytes() {
            return null;
        }

        @Override // com.crashlytics.android.core.FileLogStore
        public void writeToLog(long j, java.lang.String str) {
        }

        private NoopLogStore() {
        }
    }
}
