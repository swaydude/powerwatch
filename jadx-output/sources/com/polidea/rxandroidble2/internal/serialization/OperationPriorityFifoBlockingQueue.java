package com.polidea.rxandroidble2.internal.serialization;

/* JADX INFO: loaded from: classes2.dex */
class OperationPriorityFifoBlockingQueue {
    private final java.util.concurrent.PriorityBlockingQueue<com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry> q = new java.util.concurrent.PriorityBlockingQueue<>();

    OperationPriorityFifoBlockingQueue() {
    }

    public void add(com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry fIFORunnableEntry) {
        this.q.add(fIFORunnableEntry);
    }

    public com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry<?> take() throws java.lang.InterruptedException {
        return this.q.take();
    }

    public com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry<?> takeNow() {
        return this.q.poll();
    }

    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    public boolean remove(com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry fIFORunnableEntry) {
        for (com.polidea.rxandroidble2.internal.serialization.FIFORunnableEntry fIFORunnableEntry2 : this.q) {
            if (fIFORunnableEntry2 == fIFORunnableEntry) {
                return this.q.remove(fIFORunnableEntry2);
            }
        }
        return false;
    }
}
