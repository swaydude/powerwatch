package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zax implements com.google.android.gms.tasks.OnCompleteListener<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zav zafl;

    private zax(com.google.android.gms.common.api.internal.zav zavVar) {
        this.zafl = zavVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> task) {
        this.zafl.zaer.lock();
        try {
            if (this.zafl.zafe) {
                if (task.isSuccessful()) {
                    com.google.android.gms.common.api.internal.zav zavVar = this.zafl;
                    zavVar.zaff = new androidx.collection.ArrayMap(zavVar.zaeu.size());
                    java.util.Iterator it = this.zafl.zaeu.values().iterator();
                    while (it.hasNext()) {
                        this.zafl.zaff.put(((com.google.android.gms.common.api.internal.zaw) it.next()).getApiKey(), com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.getException() instanceof com.google.android.gms.common.api.AvailabilityException) {
                    com.google.android.gms.common.api.AvailabilityException availabilityException = (com.google.android.gms.common.api.AvailabilityException) task.getException();
                    if (this.zafl.zafc) {
                        com.google.android.gms.common.api.internal.zav zavVar2 = this.zafl;
                        zavVar2.zaff = new androidx.collection.ArrayMap(zavVar2.zaeu.size());
                        for (com.google.android.gms.common.api.internal.zaw zawVar : this.zafl.zaeu.values()) {
                            java.lang.Object apiKey = zawVar.getApiKey();
                            com.google.android.gms.common.ConnectionResult connectionResult = availabilityException.getConnectionResult((com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions>) zawVar);
                            if (this.zafl.zaa((com.google.android.gms.common.api.internal.zaw<?>) zawVar, connectionResult)) {
                                this.zafl.zaff.put(apiKey, new com.google.android.gms.common.ConnectionResult(16));
                            } else {
                                this.zafl.zaff.put(apiKey, connectionResult);
                            }
                        }
                    } else {
                        this.zafl.zaff = availabilityException.zaj();
                    }
                    com.google.android.gms.common.api.internal.zav zavVar3 = this.zafl;
                    zavVar3.zafi = zavVar3.zaac();
                } else {
                    android.util.Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                    this.zafl.zaff = java.util.Collections.emptyMap();
                    this.zafl.zafi = new com.google.android.gms.common.ConnectionResult(8);
                }
                if (this.zafl.zafg != null) {
                    this.zafl.zaff.putAll(this.zafl.zafg);
                    com.google.android.gms.common.api.internal.zav zavVar4 = this.zafl;
                    zavVar4.zafi = zavVar4.zaac();
                }
                if (this.zafl.zafi == null) {
                    this.zafl.zaaa();
                    this.zafl.zaab();
                } else {
                    com.google.android.gms.common.api.internal.zav.zaa(this.zafl, false);
                    this.zafl.zaex.zac(this.zafl.zafi);
                }
                this.zafl.zaez.signalAll();
            }
        } finally {
            this.zafl.zaer.unlock();
        }
    }
}
