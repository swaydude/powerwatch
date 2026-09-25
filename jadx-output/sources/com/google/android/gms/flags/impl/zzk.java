package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
final class zzk implements java.util.concurrent.Callable<android.content.SharedPreferences> {
    private final /* synthetic */ android.content.Context val$context;

    zzk(android.content.Context context) {
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ android.content.SharedPreferences call() throws java.lang.Exception {
        return this.val$context.getSharedPreferences("google_sdk_flags", 0);
    }
}
