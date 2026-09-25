package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzat<MessageType extends com.google.android.gms.internal.clearcut.zzas<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.clearcut.zzat<MessageType, BuilderType>> implements com.google.android.gms.internal.clearcut.zzdp {
    protected abstract BuilderType zza(MessageType messagetype);

    @Override // com.google.android.gms.internal.clearcut.zzdp
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzdp zza(com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        if (zzbe().getClass().isInstance(zzdoVar)) {
            return zza((com.google.android.gms.internal.clearcut.zzas) zzdoVar);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
