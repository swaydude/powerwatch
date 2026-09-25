package com.jakewharton.rxrelay2;

/* JADX INFO: loaded from: classes2.dex */
final class SerializedRelay<T> extends com.jakewharton.rxrelay2.Relay<T> {
    private final com.jakewharton.rxrelay2.Relay<T> actual;
    private boolean emitting;
    private com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList<T> queue;

    SerializedRelay(com.jakewharton.rxrelay2.Relay<T> relay) {
        this.actual = relay;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.actual.subscribe(observer);
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(T t) {
        synchronized (this) {
            if (this.emitting) {
                com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList<T> appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList<>(4);
                    this.queue = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(t);
                return;
            }
            this.emitting = true;
            this.actual.accept(t);
            emitLoop();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void emitLoop() {
        com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList<T> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    this.emitting = false;
                    return;
                }
                this.queue = null;
            }
            appendOnlyLinkedArrayList.accept((com.jakewharton.rxrelay2.Relay<? super T>) this.actual);
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        return this.actual.hasObservers();
    }
}
