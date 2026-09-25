package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaaq extends com.google.android.gms.common.api.internal.zaau {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaak zafz;
    private final java.util.ArrayList<com.google.android.gms.common.api.Api.Client> zags;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaaq(com.google.android.gms.common.api.internal.zaak zaakVar, java.util.ArrayList<com.google.android.gms.common.api.Api.Client> arrayList) {
        super(zaakVar, null);
        this.zafz = zaakVar;
        this.zags = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaau
    public final void zaal() {
        this.zafz.zafv.zaeh.zahe = this.zafz.zaar();
        java.util.ArrayList<com.google.android.gms.common.api.Api.Client> arrayList = this.zags;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            com.google.android.gms.common.api.Api.Client client = arrayList.get(i);
            i++;
            client.getRemoteService(this.zafz.zagj, this.zafz.zafv.zaeh.zahe);
        }
    }
}
