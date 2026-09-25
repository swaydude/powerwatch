package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdo extends com.google.android.gms.internal.fitness.zzbe {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.DataReadResult> zzmv;
    private int zznp;
    private com.google.android.gms.fitness.result.DataReadResult zznq;

    private zzdo(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.DataReadResult> resultHolder) {
        this.zznp = 0;
        this.zznq = null;
        this.zzmv = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzbf
    public final void zza(com.google.android.gms.fitness.result.DataReadResult dataReadResult) {
        synchronized (this) {
            if (android.util.Log.isLoggable("Fitness", 2)) {
                int i = this.zznp;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(33);
                sb.append("Received batch result ");
                sb.append(i);
                android.util.Log.v("Fitness", sb.toString());
            }
            com.google.android.gms.fitness.result.DataReadResult dataReadResult2 = this.zznq;
            if (dataReadResult2 == null) {
                this.zznq = dataReadResult;
            } else {
                dataReadResult2.zzb(dataReadResult);
            }
            int i2 = this.zznp + 1;
            this.zznp = i2;
            if (i2 == this.zznq.zzae()) {
                this.zzmv.setResult(this.zznq);
            }
        }
    }

    /* synthetic */ zzdo(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.internal.fitness.zzdg zzdgVar) {
        this(resultHolder);
    }
}
