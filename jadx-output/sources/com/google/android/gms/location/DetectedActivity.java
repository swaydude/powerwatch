package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class DetectedActivity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    private int zzi;
    private int zzs;
    private static final java.util.Comparator<com.google.android.gms.location.DetectedActivity> zzo = new com.google.android.gms.location.zzh();
    private static final int[] zzp = {9, 10};
    private static final int[] zzq = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};
    private static final int[] zzr = {0, 1, 2, 3, 7, 8, 16, 17};
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.DetectedActivity> CREATOR = new com.google.android.gms.location.zzi();

    public DetectedActivity(int i, int i2) {
        this.zzi = i;
        this.zzs = i2;
    }

    public static void zzb(int i) {
        boolean z = false;
        for (int i2 : zzr) {
            if (i2 == i) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(81);
        sb.append(i);
        sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
        android.util.Log.w("DetectedActivity", sb.toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.location.DetectedActivity detectedActivity = (com.google.android.gms.location.DetectedActivity) obj;
            if (this.zzi == detectedActivity.zzi && this.zzs == detectedActivity.zzs) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.zzs;
    }

    public int getType() {
        int i = this.zzi;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzi), java.lang.Integer.valueOf(this.zzs));
    }

    public java.lang.String toString() {
        java.lang.String string;
        int type = getType();
        if (type == 0) {
            string = "IN_VEHICLE";
        } else if (type == 1) {
            string = "ON_BICYCLE";
        } else if (type == 2) {
            string = "ON_FOOT";
        } else if (type == 3) {
            string = "STILL";
        } else if (type == 4) {
            string = "UNKNOWN";
        } else if (type == 5) {
            string = "TILTING";
        } else if (type == 7) {
            string = "WALKING";
        } else if (type != 8) {
            switch (type) {
                case 16:
                    string = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    string = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    string = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    string = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    string = java.lang.Integer.toString(type);
                    break;
            }
        } else {
            string = "RUNNING";
        }
        int i = this.zzs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(string);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzs);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
