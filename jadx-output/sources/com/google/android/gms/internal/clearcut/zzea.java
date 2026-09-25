package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzea {
    private static final com.google.android.gms.internal.clearcut.zzea zznc = new com.google.android.gms.internal.clearcut.zzea();
    private final com.google.android.gms.internal.clearcut.zzeg zznd;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.clearcut.zzef<?>> zzne = new java.util.concurrent.ConcurrentHashMap();

    private zzea() {
        java.lang.String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        com.google.android.gms.internal.clearcut.zzeg zzegVarZzk = null;
        for (int i = 0; i <= 0; i++) {
            zzegVarZzk = zzk(strArr[0]);
            if (zzegVarZzk != null) {
                break;
            }
        }
        this.zznd = zzegVarZzk == null ? new com.google.android.gms.internal.clearcut.zzdd() : zzegVarZzk;
    }

    public static com.google.android.gms.internal.clearcut.zzea zzcm() {
        return zznc;
    }

    private static com.google.android.gms.internal.clearcut.zzeg zzk(java.lang.String str) {
        try {
            return (com.google.android.gms.internal.clearcut.zzeg) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final <T> com.google.android.gms.internal.clearcut.zzef<T> zze(java.lang.Class<T> cls) {
        com.google.android.gms.internal.clearcut.zzci.zza(cls, "messageType");
        com.google.android.gms.internal.clearcut.zzef<T> zzefVar = (com.google.android.gms.internal.clearcut.zzef) this.zzne.get(cls);
        if (zzefVar != null) {
            return zzefVar;
        }
        com.google.android.gms.internal.clearcut.zzef<T> zzefVarZzd = this.zznd.zzd(cls);
        com.google.android.gms.internal.clearcut.zzci.zza(cls, "messageType");
        com.google.android.gms.internal.clearcut.zzci.zza(zzefVarZzd, "schema");
        com.google.android.gms.internal.clearcut.zzef<T> zzefVar2 = (com.google.android.gms.internal.clearcut.zzef) this.zzne.putIfAbsent(cls, zzefVarZzd);
        return zzefVar2 != null ? zzefVar2 : zzefVarZzd;
    }

    public final <T> com.google.android.gms.internal.clearcut.zzef<T> zzp(T t) {
        return zze(t.getClass());
    }
}
