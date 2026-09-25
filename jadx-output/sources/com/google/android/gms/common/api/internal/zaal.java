package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaal extends com.google.android.gms.common.api.internal.zaau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaak zafz;
    private final java.util.Map<com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.api.internal.zaam> zagn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaal(com.google.android.gms.common.api.internal.zaak zaakVar, java.util.Map<com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.api.internal.zaam> map) {
        super(zaakVar, null);
        this.zafz = zaakVar;
        this.zagn = map;
    }

    @Override // com.google.android.gms.common.api.internal.zaau
    public final void zaal() {
        com.google.android.gms.common.internal.GoogleApiAvailabilityCache googleApiAvailabilityCache = new com.google.android.gms.common.internal.GoogleApiAvailabilityCache(this.zafz.zaey);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.google.android.gms.common.api.Api.Client client : this.zagn.keySet()) {
            if (client.requiresGooglePlayServices() && !this.zagn.get(client).zaee) {
                arrayList.add(client);
            } else {
                arrayList2.add(client);
            }
        }
        int clientAvailability = -1;
        int i = 0;
        if (arrayList.isEmpty()) {
            java.util.ArrayList arrayList3 = arrayList2;
            int size = arrayList3.size();
            while (i < size) {
                java.lang.Object obj = arrayList3.get(i);
                i++;
                clientAvailability = googleApiAvailabilityCache.getClientAvailability(this.zafz.mContext, (com.google.android.gms.common.api.Api.Client) obj);
                if (clientAvailability == 0) {
                    break;
                }
            }
        } else {
            java.util.ArrayList arrayList4 = arrayList;
            int size2 = arrayList4.size();
            while (i < size2) {
                java.lang.Object obj2 = arrayList4.get(i);
                i++;
                clientAvailability = googleApiAvailabilityCache.getClientAvailability(this.zafz.mContext, (com.google.android.gms.common.api.Api.Client) obj2);
                if (clientAvailability != 0) {
                    break;
                }
            }
        }
        if (clientAvailability != 0) {
            this.zafz.zafv.zaa(new com.google.android.gms.common.api.internal.zaao(this, this.zafz, new com.google.android.gms.common.ConnectionResult(clientAvailability, null)));
            return;
        }
        if (this.zafz.zagh && this.zafz.zagf != null) {
            this.zafz.zagf.connect();
        }
        for (com.google.android.gms.common.api.Api.Client client2 : this.zagn.keySet()) {
            com.google.android.gms.common.api.internal.zaam zaamVar = this.zagn.get(client2);
            if (!client2.requiresGooglePlayServices() || googleApiAvailabilityCache.getClientAvailability(this.zafz.mContext, client2) == 0) {
                client2.connect(zaamVar);
            } else {
                this.zafz.zafv.zaa(new com.google.android.gms.common.api.internal.zaan(this, this.zafz, zaamVar));
            }
        }
    }
}
