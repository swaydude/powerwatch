package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class ActivityTransitionEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransitionEvent> CREATOR = new com.google.android.gms.location.zzd();
    private final int zzi;
    private final int zzj;
    private final long zzk;

    public ActivityTransitionEvent(int i, int i2, long j) {
        com.google.android.gms.location.DetectedActivity.zzb(i);
        com.google.android.gms.location.ActivityTransition.zza(i2);
        this.zzi = i;
        this.zzj = i2;
        this.zzk = j;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.ActivityTransitionEvent)) {
            return false;
        }
        com.google.android.gms.location.ActivityTransitionEvent activityTransitionEvent = (com.google.android.gms.location.ActivityTransitionEvent) obj;
        return this.zzi == activityTransitionEvent.zzi && this.zzj == activityTransitionEvent.zzj && this.zzk == activityTransitionEvent.zzk;
    }

    public int getActivityType() {
        return this.zzi;
    }

    public long getElapsedRealTimeNanos() {
        return this.zzk;
    }

    public int getTransitionType() {
        return this.zzj;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzi), java.lang.Integer.valueOf(this.zzj), java.lang.Long.valueOf(this.zzk));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.zzi;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.zzj;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.zzk;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getElapsedRealTimeNanos());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
