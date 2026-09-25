package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class ListSubscriptionsResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.ListSubscriptionsResult> CREATOR = new com.google.android.gms.fitness.result.zzg();
    private final com.google.android.gms.common.api.Status zzqr;
    private final java.util.List<com.google.android.gms.fitness.data.Subscription> zzqv;

    public ListSubscriptionsResult(java.util.List<com.google.android.gms.fitness.data.Subscription> list, com.google.android.gms.common.api.Status status) {
        this.zzqv = list;
        this.zzqr = status;
    }

    public static com.google.android.gms.fitness.result.ListSubscriptionsResult zzd(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.ListSubscriptionsResult(java.util.Collections.emptyList(), status);
    }

    public java.util.List<com.google.android.gms.fitness.data.Subscription> getSubscriptions() {
        return this.zzqv;
    }

    public java.util.List<com.google.android.gms.fitness.data.Subscription> getSubscriptions(com.google.android.gms.fitness.data.DataType dataType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.Subscription subscription : this.zzqv) {
            if (dataType.equals(subscription.zzu())) {
                arrayList.add(subscription);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzqr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.result.ListSubscriptionsResult) {
                com.google.android.gms.fitness.result.ListSubscriptionsResult listSubscriptionsResult = (com.google.android.gms.fitness.result.ListSubscriptionsResult) obj;
                if (this.zzqr.equals(listSubscriptionsResult.zzqr) && com.google.android.gms.common.internal.Objects.equal(this.zzqv, listSubscriptionsResult.zzqv)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzqr, this.zzqv);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzqr).add("subscriptions", this.zzqv).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getSubscriptions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
