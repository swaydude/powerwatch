package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdn<MessageType extends com.google.android.gms.internal.measurement.zzdl<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzdn<MessageType, BuilderType>> implements com.google.android.gms.internal.measurement.zzgn {
    protected abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(com.google.android.gms.internal.measurement.zzeg zzegVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException;

    @Override // 
    /* JADX INFO: renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.measurement.zzfo {
        try {
            com.google.android.gms.internal.measurement.zzeg zzegVarZza = com.google.android.gms.internal.measurement.zzeg.zza(bArr, 0, i2, false);
            zza(zzegVarZza, com.google.android.gms.internal.measurement.zzeq.zza());
            zzegVarZza.zza(0);
            return this;
        } catch (com.google.android.gms.internal.measurement.zzfo e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws com.google.android.gms.internal.measurement.zzfo {
        try {
            com.google.android.gms.internal.measurement.zzeg zzegVarZza = com.google.android.gms.internal.measurement.zzeg.zza(bArr, 0, i2, false);
            zza(zzegVarZza, zzeqVar);
            zzegVarZza.zza(0);
            return this;
        } catch (com.google.android.gms.internal.measurement.zzfo e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("byte array"), e2);
        }
    }

    private final java.lang.String zza(java.lang.String str) {
        java.lang.String name = getClass().getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 60 + java.lang.String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zza(com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        if (!zzbt().getClass().isInstance(zzgoVar)) {
            throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((com.google.android.gms.internal.measurement.zzdl) zzgoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zza(byte[] bArr, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws com.google.android.gms.internal.measurement.zzfo {
        return zza(bArr, 0, bArr.length, zzeqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zza(byte[] bArr) throws com.google.android.gms.internal.measurement.zzfo {
        return zza(bArr, 0, bArr.length);
    }
}
