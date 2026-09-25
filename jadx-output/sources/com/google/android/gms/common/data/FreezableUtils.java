package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class FreezableUtils {
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(java.util.ArrayList<E> arrayList) {
        kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            argumentList.add(arrayList.get(i).freeze());
        }
        return argumentList;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(E[] eArr) {
        kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = (java.util.ArrayList<T>) new java.util.ArrayList(eArr.length);
        for (E e : eArr) {
            argumentList.add(e.freeze());
        }
        return argumentList;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeIterable(java.lang.Iterable<E> iterable) {
        kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            argumentList.add(it.next().freeze());
        }
        return argumentList;
    }
}
