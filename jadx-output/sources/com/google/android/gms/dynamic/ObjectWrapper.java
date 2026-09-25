package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectWrapper<T> extends com.google.android.gms.dynamic.IObjectWrapper.Stub {
    private final T zzib;

    private ObjectWrapper(T t) {
        this.zzib = t;
    }

    public static <T> com.google.android.gms.dynamic.IObjectWrapper wrap(T t) {
        return new com.google.android.gms.dynamic.ObjectWrapper(t);
    }

    public static <T> T unwrap(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof com.google.android.gms.dynamic.ObjectWrapper) {
            return ((com.google.android.gms.dynamic.ObjectWrapper) iObjectWrapper).zzib;
        }
        android.os.IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        java.lang.reflect.Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int i = 0;
        for (java.lang.reflect.Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(iBinderAsBinder);
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new java.lang.IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
