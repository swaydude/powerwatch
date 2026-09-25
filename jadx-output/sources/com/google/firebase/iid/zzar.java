package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzar implements com.google.firebase.components.ComponentFactory {
    static final com.google.firebase.components.ComponentFactory zza = new com.google.firebase.iid.zzar();

    private zzar() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.iid.Registrar.zza((com.google.firebase.iid.FirebaseInstanceId) componentContainer.get(com.google.firebase.iid.FirebaseInstanceId.class));
    }
}
