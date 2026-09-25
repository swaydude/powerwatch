package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzi {
    public static <T> int zza(T t, java.util.List<T> list) {
        if (t == null) {
            return -1;
        }
        int iIndexOf = list.indexOf(t);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        list.add(t);
        return list.size() - 1;
    }
}
