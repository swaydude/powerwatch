package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface ISignInButtonCreator extends android.os.IInterface {
    com.google.android.gms.dynamic.IObjectWrapper newSignInButton(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i, int i2) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper newSignInButtonFromConfig(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.common.internal.SignInButtonConfig signInButtonConfig) throws android.os.RemoteException;
}
