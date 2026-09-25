package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class be extends com.google.android.play.core.internal.g implements com.google.android.play.core.internal.bc {
    be(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    @Override // com.google.android.play.core.internal.bc
    public final void a(java.lang.String str, int i, android.os.Bundle bundle, com.google.android.play.core.internal.bd bdVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeInt(i);
        com.google.android.play.core.internal.i.a(parcelA, bundle);
        com.google.android.play.core.internal.i.a(parcelA, bdVar);
        a(4, parcelA);
    }

    @Override // com.google.android.play.core.internal.bc
    public final void a(java.lang.String str, int i, com.google.android.play.core.internal.bd bdVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeInt(i);
        com.google.android.play.core.internal.i.a(parcelA, bdVar);
        a(5, parcelA);
    }

    @Override // com.google.android.play.core.internal.bc
    public final void a(java.lang.String str, com.google.android.play.core.internal.bd bdVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        com.google.android.play.core.internal.i.a(parcelA, bdVar);
        a(6, parcelA);
    }

    @Override // com.google.android.play.core.internal.bc
    public final void a(java.lang.String str, java.util.List<android.os.Bundle> list, android.os.Bundle bundle, com.google.android.play.core.internal.bd bdVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        com.google.android.play.core.internal.i.a(parcelA, bundle);
        com.google.android.play.core.internal.i.a(parcelA, bdVar);
        a(2, parcelA);
    }

    @Override // com.google.android.play.core.internal.bc
    public final void b(java.lang.String str, java.util.List<android.os.Bundle> list, android.os.Bundle bundle, com.google.android.play.core.internal.bd bdVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        com.google.android.play.core.internal.i.a(parcelA, bundle);
        com.google.android.play.core.internal.i.a(parcelA, bdVar);
        a(7, parcelA);
    }

    @Override // com.google.android.play.core.internal.bc
    public final void c(java.lang.String str, java.util.List<android.os.Bundle> list, android.os.Bundle bundle, com.google.android.play.core.internal.bd bdVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        com.google.android.play.core.internal.i.a(parcelA, bundle);
        com.google.android.play.core.internal.i.a(parcelA, bdVar);
        a(8, parcelA);
    }

    @Override // com.google.android.play.core.internal.bc
    public final void d(java.lang.String str, java.util.List<android.os.Bundle> list, android.os.Bundle bundle, com.google.android.play.core.internal.bd bdVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        com.google.android.play.core.internal.i.a(parcelA, bundle);
        com.google.android.play.core.internal.i.a(parcelA, bdVar);
        a(13, parcelA);
    }

    @Override // com.google.android.play.core.internal.bc
    public final void e(java.lang.String str, java.util.List<android.os.Bundle> list, android.os.Bundle bundle, com.google.android.play.core.internal.bd bdVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        com.google.android.play.core.internal.i.a(parcelA, bundle);
        com.google.android.play.core.internal.i.a(parcelA, bdVar);
        a(14, parcelA);
    }
}
