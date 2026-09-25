package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzez<MessageType extends com.google.android.gms.internal.fitness.zzex<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.fitness.zzez<MessageType, BuilderType>> implements com.google.android.gms.internal.fitness.zzhn {
    protected abstract BuilderType zza(MessageType messagetype);

    @Override // 
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    @Override // com.google.android.gms.internal.fitness.zzhn
    public final /* synthetic */ com.google.android.gms.internal.fitness.zzhn zza(com.google.android.gms.internal.fitness.zzho zzhoVar) {
        if (!zzbm().getClass().isInstance(zzhoVar)) {
            throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((com.google.android.gms.internal.fitness.zzex) zzhoVar);
    }
}
