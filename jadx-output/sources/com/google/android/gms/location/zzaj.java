package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzaj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzaj> CREATOR = new com.google.android.gms.location.zzak();
    private final int zzar;
    private final int zzas;
    private final long zzat;
    private final long zzbt;

    zzaj(int i, int i2, long j, long j2) {
        this.zzas = i;
        this.zzar = i2;
        this.zzbt = j;
        this.zzat = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.location.zzaj zzajVar = (com.google.android.gms.location.zzaj) obj;
            if (this.zzas == zzajVar.zzas && this.zzar == zzajVar.zzar && this.zzbt == zzajVar.zzbt && this.zzat == zzajVar.zzat) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzar), java.lang.Integer.valueOf(this.zzas), java.lang.Long.valueOf(this.zzat), java.lang.Long.valueOf(this.zzbt));
    }

    public final java.lang.String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.zzas + " Cell status: " + this.zzar + " elapsed time NS: " + this.zzat + " system time ms: " + this.zzbt;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzas);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzar);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzbt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzat);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
