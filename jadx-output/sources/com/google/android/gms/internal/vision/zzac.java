package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzac extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.vision.zzac> CREATOR = new com.google.android.gms.internal.vision.zzab();
    private final float zzdo;
    public final java.lang.String zzec;
    public final com.google.android.gms.internal.vision.zzaj[] zzeh;
    public final com.google.android.gms.internal.vision.zzw zzei;
    private final com.google.android.gms.internal.vision.zzw zzej;
    private final com.google.android.gms.internal.vision.zzw zzek;
    public final java.lang.String zzel;
    private final int zzem;
    public final boolean zzen;
    public final int zzeo;
    public final int zzep;

    public zzac(com.google.android.gms.internal.vision.zzaj[] zzajVarArr, com.google.android.gms.internal.vision.zzw zzwVar, com.google.android.gms.internal.vision.zzw zzwVar2, com.google.android.gms.internal.vision.zzw zzwVar3, java.lang.String str, float f, java.lang.String str2, int i, boolean z, int i2, int i3) {
        this.zzeh = zzajVarArr;
        this.zzei = zzwVar;
        this.zzej = zzwVar2;
        this.zzek = zzwVar3;
        this.zzel = str;
        this.zzdo = f;
        this.zzec = str2;
        this.zzem = i;
        this.zzen = z;
        this.zzeo = i2;
        this.zzep = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zzeh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzei, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzej, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzek, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzel, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, this.zzdo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzec, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzem);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzen);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzeo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 12, this.zzep);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
