package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzap extends com.google.firebase.iid.zzan<android.os.Bundle> {
    zzap(int i, int i2, android.os.Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.zzan
    final boolean zza() {
        return false;
    }

    @Override // com.google.firebase.iid.zzan
    final void zza(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        zza(bundle2);
    }
}
