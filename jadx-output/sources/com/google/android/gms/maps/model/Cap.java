package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public class Cap extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.Cap> CREATOR = new com.google.android.gms.maps.model.zzb();
    private static final java.lang.String TAG = "Cap";
    private final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor;
    private final int type;
    private final java.lang.Float zzcn;

    private Cap(int i, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, java.lang.Float f) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(i != 3 || (bitmapDescriptor != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), java.lang.String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", java.lang.Integer.valueOf(i), bitmapDescriptor, f));
        this.type = i;
        this.bitmapDescriptor = bitmapDescriptor;
        this.zzcn = f;
    }

    Cap(int i, android.os.IBinder iBinder, java.lang.Float f) {
        this(i, iBinder == null ? null : new com.google.android.gms.maps.model.BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder)), f);
    }

    protected Cap(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, java.lang.Float.valueOf(f));
    }

    protected Cap(int i) {
        this(i, (com.google.android.gms.maps.model.BitmapDescriptor) null, (java.lang.Float) null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.type);
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = this.bitmapDescriptor;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zzb().asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 4, this.zzcn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.type), this.bitmapDescriptor, this.zzcn);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.Cap)) {
            return false;
        }
        com.google.android.gms.maps.model.Cap cap = (com.google.android.gms.maps.model.Cap) obj;
        return this.type == cap.type && com.google.android.gms.common.internal.Objects.equal(this.bitmapDescriptor, cap.bitmapDescriptor) && com.google.android.gms.common.internal.Objects.equal(this.zzcn, cap.zzcn);
    }

    public java.lang.String toString() {
        int i = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    final com.google.android.gms.maps.model.Cap zzh() {
        int i = this.type;
        if (i == 0) {
            return new com.google.android.gms.maps.model.ButtCap();
        }
        if (i == 1) {
            return new com.google.android.gms.maps.model.SquareCap();
        }
        if (i == 2) {
            return new com.google.android.gms.maps.model.RoundCap();
        }
        if (i == 3) {
            return new com.google.android.gms.maps.model.CustomCap(this.bitmapDescriptor, this.zzcn.floatValue());
        }
        java.lang.String str = TAG;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
        sb.append("Unknown Cap type: ");
        sb.append(i);
        android.util.Log.w(str, sb.toString());
        return this;
    }
}
