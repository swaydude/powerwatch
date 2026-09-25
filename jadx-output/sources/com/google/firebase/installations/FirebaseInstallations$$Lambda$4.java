package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class FirebaseInstallations$$Lambda$4 implements java.util.concurrent.Callable {
    private final com.google.firebase.installations.FirebaseInstallations arg$1;

    private FirebaseInstallations$$Lambda$4(com.google.firebase.installations.FirebaseInstallations firebaseInstallations) {
        this.arg$1 = firebaseInstallations;
    }

    public static java.util.concurrent.Callable lambdaFactory$(com.google.firebase.installations.FirebaseInstallations firebaseInstallations) {
        return new com.google.firebase.installations.FirebaseInstallations$$Lambda$4(firebaseInstallations);
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return this.arg$1.deleteFirebaseInstallationId();
    }
}
