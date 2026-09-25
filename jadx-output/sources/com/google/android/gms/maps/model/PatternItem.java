package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public class PatternItem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PatternItem> CREATOR = new com.google.android.gms.maps.model.zzi();
    private static final java.lang.String TAG = "PatternItem";
    private final int type;
    private final java.lang.Float zzdv;

    public PatternItem(int i, java.lang.Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(f);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(strValueOf);
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
        this.type = i;
        this.zzdv = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.type);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 3, this.zzdv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.type), this.zzdv);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.PatternItem)) {
            return false;
        }
        com.google.android.gms.maps.model.PatternItem patternItem = (com.google.android.gms.maps.model.PatternItem) obj;
        return this.type == patternItem.type && com.google.android.gms.common.internal.Objects.equal(this.zzdv, patternItem.zzdv);
    }

    public java.lang.String toString() {
        int i = this.type;
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzdv);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    static java.util.List<com.google.android.gms.maps.model.PatternItem> zza(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        com.google.android.gms.maps.model.PatternItem dash;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (com.google.android.gms.maps.model.PatternItem dot : list) {
            if (dot == null) {
                dot = null;
            } else {
                int i = dot.type;
                if (i == 0) {
                    dash = new com.google.android.gms.maps.model.Dash(dot.zzdv.floatValue());
                } else if (i == 1) {
                    dot = new com.google.android.gms.maps.model.Dot();
                } else if (i == 2) {
                    dash = new com.google.android.gms.maps.model.Gap(dot.zzdv.floatValue());
                } else {
                    java.lang.String str = TAG;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
                    sb.append("Unknown PatternItem type: ");
                    sb.append(i);
                    android.util.Log.w(str, sb.toString());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }
}
