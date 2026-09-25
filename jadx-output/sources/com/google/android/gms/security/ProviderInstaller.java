package com.google.android.gms.security;

/* JADX INFO: loaded from: classes.dex */
public class ProviderInstaller {
    public static final java.lang.String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zziv = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
    private static final java.lang.Object lock = new java.lang.Object();
    private static java.lang.reflect.Method zziw = null;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, android.content.Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        zziv.verifyGooglePlayServicesIsAvailable(context, 11925000);
        android.content.Context contextZzk = zzk(context);
        if (contextZzk == null) {
            contextZzk = zzl(context);
        }
        if (contextZzk == null) {
            android.util.Log.e("ProviderInstaller", "Failed to get remote context");
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
        }
        synchronized (lock) {
            try {
                try {
                    if (zziw == null) {
                        zziw = contextZzk.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", android.content.Context.class);
                    }
                    zziw.invoke(null, contextZzk);
                } catch (java.lang.Exception e) {
                    e = e;
                    java.lang.Throwable cause = e.getCause();
                    if (android.util.Log.isLoggable("ProviderInstaller", 6)) {
                        java.lang.String strValueOf = java.lang.String.valueOf(cause == null ? e.getMessage() : cause.getMessage());
                        android.util.Log.e("ProviderInstaller", strValueOf.length() != 0 ? "Failed to install provider: ".concat(strValueOf) : new java.lang.String("Failed to install provider: "));
                    }
                    if (cause != null) {
                        e = cause;
                    }
                    com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, e);
                    throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void installIfNeededAsync(android.content.Context context, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener providerInstallListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the UI thread");
        new com.google.android.gms.security.zza(context, providerInstallListener).execute(new java.lang.Void[0]);
    }

    private static android.content.Context zzk(android.content.Context context) {
        try {
            return com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "providerinstaller").getModuleContext();
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w("ProviderInstaller", strValueOf.length() != 0 ? "Failed to load providerinstaller module: ".concat(strValueOf) : new java.lang.String("Failed to load providerinstaller module: "));
            return null;
        }
    }

    private static android.content.Context zzl(android.content.Context context) {
        try {
            return com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
        } catch (android.content.res.Resources.NotFoundException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w("ProviderInstaller", strValueOf.length() != 0 ? "Failed to load GMS Core context for providerinstaller: ".concat(strValueOf) : new java.lang.String("Failed to load GMS Core context for providerinstaller: "));
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, e);
            return null;
        }
    }
}
