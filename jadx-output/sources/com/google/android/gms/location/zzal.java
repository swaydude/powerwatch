package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzal> CREATOR = new com.google.android.gms.location.zzam();
    private final java.lang.String tag;
    private final java.util.List<java.lang.String> zzbu;
    private final android.app.PendingIntent zzbv;

    zzal(java.util.List<java.lang.String> list, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.zzbu = list == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list);
        this.zzbv = pendingIntent;
        this.tag = str;
    }

    public static com.google.android.gms.location.zzal zza(android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent can not be null.");
        return new com.google.android.gms.location.zzal(null, pendingIntent, "");
    }

    public static com.google.android.gms.location.zzal zza(java.util.List<java.lang.String> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "geofence can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!list.isEmpty(), "Geofences must contains at least one id.");
        return new com.google.android.gms.location.zzal(list, null, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 1, this.zzbu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzbv, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.tag, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
