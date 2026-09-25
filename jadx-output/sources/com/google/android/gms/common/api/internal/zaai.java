package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaai extends com.google.android.gms.common.api.internal.zabd {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaaf zafy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaai(com.google.android.gms.common.api.internal.zaaf zaafVar, com.google.android.gms.common.api.internal.zabb zabbVar) {
        super(zabbVar);
        this.zafy = zaafVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zaal() {
        this.zafy.onConnectionSuspended(1);
    }
}
