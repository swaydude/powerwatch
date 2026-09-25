package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
final class FirebaseAppImpl implements io.fabric.sdk.android.services.common.FirebaseApp {
    private static final java.lang.String FIREBASE_APP_CLASS = "com.google.firebase.FirebaseApp";
    private static final java.lang.String GET_INSTANCE_METHOD = "getInstance";
    private static final java.lang.String IS_DATA_COLLECTION_ENABLED_METHOD = "isDataCollectionDefaultEnabled";
    private final java.lang.Object firebaseAppInstance;
    private final java.lang.reflect.Method isDataCollectionDefaultEnabledMethod;

    public static io.fabric.sdk.android.services.common.FirebaseApp getInstance(android.content.Context context) {
        try {
            java.lang.Class<?> clsLoadClass = context.getClassLoader().loadClass(FIREBASE_APP_CLASS);
            return new io.fabric.sdk.android.services.common.FirebaseAppImpl(clsLoadClass, clsLoadClass.getDeclaredMethod(GET_INSTANCE_METHOD, new java.lang.Class[0]).invoke(clsLoadClass, new java.lang.Object[0]));
        } catch (java.lang.ClassNotFoundException unused) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (java.lang.NoSuchMethodException e) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Could not find method: " + e.getMessage());
            return null;
        } catch (java.lang.Exception e2) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Unexpected error loading FirebaseApp instance.", e2);
            return null;
        }
    }

    private FirebaseAppImpl(java.lang.Class cls, java.lang.Object obj) throws java.lang.NoSuchMethodException {
        this.firebaseAppInstance = obj;
        this.isDataCollectionDefaultEnabledMethod = cls.getDeclaredMethod(IS_DATA_COLLECTION_ENABLED_METHOD, new java.lang.Class[0]);
    }

    @Override // io.fabric.sdk.android.services.common.FirebaseApp
    public boolean isDataCollectionDefaultEnabled() {
        try {
            return ((java.lang.Boolean) this.isDataCollectionDefaultEnabledMethod.invoke(this.firebaseAppInstance, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", e);
            return false;
        }
    }
}
