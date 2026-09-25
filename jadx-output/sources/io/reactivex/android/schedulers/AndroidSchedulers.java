package io.reactivex.android.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidSchedulers {
    private static final io.reactivex.Scheduler MAIN_THREAD = io.reactivex.android.plugins.RxAndroidPlugins.initMainThreadScheduler(new java.util.concurrent.Callable<io.reactivex.Scheduler>() { // from class: io.reactivex.android.schedulers.AndroidSchedulers.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.android.schedulers.AndroidSchedulers.MainHolder.DEFAULT;
        }
    });

    private static final class MainHolder {
        static final io.reactivex.Scheduler DEFAULT = new io.reactivex.android.schedulers.HandlerScheduler(new android.os.Handler(android.os.Looper.getMainLooper()));

        private MainHolder() {
        }
    }

    public static io.reactivex.Scheduler mainThread() {
        return io.reactivex.android.plugins.RxAndroidPlugins.onMainThreadScheduler(MAIN_THREAD);
    }

    public static io.reactivex.Scheduler from(android.os.Looper looper) {
        java.util.Objects.requireNonNull(looper, "looper == null");
        return new io.reactivex.android.schedulers.HandlerScheduler(new android.os.Handler(looper));
    }

    private AndroidSchedulers() {
        throw new java.lang.AssertionError("No instances.");
    }
}
