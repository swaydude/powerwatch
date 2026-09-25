package com.polidea.rxandroidble2.internal.serialization;

/* JADX INFO: loaded from: classes2.dex */
class QueueSemaphore implements com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface, com.polidea.rxandroidble2.internal.serialization.QueueAwaitReleaseInterface {
    private final java.util.concurrent.atomic.AtomicBoolean isReleased = new java.util.concurrent.atomic.AtomicBoolean(false);

    QueueSemaphore() {
    }

    @Override // com.polidea.rxandroidble2.internal.serialization.QueueAwaitReleaseInterface
    public synchronized void awaitRelease() throws java.lang.InterruptedException {
        while (!this.isReleased.get()) {
            try {
                wait();
            } catch (java.lang.InterruptedException e) {
                if (!this.isReleased.get()) {
                    com.polidea.rxandroidble2.internal.RxBleLog.w(e, "Queue's awaitRelease() has been interrupted abruptly while it wasn't released by the release() method.", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface
    public synchronized void release() {
        if (this.isReleased.compareAndSet(false, true)) {
            notify();
        }
    }
}
