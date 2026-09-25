package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends com.google.android.play.core.internal.g implements com.google.android.play.core.internal.l {
    m(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override // com.google.android.play.core.internal.l
    public final void a(java.lang.String str, android.os.Bundle bundle, com.google.android.play.core.internal.p pVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.internal.i.a(parcelA, bundle);
        com.google.android.play.core.internal.i.a(parcelA, pVar);
        a(2, parcelA);
    }

    @Override // com.google.android.play.core.internal.l
    public final void b(java.lang.String str, android.os.Bundle bundle, com.google.android.play.core.internal.p pVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.internal.i.a(parcelA, bundle);
        com.google.android.play.core.internal.i.a(parcelA, pVar);
        a(3, parcelA);
    }
}
