package com.google.firebase.internal;

/* JADX INFO: compiled from: com.google.firebase:firebase-common@@19.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class DataCollectionConfigStorage {
    public static final java.lang.String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    private static final java.lang.String FIREBASE_APP_PREFS = "com.google.firebase.common.prefs:";
    private final android.content.Context applicationContext;
    private final java.util.concurrent.atomic.AtomicBoolean dataCollectionDefaultEnabled = new java.util.concurrent.atomic.AtomicBoolean(readAutoDataCollectionEnabled());
    private final com.google.firebase.events.Publisher publisher;
    private final android.content.SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(android.content.Context context, java.lang.String str, com.google.firebase.events.Publisher publisher) {
        this.applicationContext = directBootSafe(context);
        this.sharedPreferences = context.getSharedPreferences(FIREBASE_APP_PREFS + str, 0);
        this.publisher = publisher;
    }

    private static android.content.Context directBootSafe(android.content.Context context) {
        return (android.os.Build.VERSION.SDK_INT < 24 || androidx.core.content.ContextCompat.isDeviceProtectedStorage(context)) ? context : androidx.core.content.ContextCompat.createDeviceProtectedStorageContext(context);
    }

    public boolean isEnabled() {
        return this.dataCollectionDefaultEnabled.get();
    }

    public void setEnabled(boolean z) {
        if (this.dataCollectionDefaultEnabled.compareAndSet(!z, z)) {
            this.sharedPreferences.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, z).apply();
            this.publisher.publish(new com.google.firebase.events.Event<>(com.google.firebase.DataCollectionDefaultChange.class, new com.google.firebase.DataCollectionDefaultChange(z)));
        }
    }

    private boolean readAutoDataCollectionEnabled() {
        android.content.pm.ApplicationInfo applicationInfo;
        if (this.sharedPreferences.contains(DATA_COLLECTION_DEFAULT_ENABLED)) {
            return this.sharedPreferences.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true);
        }
        try {
            android.content.pm.PackageManager packageManager = this.applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return true;
    }
}
