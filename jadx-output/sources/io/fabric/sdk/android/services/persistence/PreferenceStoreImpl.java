package io.fabric.sdk.android.services.persistence;

/* JADX INFO: loaded from: classes2.dex */
public class PreferenceStoreImpl implements io.fabric.sdk.android.services.persistence.PreferenceStore {
    private final android.content.Context context;
    private final java.lang.String preferenceName;
    private final android.content.SharedPreferences sharedPreferences;

    public PreferenceStoreImpl(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        }
        this.context = context;
        this.preferenceName = str;
        this.sharedPreferences = context.getSharedPreferences(str, 0);
    }

    @java.lang.Deprecated
    public PreferenceStoreImpl(io.fabric.sdk.android.Kit kit) {
        this(kit.getContext(), kit.getClass().getName());
    }

    @Override // io.fabric.sdk.android.services.persistence.PreferenceStore
    public android.content.SharedPreferences get() {
        return this.sharedPreferences;
    }

    @Override // io.fabric.sdk.android.services.persistence.PreferenceStore
    public android.content.SharedPreferences.Editor edit() {
        return this.sharedPreferences.edit();
    }

    @Override // io.fabric.sdk.android.services.persistence.PreferenceStore
    public boolean save(android.content.SharedPreferences.Editor editor) {
        if (android.os.Build.VERSION.SDK_INT >= 9) {
            editor.apply();
            return true;
        }
        return editor.commit();
    }
}
