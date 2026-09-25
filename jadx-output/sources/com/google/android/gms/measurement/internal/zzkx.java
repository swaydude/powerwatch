package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkx {
    final android.content.Context zza;

    public zzkx(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
    }
}
