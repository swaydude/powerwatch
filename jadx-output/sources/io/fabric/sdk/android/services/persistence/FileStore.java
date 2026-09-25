package io.fabric.sdk.android.services.persistence;

/* JADX INFO: loaded from: classes2.dex */
public interface FileStore {
    java.io.File getCacheDir();

    java.io.File getExternalCacheDir();

    java.io.File getExternalFilesDir();

    java.io.File getFilesDir();
}
