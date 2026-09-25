package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbv extends android.database.ContentObserver {
    zzbv(android.os.Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        com.google.android.gms.internal.measurement.zzbw.zze.set(true);
    }
}
