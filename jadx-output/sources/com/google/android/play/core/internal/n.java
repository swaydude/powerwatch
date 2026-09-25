package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends com.google.android.play.core.internal.j implements com.google.android.play.core.internal.l {
    public static com.google.android.play.core.internal.l a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.play.core.internal.l ? (com.google.android.play.core.internal.l) iInterfaceQueryLocalInterface : new com.google.android.play.core.internal.m(iBinder);
    }
}
