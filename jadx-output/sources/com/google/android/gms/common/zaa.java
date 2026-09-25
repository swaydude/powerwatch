package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaa implements com.google.android.gms.tasks.Continuation<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>, java.lang.Void> {
    zaa(com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Void then(com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> task) throws java.lang.Exception {
        task.getResult();
        return null;
    }
}
