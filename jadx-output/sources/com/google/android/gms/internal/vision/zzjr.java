package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjr implements java.security.PrivilegedExceptionAction<sun.misc.Unsafe> {
    zzjr() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ sun.misc.Unsafe run() throws java.lang.Exception {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
