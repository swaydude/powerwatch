package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaan extends com.google.android.gms.common.api.internal.zabd {
    private final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zagp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaan(com.google.android.gms.common.api.internal.zaal zaalVar, com.google.android.gms.common.api.internal.zabb zabbVar, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabbVar);
        this.zagp = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zaal() {
        this.zagp.onReportServiceBinding(new com.google.android.gms.common.ConnectionResult(16, null));
    }
}
