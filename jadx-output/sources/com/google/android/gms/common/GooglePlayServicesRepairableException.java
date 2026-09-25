package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends com.google.android.gms.common.UserRecoverableException {
    private final int zzag;

    public GooglePlayServicesRepairableException(int i, java.lang.String str, android.content.Intent intent) {
        super(str, intent);
        this.zzag = i;
    }

    public int getConnectionStatusCode() {
        return this.zzag;
    }
}
