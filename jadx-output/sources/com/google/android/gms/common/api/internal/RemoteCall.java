package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface RemoteCall<T, U> {
    void accept(T t, U u) throws android.os.RemoteException;
}
