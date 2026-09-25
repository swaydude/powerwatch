package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ax<T> {
    private final java.lang.Object a;
    private final java.lang.reflect.Field b;
    private final java.lang.Class<T> c;

    ax(java.lang.Object obj, java.lang.reflect.Field field, java.lang.Class<T> cls) {
        this.a = obj;
        this.b = field;
        this.c = cls;
    }

    ax(java.lang.Object obj, java.lang.reflect.Field field, java.lang.Class<T> cls, byte b) {
        this(obj, field, a((java.lang.Class) cls));
    }

    private static <T> java.lang.Class<T[]> a(java.lang.Class<T> cls) {
        return (java.lang.Class<T[]>) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 0).getClass();
    }

    private java.lang.Class<T> b() {
        return (java.lang.Class<T>) this.b.getType().getComponentType();
    }

    public final T a() {
        try {
            return this.c.cast(this.b.get(this.a));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.internal.az(java.lang.String.format("Failed to get value of field %s of type %s on object of type %s", this.b.getName(), this.a.getClass().getName(), this.c.getName()), e);
        }
    }

    public final void a(T t) {
        try {
            this.b.set(this.a, t);
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.internal.az(java.lang.String.format("Failed to set value of field %s of type %s on object of type %s", this.b.getName(), this.a.getClass().getName(), this.c.getName()), e);
        }
    }

    public void a(java.util.Collection<T> collection) {
        java.lang.Object[] objArr = (java.lang.Object[]) a();
        int length = objArr == null ? 0 : objArr.length;
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) b(), collection.size() + length);
        if (objArr != null) {
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        a(objArr2);
    }

    public void a(T[] tArr) {
        a((java.util.Collection) java.util.Arrays.asList(tArr));
    }

    public void b(java.util.Collection<T> collection) {
        java.lang.Object[] objArr = (java.lang.Object[]) a();
        int i = 0;
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) b(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            java.lang.System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        a(objArr2);
    }

    public void b(T[] tArr) {
        b(java.util.Arrays.asList(tArr));
    }
}
