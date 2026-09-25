package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zabv {
    public final com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> zakc;
    public final com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> zakd;

    public zabv(com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> unregisterListenerMethod) {
        this.zakc = registerListenerMethod;
        this.zakd = unregisterListenerMethod;
    }
}
