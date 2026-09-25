package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zabg extends com.google.android.gms.internal.base.zar {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zabe zahz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabg(com.google.android.gms.common.api.internal.zabe zabeVar, android.os.Looper looper) {
        super(looper);
        this.zahz = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            ((com.google.android.gms.common.api.internal.zabd) message.obj).zaa(this.zahz);
            return;
        }
        if (i == 2) {
            throw ((java.lang.RuntimeException) message.obj);
        }
        int i2 = message.what;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
        sb.append("Unknown message id: ");
        sb.append(i2);
        android.util.Log.w("GACStateManager", sb.toString());
    }
}
