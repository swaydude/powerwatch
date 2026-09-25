package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractComponentContainer implements com.google.firebase.components.ComponentContainer {
    AbstractComponentContainer() {
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(java.lang.Class<T> cls) {
        com.google.firebase.inject.Provider<T> provider = getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> java.util.Set<T> setOf(java.lang.Class<T> cls) {
        return setOfProvider(cls).get();
    }
}
