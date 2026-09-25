package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public class zzbz {
    private static final java.lang.String TAG = "zzbz";
    private static android.content.Context zzck;
    private static com.google.android.gms.maps.internal.zze zzcl;

    public static com.google.android.gms.maps.internal.zze zza(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        com.google.android.gms.maps.internal.zze zzfVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.maps.internal.zze zzeVar = zzcl;
        if (zzeVar != null) {
            return zzeVar;
        }
        int iIsGooglePlayServicesAvailable = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (iIsGooglePlayServicesAvailable != 0) {
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
        android.util.Log.i(TAG, "Making Creator dynamically");
        android.os.IBinder iBinder = (android.os.IBinder) zza(zzb(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
        if (iBinder == null) {
            zzfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            zzfVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.zze ? (com.google.android.gms.maps.internal.zze) iInterfaceQueryLocalInterface : new com.google.android.gms.maps.internal.zzf(iBinder);
        }
        zzcl = zzfVar;
        try {
            zzfVar.zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(zzb(context).getResources()), com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            return zzcl;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    private static android.content.Context zzb(android.content.Context context) {
        android.content.Context context2 = zzck;
        if (context2 != null) {
            return context2;
        }
        android.content.Context contextZzc = zzc(context);
        zzck = contextZzc;
        return contextZzc;
    }

    private static android.content.Context zzc(android.content.Context context) {
        try {
            return com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Failed to load maps module, use legacy", e);
            return com.google.android.gms.common.GooglePlayServicesUtil.getRemoteContext(context);
        }
    }

    private static <T> T zza(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return (T) zza(((java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(classLoader)).loadClass(str));
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalStateException(strValueOf.length() != 0 ? "Unable to find dynamic class ".concat(strValueOf) : new java.lang.String("Unable to find dynamic class "));
        }
    }

    private static <T> T zza(java.lang.Class<?> cls) {
        try {
            return (T) cls.newInstance();
        } catch (java.lang.IllegalAccessException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalStateException(strValueOf.length() != 0 ? "Unable to call the default constructor of ".concat(strValueOf) : new java.lang.String("Unable to call the default constructor of "));
        } catch (java.lang.InstantiationException unused2) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalStateException(strValueOf2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(strValueOf2) : new java.lang.String("Unable to instantiate the dynamic class "));
        }
    }
}
