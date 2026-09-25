package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class SessionReport implements com.crashlytics.android.core.Report {
    private final java.util.Map<java.lang.String, java.lang.String> customHeaders;
    private final java.io.File file;
    private final java.io.File[] files;

    public SessionReport(java.io.File file) {
        this(file, java.util.Collections.emptyMap());
    }

    public SessionReport(java.io.File file, java.util.Map<java.lang.String, java.lang.String> map) {
        this.file = file;
        this.files = new java.io.File[]{file};
        java.util.HashMap map2 = new java.util.HashMap(map);
        this.customHeaders = map2;
        if (file.length() == 0) {
            map2.putAll(com.crashlytics.android.core.ReportUploader.HEADER_INVALID_CLS_FILE);
        }
    }

    @Override // com.crashlytics.android.core.Report
    public java.io.File getFile() {
        return this.file;
    }

    @Override // com.crashlytics.android.core.Report
    public java.io.File[] getFiles() {
        return this.files;
    }

    @Override // com.crashlytics.android.core.Report
    public java.lang.String getFileName() {
        return getFile().getName();
    }

    @Override // com.crashlytics.android.core.Report
    public java.lang.String getIdentifier() {
        java.lang.String fileName = getFileName();
        return fileName.substring(0, fileName.lastIndexOf(46));
    }

    @Override // com.crashlytics.android.core.Report
    public java.util.Map<java.lang.String, java.lang.String> getCustomHeaders() {
        return java.util.Collections.unmodifiableMap(this.customHeaders);
    }

    @Override // com.crashlytics.android.core.Report
    public void remove() {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Removing report at " + this.file.getPath());
        this.file.delete();
    }

    @Override // com.crashlytics.android.core.Report
    public com.crashlytics.android.core.Report.Type getType() {
        return com.crashlytics.android.core.Report.Type.JAVA;
    }
}
