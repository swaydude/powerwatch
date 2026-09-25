package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.ReflectedParcelable {
    private final int zzg;
    private final int zzh;
    private final android.app.PendingIntent zzi;
    private final java.lang.String zzj;
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS = new com.google.android.gms.common.api.Status(0);
    public static final com.google.android.gms.common.api.Status RESULT_INTERRUPTED = new com.google.android.gms.common.api.Status(14);
    public static final com.google.android.gms.common.api.Status RESULT_INTERNAL_ERROR = new com.google.android.gms.common.api.Status(8);
    public static final com.google.android.gms.common.api.Status RESULT_TIMEOUT = new com.google.android.gms.common.api.Status(15);
    public static final com.google.android.gms.common.api.Status RESULT_CANCELED = new com.google.android.gms.common.api.Status(16);
    private static final com.google.android.gms.common.api.Status zzar = new com.google.android.gms.common.api.Status(17);
    public static final com.google.android.gms.common.api.Status RESULT_DEAD_CLIENT = new com.google.android.gms.common.api.Status(18);
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new com.google.android.gms.common.api.zzb();

    Status(int i, int i2, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this.zzg = i;
        this.zzh = i2;
        this.zzj = str;
        this.zzi = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this;
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, java.lang.String str) {
        this(1, i, str, null);
    }

    public Status(int i, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final void startResolutionForResult(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.zzi.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final java.lang.String getStatusMessage() {
        return this.zzj;
    }

    public final boolean hasResolution() {
        return this.zzi != null;
    }

    public final boolean isSuccess() {
        return this.zzh <= 0;
    }

    public final boolean isCanceled() {
        return this.zzh == 16;
    }

    public final boolean isInterrupted() {
        return this.zzh == 14;
    }

    public final int getStatusCode() {
        return this.zzh;
    }

    public final android.app.PendingIntent getResolution() {
        return this.zzi;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzg), java.lang.Integer.valueOf(this.zzh), this.zzj, this.zzi);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.zzg == status.zzg && this.zzh == status.zzh && com.google.android.gms.common.internal.Objects.equal(this.zzj, status.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzi, status.zzi);
    }

    public final java.lang.String zzg() {
        java.lang.String str = this.zzj;
        return str != null ? str : com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zzh);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("statusCode", zzg()).add("resolution", this.zzi).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
