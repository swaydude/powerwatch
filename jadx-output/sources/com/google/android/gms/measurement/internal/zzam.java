package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzam extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Iterable<java.lang.String> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzam> CREATOR = new com.google.android.gms.measurement.internal.zzao();
    private final android.os.Bundle zza;

    zzam(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, zzb(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final java.lang.Object zza(java.lang.String str) {
        return this.zza.get(str);
    }

    final java.lang.Long zzb(java.lang.String str) {
        return java.lang.Long.valueOf(this.zza.getLong(str));
    }

    final java.lang.Double zzc(java.lang.String str) {
        return java.lang.Double.valueOf(this.zza.getDouble(str));
    }

    final java.lang.String zzd(java.lang.String str) {
        return this.zza.getString(str);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    public final android.os.Bundle zzb() {
        return new android.os.Bundle(this.zza);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.measurement.internal.zzal(this);
    }
}
