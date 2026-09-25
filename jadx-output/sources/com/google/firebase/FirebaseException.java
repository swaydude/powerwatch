package com.google.firebase;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseException extends java.lang.Exception {
    @java.lang.Deprecated
    protected FirebaseException() {
    }

    public FirebaseException(java.lang.String str) {
        super(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Detail message must not be empty"));
    }

    public FirebaseException(java.lang.String str, java.lang.Throwable th) {
        super(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Detail message must not be empty"), th);
    }
}
