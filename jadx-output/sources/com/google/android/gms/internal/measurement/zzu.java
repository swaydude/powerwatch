package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu extends com.google.android.gms.internal.measurement.zza implements com.google.android.gms.internal.measurement.zzs {
    zzu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzs
    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        parcelA_.writeLong(j);
        zzb(1, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzs
    public final int zza() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, a_());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }
}
