package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zac {
    private final int type;

    public zac(int i) {
        this.type = i;
    }

    public abstract void zaa(com.google.android.gms.common.api.Status status);

    public abstract void zaa(com.google.android.gms.common.api.internal.zaz zazVar, boolean z);

    public abstract void zaa(java.lang.RuntimeException runtimeException);

    public abstract void zac(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) throws android.os.DeadObjectException;

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.common.api.Status zaa(android.os.RemoteException remoteException) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwichMR1() && (remoteException instanceof android.os.TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new com.google.android.gms.common.api.Status(8, sb.toString());
    }
}
