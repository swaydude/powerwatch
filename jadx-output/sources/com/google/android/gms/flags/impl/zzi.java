package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
final class zzi implements java.util.concurrent.Callable<java.lang.String> {
    private final /* synthetic */ android.content.SharedPreferences zzo;
    private final /* synthetic */ java.lang.String zzp;
    private final /* synthetic */ java.lang.String zzt;

    zzi(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzt = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.String call() throws java.lang.Exception {
        return this.zzo.getString(this.zzp, this.zzt);
    }
}
