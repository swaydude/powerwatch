package com.google.android.gms.common.wrappers;

/* JADX INFO: loaded from: classes.dex */
public class Wrappers {
    private static com.google.android.gms.common.wrappers.Wrappers zzhz = new com.google.android.gms.common.wrappers.Wrappers();
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zzhy = null;

    private final synchronized com.google.android.gms.common.wrappers.PackageManagerWrapper zzi(android.content.Context context) {
        if (this.zzhy == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzhy = new com.google.android.gms.common.wrappers.PackageManagerWrapper(context);
        }
        return this.zzhy;
    }

    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(android.content.Context context) {
        return zzhz.zzi(context);
    }
}
