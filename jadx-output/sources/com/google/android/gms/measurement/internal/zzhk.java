package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhk {
    public static void zza(android.os.Bundle bundle, java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            bundle.putDouble("value", ((java.lang.Double) obj).doubleValue());
        } else if (obj instanceof java.lang.Long) {
            bundle.putLong("value", ((java.lang.Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static <T> T zza(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls, T t) {
        T t2 = (T) bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t2.getClass().getCanonicalName()));
    }
}
