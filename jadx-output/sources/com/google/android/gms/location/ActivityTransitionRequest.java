package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class ActivityTransitionRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransitionRequest> CREATOR = new com.google.android.gms.location.zzf();
    public static final java.util.Comparator<com.google.android.gms.location.ActivityTransition> IS_SAME_TRANSITION = new com.google.android.gms.location.zze();
    private final java.lang.String tag;
    private final java.util.List<com.google.android.gms.location.ActivityTransition> zzl;
    private final java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzm;

    public ActivityTransitionRequest(java.util.List<com.google.android.gms.location.ActivityTransition> list) {
        this(list, null, null);
    }

    public ActivityTransitionRequest(java.util.List<com.google.android.gms.location.ActivityTransition> list, java.lang.String str, java.util.List<com.google.android.gms.common.internal.ClientIdentity> list2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "transitions can't be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(list.size() > 0, "transitions can't be empty.");
        java.util.TreeSet treeSet = new java.util.TreeSet(IS_SAME_TRANSITION);
        for (com.google.android.gms.location.ActivityTransition activityTransition : list) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(treeSet.add(activityTransition), java.lang.String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.zzl = java.util.Collections.unmodifiableList(list);
        this.tag = str;
        this.zzm = list2 == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest = (com.google.android.gms.location.ActivityTransitionRequest) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzl, activityTransitionRequest.zzl) && com.google.android.gms.common.internal.Objects.equal(this.tag, activityTransitionRequest.tag) && com.google.android.gms.common.internal.Objects.equal(this.zzm, activityTransitionRequest.zzm)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.zzl.hashCode() * 31;
        java.lang.String str = this.tag;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.util.List<com.google.android.gms.common.internal.ClientIdentity> list = this.zzm;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public void serializeToIntentExtra(android.content.Intent intent) {
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzl);
        java.lang.String str = this.tag;
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.zzm);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 61 + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(strValueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(strValueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(strValueOf2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.tag, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
