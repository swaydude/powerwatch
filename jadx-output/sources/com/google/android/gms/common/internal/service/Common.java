package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Common {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.common.internal.service.zah> CLIENT_KEY;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.common.internal.service.zah, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zapv;
    public static final com.google.android.gms.common.internal.service.zab zapw;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.common.internal.service.zah> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.common.internal.service.zac zacVar = new com.google.android.gms.common.internal.service.zac();
        zapv = zacVar;
        API = new com.google.android.gms.common.api.Api<>("Common.API", zacVar, clientKey);
        zapw = new com.google.android.gms.common.internal.service.zae();
    }
}
