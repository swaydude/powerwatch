package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bb extends com.google.android.play.core.internal.j implements com.google.android.play.core.internal.bc {
    public static com.google.android.play.core.internal.bc a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.play.core.internal.bc ? (com.google.android.play.core.internal.bc) iInterfaceQueryLocalInterface : new com.google.android.play.core.internal.be(iBinder);
    }
}
