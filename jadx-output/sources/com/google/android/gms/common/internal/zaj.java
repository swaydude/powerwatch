package com.google.android.gms.common.internal;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaj<R, T> implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<R, T> {
    private final /* synthetic */ com.google.android.gms.common.api.Response zapg;

    zaj(com.google.android.gms.common.api.Response response) {
        this.zapg = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        this.zapg.setResult(result);
        return this.zapg;
    }
}
