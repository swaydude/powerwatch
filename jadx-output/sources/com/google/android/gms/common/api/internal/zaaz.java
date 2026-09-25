package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaaz extends com.google.android.gms.internal.base.zar {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zagv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaaz(com.google.android.gms.common.api.internal.zaaw zaawVar, android.os.Looper looper) {
        super(looper);
        this.zagv = zaawVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            this.zagv.zaat();
            return;
        }
        if (i != 2) {
            int i2 = message.what;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            android.util.Log.w("GoogleApiClientImpl", sb.toString());
            return;
        }
        this.zagv.resume();
    }
}
