package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaaa implements com.google.android.gms.tasks.OnCompleteListener<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zav zafl;
    private com.google.android.gms.common.api.internal.SignInConnectionListener zafo;

    zaaa(com.google.android.gms.common.api.internal.zav zavVar, com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        this.zafl = zavVar;
        this.zafo = signInConnectionListener;
    }

    final void cancel() {
        this.zafo.onComplete();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> task) {
        this.zafl.zaer.lock();
        try {
            if (!this.zafl.zafe) {
                this.zafo.onComplete();
                this.zafl.zaer.unlock();
                return;
            }
            if (task.isSuccessful()) {
                com.google.android.gms.common.api.internal.zav zavVar = this.zafl;
                zavVar.zafg = new androidx.collection.ArrayMap(zavVar.zaev.size());
                java.util.Iterator it = this.zafl.zaev.values().iterator();
                while (it.hasNext()) {
                    this.zafl.zafg.put(((com.google.android.gms.common.api.internal.zaw) it.next()).getApiKey(), com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
                }
            } else if (task.getException() instanceof com.google.android.gms.common.api.AvailabilityException) {
                com.google.android.gms.common.api.AvailabilityException availabilityException = (com.google.android.gms.common.api.AvailabilityException) task.getException();
                if (this.zafl.zafc) {
                    com.google.android.gms.common.api.internal.zav zavVar2 = this.zafl;
                    zavVar2.zafg = new androidx.collection.ArrayMap(zavVar2.zaev.size());
                    for (com.google.android.gms.common.api.internal.zaw zawVar : this.zafl.zaev.values()) {
                        java.lang.Object apiKey = zawVar.getApiKey();
                        com.google.android.gms.common.ConnectionResult connectionResult = availabilityException.getConnectionResult((com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions>) zawVar);
                        if (this.zafl.zaa((com.google.android.gms.common.api.internal.zaw<?>) zawVar, connectionResult)) {
                            this.zafl.zafg.put(apiKey, new com.google.android.gms.common.ConnectionResult(16));
                        } else {
                            this.zafl.zafg.put(apiKey, connectionResult);
                        }
                    }
                } else {
                    this.zafl.zafg = availabilityException.zaj();
                }
            } else {
                android.util.Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                this.zafl.zafg = java.util.Collections.emptyMap();
            }
            if (this.zafl.isConnected()) {
                this.zafl.zaff.putAll(this.zafl.zafg);
                if (this.zafl.zaac() == null) {
                    this.zafl.zaaa();
                    this.zafl.zaab();
                    this.zafl.zaez.signalAll();
                }
            }
            this.zafo.onComplete();
            this.zafl.zaer.unlock();
        } catch (java.lang.Throwable th) {
            this.zafl.zaer.unlock();
            throw th;
        }
    }
}
