package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o extends com.google.android.play.core.internal.j implements com.google.android.play.core.internal.p {
    public o() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.internal.j
    protected final boolean a(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        if (i == 2) {
            a((android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
            return true;
        }
        if (i != 3) {
            return false;
        }
        b((android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
        return true;
    }
}
