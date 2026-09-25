package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationAvailability> CREATOR = new com.google.android.gms.location.zzaa();

    @java.lang.Deprecated
    private int zzar;

    @java.lang.Deprecated
    private int zzas;
    private long zzat;
    private int zzau;
    private com.google.android.gms.location.zzaj[] zzav;

    LocationAvailability(int i, int i2, int i3, long j, com.google.android.gms.location.zzaj[] zzajVarArr) {
        this.zzau = i;
        this.zzar = i2;
        this.zzas = i3;
        this.zzat = j;
        this.zzav = zzajVarArr;
    }

    public static com.google.android.gms.location.LocationAvailability extractLocationAvailability(android.content.Intent intent) {
        if (hasLocationAvailability(intent)) {
            return (com.google.android.gms.location.LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        }
        return null;
    }

    public static boolean hasLocationAvailability(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) obj;
            if (this.zzar == locationAvailability.zzar && this.zzas == locationAvailability.zzas && this.zzat == locationAvailability.zzat && this.zzau == locationAvailability.zzau && java.util.Arrays.equals(this.zzav, locationAvailability.zzav)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzau), java.lang.Integer.valueOf(this.zzar), java.lang.Integer.valueOf(this.zzas), java.lang.Long.valueOf(this.zzat), this.zzav);
    }

    public final boolean isLocationAvailable() {
        return this.zzau < 1000;
    }

    public final java.lang.String toString() {
        boolean zIsLocationAvailable = isLocationAvailable();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(zIsLocationAvailable);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzar);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzas);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzat);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzau);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.zzav, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
