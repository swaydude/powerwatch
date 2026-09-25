package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzcf implements com.google.android.gms.internal.clearcut.zzdn {
    private static final com.google.android.gms.internal.clearcut.zzcf zzjo = new com.google.android.gms.internal.clearcut.zzcf();

    private zzcf() {
    }

    public static com.google.android.gms.internal.clearcut.zzcf zzay() {
        return zzjo;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdn
    public final boolean zza(java.lang.Class<?> cls) {
        return com.google.android.gms.internal.clearcut.zzcg.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.clearcut.zzdn
    public final com.google.android.gms.internal.clearcut.zzdm zzb(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.clearcut.zzcg.class.isAssignableFrom(cls)) {
            java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.google.android.gms.internal.clearcut.zzdm) com.google.android.gms.internal.clearcut.zzcg.zzc(cls.asSubclass(com.google.android.gms.internal.clearcut.zzcg.class)).zza(com.google.android.gms.internal.clearcut.zzcg.zzg.zzkf, (java.lang.Object) null, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(cls.getName());
            throw new java.lang.RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new java.lang.String("Unable to get message info for "), e);
        }
    }
}
