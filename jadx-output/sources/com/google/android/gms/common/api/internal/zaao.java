package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaao extends com.google.android.gms.common.api.internal.zabd {
    private final /* synthetic */ com.google.android.gms.common.ConnectionResult zagq;
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaal zagr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaao(com.google.android.gms.common.api.internal.zaal zaalVar, com.google.android.gms.common.api.internal.zabb zabbVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        super(zabbVar);
        this.zagr = zaalVar;
        this.zagq = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zaal() {
        this.zagr.zafz.zae(this.zagq);
    }
}
