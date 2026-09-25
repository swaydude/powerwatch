package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SessionReadResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.SessionReadResult> CREATOR = new com.google.android.gms.fitness.result.zzh();
    private final java.util.List<com.google.android.gms.fitness.data.Session> zzoo;
    private final com.google.android.gms.common.api.Status zzqr;
    private final java.util.List<com.google.android.gms.fitness.data.zzad> zzqw;

    public SessionReadResult(java.util.List<com.google.android.gms.fitness.data.Session> list, java.util.List<com.google.android.gms.fitness.data.zzad> list2, com.google.android.gms.common.api.Status status) {
        this.zzoo = list;
        this.zzqw = java.util.Collections.unmodifiableList(list2);
        this.zzqr = status;
    }

    public static com.google.android.gms.fitness.result.SessionReadResult zze(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.SessionReadResult(new java.util.ArrayList(), new java.util.ArrayList(), status);
    }

    public java.util.List<com.google.android.gms.fitness.data.Session> getSessions() {
        return this.zzoo;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSet(com.google.android.gms.fitness.data.Session session, com.google.android.gms.fitness.data.DataType dataType) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzoo.contains(session), "Attempting to read data for session %s which was not returned", session);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.zzad zzadVar : this.zzqw) {
            if (com.google.android.gms.common.internal.Objects.equal(session, zzadVar.getSession()) && dataType.equals(zzadVar.getDataSet().getDataType())) {
                arrayList.add(zzadVar.getDataSet());
            }
        }
        return arrayList;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSet(com.google.android.gms.fitness.data.Session session) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzoo.contains(session), "Attempting to read data for session %s which was not returned", session);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.zzad zzadVar : this.zzqw) {
            if (com.google.android.gms.common.internal.Objects.equal(session, zzadVar.getSession())) {
                arrayList.add(zzadVar.getDataSet());
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.result.SessionReadResult) {
                com.google.android.gms.fitness.result.SessionReadResult sessionReadResult = (com.google.android.gms.fitness.result.SessionReadResult) obj;
                if (this.zzqr.equals(sessionReadResult.zzqr) && com.google.android.gms.common.internal.Objects.equal(this.zzoo, sessionReadResult.zzoo) && com.google.android.gms.common.internal.Objects.equal(this.zzqw, sessionReadResult.zzqw)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqr, this.zzoo, this.zzqw);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzqr).add("sessions", this.zzoo).add("sessionDataSets", this.zzqw).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getSessions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzqw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
