package com.jakewharton.rxrelay2;

/* JADX INFO: loaded from: classes2.dex */
class AppendOnlyLinkedArrayList<T> {
    private final int capacity;
    private final java.lang.Object[] head;
    private int offset;
    private java.lang.Object[] tail;

    public interface NonThrowingPredicate<T> extends io.reactivex.functions.Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t);
    }

    AppendOnlyLinkedArrayList(int i) {
        this.capacity = i;
        java.lang.Object[] objArr = new java.lang.Object[i + 1];
        this.head = objArr;
        this.tail = objArr;
    }

    void add(T t) {
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

    void forEachWhile(com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList.NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i = this.capacity;
        for (java.lang.Object[] objArr = this.head; objArr != null; objArr = (java.lang.Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object obj = objArr[i2];
                if (obj == null || nonThrowingPredicate.test(obj)) {
                    break;
                }
            }
        }
    }

    boolean accept(com.jakewharton.rxrelay2.Relay<? super T> relay) {
        java.lang.Object[] objArr = this.head;
        int i = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object obj = objArr[i2];
                if (obj == null) {
                    break;
                }
                relay.accept(obj);
            }
            objArr = (java.lang.Object[]) objArr[i];
        }
    }
}
