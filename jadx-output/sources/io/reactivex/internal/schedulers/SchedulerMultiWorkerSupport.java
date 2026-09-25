package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i, io.reactivex.Scheduler.Worker worker);
    }

    void createWorkers(int i, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback workerCallback);
}
