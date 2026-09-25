package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SessionStopResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.SessionStopResult> CREATOR = new com.google.android.gms.fitness.result.zzi();
    private final java.util.List<com.google.android.gms.fitness.data.Session> zzoo;
    private final com.google.android.gms.common.api.Status zzqr;

    public SessionStopResult(com.google.android.gms.common.api.Status status, java.util.List<com.google.android.gms.fitness.data.Session> list) {
        this.zzqr = status;
        this.zzoo = java.util.Collections.unmodifiableList(list);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    public java.util.List<com.google.android.gms.fitness.data.Session> getSessions() {
        return this.zzoo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.result.SessionStopResult) {
                com.google.android.gms.fitness.result.SessionStopResult sessionStopResult = (com.google.android.gms.fitness.result.SessionStopResult) obj;
                if (this.zzqr.equals(sessionStopResult.zzqr) && com.google.android.gms.common.internal.Objects.equal(this.zzoo, sessionStopResult.zzoo)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqr, this.zzoo);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzqr).add("sessions", this.zzoo).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, getSessions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
