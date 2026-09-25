package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzex<MessageType extends com.google.android.gms.internal.fitness.zzex<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.fitness.zzez<MessageType, BuilderType>> implements com.google.android.gms.internal.fitness.zzho {
    protected int zzrb = 0;

    @Override // com.google.android.gms.internal.fitness.zzho
    public final com.google.android.gms.internal.fitness.zzff zzag() {
        try {
            com.google.android.gms.internal.fitness.zzfn zzfnVarZzj = com.google.android.gms.internal.fitness.zzff.zzj(zzbk());
            zzb(zzfnVarZzj.zzau());
            return zzfnVarZzj.zzat();
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

    int zzah() {
        throw new java.lang.UnsupportedOperationException();
    }

    void zzg(int i) {
        throw new java.lang.UnsupportedOperationException();
    }
}
