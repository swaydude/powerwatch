package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public interface LifecycleFragment {
    void addCallback(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback);

    <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String str, java.lang.Class<T> cls);

    android.app.Activity getLifecycleActivity();

    boolean isCreated();

    boolean isStarted();

    void startActivityForResult(android.content.Intent intent, int i);
}
