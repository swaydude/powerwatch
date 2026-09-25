package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzii extends com.google.android.gms.internal.fitness.zzio {
    private final /* synthetic */ com.google.android.gms.internal.fitness.zzid zzyv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzii(com.google.android.gms.internal.fitness.zzid zzidVar) {
        super(zzidVar, null);
        this.zzyv = zzidVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzio, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.android.gms.internal.fitness.zzif(this.zzyv, null);
    }

    /* synthetic */ zzii(com.google.android.gms.internal.fitness.zzid zzidVar, com.google.android.gms.internal.fitness.zzig zzigVar) {
        this(zzidVar);
    }
}
