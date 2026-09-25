package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zab {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.signin.SignInOptions> API;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> CLIENT_KEY;
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, com.google.android.gms.signin.SignInOptions> zapv;
    private static final com.google.android.gms.common.api.Scope zar;
    private static final com.google.android.gms.common.api.Scope zas;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> zasj;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, java.lang.Object> zask;
    private static final com.google.android.gms.common.api.Api<java.lang.Object> zasl;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> clientKey2 = new com.google.android.gms.common.api.Api.ClientKey<>();
        zasj = clientKey2;
        com.google.android.gms.signin.zaa zaaVar = new com.google.android.gms.signin.zaa();
        zapv = zaaVar;
        com.google.android.gms.signin.zad zadVar = new com.google.android.gms.signin.zad();
        zask = zadVar;
        zar = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.PROFILE);
        zas = new com.google.android.gms.common.api.Scope("email");
        API = new com.google.android.gms.common.api.Api<>("SignIn.API", zaaVar, clientKey);
        zasl = new com.google.android.gms.common.api.Api<>("SignIn.INTERNAL_API", zadVar, clientKey2);
    }
}
