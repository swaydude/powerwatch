package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationRequest> CREATOR = new com.google.android.gms.location.zzab();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    private int priority;
    private long zzaf;
    private long zzaw;
    private long zzax;
    private boolean zzay;
    private float zzaz;
    private long zzba;
    private int zzx;

    public LocationRequest() {
        this.priority = 102;
        this.zzaw = 3600000L;
        this.zzax = 600000L;
        this.zzay = false;
        this.zzaf = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        this.zzx = Integer.MAX_VALUE;
        this.zzaz = 0.0f;
        this.zzba = 0L;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.priority = i;
        this.zzaw = j;
        this.zzax = j2;
        this.zzay = z;
        this.zzaf = j3;
        this.zzx = i2;
        this.zzaz = f;
        this.zzba = j4;
    }

    public static com.google.android.gms.location.LocationRequest create() {
        return new com.google.android.gms.location.LocationRequest();
    }

    private static void zza(long j) {
        if (j >= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.LocationRequest)) {
            return false;
        }
        com.google.android.gms.location.LocationRequest locationRequest = (com.google.android.gms.location.LocationRequest) obj;
        return this.priority == locationRequest.priority && this.zzaw == locationRequest.zzaw && this.zzax == locationRequest.zzax && this.zzay == locationRequest.zzay && this.zzaf == locationRequest.zzaf && this.zzx == locationRequest.zzx && this.zzaz == locationRequest.zzaz && getMaxWaitTime() == locationRequest.getMaxWaitTime();
    }

    public final long getExpirationTime() {
        return this.zzaf;
    }

    public final long getFastestInterval() {
        return this.zzax;
    }

    public final long getInterval() {
        return this.zzaw;
    }

    public final long getMaxWaitTime() {
        long j = this.zzba;
        long j2 = this.zzaw;
        return j < j2 ? j2 : j;
    }

    public final int getNumUpdates() {
        return this.zzx;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final float getSmallestDisplacement() {
        return this.zzaz;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.priority), java.lang.Long.valueOf(this.zzaw), java.lang.Float.valueOf(this.zzaz), java.lang.Long.valueOf(this.zzba));
    }

    public final boolean isFastestIntervalExplicitlySet() {
        return this.zzay;
    }

    public final com.google.android.gms.location.LocationRequest setExpirationDuration(long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (j > kotlin.jvm.internal.LongCompanionObject.MAX_VALUE - jElapsedRealtime) {
            this.zzaf = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        } else {
            this.zzaf = j + jElapsedRealtime;
        }
        if (this.zzaf < 0) {
            this.zzaf = 0L;
        }
        return this;
    }

    public final com.google.android.gms.location.LocationRequest setExpirationTime(long j) {
        this.zzaf = j;
        if (j < 0) {
            this.zzaf = 0L;
        }
        return this;
    }

    public final com.google.android.gms.location.LocationRequest setFastestInterval(long j) {
        zza(j);
        this.zzay = true;
        this.zzax = j;
        return this;
    }

    public final com.google.android.gms.location.LocationRequest setInterval(long j) {
        zza(j);
        this.zzaw = j;
        if (!this.zzay) {
            this.zzax = (long) (j / 6.0d);
        }
        return this;
    }

    public final com.google.android.gms.location.LocationRequest setMaxWaitTime(long j) {
        zza(j);
        this.zzba = j;
        return this;
    }

    public final com.google.android.gms.location.LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzx = i;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final com.google.android.gms.location.LocationRequest setPriority(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.priority = i;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final com.google.android.gms.location.LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzaz = f;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request[");
        int i = this.priority;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i != 104) {
            str = i != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb.append(str);
        if (this.priority != 105) {
            sb.append(" requested=");
            sb.append(this.zzaw);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.zzax);
        sb.append("ms");
        if (this.zzba > this.zzaw) {
            sb.append(" maxWait=");
            sb.append(this.zzba);
            sb.append("ms");
        }
        if (this.zzaz > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.zzaz);
            sb.append("m");
        }
        long j = this.zzaf;
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
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.priority);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzaw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzax);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzay);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzaf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, this.zzaz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zzba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
