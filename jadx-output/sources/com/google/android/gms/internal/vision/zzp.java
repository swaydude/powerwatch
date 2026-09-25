package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.vision.zzp> CREATOR = new com.google.android.gms.internal.vision.zzo();
    public int height;
    public int id;
    public int rotation;
    public int width;
    public long zzar;

    public zzp() {
    }

    public zzp(int i, int i2, int i3, long j, int i4) {
        this.width = i;
        this.height = i2;
        this.id = i3;
        this.zzar = j;
        this.rotation = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.width);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.height);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.id);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzar);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.rotation);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static com.google.android.gms.internal.vision.zzp zzc(com.google.android.gms.vision.Frame frame) {
        com.google.android.gms.internal.vision.zzp zzpVar = new com.google.android.gms.internal.vision.zzp();
        zzpVar.width = frame.getMetadata().getWidth();
        zzpVar.height = frame.getMetadata().getHeight();
        zzpVar.rotation = frame.getMetadata().getRotation();
        zzpVar.id = frame.getMetadata().getId();
        zzpVar.zzar = frame.getMetadata().getTimestampMillis();
        return zzpVar;
    }
}
