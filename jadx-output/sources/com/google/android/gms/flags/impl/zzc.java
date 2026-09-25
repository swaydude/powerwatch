package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
final class zzc implements java.util.concurrent.Callable<java.lang.Boolean> {
    private final /* synthetic */ android.content.SharedPreferences zzo;
    private final /* synthetic */ java.lang.String zzp;
    private final /* synthetic */ java.lang.Boolean zzq;

    zzc(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Boolean bool) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzq = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
        return java.lang.Boolean.valueOf(this.zzo.getBoolean(this.zzp, this.zzq.booleanValue()));
    }
}
