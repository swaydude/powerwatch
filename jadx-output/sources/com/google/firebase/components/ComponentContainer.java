package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface ComponentContainer {
    <T> T get(java.lang.Class<T> cls);

    <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> cls);

    <T> java.util.Set<T> setOf(java.lang.Class<T> cls);

    <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(java.lang.Class<T> cls);
}
