package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class Component$$Lambda$1 implements com.google.firebase.components.ComponentFactory {
    private final java.lang.Object arg$1;

    private Component$$Lambda$1(java.lang.Object obj) {
        this.arg$1 = obj;
    }

    public static com.google.firebase.components.ComponentFactory lambdaFactory$(java.lang.Object obj) {
        return new com.google.firebase.components.Component$$Lambda$1(obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        return com.google.firebase.components.Component.lambda$of$0(this.arg$1, componentContainer);
    }
}
