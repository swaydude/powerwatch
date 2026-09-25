package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DataBufferUtils {
    public static final java.lang.String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    public static final java.lang.String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeAndClose(com.google.android.gms.common.data.DataBuffer<E> dataBuffer) {
        kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = (java.util.ArrayList<T>) new java.util.ArrayList(dataBuffer.getCount());
        try {
            java.util.Iterator<E> it = dataBuffer.iterator();
            while (it.hasNext()) {
                argumentList.add(it.next().freeze());
            }
            dataBuffer.close();
            return argumentList;
        } catch (java.lang.Throwable th) {
            dataBuffer.close();
            throw th;
        }
    }

    public static boolean hasNextPage(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        android.os.Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_NEXT_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasPrevPage(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        android.os.Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_PREV_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasData(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }
}
