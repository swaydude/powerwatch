package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class Gap extends com.google.android.gms.maps.model.PatternItem {
    public final float length;

    public Gap(float f) {
        super(2, java.lang.Float.valueOf(java.lang.Math.max(f, 0.0f)));
        this.length = java.lang.Math.max(f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public final java.lang.String toString() {
        float f = this.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
        sb.append("[Gap: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
