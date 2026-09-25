package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class ActivityTransitionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransitionResult> CREATOR = new com.google.android.gms.location.zzg();
    private final java.util.List<com.google.android.gms.location.ActivityTransitionEvent> zzn;

    public ActivityTransitionResult(java.util.List<com.google.android.gms.location.ActivityTransitionEvent> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                com.google.android.gms.common.internal.Preconditions.checkArgument(list.get(i).getElapsedRealTimeNanos() >= list.get(i + (-1)).getElapsedRealTimeNanos());
            }
        }
        this.zzn = java.util.Collections.unmodifiableList(list);
    }

    public static com.google.android.gms.location.ActivityTransitionResult extractResult(android.content.Intent intent) {
        if (hasResult(intent)) {
            return (com.google.android.gms.location.ActivityTransitionResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public static boolean hasResult(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzn.equals(((com.google.android.gms.location.ActivityTransitionResult) obj).zzn);
    }

    public java.util.List<com.google.android.gms.location.ActivityTransitionEvent> getTransitionEvents() {
        return this.zzn;
    }

    public int hashCode() {
        return this.zzn.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getTransitionEvents(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
