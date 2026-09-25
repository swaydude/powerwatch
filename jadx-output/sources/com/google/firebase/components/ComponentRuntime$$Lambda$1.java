package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ComponentRuntime$$Lambda$1 implements com.google.firebase.inject.Provider {
    private final com.google.firebase.components.ComponentRuntime arg$1;
    private final com.google.firebase.components.Component arg$2;

    private ComponentRuntime$$Lambda$1(com.google.firebase.components.ComponentRuntime componentRuntime, com.google.firebase.components.Component component) {
        this.arg$1 = componentRuntime;
        this.arg$2 = component;
    }

    public static com.google.firebase.inject.Provider lambdaFactory$(com.google.firebase.components.ComponentRuntime componentRuntime, com.google.firebase.components.Component component) {
        return new com.google.firebase.components.ComponentRuntime$$Lambda$1(componentRuntime, component);
    }

    @Override // com.google.firebase.inject.Provider
    public java.lang.Object get() {
        return com.google.firebase.components.ComponentRuntime.lambda$new$0(this.arg$1, this.arg$2);
    }
}
