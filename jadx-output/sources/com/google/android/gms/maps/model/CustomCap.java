package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class CustomCap extends com.google.android.gms.maps.model.Cap {
    public final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomCap(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, float f) {
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2 = (com.google.android.gms.maps.model.BitmapDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(bitmapDescriptor, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("refWidth must be positive");
        }
        super(bitmapDescriptor2, f);
        this.bitmapDescriptor = bitmapDescriptor;
        this.refWidth = f;
    }

    public CustomCap(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.bitmapDescriptor);
        float f = this.refWidth;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(strValueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
