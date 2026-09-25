package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
final class zze implements java.util.concurrent.Callable<java.lang.Integer> {
    private final /* synthetic */ android.content.SharedPreferences zzo;
    private final /* synthetic */ java.lang.String zzp;
    private final /* synthetic */ java.lang.Integer zzr;

    zze(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Integer num) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzr = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Integer call() throws java.lang.Exception {
        return java.lang.Integer.valueOf(this.zzo.getInt(this.zzp, this.zzr.intValue()));
    }
}
