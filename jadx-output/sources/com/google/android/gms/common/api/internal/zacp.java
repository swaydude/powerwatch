package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zacp {
    public static final com.google.android.gms.common.api.Status zalb = new com.google.android.gms.common.api.Status(8, "The connection to Google Play services was lost");
    private static final com.google.android.gms.common.api.internal.BasePendingResult<?>[] zalc = new com.google.android.gms.common.api.internal.BasePendingResult[0];
    private final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> zahd;
    final java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> zald = java.util.Collections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
    private final com.google.android.gms.common.api.internal.zacq zale = new com.google.android.gms.common.api.internal.zaco(this);

    public zacp(java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> map) {
        this.zahd = map;
    }

    final void zac(com.google.android.gms.common.api.internal.BasePendingResult<? extends com.google.android.gms.common.api.Result> basePendingResult) {
        this.zald.add(basePendingResult);
        basePendingResult.zaa(this.zale);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void release() {
        for (com.google.android.gms.common.api.internal.BasePendingResult basePendingResult : (com.google.android.gms.common.api.internal.BasePendingResult[]) this.zald.toArray(zalc)) {
            com.google.android.gms.common.api.zac zacVar = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            java.lang.Object[] objArr4 = 0;
            com.google.android.gms.common.api.zac zacVar2 = null;
            basePendingResult.zaa((com.google.android.gms.common.api.internal.zacq) null);
            if (basePendingResult.zal() == null) {
                if (basePendingResult.zaq()) {
                    this.zald.remove(basePendingResult);
                }
            } else {
                basePendingResult.setResultCallback(null);
                android.os.IBinder serviceBrokerBinder = this.zahd.get(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) basePendingResult).getClientKey()).getServiceBrokerBinder();
                if (basePendingResult.isReady()) {
                    basePendingResult.zaa(new com.google.android.gms.common.api.internal.zacr(basePendingResult, objArr4 == true ? 1 : 0, serviceBrokerBinder, objArr3 == true ? 1 : 0));
                } else if (serviceBrokerBinder != null && serviceBrokerBinder.isBinderAlive()) {
                    com.google.android.gms.common.api.internal.zacr zacrVar = new com.google.android.gms.common.api.internal.zacr(basePendingResult, objArr2 == true ? 1 : 0, serviceBrokerBinder, objArr == true ? 1 : 0);
                    basePendingResult.zaa(zacrVar);
                    try {
                        serviceBrokerBinder.linkToDeath(zacrVar, 0);
                    } catch (android.os.RemoteException unused) {
                        basePendingResult.cancel();
                        zacVar2.remove(basePendingResult.zal().intValue());
                    }
                } else {
                    basePendingResult.zaa((com.google.android.gms.common.api.internal.zacq) null);
                    basePendingResult.cancel();
                    zacVar.remove(basePendingResult.zal().intValue());
                }
                this.zald.remove(basePendingResult);
            }
        }
    }

    public final void zabv() {
        for (com.google.android.gms.common.api.internal.BasePendingResult basePendingResult : (com.google.android.gms.common.api.internal.BasePendingResult[]) this.zald.toArray(zalc)) {
            basePendingResult.zab(zalb);
        }
    }
}
