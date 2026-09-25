package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class FirebaseInstallations$$Lambda$5 implements java.lang.Runnable {
    private final com.google.firebase.installations.FirebaseInstallations arg$1;
    private final boolean arg$2;

    private FirebaseInstallations$$Lambda$5(com.google.firebase.installations.FirebaseInstallations firebaseInstallations, boolean z) {
        this.arg$1 = firebaseInstallations;
        this.arg$2 = z;
    }

    public static java.lang.Runnable lambdaFactory$(com.google.firebase.installations.FirebaseInstallations firebaseInstallations, boolean z) {
        return new com.google.firebase.installations.FirebaseInstallations$$Lambda$5(firebaseInstallations, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.arg$1.doNetworkCall(this.arg$2);
    }
}
