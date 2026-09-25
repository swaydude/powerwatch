package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbc> CREATOR = new com.google.android.gms.fitness.request.zzbb();
    private final java.lang.String name;
    private final java.lang.String zzma;
    private final com.google.android.gms.internal.fitness.zzcl zzqj;

    zzbc(java.lang.String str, java.lang.String str2, android.os.IBinder iBinder) {
        this.name = str;
        this.zzma = str2;
        this.zzqj = com.google.android.gms.internal.fitness.zzck.zzi(iBinder);
    }

    public zzbc(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.fitness.zzcl zzclVar) {
        this.name = str;
        this.zzma = str2;
        this.zzqj = zzclVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof com.google.android.gms.fitness.request.zzbc) {
                com.google.android.gms.fitness.request.zzbc zzbcVar = (com.google.android.gms.fitness.request.zzbc) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.name, zzbcVar.name) && com.google.android.gms.common.internal.Objects.equal(this.zzma, zzbcVar.zzma)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.name, this.zzma);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).add(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_IDENTIFIER_KEY, this.zzma).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzma, false);
        com.google.android.gms.internal.fitness.zzcl zzclVar = this.zzqj;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzclVar == null ? null : zzclVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
