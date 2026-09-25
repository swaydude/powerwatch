package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zacl implements com.google.android.gms.tasks.Continuation<java.lang.Boolean, java.lang.Void> {
    zacl() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Void then(com.google.android.gms.tasks.Task<java.lang.Boolean> task) throws java.lang.Exception {
        if (task.getResult().booleanValue()) {
            return null;
        }
        throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(13, "listener already unregistered"));
    }
}
