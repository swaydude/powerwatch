package com.google.android.gms.internal.phenotype;

/* JADX INFO: loaded from: classes.dex */
final class zzg extends android.database.ContentObserver {
    zzg(android.os.Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        com.google.android.gms.internal.phenotype.zzf.zzbh.set(true);
    }
}
