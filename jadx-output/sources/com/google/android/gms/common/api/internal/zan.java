package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zan extends com.google.android.gms.common.api.internal.zabp {
    private final /* synthetic */ android.app.Dialog zaec;
    private final /* synthetic */ com.google.android.gms.common.api.internal.zal zaed;

    zan(com.google.android.gms.common.api.internal.zal zalVar, android.app.Dialog dialog) {
        this.zaed = zalVar;
        this.zaec = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabp
    public final void zas() {
        this.zaed.zadl.zao();
        if (this.zaec.isShowing()) {
            this.zaec.dismiss();
        }
    }
}
