package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzn<T> {
    private static java.lang.String PREFIX = "com.google.android.gms.vision.dynamite";
    private final java.lang.String tag;
    private final java.lang.String zzde;
    private final java.lang.String zzdf;
    private final boolean zzdg;
    private T zzdj;
    private final android.content.Context zze;
    private final java.lang.Object lock = new java.lang.Object();
    private boolean zzdh = false;
    private boolean zzdi = false;

    public zzn(android.content.Context context, java.lang.String str, java.lang.String str2) {
        boolean z = false;
        this.zze = context;
        this.tag = str;
        java.lang.String str3 = PREFIX;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 1 + java.lang.String.valueOf(str2).length());
        sb.append(str3);
        sb.append(".");
        sb.append(str2);
        this.zzde = sb.toString();
        this.zzdf = str2;
        if (context != null) {
            com.google.android.gms.internal.vision.zzbe.maybeInit(context);
            com.google.android.gms.internal.vision.zzdg zzdgVarZza = com.google.android.gms.internal.vision.zzdg.zza("barcode", java.lang.Boolean.valueOf(com.google.android.gms.internal.vision.zzkv.zzjp()), "face", java.lang.Boolean.TRUE, "ica", java.lang.Boolean.valueOf(com.google.android.gms.internal.vision.zzkv.zzjq()), "ocr", java.lang.Boolean.TRUE);
            if (zzdgVarZza.containsKey(str2) && ((java.lang.Boolean) zzdgVarZza.get(str2)).booleanValue()) {
                z = true;
            }
        }
        this.zzdg = z;
    }

    protected abstract T zza(com.google.android.gms.dynamite.DynamiteModule dynamiteModule, android.content.Context context) throws android.os.RemoteException, com.google.android.gms.dynamite.DynamiteModule.LoadingException;

    protected abstract void zzn() throws android.os.RemoteException;

    public final boolean isOperational() {
        return zzp() != null;
    }

    public final void zzo() {
        synchronized (this.lock) {
            if (this.zzdj == null) {
                return;
            }
            try {
                zzn();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(this.tag, "Could not finalize native handle", e);
            }
        }
    }

    protected final T zzp() {
        com.google.android.gms.dynamite.DynamiteModule dynamiteModuleZza;
        synchronized (this.lock) {
            T t = this.zzdj;
            if (t != null) {
                return t;
            }
            try {
                dynamiteModuleZza = com.google.android.gms.dynamite.DynamiteModule.load(this.zze, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, this.zzde);
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
                android.util.Log.d(this.tag, "Cannot load feature, fall back to load dynamite module.");
                dynamiteModuleZza = com.google.android.gms.internal.vision.zzr.zza(this.zze, this.zzdf, this.zzdg);
                if (dynamiteModuleZza == null && this.zzdg && !this.zzdh) {
                    java.lang.String str = this.tag;
                    java.lang.String strValueOf = java.lang.String.valueOf(this.zzdf);
                    android.util.Log.d(str, strValueOf.length() != 0 ? "Broadcasting download intent for dependency ".concat(strValueOf) : new java.lang.String("Broadcasting download intent for dependency "));
                    java.lang.String str2 = this.zzdf;
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                    intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str2);
                    intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                    this.zze.sendBroadcast(intent);
                    this.zzdh = true;
                }
            }
            if (dynamiteModuleZza != null) {
                try {
                    this.zzdj = zza(dynamiteModuleZza, this.zze);
                } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
                    android.util.Log.e(this.tag, "Error creating remote native handle", e);
                }
            }
            boolean z = this.zzdi;
            if (!z && this.zzdj == null) {
                android.util.Log.w(this.tag, "Native handle not yet available. Reverting to no-op handle.");
                this.zzdi = true;
            } else if (z && this.zzdj != null) {
                android.util.Log.w(this.tag, "Native handle is now available.");
            }
            return this.zzdj;
        }
    }
}
