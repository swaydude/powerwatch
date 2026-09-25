package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzj implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.firebase.iid.zzj> CREATOR = new com.google.firebase.iid.zzi();
    private android.os.Messenger zza;
    private com.google.firebase.iid.zzx zzb;

    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
    public static final class zza extends java.lang.ClassLoader {
        @Override // java.lang.ClassLoader
        protected final java.lang.Class<?> loadClass(java.lang.String str, boolean z) throws java.lang.ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!com.google.firebase.iid.FirebaseInstanceId.zzd()) {
                return com.google.firebase.iid.zzj.class;
            }
            android.util.Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return com.google.firebase.iid.zzj.class;
        }
    }

    public zzj(android.os.IBinder iBinder) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.zza = new android.os.Messenger(iBinder);
        } else {
            this.zzb = new com.google.firebase.iid.zzw(iBinder);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void zza(android.os.Message message) throws android.os.RemoteException {
        android.os.Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.zzb.zza(message);
        }
    }

    private final android.os.IBinder zza() {
        android.os.Messenger messenger = this.zza;
        return messenger != null ? messenger.getBinder() : this.zzb.asBinder();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return zza().equals(((com.google.firebase.iid.zzj) obj).zza());
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return zza().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Messenger messenger = this.zza;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.zzb.asBinder());
        }
    }
}
