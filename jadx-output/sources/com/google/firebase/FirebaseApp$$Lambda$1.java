package com.google.firebase;

/* JADX INFO: compiled from: com.google.firebase:firebase-common@@19.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class FirebaseApp$$Lambda$1 implements com.google.firebase.inject.Provider {
    private final com.google.firebase.FirebaseApp arg$1;
    private final android.content.Context arg$2;

    private FirebaseApp$$Lambda$1(com.google.firebase.FirebaseApp firebaseApp, android.content.Context context) {
        this.arg$1 = firebaseApp;
        this.arg$2 = context;
    }

    public static com.google.firebase.inject.Provider lambdaFactory$(com.google.firebase.FirebaseApp firebaseApp, android.content.Context context) {
        return new com.google.firebase.FirebaseApp$$Lambda$1(firebaseApp, context);
    }

    @Override // com.google.firebase.inject.Provider
    public java.lang.Object get() {
        return com.google.firebase.FirebaseApp.lambda$new$0(this.arg$1, this.arg$2);
    }
}
