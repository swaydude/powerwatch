package io.reactivex.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T, U> void drainMaxLoop(io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue, org.reactivestreams.Subscriber<? super U> subscriber, boolean z, io.reactivex.disposables.Disposable disposable, io.reactivex.internal.util.QueueDrain<T, U> queueDrain) {
        int iLeave = 1;
        while (true) {
            boolean zDone = queueDrain.done();
            T tPoll = simplePlainQueue.poll();
            boolean z2 = tPoll == null;
            if (checkTerminated(zDone, z2, subscriber, z, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else if (!z2) {
                long jRequested = queueDrain.requested();
                if (jRequested != 0) {
                    if (queueDrain.accept(subscriber, tPoll) && jRequested != Long.MAX_VALUE) {
                        queueDrain.produced(1L);
                    }
                } else {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
            } else {
                iLeave = queueDrain.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            }
        }
    }

    public static <T, U> boolean checkTerminated(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, boolean z3, io.reactivex.internal.fuseable.SimpleQueue<?> simpleQueue, io.reactivex.internal.util.QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            java.lang.Throwable thError = queueDrain.error();
            if (thError != null) {
                subscriber.onError(thError);
            } else {
                subscriber.onComplete();
            }
            return true;
        }
        java.lang.Throwable thError2 = queueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            subscriber.onError(thError2);
            return true;
        }
        if (!z2) {
            return false;
        }
        subscriber.onComplete();
        return true;
    }

    public static <T, U> void drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue, io.reactivex.Observer<? super U> observer, boolean z, io.reactivex.disposables.Disposable disposable, io.reactivex.internal.util.ObservableQueueDrain<T, U> observableQueueDrain) {
        int iLeave = 1;
        while (!checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean zDone = observableQueueDrain.done();
                T tPoll = simplePlainQueue.poll();
                boolean z2 = tPoll == null;
                if (checkTerminated(zDone, z2, observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
                    return;
                }
                if (z2) {
                    break;
                } else {
                    observableQueueDrain.accept(observer, tPoll);
                }
            }
            iLeave = observableQueueDrain.leave(-iLeave);
            if (iLeave == 0) {
                return;
            }
        }
    }

    public static <T, U> boolean checkTerminated(boolean z, boolean z2, io.reactivex.Observer<?> observer, boolean z3, io.reactivex.internal.fuseable.SimpleQueue<?> simpleQueue, io.reactivex.disposables.Disposable disposable, io.reactivex.internal.util.ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            java.lang.Throwable thError = observableQueueDrain.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        java.lang.Throwable thError2 = observableQueueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    public static <T> io.reactivex.internal.fuseable.SimpleQueue<T> createQueue(int i) {
        if (i < 0) {
            return new io.reactivex.internal.queue.SpscLinkedArrayQueue(-i);
        }
        return new io.reactivex.internal.queue.SpscArrayQueue(i);
    }

    public static void request(org.reactivestreams.Subscription subscription, int i) {
        subscription.request(i < 0 ? Long.MAX_VALUE : i);
    }

    public static <T> boolean postCompleteRequest(long j, org.reactivestreams.Subscriber<? super T> subscriber, java.util.Queue<T> queue, java.util.concurrent.atomic.AtomicLong atomicLong, io.reactivex.functions.BooleanSupplier booleanSupplier) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, io.reactivex.internal.util.BackpressureHelper.addCap(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        postCompleteDrain(j | Long.MIN_VALUE, subscriber, queue, atomicLong, booleanSupplier);
        return true;
    }

    static boolean isCancelled(io.reactivex.functions.BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            return true;
        }
    }

    static <T> boolean postCompleteDrain(long j, org.reactivestreams.Subscriber<? super T> subscriber, java.util.Queue<T> queue, java.util.concurrent.atomic.AtomicLong atomicLong, io.reactivex.functions.BooleanSupplier booleanSupplier) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    subscriber.onComplete();
                    return true;
                }
                subscriber.onNext(tPoll);
                j2++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    subscriber.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long jAddAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j = jAddAndGet;
                    j2 = jAddAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> void postComplete(org.reactivestreams.Subscriber<? super T> subscriber, java.util.Queue<T> queue, java.util.concurrent.atomic.AtomicLong atomicLong, io.reactivex.functions.BooleanSupplier booleanSupplier) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            subscriber.onComplete();
            return;
        }
        if (postCompleteDrain(atomicLong.get(), subscriber, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = j | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        if (j != 0) {
            postCompleteDrain(j2, subscriber, queue, atomicLong, booleanSupplier);
        }
    }
}
