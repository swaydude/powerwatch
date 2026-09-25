package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ComponentRuntime$$Lambda$4 implements com.google.firebase.inject.Provider {
    private final java.util.Set arg$1;

    private ComponentRuntime$$Lambda$4(java.util.Set set) {
        this.arg$1 = set;
    }

    public static com.google.firebase.inject.Provider lambdaFactory$(java.util.Set set) {
        return new com.google.firebase.components.ComponentRuntime$$Lambda$4(set);
    }

    @Override // com.google.firebase.inject.Provider
    public java.lang.Object get() {
        return com.google.firebase.components.ComponentRuntime.lambda$processSetComponents$1(this.arg$1);
    }
}
