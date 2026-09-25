package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public class DependencyPriorityBlockingQueue<E extends io.fabric.sdk.android.services.concurrency.Dependency & io.fabric.sdk.android.services.concurrency.Task & io.fabric.sdk.android.services.concurrency.PriorityProvider> extends java.util.concurrent.PriorityBlockingQueue<E> {
    static final int PEEK = 1;
    static final int POLL = 2;
    static final int POLL_WITH_TIMEOUT = 3;
    static final int TAKE = 0;
    final java.util.Queue<E> blockedQueue = new java.util.LinkedList();
    private final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.concurrent.BlockingQueue
    public E take() throws java.lang.InterruptedException {
        return (E) get(0, null, null);
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue
    public E peek() {
        try {
            return (E) get(1, null, null);
        } catch (java.lang.InterruptedException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.concurrent.BlockingQueue
    public E poll(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return (E) get(3, java.lang.Long.valueOf(j), timeUnit);
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue
    public E poll() {
        try {
            return (E) get(2, null, null);
        } catch (java.lang.InterruptedException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public int size() {
        try {
            this.lock.lock();
            return this.blockedQueue.size() + super.size();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        try {
            this.lock.lock();
            return (T[]) concatenate(super.toArray(tArr), this.blockedQueue.toArray(tArr));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
        try {
            this.lock.lock();
            return concatenate(super.toArray(), this.blockedQueue.toArray());
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> collection) {
        try {
            this.lock.lock();
            int iDrainTo = super.drainTo(collection) + this.blockedQueue.size();
            while (!this.blockedQueue.isEmpty()) {
                collection.add(this.blockedQueue.poll());
            }
            this.lock.unlock();
            return iDrainTo;
        } catch (java.lang.Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> collection, int i) {
        try {
            this.lock.lock();
            int iDrainTo = super.drainTo(collection, i);
            while (!this.blockedQueue.isEmpty() && iDrainTo <= i) {
                collection.add(this.blockedQueue.poll());
                iDrainTo++;
            }
            this.lock.unlock();
            return iDrainTo;
        } catch (java.lang.Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(java.lang.Object obj) {
        try {
            this.lock.lock();
            return super.contains(obj) || this.blockedQueue.contains(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        try {
            this.lock.lock();
            this.blockedQueue.clear();
            super.clear();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(java.lang.Object obj) {
        try {
            this.lock.lock();
            return super.remove(obj) || this.blockedQueue.remove(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection<?> collection) {
        try {
            this.lock.lock();
            return this.blockedQueue.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.lock.unlock();
        }
    }

    E performOperation(int i, java.lang.Long l, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        if (i == 0) {
            return (E) ((io.fabric.sdk.android.services.concurrency.Dependency) super.take());
        }
        if (i == 1) {
            return (E) ((io.fabric.sdk.android.services.concurrency.Dependency) super.peek());
        }
        if (i == 2) {
            return (E) ((io.fabric.sdk.android.services.concurrency.Dependency) super.poll());
        }
        if (i != 3) {
            return null;
        }
        return (E) ((io.fabric.sdk.android.services.concurrency.Dependency) super.poll(l.longValue(), timeUnit));
    }

    boolean offerBlockedResult(int i, E e) {
        try {
            this.lock.lock();
            if (i == 1) {
                super.remove(e);
            }
            return this.blockedQueue.offer(e);
        } finally {
            this.lock.unlock();
        }
    }

    E get(int i, java.lang.Long l, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        E e;
        while (true) {
            e = (E) performOperation(i, l, timeUnit);
            if (e == null || canProcess(e)) {
                break;
            }
            offerBlockedResult(i, e);
        }
        return e;
    }

    boolean canProcess(E e) {
        return e.areDependenciesMet();
    }

    public void recycleBlockedQueue() {
        try {
            this.lock.lock();
            java.util.Iterator<E> it = this.blockedQueue.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (canProcess(next)) {
                    super.offer(next);
                    it.remove();
                }
            }
            this.lock.unlock();
        } catch (java.lang.Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    <T> T[] concatenate(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), length + length2));
        java.lang.System.arraycopy(tArr, 0, tArr3, 0, length);
        java.lang.System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }
}
