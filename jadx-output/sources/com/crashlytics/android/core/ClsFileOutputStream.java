package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class ClsFileOutputStream extends java.io.FileOutputStream {
    public static final java.lang.String IN_PROGRESS_SESSION_FILE_EXTENSION = ".cls_temp";
    public static final java.lang.String SESSION_FILE_EXTENSION = ".cls";
    public static final java.io.FilenameFilter TEMP_FILENAME_FILTER = new java.io.FilenameFilter() { // from class: com.crashlytics.android.core.ClsFileOutputStream.1
        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return str.endsWith(com.crashlytics.android.core.ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    };
    private boolean closed;
    private java.io.File complete;
    private java.io.File inProgress;
    private final java.lang.String root;

    public ClsFileOutputStream(java.lang.String str, java.lang.String str2) throws java.io.FileNotFoundException {
        this(new java.io.File(str), str2);
    }

    public ClsFileOutputStream(java.io.File file, java.lang.String str) throws java.io.FileNotFoundException {
        super(new java.io.File(file, str + IN_PROGRESS_SESSION_FILE_EXTENSION));
        this.closed = false;
        java.lang.String str2 = file + java.io.File.separator + str;
        this.root = str2;
        this.inProgress = new java.io.File(str2 + IN_PROGRESS_SESSION_FILE_EXTENSION);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        super.flush();
        super.close();
        java.io.File file = new java.io.File(this.root + SESSION_FILE_EXTENSION);
        if (this.inProgress.renameTo(file)) {
            this.inProgress = null;
            this.complete = file;
            return;
        }
        java.lang.String str = "";
        if (file.exists()) {
            str = " (target already exists)";
        } else if (!this.inProgress.exists()) {
            str = " (source does not exist)";
        }
        throw new java.io.IOException("Could not rename temp file: " + this.inProgress + " -> " + file + str);
    }

    public void closeInProgressStream() throws java.io.IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        super.flush();
        super.close();
    }

    public java.io.File getCompleteFile() {
        return this.complete;
    }

    public java.io.File getInProgressFile() {
        return this.inProgress;
    }
}
