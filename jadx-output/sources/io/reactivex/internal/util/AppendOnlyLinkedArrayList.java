package io.reactivex.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class AppendOnlyLinkedArrayList<T> {
    final int capacity;
    final java.lang.Object[] head;
    int offset;
    java.lang.Object[] tail;

    public interface NonThrowingPredicate<T> extends io.reactivex.functions.Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t);
    }

    public AppendOnlyLinkedArrayList(int i) {
        this.capacity = i;
        java.lang.Object[] objArr = new java.lang.Object[i + 1];
        this.head = objArr;
        this.tail = objArr;
    }

    public void add(T t) {
        int i = this.capacity;
        int i2 = this.offset;
        if (i2 == i) {
            java.lang.Object[] objArr = new java.lang.Object[i + 1];
            this.tail[i] = objArr;
            this.tail = objArr;
            i2 = 0;
        }
        this.tail[i2] = t;
        this.offset = i2 + 1;
    }

    public void setFirst(T t) {
        this.head[0] = t;
    }

    public void forEachWhile(io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i = this.capacity;
        for (java.lang.Object[] objArr = this.head; objArr != null; objArr = (java.lang.Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else {
                    if (nonThrowingPredicate.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public <U> boolean accept(org.reactivestreams.Subscriber<? super U> subscriber) {
        java.lang.Object[] objArr = this.head;
        int i = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                if (io.reactivex.internal.util.NotificationLite.acceptFull(objArr2, subscriber)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    public <U> boolean accept(io.reactivex.Observer<? super U> observer) {
        java.lang.Object[] objArr = this.head;
        int i = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                if (io.reactivex.internal.util.NotificationLite.acceptFull(objArr2, observer)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    public <S> void forEachWhile(S s, io.reactivex.functions.BiPredicate<? super S, ? super T> biPredicate) throws java.lang.Exception {
        java.lang.Object[] objArr = this.head;
        int i = this.capacity;
        while (true) {
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object obj = objArr[i2];
                if (obj == null || biPredicate.test(s, obj)) {
                    return;
                }
            }
            objArr = (java.lang.Object[]) objArr[i];
        }
    }
}
