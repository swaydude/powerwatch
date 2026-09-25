package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzj> CREATOR = new com.google.android.gms.location.zzk();
    private boolean zzt;
    private long zzu;
    private float zzv;
    private long zzw;
    private int zzx;

    public zzj() {
        this(true, 50L, 0.0f, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.zzt = z;
        this.zzu = j;
        this.zzv = f;
        this.zzw = j2;
        this.zzx = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.zzj)) {
            return false;
        }
        com.google.android.gms.location.zzj zzjVar = (com.google.android.gms.location.zzj) obj;
        return this.zzt == zzjVar.zzt && this.zzu == zzjVar.zzu && java.lang.Float.compare(this.zzv, zzjVar.zzv) == 0 && this.zzw == zzjVar.zzw && this.zzx == zzjVar.zzx;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zzt), java.lang.Long.valueOf(this.zzu), java.lang.Float.valueOf(this.zzv), java.lang.Long.valueOf(this.zzw), java.lang.Integer.valueOf(this.zzx));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.zzt);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.zzu);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.zzv);
        long j = this.zzw;
        if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
            long jElapsedRealtime = j - android.os.SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(jElapsedRealtime);
            sb.append("ms");
        }
        if (this.zzx != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.zzx);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zzt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
