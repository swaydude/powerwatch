package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzas<MessageType extends com.google.android.gms.internal.clearcut.zzas<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.clearcut.zzat<MessageType, BuilderType>> implements com.google.android.gms.internal.clearcut.zzdo {
    private static boolean zzey = false;
    protected int zzex = 0;

    void zzf(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final com.google.android.gms.internal.clearcut.zzbb zzr() {
        try {
            com.google.android.gms.internal.clearcut.zzbg zzbgVarZzk = com.google.android.gms.internal.clearcut.zzbb.zzk(zzas());
            zzb(zzbgVarZzk.zzae());
            return zzbgVarZzk.zzad();
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    int zzs() {
        throw new java.lang.UnsupportedOperationException();
    }
}
