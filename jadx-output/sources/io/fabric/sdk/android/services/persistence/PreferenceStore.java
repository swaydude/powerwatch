package io.fabric.sdk.android.services.persistence;

/* JADX INFO: loaded from: classes2.dex */
public interface PreferenceStore {
    android.content.SharedPreferences.Editor edit();

    android.content.SharedPreferences get();

    boolean save(android.content.SharedPreferences.Editor editor);
}
