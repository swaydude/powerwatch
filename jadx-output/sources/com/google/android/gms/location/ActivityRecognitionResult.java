package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRecognitionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityRecognitionResult> CREATOR = new com.google.android.gms.location.zzb();
    private android.os.Bundle extras;
    private java.util.List<com.google.android.gms.location.DetectedActivity> zze;
    private long zzf;
    private long zzg;
    private int zzh;

    public ActivityRecognitionResult(com.google.android.gms.location.DetectedActivity detectedActivity, long j, long j2) {
        this(detectedActivity, j, j2, 0, (android.os.Bundle) null);
    }

    private ActivityRecognitionResult(com.google.android.gms.location.DetectedActivity detectedActivity, long j, long j2, int i, android.os.Bundle bundle) {
        this((java.util.List<com.google.android.gms.location.DetectedActivity>) java.util.Collections.singletonList(detectedActivity), j, j2, 0, (android.os.Bundle) null);
    }

    public ActivityRecognitionResult(java.util.List<com.google.android.gms.location.DetectedActivity> list, long j, long j2) {
        this(list, j, j2, 0, (android.os.Bundle) null);
    }

    public ActivityRecognitionResult(java.util.List<com.google.android.gms.location.DetectedActivity> list, long j, long j2, int i, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0 && j2 > 0, "Must set times");
        this.zze = list;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i;
        this.extras = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public static com.google.android.gms.location.ActivityRecognitionResult extractResult(android.content.Intent intent) {
        com.google.android.gms.location.ActivityRecognitionResult activityRecognitionResult;
        if (hasResult(intent)) {
            java.lang.Object objDeserializeFromBytes = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (objDeserializeFromBytes instanceof byte[]) {
                objDeserializeFromBytes = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes((byte[]) objDeserializeFromBytes, CREATOR);
            } else if (!(objDeserializeFromBytes instanceof com.google.android.gms.location.ActivityRecognitionResult)) {
                activityRecognitionResult = null;
            }
            activityRecognitionResult = (com.google.android.gms.location.ActivityRecognitionResult) objDeserializeFromBytes;
        } else {
            activityRecognitionResult = null;
        }
        if (activityRecognitionResult != null) {
            return activityRecognitionResult;
        }
        java.util.List<com.google.android.gms.location.ActivityRecognitionResult> listZza = zza(intent);
        if (listZza == null || listZza.isEmpty()) {
            return null;
        }
        return listZza.get(listZza.size() - 1);
    }

    public static boolean hasResult(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        java.util.List<com.google.android.gms.location.ActivityRecognitionResult> listZza = zza(intent);
        return (listZza == null || listZza.isEmpty()) ? false : true;
    }

    private static java.util.List<com.google.android.gms.location.ActivityRecognitionResult> zza(android.content.Intent intent) {
        if (intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    private static boolean zza(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (java.lang.String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof android.os.Bundle) {
                if (!zza(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.location.ActivityRecognitionResult activityRecognitionResult = (com.google.android.gms.location.ActivityRecognitionResult) obj;
            if (this.zzf == activityRecognitionResult.zzf && this.zzg == activityRecognitionResult.zzg && this.zzh == activityRecognitionResult.zzh && com.google.android.gms.common.internal.Objects.equal(this.zze, activityRecognitionResult.zze) && zza(this.extras, activityRecognitionResult.extras)) {
                return true;
            }
        }
        return false;
    }

    public int getActivityConfidence(int i) {
        for (com.google.android.gms.location.DetectedActivity detectedActivity : this.zze) {
            if (detectedActivity.getType() == i) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzg;
    }

    public com.google.android.gms.location.DetectedActivity getMostProbableActivity() {
        return this.zze.get(0);
    }

    public java.util.List<com.google.android.gms.location.DetectedActivity> getProbableActivities() {
        return this.zze;
    }

    public long getTime() {
        return this.zzf;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzf), java.lang.Long.valueOf(this.zzg), java.lang.Integer.valueOf(this.zzh), this.zze, this.extras);
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zze);
        long j = this.zzf;
        long j2 = this.zzg;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(strValueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 5, this.extras, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
