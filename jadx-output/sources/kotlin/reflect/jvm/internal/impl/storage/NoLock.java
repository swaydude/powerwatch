package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: classes2.dex */
class NoLock implements java.util.concurrent.locks.Lock {
    public static final java.util.concurrent.locks.Lock INSTANCE = new kotlin.reflect.jvm.internal.impl.storage.NoLock();

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "unit", "kotlin/reflect/jvm/internal/impl/storage/NoLock", "tryLock"));
    }

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
    }

    private NoLock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws java.lang.InterruptedException {
        throw new java.lang.UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        throw new java.lang.UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        if (timeUnit == null) {
            $$$reportNull$$$0(0);
        }
        throw new java.lang.UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public java.util.concurrent.locks.Condition newCondition() {
        throw new java.lang.UnsupportedOperationException("Should not be called");
    }
}
