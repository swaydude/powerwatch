package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhj extends com.google.android.gms.internal.measurement.zzhp {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzhj(com.google.android.gms.internal.measurement.zzhi zzhiVar) {
        super(zzhiVar, null);
        this.zza = zzhiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzhp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.android.gms.internal.measurement.zzhk(this.zza, null);
    }

    /* synthetic */ zzhj(com.google.android.gms.internal.measurement.zzhi zzhiVar, com.google.android.gms.internal.measurement.zzhh zzhhVar) {
        this(zzhiVar);
    }
}
