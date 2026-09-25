package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zaf extends com.google.android.gms.internal.base.zaa implements com.google.android.gms.signin.internal.zac {
    public zaf() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zaa
    protected boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 3) {
            zaa((com.google.android.gms.common.ConnectionResult) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.common.ConnectionResult.CREATOR), (com.google.android.gms.signin.internal.zab) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.signin.internal.zab.CREATOR));
        } else if (i == 4) {
            zag((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR));
        } else if (i == 6) {
            zah((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR));
        } else if (i == 7) {
            zaa((com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR));
        } else {
            if (i != 8) {
                return false;
            }
            zab((com.google.android.gms.signin.internal.zak) com.google.android.gms.internal.base.zad.zaa(parcel, com.google.android.gms.signin.internal.zak.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
