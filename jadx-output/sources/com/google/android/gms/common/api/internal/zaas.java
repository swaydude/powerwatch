package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaas extends com.google.android.gms.common.api.internal.zabd {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaak zagt;
    private final /* synthetic */ com.google.android.gms.signin.internal.zak zagu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaas(com.google.android.gms.common.api.internal.zaap zaapVar, com.google.android.gms.common.api.internal.zabb zabbVar, com.google.android.gms.common.api.internal.zaak zaakVar, com.google.android.gms.signin.internal.zak zakVar) {
        super(zabbVar);
        this.zagt = zaakVar;
        this.zagu = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void zaal() {
        this.zagt.zaa(this.zagu);
    }
}
