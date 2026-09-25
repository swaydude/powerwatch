package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class EventBus$$Lambda$1 implements java.lang.Runnable {
    private final java.util.Map.Entry arg$1;
    private final com.google.firebase.events.Event arg$2;

    private EventBus$$Lambda$1(java.util.Map.Entry entry, com.google.firebase.events.Event event) {
        this.arg$1 = entry;
        this.arg$2 = event;
    }

    public static java.lang.Runnable lambdaFactory$(java.util.Map.Entry entry, com.google.firebase.events.Event event) {
        return new com.google.firebase.components.EventBus$$Lambda$1(entry, event);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.google.firebase.events.EventHandler) this.arg$1.getKey()).handle(this.arg$2);
    }
}
