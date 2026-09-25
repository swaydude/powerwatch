package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class NativeSessionReport implements com.crashlytics.android.core.Report {
    private final java.io.File reportDirectory;

    @Override // com.crashlytics.android.core.Report
    public java.util.Map<java.lang.String, java.lang.String> getCustomHeaders() {
        return null;
    }

    @Override // com.crashlytics.android.core.Report
    public java.io.File getFile() {
        return null;
    }

    @Override // com.crashlytics.android.core.Report
    public java.lang.String getFileName() {
        return null;
    }

    public NativeSessionReport(java.io.File file) {
        this.reportDirectory = file;
    }

    @Override // com.crashlytics.android.core.Report
    public void remove() {
        for (java.io.File file : getFiles()) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Removing native report file at " + file.getPath());
            file.delete();
        }
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Removing native report directory at " + this.reportDirectory);
        this.reportDirectory.delete();
    }

    @Override // com.crashlytics.android.core.Report
    public java.lang.String getIdentifier() {
        return this.reportDirectory.getName();
    }

    @Override // com.crashlytics.android.core.Report
    public java.io.File[] getFiles() {
        return this.reportDirectory.listFiles();
    }

    @Override // com.crashlytics.android.core.Report
    public com.crashlytics.android.core.Report.Type getType() {
        return com.crashlytics.android.core.Report.Type.NATIVE;
    }
}
