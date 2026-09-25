package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzax extends com.google.android.gms.internal.firebase_messaging.zze {
    private final /* synthetic */ com.google.firebase.iid.zzau zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(com.google.firebase.iid.zzau zzauVar, android.os.Looper looper) {
        super(looper);
        this.zza = zzauVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        this.zza.zza(message);
    }
}
