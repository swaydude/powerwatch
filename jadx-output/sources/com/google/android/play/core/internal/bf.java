package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bf extends com.google.android.play.core.internal.j implements com.google.android.play.core.internal.bd {
    public bf() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.internal.j
    protected final boolean a(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        switch (i) {
            case 2:
                c(parcel.readInt(), (android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
                return true;
            case 3:
                int i2 = parcel.readInt();
                a(i2);
                return true;
            case 4:
                a(parcel.readInt(), (android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
                return true;
            case 5:
                b(parcel.readInt(), (android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
                return true;
            case 6:
                e((android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
                return true;
            case 7:
                a(parcel.createTypedArrayList(android.os.Bundle.CREATOR));
                return true;
            case 8:
                d((android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
                return true;
            case 9:
                a((android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
                return true;
            case 10:
                b();
                return true;
            case 11:
                a();
                return true;
            case 12:
                c((android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
                return true;
            case 13:
                b((android.os.Bundle) com.google.android.play.core.internal.i.a(parcel, android.os.Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
