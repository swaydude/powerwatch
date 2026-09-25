package com.google.firebase;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public java.lang.Exception getException(com.google.android.gms.common.api.Status status) {
        return status.getStatusCode() == 8 ? new com.google.firebase.FirebaseException(status.zzg()) : new com.google.firebase.FirebaseApiNotAvailableException(status.zzg());
    }
}
