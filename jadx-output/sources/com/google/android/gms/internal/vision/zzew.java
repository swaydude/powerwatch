package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzew<MessageType extends com.google.android.gms.internal.vision.zzet<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzew<MessageType, BuilderType>> implements com.google.android.gms.internal.vision.zzib {
    protected abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(com.google.android.gms.internal.vision.zzft zzftVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException;

    @Override // 
    /* JADX INFO: renamed from: zzdn, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.vision.zzgd zzgdVar) throws com.google.android.gms.internal.vision.zzhc {
        try {
            com.google.android.gms.internal.vision.zzft zzftVarZza = com.google.android.gms.internal.vision.zzft.zza(bArr, 0, i2, false);
            zza(zzftVarZza, zzgdVar);
            zzftVarZza.zzaq(0);
            return this;
        } catch (com.google.android.gms.internal.vision.zzhc e) {
            throw e;
        } catch (java.io.IOException e2) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e2);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzib
    public final /* synthetic */ com.google.android.gms.internal.vision.zzib zza(com.google.android.gms.internal.vision.zzic zzicVar) {
        if (!zzgd().getClass().isInstance(zzicVar)) {
            throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((com.google.android.gms.internal.vision.zzet) zzicVar);
    }
}
