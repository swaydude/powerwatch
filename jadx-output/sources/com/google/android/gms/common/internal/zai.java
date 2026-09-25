package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zai implements com.google.android.gms.common.internal.PendingResultUtil.zaa {
    zai() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.zaa
    public final com.google.android.gms.common.api.ApiException zaf(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status);
    }
}
