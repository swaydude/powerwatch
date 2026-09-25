package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Device extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Device> CREATOR = new com.google.android.gms.fitness.data.zzo();
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_HEAD_MOUNTED = 6;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;
    private final int type;
    private final java.lang.String zzkd;
    private final java.lang.String zzke;
    private final java.lang.String zzkf;
    private final int zzkg;

    public static com.google.android.gms.fitness.data.Device getLocalDevice(android.content.Context context) {
        int iZza = com.google.android.gms.internal.fitness.zzj.zza(context);
        return new com.google.android.gms.fitness.data.Device(android.os.Build.MANUFACTURER, android.os.Build.MODEL, android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"), iZza, 2);
    }

    public Device(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this(str, str2, str3, i, 0);
    }

    public Device(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2) {
        this.zzkd = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzke = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        if (str3 == null) {
            throw new java.lang.IllegalStateException("Device UID is null.");
        }
        this.zzkf = str3;
        this.type = i;
        this.zzkg = i2;
    }

    public final java.lang.String getManufacturer() {
        return this.zzkd;
    }

    public final java.lang.String getModel() {
        return this.zzke;
    }

    public final java.lang.String getUid() {
        return this.zzkf;
    }

    public final int getType() {
        return this.type;
    }

    final java.lang.String getStreamIdentifier() {
        return java.lang.String.format("%s:%s:%s", this.zzkd, this.zzke, this.zzkf);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("Device{%s:%s:%s}", getStreamIdentifier(), java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(this.zzkg));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Device)) {
            return false;
        }
        com.google.android.gms.fitness.data.Device device = (com.google.android.gms.fitness.data.Device) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzkd, device.zzkd) && com.google.android.gms.common.internal.Objects.equal(this.zzke, device.zzke) && com.google.android.gms.common.internal.Objects.equal(this.zzkf, device.zzkf) && this.type == device.type && this.zzkg == device.zzkg;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzkd, this.zzke, this.zzkf, java.lang.Integer.valueOf(this.type));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getManufacturer(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getModel(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getUid(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzkg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
