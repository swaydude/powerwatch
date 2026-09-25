package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class ActivityTransition extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransition> CREATOR = new com.google.android.gms.location.zzc();
    private final int zzi;
    private final int zzj;

    public static class Builder {
        private int zzi = -1;
        private int zzj = -1;

        public com.google.android.gms.location.ActivityTransition build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzi != -1, "Activity type not set.");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzj != -1, "Activity transition type not set.");
            return new com.google.android.gms.location.ActivityTransition(this.zzi, this.zzj);
        }

        public com.google.android.gms.location.ActivityTransition.Builder setActivityTransition(int i) {
            com.google.android.gms.location.ActivityTransition.zza(i);
            this.zzj = i;
            return this;
        }

        public com.google.android.gms.location.ActivityTransition.Builder setActivityType(int i) {
            com.google.android.gms.location.DetectedActivity.zzb(i);
            this.zzi = i;
            return this;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    ActivityTransition(int i, int i2) {
        this.zzi = i;
        this.zzj = i2;
    }

    public static void zza(int i) {
        boolean z = i >= 0 && i <= 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.ActivityTransition)) {
            return false;
        }
        com.google.android.gms.location.ActivityTransition activityTransition = (com.google.android.gms.location.ActivityTransition) obj;
        return this.zzi == activityTransition.zzi && this.zzj == activityTransition.zzj;
    }

    public int getActivityType() {
        return this.zzi;
    }

    public int getTransitionType() {
        return this.zzj;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzi), java.lang.Integer.valueOf(this.zzj));
    }

    public java.lang.String toString() {
        int i = this.zzi;
        int i2 = this.zzj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
