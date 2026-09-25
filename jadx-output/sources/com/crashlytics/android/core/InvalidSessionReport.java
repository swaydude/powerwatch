package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class InvalidSessionReport implements com.crashlytics.android.core.Report {
    private final java.util.Map<java.lang.String, java.lang.String> customHeaders = new java.util.HashMap(com.crashlytics.android.core.ReportUploader.HEADER_INVALID_CLS_FILE);
    private final java.io.File[] files;
    private final java.lang.String identifier;

    public InvalidSessionReport(java.lang.String str, java.io.File[] fileArr) {
        this.files = fileArr;
        this.identifier = str;
    }

    @Override // com.crashlytics.android.core.Report
    public java.lang.String getFileName() {
        return this.files[0].getName();
    }

    @Override // com.crashlytics.android.core.Report
    public java.lang.String getIdentifier() {
        return this.identifier;
    }

    @Override // com.crashlytics.android.core.Report
    public java.io.File getFile() {
        return this.files[0];
    }

    @Override // com.crashlytics.android.core.Report
    public java.io.File[] getFiles() {
        return this.files;
    }

    @Override // com.crashlytics.android.core.Report
    public java.util.Map<java.lang.String, java.lang.String> getCustomHeaders() {
        return java.util.Collections.unmodifiableMap(this.customHeaders);
    }

    @Override // com.crashlytics.android.core.Report
    public void remove() {
        for (java.io.File file : this.files) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Removing invalid report file at " + file.getPath());
            file.delete();
        }
    }

    @Override // com.crashlytics.android.core.Report
    public com.crashlytics.android.core.Report.Type getType() {
        return com.crashlytics.android.core.Report.Type.JAVA;
    }
}
