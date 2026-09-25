package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzt> CREATOR = new com.google.android.gms.fitness.request.zzs();
    private final java.lang.String name;
    private final com.google.android.gms.internal.fitness.zzbl zzpj;

    zzt(java.lang.String str, android.os.IBinder iBinder) {
        this.name = str;
        this.zzpj = com.google.android.gms.internal.fitness.zzbk.zze(iBinder);
    }

    public zzt(java.lang.String str, com.google.android.gms.internal.fitness.zzbl zzblVar) {
        this.name = str;
        this.zzpj = zzblVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.fitness.request.zzt) && com.google.android.gms.common.internal.Objects.equal(this.name, ((com.google.android.gms.fitness.request.zzt) obj).name);
        }
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.name);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzpj.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
