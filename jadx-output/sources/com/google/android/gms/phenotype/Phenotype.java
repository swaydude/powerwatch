package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
public final class Phenotype {

    @java.lang.Deprecated
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.phenotype.zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.phenotype.zze> CLIENT_KEY;

    @java.lang.Deprecated
    private static final com.google.android.gms.phenotype.zzm zzaj;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.phenotype.zzd, com.google.android.gms.phenotype.zzm] */
    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.phenotype.zze> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.phenotype.zzl zzlVar = new com.google.android.gms.phenotype.zzl();
        CLIENT_BUILDER = zzlVar;
        API = new com.google.android.gms.common.api.Api<>("Phenotype.API", zzlVar, clientKey);
        zzaj = new com.google.android.gms.internal.phenotype.zzd();
    }

    private Phenotype() {
    }

    public static android.net.Uri getContentProviderUri(java.lang.String str) {
        java.lang.String strValueOf = java.lang.String.valueOf(android.net.Uri.encode(str));
        return android.net.Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new java.lang.String("content://com.google.android.gms.phenotype/"));
    }
}
