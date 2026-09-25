package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzak extends com.google.firebase.iid.zzan<java.lang.Void> {
    zzak(int i, int i2, android.os.Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // com.google.firebase.iid.zzan
    final boolean zza() {
        return true;
    }

    @Override // com.google.firebase.iid.zzan
    final void zza(android.os.Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zza((java.lang.Object) null);
        } else {
            zza(new com.google.firebase.iid.zzam(4, "Invalid response to one way request"));
        }
    }
}
