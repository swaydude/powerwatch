package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzu<TResult> extends com.google.android.gms.tasks.Task<TResult> {
    private TResult zzaa;
    private java.lang.Exception zzab;
    private boolean zzy;
    private volatile boolean zzz;
    private final java.lang.Object mLock = new java.lang.Object();
    private final com.google.android.gms.tasks.zzr<TResult> zzx = new com.google.android.gms.tasks.zzr<>();

    zzu() {
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzy;
        }
        return z;
    }

    private static class zza extends com.google.android.gms.common.api.internal.LifecycleCallback {
        private final java.util.List<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> zzac;

        public static com.google.android.gms.tasks.zzu.zza zza(android.app.Activity activity) {
            com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
            com.google.android.gms.tasks.zzu.zza zzaVar = (com.google.android.gms.tasks.zzu.zza) fragment.getCallbackOrNull("TaskOnStopCallback", com.google.android.gms.tasks.zzu.zza.class);
            return zzaVar == null ? new com.google.android.gms.tasks.zzu.zza(fragment) : zzaVar;
        }

        private zza(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.zzac = new java.util.ArrayList();
            this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
        }

        public final <T> void zzb(com.google.android.gms.tasks.zzq<T> zzqVar) {
            synchronized (this.zzac) {
                this.zzac.add(new java.lang.ref.WeakReference<>(zzqVar));
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zzac) {
                java.util.Iterator<java.lang.ref.WeakReference<com.google.android.gms.tasks.zzq<?>>> it = this.zzac.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.tasks.zzq<?> zzqVar = it.next().get();
                    if (zzqVar != null) {
                        zzqVar.cancel();
                    }
                }
                this.zzac.clear();
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.zzz;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzy && !this.zzz && this.zzab == null;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.mLock) {
            zzb();
            zzd();
            if (this.zzab != null) {
                throw new com.google.android.gms.tasks.RuntimeExecutionException(this.zzab);
            }
            tresult = this.zzaa;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends java.lang.Throwable> TResult getResult(java.lang.Class<X> cls) throws java.lang.Throwable {
        TResult tresult;
        synchronized (this.mLock) {
            zzb();
            zzd();
            if (cls.isInstance(this.zzab)) {
                throw cls.cast(this.zzab);
            }
            if (this.zzab != null) {
                throw new com.google.android.gms.tasks.RuntimeExecutionException(this.zzab);
            }
            tresult = this.zzaa;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final java.lang.Exception getException() {
        java.lang.Exception exc;
        synchronized (this.mLock) {
            exc = this.zzab;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener) {
        return addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzx.zza(new com.google.android.gms.tasks.zzm(executor, onSuccessListener));
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(android.app.Activity activity, com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener) {
        com.google.android.gms.tasks.zzm zzmVar = new com.google.android.gms.tasks.zzm(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.zzx.zza(zzmVar);
        com.google.android.gms.tasks.zzu.zza.zza(activity).zzb(zzmVar);
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(com.google.android.gms.tasks.OnFailureListener onFailureListener) {
        return addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnFailureListener onFailureListener) {
        this.zzx.zza(new com.google.android.gms.tasks.zzk(executor, onFailureListener));
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnFailureListener(android.app.Activity activity, com.google.android.gms.tasks.OnFailureListener onFailureListener) {
        com.google.android.gms.tasks.zzk zzkVar = new com.google.android.gms.tasks.zzk(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onFailureListener);
        this.zzx.zza(zzkVar);
        com.google.android.gms.tasks.zzu.zza.zza(activity).zzb(zzkVar);
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        return addOnCompleteListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        this.zzx.zza(new com.google.android.gms.tasks.zzi(executor, onCompleteListener));
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(android.app.Activity activity, com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        com.google.android.gms.tasks.zzi zziVar = new com.google.android.gms.tasks.zzi(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.zzx.zza(zziVar);
        com.google.android.gms.tasks.zzu.zza.zza(activity).zzb(zziVar);
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> continuation) {
        com.google.android.gms.tasks.zzu zzuVar = new com.google.android.gms.tasks.zzu();
        this.zzx.zza(new com.google.android.gms.tasks.zzc(executor, continuation, zzuVar));
        zze();
        return zzuVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> continuation) {
        return continueWithTask(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        return addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        this.zzx.zza(new com.google.android.gms.tasks.zzg(executor, onCanceledListener));
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(android.app.Activity activity, com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        com.google.android.gms.tasks.zzg zzgVar = new com.google.android.gms.tasks.zzg(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.zzx.zza(zzgVar);
        com.google.android.gms.tasks.zzu.zza.zza(activity).zzb(zzgVar);
        zze();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> continuation) {
        com.google.android.gms.tasks.zzu zzuVar = new com.google.android.gms.tasks.zzu();
        this.zzx.zza(new com.google.android.gms.tasks.zze(executor, continuation, zzuVar));
        zze();
        return zzuVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(java.util.concurrent.Executor executor, com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        com.google.android.gms.tasks.zzu zzuVar = new com.google.android.gms.tasks.zzu();
        this.zzx.zza(new com.google.android.gms.tasks.zzo(executor, successContinuation, zzuVar));
        zze();
        return zzuVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        return onSuccessTask(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, successContinuation);
    }

    public final void setResult(TResult tresult) {
        synchronized (this.mLock) {
            zzc();
            this.zzy = true;
            this.zzaa = tresult;
        }
        this.zzx.zza(this);
    }

    public final boolean trySetResult(TResult tresult) {
        synchronized (this.mLock) {
            if (this.zzy) {
                return false;
            }
            this.zzy = true;
            this.zzaa = tresult;
            this.zzx.zza(this);
            return true;
        }
    }

    public final void setException(java.lang.Exception exc) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.mLock) {
            zzc();
            this.zzy = true;
            this.zzab = exc;
        }
        this.zzx.zza(this);
    }

    public final boolean trySetException(java.lang.Exception exc) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.mLock) {
            if (this.zzy) {
                return false;
            }
            this.zzy = true;
            this.zzab = exc;
            this.zzx.zza(this);
            return true;
        }
    }

    public final boolean zza() {
        synchronized (this.mLock) {
            if (this.zzy) {
                return false;
            }
            this.zzy = true;
            this.zzz = true;
            this.zzx.zza(this);
            return true;
        }
    }

    private final void zzb() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzy, "Task is not yet complete");
    }

    private final void zzc() {
        com.google.android.gms.common.internal.Preconditions.checkState(!this.zzy, "Task is already complete");
    }

    private final void zzd() {
        if (this.zzz) {
            throw new java.util.concurrent.CancellationException("Task is already canceled.");
        }
    }

    private final void zze() {
        synchronized (this.mLock) {
            if (this.zzy) {
                this.zzx.zza(this);
            }
        }
    }
}
