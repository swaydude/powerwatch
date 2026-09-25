package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzbs {
    private static final java.lang.Class<?> zzgl = zzak();

    private static java.lang.Class<?> zzak() {
        try {
            return java.lang.Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.clearcut.zzbt zzal() {
        java.lang.Class<?> cls = zzgl;
        if (cls != null) {
            try {
                return (com.google.android.gms.internal.clearcut.zzbt) cls.getDeclaredMethod("getEmptyRegistry", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            } catch (java.lang.Exception unused) {
            }
        }
        return com.google.android.gms.internal.clearcut.zzbt.zzgo;
    }
}
