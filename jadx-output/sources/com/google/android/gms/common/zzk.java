package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzk> CREATOR = new com.google.android.gms.common.zzl();
    private final boolean zzaa;
    private final boolean zzab;
    private final java.lang.String zzy;

    @javax.annotation.Nullable
    private final com.google.android.gms.common.zze zzz;

    zzk(java.lang.String str, @javax.annotation.Nullable android.os.IBinder iBinder, boolean z, boolean z2) {
        this.zzy = str;
        this.zzz = zza(iBinder);
        this.zzaa = z;
        this.zzab = z2;
    }

    zzk(java.lang.String str, @javax.annotation.Nullable com.google.android.gms.common.zze zzeVar, boolean z, boolean z2) {
        this.zzy = str;
        this.zzz = zzeVar;
        this.zzaa = z;
        this.zzab = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.IBinder iBinderAsBinder;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zzy, false);
        com.google.android.gms.common.zze zzeVar = this.zzz;
        if (zzeVar == null) {
            android.util.Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzeVar.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, iBinderAsBinder, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @javax.annotation.Nullable
    private static com.google.android.gms.common.zze zza(@javax.annotation.Nullable android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzb = com.google.android.gms.common.internal.zzj.zzb(iBinder).zzb();
            byte[] bArr = iObjectWrapperZzb == null ? null : (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzb);
            if (bArr != null) {
                return new com.google.android.gms.common.zzf(bArr);
            }
            android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (android.os.RemoteException e) {
            android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
