package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class FirebaseInstallations$$Lambda$2 implements java.lang.Runnable {
    private final com.google.firebase.installations.FirebaseInstallations arg$1;

    private FirebaseInstallations$$Lambda$2(com.google.firebase.installations.FirebaseInstallations firebaseInstallations) {
        this.arg$1 = firebaseInstallations;
    }

    public static java.lang.Runnable lambdaFactory$(com.google.firebase.installations.FirebaseInstallations firebaseInstallations) {
        return new com.google.firebase.installations.FirebaseInstallations$$Lambda$2(firebaseInstallations);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.arg$1.doGetAuthTokenForceRefresh();
    }
}
