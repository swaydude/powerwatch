package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EventsFilesManager<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final java.lang.String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    protected final android.content.Context context;
    protected final io.fabric.sdk.android.services.common.CurrentTimeProvider currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    protected final io.fabric.sdk.android.services.events.EventsStorage eventStorage;
    protected volatile long lastRollOverTime;
    protected final java.util.List<io.fabric.sdk.android.services.events.EventsStorageListener> rollOverListeners = new java.util.concurrent.CopyOnWriteArrayList();
    protected final io.fabric.sdk.android.services.events.EventTransform<T> transform;

    protected abstract java.lang.String generateUniqueRollOverFileName();

    protected int getMaxByteSizePerFile() {
        return 8000;
    }

    public EventsFilesManager(android.content.Context context, io.fabric.sdk.android.services.events.EventTransform<T> eventTransform, io.fabric.sdk.android.services.common.CurrentTimeProvider currentTimeProvider, io.fabric.sdk.android.services.events.EventsStorage eventsStorage, int i) throws java.io.IOException {
        this.context = context.getApplicationContext();
        this.transform = eventTransform;
        this.eventStorage = eventsStorage;
        this.currentTimeProvider = currentTimeProvider;
        this.lastRollOverTime = currentTimeProvider.getCurrentTimeMillis();
        this.defaultMaxFilesToKeep = i;
    }

    public void writeEvent(T t) throws java.io.IOException {
        byte[] bytes = this.transform.toBytes(t);
        rollFileOverIfNeeded(bytes.length);
        this.eventStorage.add(bytes);
    }

    public void registerRollOverListener(io.fabric.sdk.android.services.events.EventsStorageListener eventsStorageListener) {
        if (eventsStorageListener != null) {
            this.rollOverListeners.add(eventsStorageListener);
        }
    }

    public boolean rollFileOver() throws java.io.IOException {
        java.lang.String strGenerateUniqueRollOverFileName;
        boolean z = true;
        if (this.eventStorage.isWorkingFileEmpty()) {
            strGenerateUniqueRollOverFileName = null;
            z = false;
        } else {
            strGenerateUniqueRollOverFileName = generateUniqueRollOverFileName();
            this.eventStorage.rollOver(strGenerateUniqueRollOverFileName);
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, 4, io.fabric.sdk.android.Fabric.TAG, java.lang.String.format(java.util.Locale.US, "generated new file %s", strGenerateUniqueRollOverFileName));
            this.lastRollOverTime = this.currentTimeProvider.getCurrentTimeMillis();
        }
        triggerRollOverOnListeners(strGenerateUniqueRollOverFileName);
        return z;
    }

    private void rollFileOverIfNeeded(int i) throws java.io.IOException {
        if (this.eventStorage.canWorkingFileStore(i, getMaxByteSizePerFile())) {
            return;
        }
        io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, 4, io.fabric.sdk.android.Fabric.TAG, java.lang.String.format(java.util.Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", java.lang.Integer.valueOf(this.eventStorage.getWorkingFileUsedSizeInBytes()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getMaxByteSizePerFile())));
        rollFileOver();
    }

    protected int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    private void triggerRollOverOnListeners(java.lang.String str) {
        java.util.Iterator<io.fabric.sdk.android.services.events.EventsStorageListener> it = this.rollOverListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onRollOver(str);
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "One of the roll over listeners threw an exception", e);
            }
        }
    }

    public java.util.List<java.io.File> getBatchOfFilesToSend() {
        return this.eventStorage.getBatchOfFilesToSend(1);
    }

    public void deleteSentFiles(java.util.List<java.io.File> list) {
        this.eventStorage.deleteFilesInRollOverDirectory(list);
    }

    public void deleteAllEventsFiles() {
        io.fabric.sdk.android.services.events.EventsStorage eventsStorage = this.eventStorage;
        eventsStorage.deleteFilesInRollOverDirectory(eventsStorage.getAllFilesInRollOverDirectory());
        this.eventStorage.deleteWorkingFile();
    }

    public void deleteOldestInRollOverIfOverMax() {
        java.util.List<java.io.File> allFilesInRollOverDirectory = this.eventStorage.getAllFilesInRollOverDirectory();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (allFilesInRollOverDirectory.size() <= maxFilesToKeep) {
            return;
        }
        int size = allFilesInRollOverDirectory.size() - maxFilesToKeep;
        io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, java.lang.String.format(java.util.Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", java.lang.Integer.valueOf(allFilesInRollOverDirectory.size()), java.lang.Integer.valueOf(maxFilesToKeep), java.lang.Integer.valueOf(size)));
        java.util.TreeSet treeSet = new java.util.TreeSet(new java.util.Comparator<io.fabric.sdk.android.services.events.EventsFilesManager.FileWithTimestamp>() { // from class: io.fabric.sdk.android.services.events.EventsFilesManager.1
            @Override // java.util.Comparator
            public int compare(io.fabric.sdk.android.services.events.EventsFilesManager.FileWithTimestamp fileWithTimestamp, io.fabric.sdk.android.services.events.EventsFilesManager.FileWithTimestamp fileWithTimestamp2) {
                return (int) (fileWithTimestamp.timestamp - fileWithTimestamp2.timestamp);
            }
        });
        for (java.io.File file : allFilesInRollOverDirectory) {
            treeSet.add(new io.fabric.sdk.android.services.events.EventsFilesManager.FileWithTimestamp(file, parseCreationTimestampFromFileName(file.getName())));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.fabric.sdk.android.services.events.EventsFilesManager.FileWithTimestamp) it.next()).file);
            if (arrayList.size() == size) {
                break;
            }
        }
        this.eventStorage.deleteFilesInRollOverDirectory(arrayList);
    }

    public long parseCreationTimestampFromFileName(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split(ROLL_OVER_FILE_NAME_SEPARATOR);
        if (strArrSplit.length != 3) {
            return 0L;
        }
        try {
            return java.lang.Long.valueOf(strArrSplit[2]).longValue();
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    static class FileWithTimestamp {
        final java.io.File file;
        final long timestamp;

        public FileWithTimestamp(java.io.File file, long j) {
            this.file = file;
            this.timestamp = j;
        }
    }
}
