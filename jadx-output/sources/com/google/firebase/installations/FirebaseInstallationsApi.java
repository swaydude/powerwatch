package com.google.firebase.installations;

/* JADX INFO: compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface FirebaseInstallationsApi {
    com.google.android.gms.tasks.Task<java.lang.Void> delete();

    com.google.android.gms.tasks.Task<java.lang.String> getId();

    com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> getToken(boolean z);
}
