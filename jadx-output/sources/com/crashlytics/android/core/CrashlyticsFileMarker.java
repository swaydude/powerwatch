package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CrashlyticsFileMarker {
    private final io.fabric.sdk.android.services.persistence.FileStore fileStore;
    private final java.lang.String markerName;

    public CrashlyticsFileMarker(java.lang.String str, io.fabric.sdk.android.services.persistence.FileStore fileStore) {
        this.markerName = str;
        this.fileStore = fileStore;
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (java.io.IOException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error creating marker: " + this.markerName, e);
            return false;
        }
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }

    private java.io.File getMarkerFile() {
        return new java.io.File(this.fileStore.getFilesDir(), this.markerName);
    }
}
