package io.fabric.sdk.android.services.persistence;

/* JADX INFO: loaded from: classes2.dex */
public class FileStoreImpl implements io.fabric.sdk.android.services.persistence.FileStore {
    private final java.lang.String contentPath;
    private final android.content.Context context;
    private final java.lang.String legacySupport;

    public FileStoreImpl(io.fabric.sdk.android.Kit kit) {
        if (kit.getContext() == null) {
            throw new java.lang.IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        }
        android.content.Context context = kit.getContext();
        this.context = context;
        this.contentPath = kit.getPath();
        this.legacySupport = "Android/" + context.getPackageName();
    }

    @Override // io.fabric.sdk.android.services.persistence.FileStore
    public java.io.File getCacheDir() {
        return prepare(this.context.getCacheDir());
    }

    @Override // io.fabric.sdk.android.services.persistence.FileStore
    public java.io.File getExternalCacheDir() {
        java.io.File file;
        if (!isExternalStorageAvailable()) {
            file = null;
        } else if (android.os.Build.VERSION.SDK_INT >= 8) {
            file = this.context.getExternalCacheDir();
        } else {
            file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), this.legacySupport + "/cache/" + this.contentPath);
        }
        return prepare(file);
    }

    @Override // io.fabric.sdk.android.services.persistence.FileStore
    public java.io.File getFilesDir() {
        return prepare(this.context.getFilesDir());
    }

    @Override // io.fabric.sdk.android.services.persistence.FileStore
    public java.io.File getExternalFilesDir() {
        java.io.File file = null;
        if (isExternalStorageAvailable()) {
            if (android.os.Build.VERSION.SDK_INT >= 8) {
                file = this.context.getExternalFilesDir(null);
            } else {
                file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), this.legacySupport + "/files/" + this.contentPath);
            }
        }
        return prepare(file);
    }

    java.io.File prepare(java.io.File file) {
        if (file != null) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "Couldn't create file");
            return null;
        }
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Null File");
        return null;
    }

    boolean isExternalStorageAvailable() {
        if ("mounted".equals(android.os.Environment.getExternalStorageState())) {
            return true;
        }
        io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
        return false;
    }
}
