package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface zac extends android.os.IInterface {
    void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.signin.internal.zab zabVar) throws android.os.RemoteException;

    void zaa(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) throws android.os.RemoteException;

    void zab(com.google.android.gms.signin.internal.zak zakVar) throws android.os.RemoteException;

    void zag(com.google.android.gms.common.api.Status status) throws android.os.RemoteException;

    void zah(com.google.android.gms.common.api.Status status) throws android.os.RemoteException;
}
