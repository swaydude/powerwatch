package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.clearcut.zzb {
    private zze(android.content.Context context) {
        super(context, com.google.android.gms.clearcut.ClearcutLogger.API, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public static com.google.android.gms.clearcut.zzb zzb(android.content.Context context) {
        return new com.google.android.gms.internal.clearcut.zze(context);
    }

    @Override // com.google.android.gms.clearcut.zzb
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zzb(com.google.android.gms.clearcut.zze zzeVar) {
        return doBestEffortWrite(new com.google.android.gms.internal.clearcut.zzh(zzeVar, asGoogleApiClient()));
    }
}
