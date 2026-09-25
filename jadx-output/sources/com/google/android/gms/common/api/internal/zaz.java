package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaz {
    private final java.util.Map<com.google.android.gms.common.api.internal.BasePendingResult<?>, java.lang.Boolean> zafm = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
    private final java.util.Map<com.google.android.gms.tasks.TaskCompletionSource<?>, java.lang.Boolean> zafn = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    final void zaa(com.google.android.gms.common.api.internal.BasePendingResult<? extends com.google.android.gms.common.api.Result> basePendingResult, boolean z) {
        this.zafm.put(basePendingResult, java.lang.Boolean.valueOf(z));
        basePendingResult.addStatusListener(new com.google.android.gms.common.api.internal.zaac(this, basePendingResult));
    }

    final <TResult> void zaa(com.google.android.gms.tasks.TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.zafn.put(taskCompletionSource, java.lang.Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.common.api.internal.zaab(this, taskCompletionSource));
    }

    final boolean zaae() {
        return (this.zafm.isEmpty() && this.zafn.isEmpty()) ? false : true;
    }

    public final void zaaf() {
        zaa(false, com.google.android.gms.common.api.internal.GoogleApiManager.zaib);
    }

    public final void zaag() {
        zaa(true, com.google.android.gms.common.api.internal.zacp.zalb);
    }

    private final void zaa(boolean z, com.google.android.gms.common.api.Status status) {
        java.util.HashMap map;
        java.util.HashMap map2;
        synchronized (this.zafm) {
            map = new java.util.HashMap(this.zafm);
        }
        synchronized (this.zafn) {
            map2 = new java.util.HashMap(this.zafn);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (z || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) entry.getKey()).zab(status);
            }
        }
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            if (z || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((com.google.android.gms.tasks.TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.ApiException(status));
            }
        }
    }
}
