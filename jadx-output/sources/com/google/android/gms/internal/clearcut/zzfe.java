package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzfe implements java.security.PrivilegedExceptionAction<sun.misc.Unsafe> {
    zzfe() {
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
