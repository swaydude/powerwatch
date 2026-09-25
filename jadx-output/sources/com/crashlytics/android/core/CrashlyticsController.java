package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CrashlyticsController {
    private static final int ANALYZER_VERSION = 1;
    private static final java.lang.String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    private static final java.lang.String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final java.lang.String EVENT_TYPE_CRASH = "crash";
    private static final java.lang.String EVENT_TYPE_LOGGED = "error";
    static final java.lang.String FATAL_SESSION_DIR = "fatal-sessions";
    static final java.lang.String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    static final java.lang.String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final java.lang.String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final java.lang.String FIREBASE_REALTIME = "_r";
    static final java.lang.String FIREBASE_TIMESTAMP = "timestamp";
    private static final java.lang.String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    static final java.lang.String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    static final int MAX_INVALID_SESSIONS = 4;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    static final int MAX_OPEN_SESSIONS = 8;
    static final int MAX_STACK_SIZE = 1024;
    static final java.lang.String NONFATAL_SESSION_DIR = "nonfatal-sessions";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    static final java.lang.String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = "SessionMissingBinaryImages";
    static final java.lang.String SESSION_FATAL_TAG = "SessionCrash";
    private static final int SESSION_ID_LENGTH = 35;
    static final java.lang.String SESSION_JSON_SUFFIX = ".json";
    static final java.lang.String SESSION_NON_FATAL_TAG = "SessionEvent";
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    private final com.crashlytics.android.core.AppData appData;
    private final com.crashlytics.android.core.AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
    private final com.crashlytics.android.core.CrashlyticsBackgroundWorker backgroundWorker;
    private com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler crashHandler;
    private final com.crashlytics.android.core.CrashlyticsCore crashlyticsCore;
    private final com.crashlytics.android.core.DevicePowerStateListener devicePowerStateListener;
    private final java.util.concurrent.atomic.AtomicInteger eventCounter = new java.util.concurrent.atomic.AtomicInteger(0);
    private final io.fabric.sdk.android.services.persistence.FileStore fileStore;
    private final com.crashlytics.android.answers.EventLogger firebaseAnalyticsLogger;
    private final com.crashlytics.android.core.ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
    private final io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory;
    private final io.fabric.sdk.android.services.common.IdManager idManager;
    private final com.crashlytics.android.core.CrashlyticsController.LogFileDirectoryProvider logFileDirectoryProvider;
    private final com.crashlytics.android.core.LogFileManager logFileManager;
    private final com.crashlytics.android.core.PreferenceManager preferenceManager;
    private final com.crashlytics.android.core.ReportUploader.ReportFilesProvider reportFilesProvider;
    private final com.crashlytics.android.core.StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    private final java.lang.String unityVersion;
    static final java.lang.String SESSION_BEGIN_TAG = "BeginSession";
    static final java.io.FilenameFilter SESSION_BEGIN_FILE_FILTER = new com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter(SESSION_BEGIN_TAG) { // from class: com.crashlytics.android.core.CrashlyticsController.1
        @Override // com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter, java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return super.accept(file, str) && str.endsWith(com.crashlytics.android.core.ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    static final java.io.FilenameFilter SESSION_FILE_FILTER = new java.io.FilenameFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.2
        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return str.length() == 39 && str.endsWith(com.crashlytics.android.core.ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    static final java.io.FileFilter SESSION_DIRECTORY_FILTER = new java.io.FileFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.3
        @Override // java.io.FileFilter
        public boolean accept(java.io.File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    };
    static final java.util.Comparator<java.io.File> LARGEST_FILE_NAME_FIRST = new java.util.Comparator<java.io.File>() { // from class: com.crashlytics.android.core.CrashlyticsController.4
        @Override // java.util.Comparator
        public int compare(java.io.File file, java.io.File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    static final java.util.Comparator<java.io.File> SMALLEST_FILE_NAME_FIRST = new java.util.Comparator<java.io.File>() { // from class: com.crashlytics.android.core.CrashlyticsController.5
        @Override // java.util.Comparator
        public int compare(java.io.File file, java.io.File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    private static final java.util.regex.Pattern SESSION_FILE_PATTERN = java.util.regex.Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final java.util.Map<java.lang.String, java.lang.String> SEND_AT_CRASHTIME_HEADER = java.util.Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    static final java.lang.String SESSION_USER_TAG = "SessionUser";
    static final java.lang.String SESSION_APP_TAG = "SessionApp";
    static final java.lang.String SESSION_OS_TAG = "SessionOS";
    static final java.lang.String SESSION_DEVICE_TAG = "SessionDevice";
    private static final java.lang.String[] INITIAL_SESSION_PART_TAGS = {SESSION_USER_TAG, SESSION_APP_TAG, SESSION_OS_TAG, SESSION_DEVICE_TAG};

    private interface CodedOutputStreamWriteAction {
        void writeTo(com.crashlytics.android.core.CodedOutputStream codedOutputStream) throws java.lang.Exception;
    }

    private interface FileOutputStreamWriteAction {
        void writeTo(java.io.FileOutputStream fileOutputStream) throws java.lang.Exception;
    }

    private java.io.File[] ensureFileArrayNotNull(java.io.File[] fileArr) {
        return fileArr == null ? new java.io.File[0] : fileArr;
    }

    static class FileNameContainsFilter implements java.io.FilenameFilter {
        private final java.lang.String string;

        public FileNameContainsFilter(java.lang.String str) {
            this.string = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return str.contains(this.string) && !str.endsWith(com.crashlytics.android.core.ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    }

    static class SessionPartFileFilter implements java.io.FilenameFilter {
        private final java.lang.String sessionId;

        public SessionPartFileFilter(java.lang.String str) {
            this.sessionId = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.sessionId);
            sb.append(com.crashlytics.android.core.ClsFileOutputStream.SESSION_FILE_EXTENSION);
            return (str.equals(sb.toString()) || !str.contains(this.sessionId) || str.endsWith(com.crashlytics.android.core.ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION)) ? false : true;
        }
    }

    private static class AnySessionPartFileFilter implements java.io.FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return !com.crashlytics.android.core.CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) && com.crashlytics.android.core.CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    }

    static class InvalidPartFileFilter implements java.io.FilenameFilter {
        InvalidPartFileFilter() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return com.crashlytics.android.core.ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) || str.contains(com.crashlytics.android.core.CrashlyticsController.SESSION_EVENT_MISSING_BINARY_IMGS_TAG);
        }
    }

    CrashlyticsController(com.crashlytics.android.core.CrashlyticsCore crashlyticsCore, com.crashlytics.android.core.CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, io.fabric.sdk.android.services.common.IdManager idManager, com.crashlytics.android.core.PreferenceManager preferenceManager, io.fabric.sdk.android.services.persistence.FileStore fileStore, com.crashlytics.android.core.AppData appData, com.crashlytics.android.core.UnityVersionProvider unityVersionProvider, com.crashlytics.android.core.AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar, com.crashlytics.android.answers.EventLogger eventLogger) {
        this.crashlyticsCore = crashlyticsCore;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = httpRequestFactory;
        this.idManager = idManager;
        this.preferenceManager = preferenceManager;
        this.fileStore = fileStore;
        this.appData = appData;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.appMeasurementEventListenerRegistrar = appMeasurementEventListenerRegistrar;
        this.firebaseAnalyticsLogger = eventLogger;
        android.content.Context context = crashlyticsCore.getContext();
        com.crashlytics.android.core.CrashlyticsController.LogFileDirectoryProvider logFileDirectoryProvider = new com.crashlytics.android.core.CrashlyticsController.LogFileDirectoryProvider(fileStore);
        this.logFileDirectoryProvider = logFileDirectoryProvider;
        this.logFileManager = new com.crashlytics.android.core.LogFileManager(context, logFileDirectoryProvider);
        this.reportFilesProvider = new com.crashlytics.android.core.CrashlyticsController.ReportUploaderFilesProvider();
        this.handlingExceptionCheck = new com.crashlytics.android.core.CrashlyticsController.ReportUploaderHandlingExceptionCheck();
        this.devicePowerStateListener = new com.crashlytics.android.core.DevicePowerStateListener(context);
        this.stackTraceTrimmingStrategy = new com.crashlytics.android.core.MiddleOutFallbackStrategy(1024, new com.crashlytics.android.core.RemoveRepeatsStrategy(10));
    }

    void enableExceptionHandling(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        openSession();
        com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler(new com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.crashlytics.android.core.CrashlyticsController.6
            @Override // com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, java.lang.Thread thread, java.lang.Throwable th, boolean z2) {
                com.crashlytics.android.core.CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th, z2);
            }
        }, new com.crashlytics.android.core.CrashlyticsController.DefaultSettingsDataProvider(), z, uncaughtExceptionHandler);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        java.lang.Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    synchronized void handleUncaughtException(final com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, final java.lang.Thread thread, final java.lang.Throwable th, final boolean z) {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        this.devicePowerStateListener.dispose();
        final java.util.Date date = new java.util.Date();
        this.backgroundWorker.submitAndWait(new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.7
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() throws java.lang.Exception {
                io.fabric.sdk.android.services.settings.SessionSettingsData sessionSettingsData;
                io.fabric.sdk.android.services.settings.FeaturesSettingsData featuresSettingsData;
                com.crashlytics.android.core.CrashlyticsController.this.crashlyticsCore.createCrashMarker();
                com.crashlytics.android.core.CrashlyticsController.this.writeFatal(date, thread, th);
                io.fabric.sdk.android.services.settings.SettingsData settingsData = settingsDataProvider.getSettingsData();
                if (settingsData != null) {
                    sessionSettingsData = settingsData.sessionData;
                    featuresSettingsData = settingsData.featuresData;
                } else {
                    sessionSettingsData = null;
                    featuresSettingsData = null;
                }
                boolean z2 = false;
                if ((featuresSettingsData == null || featuresSettingsData.firebaseCrashlyticsEnabled) || z) {
                    com.crashlytics.android.core.CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                }
                com.crashlytics.android.core.CrashlyticsController.this.doCloseSessions(sessionSettingsData);
                com.crashlytics.android.core.CrashlyticsController.this.doOpenSession();
                if (sessionSettingsData != null) {
                    com.crashlytics.android.core.CrashlyticsController.this.trimSessionFiles(sessionSettingsData.maxCompleteSessionsCount);
                }
                if (io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(com.crashlytics.android.core.CrashlyticsController.this.crashlyticsCore.getContext()).isDataCollectionEnabled() && !com.crashlytics.android.core.CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                    z2 = true;
                }
                if (z2) {
                    com.crashlytics.android.core.CrashlyticsController.this.sendSessionReports(settingsData);
                }
                return null;
            }
        });
    }

    void submitAllReports(float f, io.fabric.sdk.android.services.settings.SettingsData settingsData) {
        if (settingsData == null) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "Could not send reports. Settings are not available.");
        } else {
            new com.crashlytics.android.core.ReportUploader(this.appData.apiKey, getCreateReportSpiCall(settingsData.appData.reportsUrl, settingsData.appData.ndkReportsUrl), this.reportFilesProvider, this.handlingExceptionCheck).uploadReports(f, shouldPromptUserBeforeSendingCrashReports(settingsData) ? new com.crashlytics.android.core.CrashlyticsController.PrivacyDialogCheck(this.crashlyticsCore, this.preferenceManager, settingsData.promptData) : new com.crashlytics.android.core.ReportUploader.AlwaysSendCheck());
        }
    }

    void writeToLog(final long j, final java.lang.String str) {
        this.backgroundWorker.submit(new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.8
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() throws java.lang.Exception {
                if (com.crashlytics.android.core.CrashlyticsController.this.isHandlingException()) {
                    return null;
                }
                com.crashlytics.android.core.CrashlyticsController.this.logFileManager.writeToLog(j, str);
                return null;
            }
        });
    }

    void writeNonFatalException(final java.lang.Thread thread, final java.lang.Throwable th) {
        final java.util.Date date = new java.util.Date();
        this.backgroundWorker.submit(new java.lang.Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.9
            @Override // java.lang.Runnable
            public void run() throws java.lang.Throwable {
                if (com.crashlytics.android.core.CrashlyticsController.this.isHandlingException()) {
                    return;
                }
                com.crashlytics.android.core.CrashlyticsController.this.doWriteNonFatal(date, thread, th);
            }
        });
    }

    void cacheUserData(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        this.backgroundWorker.submit(new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.10
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() throws java.lang.Exception {
                new com.crashlytics.android.core.MetaDataStore(com.crashlytics.android.core.CrashlyticsController.this.getFilesDir()).writeUserData(com.crashlytics.android.core.CrashlyticsController.this.getCurrentSessionId(), new com.crashlytics.android.core.UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    void cacheKeyData(final java.util.Map<java.lang.String, java.lang.String> map) {
        this.backgroundWorker.submit(new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.11
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() throws java.lang.Exception {
                new com.crashlytics.android.core.MetaDataStore(com.crashlytics.android.core.CrashlyticsController.this.getFilesDir()).writeKeyData(com.crashlytics.android.core.CrashlyticsController.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    void openSession() {
        this.backgroundWorker.submit(new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.12
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() throws java.lang.Exception {
                com.crashlytics.android.core.CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getCurrentSessionId() {
        java.io.File[] fileArrListSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (fileArrListSortedSessionBeginFiles.length > 0) {
            return getSessionIdFromSessionFile(fileArrListSortedSessionBeginFiles[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getPreviousSessionId() {
        java.io.File[] fileArrListSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (fileArrListSortedSessionBeginFiles.length > 1) {
            return getSessionIdFromSessionFile(fileArrListSortedSessionBeginFiles[1]);
        }
        return null;
    }

    static java.lang.String getSessionIdFromSessionFile(java.io.File file) {
        return file.getName().substring(0, 35);
    }

    boolean hasOpenSession() {
        return listSessionBeginFiles().length > 0;
    }

    boolean finalizeSessions(final io.fabric.sdk.android.services.settings.SessionSettingsData sessionSettingsData) {
        return ((java.lang.Boolean) this.backgroundWorker.submitAndWait(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsController.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public java.lang.Boolean call() throws java.lang.Exception {
                if (com.crashlytics.android.core.CrashlyticsController.this.isHandlingException()) {
                    io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Skipping session finalization because a crash has already occurred.");
                    return java.lang.Boolean.FALSE;
                }
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Finalizing previously open sessions.");
                com.crashlytics.android.core.CrashlyticsController.this.doCloseSessions(sessionSettingsData, true);
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Closed all previously open sessions");
                return java.lang.Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenSession() throws java.lang.Exception {
        java.util.Date date = new java.util.Date();
        java.lang.String string = new com.crashlytics.android.core.CLSUUID(this.idManager).toString();
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Opening a new session with ID " + string);
        writeBeginSession(string, date);
        writeSessionApp(string);
        writeSessionOS(string);
        writeSessionDevice(string);
        this.logFileManager.setCurrentSession(string);
    }

    void doCloseSessions(io.fabric.sdk.android.services.settings.SessionSettingsData sessionSettingsData) throws java.lang.Exception {
        doCloseSessions(sessionSettingsData, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void doCloseSessions(io.fabric.sdk.android.services.settings.SessionSettingsData sessionSettingsData, boolean z) throws java.lang.Exception {
        trimOpenSessions((z ? 1 : 0) + 8);
        java.io.File[] fileArrListSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (fileArrListSortedSessionBeginFiles.length <= z) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "No open sessions to be closed.");
            return;
        }
        writeSessionUser(getSessionIdFromSessionFile(fileArrListSortedSessionBeginFiles[z ? 1 : 0]));
        if (sessionSettingsData == null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Unable to close session. Settings are not loaded.");
        } else {
            closeOpenSessions(fileArrListSortedSessionBeginFiles, z ? 1 : 0, sessionSettingsData.maxCustomExceptionEvents);
        }
    }

    private void closeOpenSessions(java.io.File[] fileArr, int i, int i2) throws java.lang.Throwable {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Closing open sessions.");
        while (i < fileArr.length) {
            java.io.File file = fileArr[i];
            java.lang.String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Closing session: " + sessionIdFromSessionFile);
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private void closeWithoutRenamingOrLog(com.crashlytics.android.core.ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream == null) {
            return;
        }
        try {
            clsFileOutputStream.closeInProgressStream();
        } catch (java.io.IOException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error closing session file stream in the presence of an exception", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recursiveDelete(java.util.Set<java.io.File> set) {
        java.util.Iterator<java.io.File> it = set.iterator();
        while (it.hasNext()) {
            recursiveDelete(it.next());
        }
    }

    private void recursiveDelete(java.io.File file) {
        if (file.isDirectory()) {
            for (java.io.File file2 : file.listFiles()) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    private void deleteSessionPartFilesFor(java.lang.String str) {
        for (java.io.File file : listSessionPartFilesFor(str)) {
            file.delete();
        }
    }

    private java.io.File[] listSessionPartFilesFor(java.lang.String str) {
        return listFilesMatching(new com.crashlytics.android.core.CrashlyticsController.SessionPartFileFilter(str));
    }

    java.io.File[] listCompleteSessionFiles() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.io.File fatalSessionFilesDir = getFatalSessionFilesDir();
        java.io.FilenameFilter filenameFilter = SESSION_FILE_FILTER;
        java.util.Collections.addAll(linkedList, listFilesMatching(fatalSessionFilesDir, filenameFilter));
        java.util.Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), filenameFilter));
        java.util.Collections.addAll(linkedList, listFilesMatching(getFilesDir(), filenameFilter));
        return (java.io.File[]) linkedList.toArray(new java.io.File[linkedList.size()]);
    }

    java.io.File[] listNativeSessionFileDirectories() {
        return listFilesMatching(SESSION_DIRECTORY_FILTER);
    }

    java.io.File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    private java.io.File[] listSortedSessionBeginFiles() {
        java.io.File[] fileArrListSessionBeginFiles = listSessionBeginFiles();
        java.util.Arrays.sort(fileArrListSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return fileArrListSessionBeginFiles;
    }

    private java.io.File[] listFilesMatching(java.io.FileFilter fileFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(fileFilter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.io.File[] listFilesMatching(java.io.FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private java.io.File[] listFilesMatching(java.io.File file, java.io.FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private java.io.File[] listFiles(java.io.File file) {
        return ensureFileArrayNotNull(file.listFiles());
    }

    private void trimSessionEventFiles(java.lang.String str, int i) {
        com.crashlytics.android.core.Utils.capFileCount(getFilesDir(), new com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter(str + SESSION_NON_FATAL_TAG), i, SMALLEST_FILE_NAME_FIRST);
    }

    void trimSessionFiles(int i) {
        java.io.File fatalSessionFilesDir = getFatalSessionFilesDir();
        java.util.Comparator<java.io.File> comparator = SMALLEST_FILE_NAME_FIRST;
        int iCapFileCount = i - com.crashlytics.android.core.Utils.capFileCount(fatalSessionFilesDir, i, comparator);
        com.crashlytics.android.core.Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, iCapFileCount - com.crashlytics.android.core.Utils.capFileCount(getNonFatalSessionFilesDir(), iCapFileCount, comparator), comparator);
    }

    private void trimOpenSessions(int i) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.io.File[] fileArrListSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int iMin = java.lang.Math.min(i, fileArrListSortedSessionBeginFiles.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            hashSet.add(getSessionIdFromSessionFile(fileArrListSortedSessionBeginFiles[i2]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching(new com.crashlytics.android.core.CrashlyticsController.AnySessionPartFileFilter()), hashSet);
    }

    private void retainSessions(java.io.File[] fileArr, java.util.Set<java.lang.String> set) {
        for (java.io.File file : fileArr) {
            java.lang.String name = file.getName();
            java.util.regex.Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            if (!matcher.matches()) {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Deleting unknown file: " + name);
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Trimming session file: " + name);
                file.delete();
            }
        }
    }

    private java.io.File[] getTrimmedNonFatalFiles(java.lang.String str, java.io.File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, java.lang.String.format(java.util.Locale.US, "Trimming down to %d logged exceptions.", java.lang.Integer.valueOf(i)));
        trimSessionEventFiles(str, i);
        return listFilesMatching(new com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter(str + SESSION_NON_FATAL_TAG));
    }

    void cleanInvalidTempFiles() {
        this.backgroundWorker.submit(new java.lang.Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.14
            @Override // java.lang.Runnable
            public void run() {
                com.crashlytics.android.core.CrashlyticsController crashlyticsController = com.crashlytics.android.core.CrashlyticsController.this;
                crashlyticsController.doCleanInvalidTempFiles(crashlyticsController.listFilesMatching(new com.crashlytics.android.core.CrashlyticsController.InvalidPartFileFilter()));
            }
        });
    }

    void doCleanInvalidTempFiles(java.io.File[] fileArr) {
        final java.util.HashSet hashSet = new java.util.HashSet();
        for (java.io.File file : fileArr) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Found invalid session part file: " + file);
            hashSet.add(getSessionIdFromSessionFile(file));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        java.io.File invalidFilesDir = getInvalidFilesDir();
        if (!invalidFilesDir.exists()) {
            invalidFilesDir.mkdir();
        }
        for (java.io.File file2 : listFilesMatching(new java.io.FilenameFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.15
            @Override // java.io.FilenameFilter
            public boolean accept(java.io.File file3, java.lang.String str) {
                if (str.length() < 35) {
                    return false;
                }
                return hashSet.contains(str.substring(0, 35));
            }
        })) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Moving session file: " + file2);
            if (!file2.renameTo(new java.io.File(invalidFilesDir, file2.getName()))) {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Could not move session file. Deleting " + file2);
                file2.delete();
            }
        }
        trimInvalidSessionFiles();
    }

    private void trimInvalidSessionFiles() {
        java.io.File invalidFilesDir = getInvalidFilesDir();
        if (invalidFilesDir.exists()) {
            java.io.File[] fileArrListFilesMatching = listFilesMatching(invalidFilesDir, new com.crashlytics.android.core.CrashlyticsController.InvalidPartFileFilter());
            java.util.Arrays.sort(fileArrListFilesMatching, java.util.Collections.reverseOrder());
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i = 0; i < fileArrListFilesMatching.length && hashSet.size() < 4; i++) {
                hashSet.add(getSessionIdFromSessionFile(fileArrListFilesMatching[i]));
            }
            retainSessions(listFiles(invalidFilesDir), hashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finalizeMostRecentNativeCrash(android.content.Context context, java.io.File file, java.lang.String str) throws java.lang.Throwable {
        byte[] bArrMinidumpFromDirectory = com.crashlytics.android.core.NativeFileUtils.minidumpFromDirectory(file);
        byte[] bArrMetadataJsonFromDirectory = com.crashlytics.android.core.NativeFileUtils.metadataJsonFromDirectory(file);
        byte[] bArrBinaryImagesJsonFromDirectory = com.crashlytics.android.core.NativeFileUtils.binaryImagesJsonFromDirectory(file, context);
        if (bArrMinidumpFromDirectory == null || bArrMinidumpFromDirectory.length == 0) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "No minidump data found in directory " + file);
            return;
        }
        recordFatalExceptionAnswersEvent(str, "<native-crash: minidump>");
        byte[] file2 = readFile(str, "BeginSession.json");
        byte[] file3 = readFile(str, "SessionApp.json");
        byte[] file4 = readFile(str, "SessionDevice.json");
        byte[] file5 = readFile(str, "SessionOS.json");
        byte[] file6 = com.crashlytics.android.core.NativeFileUtils.readFile(new com.crashlytics.android.core.MetaDataStore(getFilesDir()).getUserDataFileForSession(str));
        com.crashlytics.android.core.LogFileManager logFileManager = new com.crashlytics.android.core.LogFileManager(this.crashlyticsCore.getContext(), this.logFileDirectoryProvider, str);
        byte[] bytesForLog = logFileManager.getBytesForLog();
        logFileManager.clearLog();
        byte[] file7 = com.crashlytics.android.core.NativeFileUtils.readFile(new com.crashlytics.android.core.MetaDataStore(getFilesDir()).getKeysFileForSession(str));
        java.io.File file8 = new java.io.File(this.fileStore.getFilesDir(), str);
        if (!file8.mkdir()) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Couldn't create native sessions directory");
            return;
        }
        gzipIfNotEmpty(bArrMinidumpFromDirectory, new java.io.File(file8, "minidump"));
        gzipIfNotEmpty(bArrMetadataJsonFromDirectory, new java.io.File(file8, "metadata"));
        gzipIfNotEmpty(bArrBinaryImagesJsonFromDirectory, new java.io.File(file8, "binaryImages"));
        gzipIfNotEmpty(file2, new java.io.File(file8, io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY));
        gzipIfNotEmpty(file3, new java.io.File(file8, io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY));
        gzipIfNotEmpty(file4, new java.io.File(file8, "device"));
        gzipIfNotEmpty(file5, new java.io.File(file8, "os"));
        gzipIfNotEmpty(file6, new java.io.File(file8, "user"));
        gzipIfNotEmpty(bytesForLog, new java.io.File(file8, "logs"));
        gzipIfNotEmpty(file7, new java.io.File(file8, "keys"));
    }

    boolean finalizeNativeReport(final com.crashlytics.android.core.CrashlyticsNdkData crashlyticsNdkData) {
        if (crashlyticsNdkData == null) {
            return true;
        }
        return ((java.lang.Boolean) this.backgroundWorker.submitAndWait(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsController.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public java.lang.Boolean call() throws java.lang.Exception {
                java.io.File fileFirst;
                java.util.TreeSet<java.io.File> treeSet = crashlyticsNdkData.timestampedDirectories;
                java.lang.String previousSessionId = com.crashlytics.android.core.CrashlyticsController.this.getPreviousSessionId();
                if (previousSessionId != null && !treeSet.isEmpty() && (fileFirst = treeSet.first()) != null) {
                    com.crashlytics.android.core.CrashlyticsController crashlyticsController = com.crashlytics.android.core.CrashlyticsController.this;
                    crashlyticsController.finalizeMostRecentNativeCrash(crashlyticsController.crashlyticsCore.getContext(), fileFirst, previousSessionId);
                }
                com.crashlytics.android.core.CrashlyticsController.this.recursiveDelete(treeSet);
                return java.lang.Boolean.TRUE;
            }
        })).booleanValue();
    }

    private void gzipIfNotEmpty(byte[] bArr, java.io.File file) throws java.lang.Throwable {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        gzip(bArr, file);
    }

    private void gzip(byte[] bArr, java.io.File file) throws java.lang.Throwable {
        java.util.zip.GZIPOutputStream gZIPOutputStream = null;
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream2 = new java.util.zip.GZIPOutputStream(new java.io.FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(gZIPOutputStream2);
            } catch (java.lang.Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(gZIPOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeFatal(java.util.Date date, java.lang.Thread thread, java.lang.Throwable th) throws java.lang.Throwable {
        com.crashlytics.android.core.ClsFileOutputStream clsFileOutputStream;
        com.crashlytics.android.core.CodedOutputStream codedOutputStreamNewInstance = null;
        try {
            try {
                java.lang.String currentSessionId = getCurrentSessionId();
                if (currentSessionId == null) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Tried to write a fatal exception while no session was open.", null);
                    io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(null, "Failed to flush to session begin file.");
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(null, "Failed to close fatal exception file output stream.");
                    return;
                }
                recordFatalExceptionAnswersEvent(currentSessionId, th.getClass().getName());
                clsFileOutputStream = new com.crashlytics.android.core.ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_FATAL_TAG);
                try {
                    codedOutputStreamNewInstance = com.crashlytics.android.core.CodedOutputStream.newInstance(clsFileOutputStream);
                    writeSessionEvent(codedOutputStreamNewInstance, date, thread, th, "crash", true);
                } catch (java.lang.Exception e) {
                    e = e;
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", e);
                }
                io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Failed to flush to session begin file.");
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            } catch (java.lang.Throwable th2) {
                th = th2;
                io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Failed to flush to session begin file.");
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close fatal exception file output stream.");
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            clsFileOutputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            clsFileOutputStream = null;
            io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Failed to flush to session begin file.");
            io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Flushable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public void doWriteNonFatal(java.util.Date date, java.lang.Thread thread, java.lang.Throwable th) throws java.lang.Throwable {
        com.crashlytics.android.core.ClsFileOutputStream clsFileOutputStream;
        java.lang.String currentSessionId = getCurrentSessionId();
        ?? r1 = 0;
        codedOutputStream = null;
        com.crashlytics.android.core.CodedOutputStream codedOutputStream = null;
        r1 = 0;
        if (currentSessionId == null) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        recordLoggedExceptionAnswersEvent(currentSessionId, th.getClass().getName());
        try {
            try {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
                clsFileOutputStream = new com.crashlytics.android.core.ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_NON_FATAL_TAG + io.fabric.sdk.android.services.common.CommonUtils.padWithZerosToMaxIntWidth(this.eventCounter.getAndIncrement()));
                try {
                    com.crashlytics.android.core.CodedOutputStream codedOutputStreamNewInstance = com.crashlytics.android.core.CodedOutputStream.newInstance(clsFileOutputStream);
                    try {
                        com.crashlytics.android.core.CrashlyticsController crashlyticsController = this;
                        crashlyticsController.writeSessionEvent(codedOutputStreamNewInstance, date, thread, th, EVENT_TYPE_LOGGED, false);
                        io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Failed to flush to non-fatal file.");
                        r1 = crashlyticsController;
                    } catch (java.lang.Exception e) {
                        e = e;
                        codedOutputStream = codedOutputStreamNewInstance;
                        io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", e);
                        io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStream, "Failed to flush to non-fatal file.");
                        r1 = codedOutputStream;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r1 = codedOutputStreamNewInstance;
                        io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(r1, "Failed to flush to non-fatal file.");
                        io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
                        throw th;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            clsFileOutputStream = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
        }
        io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close non-fatal file output stream.");
        try {
            trimSessionEventFiles(currentSessionId, 64);
        } catch (java.lang.Exception e4) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "An error occurred when trimming non-fatal files.", e4);
        }
    }

    private void writeSessionPartFile(java.lang.String str, java.lang.String str2, com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction codedOutputStreamWriteAction) throws java.lang.Exception {
        com.crashlytics.android.core.ClsFileOutputStream clsFileOutputStream;
        com.crashlytics.android.core.CodedOutputStream codedOutputStreamNewInstance = null;
        try {
            clsFileOutputStream = new com.crashlytics.android.core.ClsFileOutputStream(getFilesDir(), str + str2);
            try {
                codedOutputStreamNewInstance = com.crashlytics.android.core.CodedOutputStream.newInstance(clsFileOutputStream);
                codedOutputStreamWriteAction.writeTo(codedOutputStreamNewInstance);
                io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Failed to flush to session " + str2 + " file.");
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close session " + str2 + " file.");
            } catch (java.lang.Throwable th) {
                th = th;
                io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Failed to flush to session " + str2 + " file.");
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            clsFileOutputStream = null;
        }
    }

    private void writeFile(java.lang.String str, java.lang.String str2, com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction fileOutputStreamWriteAction) throws java.lang.Exception {
        java.io.FileOutputStream fileOutputStream = null;
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(new java.io.File(getFilesDir(), str + str2));
            try {
                fileOutputStreamWriteAction.writeTo(fileOutputStream2);
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileOutputStream2, "Failed to close " + str2 + " file.");
            } catch (java.lang.Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileOutputStream, "Failed to close " + str2 + " file.");
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private byte[] readFile(java.lang.String str, java.lang.String str2) {
        return com.crashlytics.android.core.NativeFileUtils.readFile(new java.io.File(getFilesDir(), str + str2));
    }

    private void writeBeginSession(final java.lang.String str, java.util.Date date) throws java.lang.Exception {
        final java.lang.String str2 = java.lang.String.format(java.util.Locale.US, GENERATOR_FORMAT, this.crashlyticsCore.getVersion());
        final long time = date.getTime() / 1000;
        writeSessionPartFile(str, SESSION_BEGIN_TAG, new com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.17
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(com.crashlytics.android.core.CodedOutputStream codedOutputStream) throws java.lang.Exception {
                com.crashlytics.android.core.SessionProtobufHelper.writeBeginSession(codedOutputStream, str, str2, time);
            }
        });
        writeFile(str, "BeginSession.json", new com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.18
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(java.io.FileOutputStream fileOutputStream) throws java.lang.Exception {
                fileOutputStream.write(new org.json.JSONObject(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.18.1
                    {
                        put("session_id", str);
                        put("generator", str2);
                        put("started_at_seconds", java.lang.Long.valueOf(time));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionApp(java.lang.String str) throws java.lang.Exception {
        final java.lang.String appIdentifier = this.idManager.getAppIdentifier();
        final java.lang.String str2 = this.appData.versionCode;
        final java.lang.String str3 = this.appData.versionName;
        final java.lang.String appInstallIdentifier = this.idManager.getAppInstallIdentifier();
        final int id = io.fabric.sdk.android.services.common.DeliveryMechanism.determineFrom(this.appData.installerPackageName).getId();
        writeSessionPartFile(str, SESSION_APP_TAG, new com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.19
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(com.crashlytics.android.core.CodedOutputStream codedOutputStream) throws java.lang.Exception {
                com.crashlytics.android.core.SessionProtobufHelper.writeSessionApp(codedOutputStream, appIdentifier, com.crashlytics.android.core.CrashlyticsController.this.appData.apiKey, str2, str3, appInstallIdentifier, id, com.crashlytics.android.core.CrashlyticsController.this.unityVersion);
            }
        });
        writeFile(str, "SessionApp.json", new com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.20
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(java.io.FileOutputStream fileOutputStream) throws java.lang.Exception {
                fileOutputStream.write(new org.json.JSONObject(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.20.1
                    {
                        put("app_identifier", appIdentifier);
                        put("api_key", com.crashlytics.android.core.CrashlyticsController.this.appData.apiKey);
                        put("version_code", str2);
                        put("version_name", str3);
                        put("install_uuid", appInstallIdentifier);
                        put("delivery_mechanism", java.lang.Integer.valueOf(id));
                        put("unity_version", android.text.TextUtils.isEmpty(com.crashlytics.android.core.CrashlyticsController.this.unityVersion) ? "" : com.crashlytics.android.core.CrashlyticsController.this.unityVersion);
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionOS(java.lang.String str) throws java.lang.Exception {
        final boolean zIsRooted = io.fabric.sdk.android.services.common.CommonUtils.isRooted(this.crashlyticsCore.getContext());
        writeSessionPartFile(str, SESSION_OS_TAG, new com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.21
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(com.crashlytics.android.core.CodedOutputStream codedOutputStream) throws java.lang.Exception {
                com.crashlytics.android.core.SessionProtobufHelper.writeSessionOS(codedOutputStream, android.os.Build.VERSION.RELEASE, android.os.Build.VERSION.CODENAME, zIsRooted);
            }
        });
        writeFile(str, "SessionOS.json", new com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.22
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(java.io.FileOutputStream fileOutputStream) throws java.lang.Exception {
                fileOutputStream.write(new org.json.JSONObject(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.22.1
                    {
                        put("version", android.os.Build.VERSION.RELEASE);
                        put("build_version", android.os.Build.VERSION.CODENAME);
                        put("is_rooted", java.lang.Boolean.valueOf(zIsRooted));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionDevice(java.lang.String str) throws java.lang.Exception {
        android.content.Context context = this.crashlyticsCore.getContext();
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        final int cpuArchitectureInt = io.fabric.sdk.android.services.common.CommonUtils.getCpuArchitectureInt();
        final int iAvailableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        final long totalRamInBytes = io.fabric.sdk.android.services.common.CommonUtils.getTotalRamInBytes();
        final long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        final boolean zIsEmulator = io.fabric.sdk.android.services.common.CommonUtils.isEmulator(context);
        final java.util.Map<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> deviceIdentifiers = this.idManager.getDeviceIdentifiers();
        final int deviceState = io.fabric.sdk.android.services.common.CommonUtils.getDeviceState(context);
        writeSessionPartFile(str, SESSION_DEVICE_TAG, new com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.23
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(com.crashlytics.android.core.CodedOutputStream codedOutputStream) throws java.lang.Exception {
                com.crashlytics.android.core.SessionProtobufHelper.writeSessionDevice(codedOutputStream, cpuArchitectureInt, android.os.Build.MODEL, iAvailableProcessors, totalRamInBytes, blockCount, zIsEmulator, deviceIdentifiers, deviceState, android.os.Build.MANUFACTURER, android.os.Build.PRODUCT);
            }
        });
        writeFile(str, "SessionDevice.json", new com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.24
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(java.io.FileOutputStream fileOutputStream) throws java.lang.Exception {
                fileOutputStream.write(new org.json.JSONObject(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.24.1
                    {
                        put("arch", java.lang.Integer.valueOf(cpuArchitectureInt));
                        put("build_model", android.os.Build.MODEL);
                        put("available_processors", java.lang.Integer.valueOf(iAvailableProcessors));
                        put("total_ram", java.lang.Long.valueOf(totalRamInBytes));
                        put("disk_space", java.lang.Long.valueOf(blockCount));
                        put("is_emulator", java.lang.Boolean.valueOf(zIsEmulator));
                        put("ids", deviceIdentifiers);
                        put("state", java.lang.Integer.valueOf(deviceState));
                        put("build_manufacturer", android.os.Build.MANUFACTURER);
                        put("build_product", android.os.Build.PRODUCT);
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionUser(java.lang.String str) throws java.lang.Exception {
        final com.crashlytics.android.core.UserMetaData userMetaData = getUserMetaData(str);
        writeSessionPartFile(str, SESSION_USER_TAG, new com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.25
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(com.crashlytics.android.core.CodedOutputStream codedOutputStream) throws java.lang.Exception {
                com.crashlytics.android.core.SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetaData.id, userMetaData.name, userMetaData.email);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    private void writeSessionEvent(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.util.Date date, java.lang.Thread thread, java.lang.Throwable th, java.lang.String str, boolean z) throws java.lang.Exception {
        ?? r6;
        java.lang.Thread[] threadArr;
        java.util.Map<java.lang.String, java.lang.String> attributes;
        java.util.Map<java.lang.String, java.lang.String> treeMap;
        com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData = new com.crashlytics.android.core.TrimmedThrowableData(th, this.stackTraceTrimmingStrategy);
        android.content.Context context = this.crashlyticsCore.getContext();
        long time = date.getTime() / 1000;
        java.lang.Float batteryLevel = io.fabric.sdk.android.services.common.CommonUtils.getBatteryLevel(context);
        int batteryVelocity = io.fabric.sdk.android.services.common.CommonUtils.getBatteryVelocity(context, this.devicePowerStateListener.isPowerConnected());
        boolean proximitySensorEnabled = io.fabric.sdk.android.services.common.CommonUtils.getProximitySensorEnabled(context);
        int i = context.getResources().getConfiguration().orientation;
        long totalRamInBytes = io.fabric.sdk.android.services.common.CommonUtils.getTotalRamInBytes() - io.fabric.sdk.android.services.common.CommonUtils.calculateFreeRamInBytes(context);
        long jCalculateUsedDiskSpaceInBytes = io.fabric.sdk.android.services.common.CommonUtils.calculateUsedDiskSpaceInBytes(android.os.Environment.getDataDirectory().getPath());
        android.app.ActivityManager.RunningAppProcessInfo appProcessInfo = io.fabric.sdk.android.services.common.CommonUtils.getAppProcessInfo(context.getPackageName(), context);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace;
        java.lang.String str2 = this.appData.buildId;
        java.lang.String appIdentifier = this.idManager.getAppIdentifier();
        int i2 = 0;
        if (z) {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
            java.lang.Thread[] threadArr2 = new java.lang.Thread[allStackTraces.size()];
            for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : allStackTraces.entrySet()) {
                threadArr2[i2] = entry.getKey();
                linkedList.add(this.stackTraceTrimmingStrategy.getTrimmedStackTrace(entry.getValue()));
                i2++;
            }
            r6 = 1;
            threadArr = threadArr2;
        } else {
            r6 = 1;
            threadArr = new java.lang.Thread[0];
        }
        if (!io.fabric.sdk.android.services.common.CommonUtils.getBooleanResourceValue(context, COLLECT_CUSTOM_KEYS, r6)) {
            attributes = new java.util.TreeMap<>();
        } else {
            attributes = this.crashlyticsCore.getAttributes();
            if (attributes != null && attributes.size() > r6) {
                treeMap = new java.util.TreeMap(attributes);
            }
            com.crashlytics.android.core.SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.logFileManager, appProcessInfo, i, appIdentifier, str2, batteryLevel, batteryVelocity, proximitySensorEnabled, totalRamInBytes, jCalculateUsedDiskSpaceInBytes);
        }
        treeMap = attributes;
        com.crashlytics.android.core.SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.logFileManager, appProcessInfo, i, appIdentifier, str2, batteryLevel, batteryVelocity, proximitySensorEnabled, totalRamInBytes, jCalculateUsedDiskSpaceInBytes);
    }

    private void writeSessionPartsToSessionFile(java.io.File file, java.lang.String str, int i) throws java.lang.Throwable {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Collecting session parts for ID " + str);
        java.io.File[] fileArrListFilesMatching = listFilesMatching(new com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter(str + SESSION_FATAL_TAG));
        boolean z = fileArrListFilesMatching != null && fileArrListFilesMatching.length > 0;
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, java.lang.String.format(java.util.Locale.US, "Session %s has fatal exception: %s", str, java.lang.Boolean.valueOf(z)));
        java.io.File[] fileArrListFilesMatching2 = listFilesMatching(new com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter(str + SESSION_NON_FATAL_TAG));
        boolean z2 = fileArrListFilesMatching2 != null && fileArrListFilesMatching2.length > 0;
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, java.lang.String.format(java.util.Locale.US, "Session %s has non-fatal exceptions: %s", str, java.lang.Boolean.valueOf(z2)));
        if (z || z2) {
            synthesizeSessionFile(file, str, getTrimmedNonFatalFiles(str, fileArrListFilesMatching2, i), z ? fileArrListFilesMatching[0] : null);
        } else {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "No events present for session ID " + str);
        }
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Removing session part files for ID " + str);
        deleteSessionPartFilesFor(str);
    }

    private void synthesizeSessionFile(java.io.File file, java.lang.String str, java.io.File[] fileArr, java.io.File file2) throws java.lang.Throwable {
        com.crashlytics.android.core.ClsFileOutputStream clsFileOutputStream;
        boolean z = file2 != null;
        java.io.File fatalSessionFilesDir = z ? getFatalSessionFilesDir() : getNonFatalSessionFilesDir();
        if (!fatalSessionFilesDir.exists()) {
            fatalSessionFilesDir.mkdirs();
        }
        com.crashlytics.android.core.CodedOutputStream codedOutputStreamNewInstance = null;
        try {
            clsFileOutputStream = new com.crashlytics.android.core.ClsFileOutputStream(fatalSessionFilesDir, str);
            try {
                try {
                    codedOutputStreamNewInstance = com.crashlytics.android.core.CodedOutputStream.newInstance(clsFileOutputStream);
                    io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Collecting SessionStart data for session ID " + str);
                    writeToCosFromFile(codedOutputStreamNewInstance, file);
                    codedOutputStreamNewInstance.writeUInt64(4, new java.util.Date().getTime() / 1000);
                    codedOutputStreamNewInstance.writeBool(5, z);
                    codedOutputStreamNewInstance.writeUInt32(11, 1);
                    codedOutputStreamNewInstance.writeEnum(12, 3);
                    writeInitialPartsTo(codedOutputStreamNewInstance, str);
                    writeNonFatalEventsTo(codedOutputStreamNewInstance, fileArr, str);
                    if (z) {
                        writeToCosFromFile(codedOutputStreamNewInstance, file2);
                    }
                    io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Error flushing session file stream");
                    io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close CLS file");
                } catch (java.lang.Exception e) {
                    e = e;
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Failed to write session file for session ID: " + str, e);
                    io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Error flushing session file stream");
                    closeWithoutRenamingOrLog(clsFileOutputStream);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Error flushing session file stream");
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close CLS file");
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            clsFileOutputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            clsFileOutputStream = null;
            io.fabric.sdk.android.services.common.CommonUtils.flushOrLog(codedOutputStreamNewInstance, "Error flushing session file stream");
            io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(clsFileOutputStream, "Failed to close CLS file");
            throw th;
        }
    }

    private static void writeNonFatalEventsTo(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.io.File[] fileArr, java.lang.String str) throws java.lang.Throwable {
        java.util.Arrays.sort(fileArr, io.fabric.sdk.android.services.common.CommonUtils.FILE_MODIFIED_COMPARATOR);
        for (java.io.File file : fileArr) {
            try {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, java.lang.String.format(java.util.Locale.US, "Found Non Fatal for session ID %s in %s ", str, file.getName()));
                writeToCosFromFile(codedOutputStream, file);
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error writting non-fatal to session.", e);
            }
        }
    }

    private void writeInitialPartsTo(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.lang.String str) throws java.lang.Throwable {
        for (java.lang.String str2 : INITIAL_SESSION_PART_TAGS) {
            java.io.File[] fileArrListFilesMatching = listFilesMatching(new com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter(str + str2 + com.crashlytics.android.core.ClsFileOutputStream.SESSION_FILE_EXTENSION));
            if (fileArrListFilesMatching.length == 0) {
                io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Can't find " + str2 + " data for session ID " + str, null);
            } else {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Collecting " + str2 + " data for session ID " + str);
                writeToCosFromFile(codedOutputStream, fileArrListFilesMatching[0]);
            }
        }
    }

    private static void writeToCosFromFile(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.io.File file) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream = null;
        if (!file.exists()) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Tried to include a file that doesn't exist: " + file.getName(), null);
            return;
        }
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                copyToCodedOutputStream(fileInputStream2, codedOutputStream, (int) file.length());
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream2, "Failed to close file input stream.");
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static void copyToCodedOutputStream(java.io.InputStream inputStream, com.crashlytics.android.core.CodedOutputStream codedOutputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            } else {
                i2 += i3;
            }
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private com.crashlytics.android.core.UserMetaData getUserMetaData(java.lang.String str) {
        if (isHandlingException()) {
            return new com.crashlytics.android.core.UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail());
        }
        return new com.crashlytics.android.core.MetaDataStore(getFilesDir()).readUserData(str);
    }

    boolean isHandlingException() {
        com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    java.io.File getFilesDir() {
        return this.fileStore.getFilesDir();
    }

    java.io.File getFatalSessionFilesDir() {
        return new java.io.File(getFilesDir(), FATAL_SESSION_DIR);
    }

    java.io.File getNonFatalSessionFilesDir() {
        return new java.io.File(getFilesDir(), NONFATAL_SESSION_DIR);
    }

    java.io.File getInvalidFilesDir() {
        return new java.io.File(getFilesDir(), INVALID_CLS_CACHE_DIR);
    }

    void registerAnalyticsEventListener(io.fabric.sdk.android.services.settings.SettingsData settingsData) {
        if (settingsData.featuresData.firebaseCrashlyticsEnabled) {
            boolean zRegister = this.appMeasurementEventListenerRegistrar.register();
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Registered Firebase Analytics event listener for breadcrumbs: " + zRegister);
        }
    }

    void registerDevicePowerStateListener() {
        this.devicePowerStateListener.initialize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldPromptUserBeforeSendingCrashReports(io.fabric.sdk.android.services.settings.SettingsData settingsData) {
        return (settingsData == null || !settingsData.featuresData.promptEnabled || this.preferenceManager.shouldAlwaysSendReports()) ? false : true;
    }

    private com.crashlytics.android.core.CreateReportSpiCall getCreateReportSpiCall(java.lang.String str, java.lang.String str2) {
        java.lang.String stringsFileValue = io.fabric.sdk.android.services.common.CommonUtils.getStringsFileValue(this.crashlyticsCore.getContext(), CRASHLYTICS_API_ENDPOINT);
        return new com.crashlytics.android.core.CompositeCreateReportSpiCall(new com.crashlytics.android.core.DefaultCreateReportSpiCall(this.crashlyticsCore, stringsFileValue, str, this.httpRequestFactory), new com.crashlytics.android.core.NativeCreateReportSpiCall(this.crashlyticsCore, stringsFileValue, str2, this.httpRequestFactory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSessionReports(io.fabric.sdk.android.services.settings.SettingsData settingsData) {
        if (settingsData == null) {
            io.fabric.sdk.android.Fabric.getLogger().w(com.crashlytics.android.core.CrashlyticsCore.TAG, "Cannot send reports. Settings are unavailable.");
            return;
        }
        android.content.Context context = this.crashlyticsCore.getContext();
        com.crashlytics.android.core.ReportUploader reportUploader = new com.crashlytics.android.core.ReportUploader(this.appData.apiKey, getCreateReportSpiCall(settingsData.appData.reportsUrl, settingsData.appData.ndkReportsUrl), this.reportFilesProvider, this.handlingExceptionCheck);
        for (java.io.File file : listCompleteSessionFiles()) {
            this.backgroundWorker.submit(new com.crashlytics.android.core.CrashlyticsController.SendReportRunnable(context, new com.crashlytics.android.core.SessionReport(file, SEND_AT_CRASHTIME_HEADER), reportUploader));
        }
    }

    private static void recordLoggedExceptionAnswersEvent(java.lang.String str, java.lang.String str2) {
        com.crashlytics.android.answers.Answers answers = (com.crashlytics.android.answers.Answers) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.answers.Answers.class);
        if (answers == null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new io.fabric.sdk.android.services.common.Crash.LoggedException(str, str2));
        }
    }

    private static void recordFatalExceptionAnswersEvent(java.lang.String str, java.lang.String str2) {
        com.crashlytics.android.answers.Answers answers = (com.crashlytics.android.answers.Answers) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.answers.Answers.class);
        if (answers == null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new io.fabric.sdk.android.services.common.Crash.FatalException(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordFatalFirebaseEvent(long j) {
        if (firebaseCrashExists()) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return;
        }
        if (this.firebaseAnalyticsLogger != null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Logging Crashlytics event to Firebase");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(FIREBASE_REALTIME, 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j);
            this.firebaseAnalyticsLogger.logEvent(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, "_ae", bundle);
            return;
        }
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }

    private boolean firebaseCrashExists() {
        try {
            java.lang.Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    private final class ReportUploaderHandlingExceptionCheck implements com.crashlytics.android.core.ReportUploader.HandlingExceptionCheck {
        private ReportUploaderHandlingExceptionCheck() {
        }

        @Override // com.crashlytics.android.core.ReportUploader.HandlingExceptionCheck
        public boolean isHandlingException() {
            return com.crashlytics.android.core.CrashlyticsController.this.isHandlingException();
        }
    }

    private final class ReportUploaderFilesProvider implements com.crashlytics.android.core.ReportUploader.ReportFilesProvider {
        private ReportUploaderFilesProvider() {
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public java.io.File[] getCompleteSessionFiles() {
            return com.crashlytics.android.core.CrashlyticsController.this.listCompleteSessionFiles();
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public java.io.File[] getInvalidSessionFiles() {
            return com.crashlytics.android.core.CrashlyticsController.this.getInvalidFilesDir().listFiles();
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public java.io.File[] getNativeReportFiles() {
            return com.crashlytics.android.core.CrashlyticsController.this.listNativeSessionFileDirectories();
        }
    }

    private static final class PrivacyDialogCheck implements com.crashlytics.android.core.ReportUploader.SendCheck {
        private final io.fabric.sdk.android.Kit kit;
        private final com.crashlytics.android.core.PreferenceManager preferenceManager;
        private final io.fabric.sdk.android.services.settings.PromptSettingsData promptData;

        public PrivacyDialogCheck(io.fabric.sdk.android.Kit kit, com.crashlytics.android.core.PreferenceManager preferenceManager, io.fabric.sdk.android.services.settings.PromptSettingsData promptSettingsData) {
            this.kit = kit;
            this.preferenceManager = preferenceManager;
            this.promptData = promptSettingsData;
        }

        @Override // com.crashlytics.android.core.ReportUploader.SendCheck
        public boolean canSendReports() {
            android.app.Activity currentActivity = this.kit.getFabric().getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                return true;
            }
            final com.crashlytics.android.core.CrashPromptDialog crashPromptDialogCreate = com.crashlytics.android.core.CrashPromptDialog.create(currentActivity, this.promptData, new com.crashlytics.android.core.CrashPromptDialog.AlwaysSendCallback() { // from class: com.crashlytics.android.core.CrashlyticsController.PrivacyDialogCheck.1
                @Override // com.crashlytics.android.core.CrashPromptDialog.AlwaysSendCallback
                public void sendUserReportsWithoutPrompting(boolean z) {
                    com.crashlytics.android.core.CrashlyticsController.PrivacyDialogCheck.this.preferenceManager.setShouldAlwaysSendReports(z);
                }
            });
            currentActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.PrivacyDialogCheck.2
                @Override // java.lang.Runnable
                public void run() {
                    crashPromptDialogCreate.show();
                }
            });
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Waiting for user opt-in.");
            crashPromptDialogCreate.await();
            return crashPromptDialogCreate.getOptIn();
        }
    }

    private static final class SendReportRunnable implements java.lang.Runnable {
        private final android.content.Context context;
        private final com.crashlytics.android.core.Report report;
        private final com.crashlytics.android.core.ReportUploader reportUploader;

        public SendReportRunnable(android.content.Context context, com.crashlytics.android.core.Report report, com.crashlytics.android.core.ReportUploader reportUploader) {
            this.context = context;
            this.report = report;
            this.reportUploader = reportUploader;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (io.fabric.sdk.android.services.common.CommonUtils.canTryConnection(this.context)) {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Attempting to send crash report at time of crash...");
                this.reportUploader.forceUpload(this.report);
            }
        }
    }

    private static final class LogFileDirectoryProvider implements com.crashlytics.android.core.LogFileManager.DirectoryProvider {
        private static final java.lang.String LOG_FILES_DIR = "log-files";
        private final io.fabric.sdk.android.services.persistence.FileStore rootFileStore;

        public LogFileDirectoryProvider(io.fabric.sdk.android.services.persistence.FileStore fileStore) {
            this.rootFileStore = fileStore;
        }

        @Override // com.crashlytics.android.core.LogFileManager.DirectoryProvider
        public java.io.File getLogFileDir() {
            java.io.File file = new java.io.File(this.rootFileStore.getFilesDir(), LOG_FILES_DIR);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    private static final class DefaultSettingsDataProvider implements com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider {
        private DefaultSettingsDataProvider() {
        }

        @Override // com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider
        public io.fabric.sdk.android.services.settings.SettingsData getSettingsData() {
            return io.fabric.sdk.android.services.settings.Settings.getInstance().awaitSettingsData();
        }
    }
}
