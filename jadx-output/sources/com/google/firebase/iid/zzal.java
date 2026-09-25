package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzal {
    private final android.os.Messenger zza;
    private final com.google.firebase.iid.zzj zzb;

    zzal(android.os.IBinder iBinder) throws android.os.RemoteException {
        java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.zza = new android.os.Messenger(iBinder);
            this.zzb = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.zzb = new com.google.firebase.iid.zzj(iBinder);
            this.zza = null;
        } else {
            java.lang.String strValueOf = java.lang.String.valueOf(interfaceDescriptor);
            android.util.Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new java.lang.String("Invalid interface descriptor: "));
            throw new android.os.RemoteException();
        }
    }

    final void zza(android.os.Message message) throws android.os.RemoteException {
        android.os.Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        com.google.firebase.iid.zzj zzjVar = this.zzb;
        if (zzjVar != null) {
            zzjVar.zza(message);
            return;
        }
        throw new java.lang.IllegalStateException("Both messengers are null");
    }
}
