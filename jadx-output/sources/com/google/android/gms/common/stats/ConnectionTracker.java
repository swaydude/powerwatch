package com.google.android.gms.common.stats;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTracker {
    private static final java.lang.Object zzdp = new java.lang.Object();
    private static volatile com.google.android.gms.common.stats.ConnectionTracker zzfa = null;
    private static boolean zzfb = false;
    private final java.util.List<java.lang.String> zzfc = java.util.Collections.EMPTY_LIST;
    private final java.util.List<java.lang.String> zzfd = java.util.Collections.EMPTY_LIST;
    private final java.util.List<java.lang.String> zzfe = java.util.Collections.EMPTY_LIST;
    private final java.util.List<java.lang.String> zzff = java.util.Collections.EMPTY_LIST;

    public static com.google.android.gms.common.stats.ConnectionTracker getInstance() {
        if (zzfa == null) {
            synchronized (zzdp) {
                if (zzfa == null) {
                    zzfa = new com.google.android.gms.common.stats.ConnectionTracker();
                }
            }
        }
        return zzfa;
    }

    private ConnectionTracker() {
    }

    public final boolean zza(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        android.content.ComponentName component = intent.getComponent();
        if (component == null ? false : com.google.android.gms.common.util.ClientLibraryUtils.zzc(context, component.getPackageName())) {
            android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public boolean bindService(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        return zza(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public void unbindService(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
