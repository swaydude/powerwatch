package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class GoalsResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.GoalsResult> CREATOR = new com.google.android.gms.fitness.result.zzf();
    private final com.google.android.gms.common.api.Status zzqr;
    private final java.util.List<com.google.android.gms.fitness.data.Goal> zzqu;

    public GoalsResult(com.google.android.gms.common.api.Status status, java.util.List<com.google.android.gms.fitness.data.Goal> list) {
        this.zzqr = status;
        this.zzqu = list;
    }

    public java.util.List<com.google.android.gms.fitness.data.Goal> getGoals() {
        return this.zzqu;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getGoals(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
