package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class StreetViewSource extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewSource> CREATOR = new com.google.android.gms.maps.model.zzq();
    public static final com.google.android.gms.maps.model.StreetViewSource DEFAULT = new com.google.android.gms.maps.model.StreetViewSource(0);
    public static final com.google.android.gms.maps.model.StreetViewSource OUTDOOR = new com.google.android.gms.maps.model.StreetViewSource(1);
    private static final java.lang.String TAG = "StreetViewSource";
    private final int type;

    public StreetViewSource(int i) {
        this.type = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.type);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.type));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.maps.model.StreetViewSource) && this.type == ((com.google.android.gms.maps.model.StreetViewSource) obj).type;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.type;
        if (i != 0) {
            str = i != 1 ? java.lang.String.format("UNKNOWN(%s)", java.lang.Integer.valueOf(i)) : "OUTDOOR";
        } else {
            str = "DEFAULT";
        }
        return java.lang.String.format("StreetViewSource:%s", str);
    }
}
