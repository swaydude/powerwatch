package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
final class zzg implements java.util.concurrent.Callable<java.lang.Long> {
    private final /* synthetic */ android.content.SharedPreferences zzo;
    private final /* synthetic */ java.lang.String zzp;
    private final /* synthetic */ java.lang.Long zzs;

    zzg(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Long l) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzs = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Long call() throws java.lang.Exception {
        return java.lang.Long.valueOf(this.zzo.getLong(this.zzp, this.zzs.longValue()));
    }
}
