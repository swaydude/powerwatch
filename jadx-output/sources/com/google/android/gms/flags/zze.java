package com.google.android.gms.flags;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends com.google.android.gms.internal.flags.zza implements com.google.android.gms.flags.zzc {
    zze(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // com.google.android.gms.flags.zzc
    public final void init(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.flags.zzc.zza(parcelZza, iObjectWrapper);
        zzb(1, parcelZza);
    }

    @Override // com.google.android.gms.flags.zzc
    public final boolean getBooleanFlagValue(java.lang.String str, boolean z, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.flags.zzc.writeBoolean(parcelZza, z);
        parcelZza.writeInt(i);
        android.os.Parcel parcelZza2 = zza(2, parcelZza);
        boolean zZza = com.google.android.gms.internal.flags.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.flags.zzc
    public final int getIntFlagValue(java.lang.String str, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        android.os.Parcel parcelZza2 = zza(3, parcelZza);
        int i3 = parcelZza2.readInt();
        parcelZza2.recycle();
        return i3;
    }

    @Override // com.google.android.gms.flags.zzc
    public final long getLongFlagValue(java.lang.String str, long j, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        parcelZza.writeInt(i);
        android.os.Parcel parcelZza2 = zza(4, parcelZza);
        long j2 = parcelZza2.readLong();
        parcelZza2.recycle();
        return j2;
    }

    @Override // com.google.android.gms.flags.zzc
    public final java.lang.String getStringFlagValue(java.lang.String str, java.lang.String str2, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i);
        android.os.Parcel parcelZza2 = zza(5, parcelZza);
        java.lang.String string = parcelZza2.readString();
        parcelZza2.recycle();
        return string;
    }
}
