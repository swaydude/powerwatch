package com.google.android.gms.internal.firebase_messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzq extends com.google.android.gms.internal.firebase_messaging.zzp {
    private final com.google.android.gms.internal.firebase_messaging.zzo zza = new com.google.android.gms.internal.firebase_messaging.zzo();

    zzq() {
    }

    @Override // com.google.android.gms.internal.firebase_messaging.zzp
    public final void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th2 == th) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        java.util.Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.zza.zza(th, true).add(th2);
    }
}
