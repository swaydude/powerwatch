package com.google.android.gms.common.server;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class FavaDiagnosticsEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.FavaDiagnosticsEntity> CREATOR = new com.google.android.gms.common.server.zaa();
    private final int zali;
    private final java.lang.String zapx;
    private final int zapy;

    public FavaDiagnosticsEntity(int i, java.lang.String str, int i2) {
        this.zali = i;
        this.zapx = str;
        this.zapy = i2;
    }

    public FavaDiagnosticsEntity(java.lang.String str, int i) {
        this.zali = 1;
        this.zapx = str;
        this.zapy = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zapx, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zapy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
