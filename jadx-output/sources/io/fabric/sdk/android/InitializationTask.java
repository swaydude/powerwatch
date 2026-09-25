package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
class InitializationTask<Result> extends io.fabric.sdk.android.services.concurrency.PriorityAsyncTask<java.lang.Void, java.lang.Void, Result> {
    private static final java.lang.String TIMING_METRIC_TAG = "KitInitialization";
    final io.fabric.sdk.android.Kit<Result> kit;

    public InitializationTask(io.fabric.sdk.android.Kit<Result> kit) {
        this.kit = kit;
    }

    @Override // io.fabric.sdk.android.services.concurrency.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        io.fabric.sdk.android.services.common.TimingMetric timingMetricCreateAndStartTimingMetric = createAndStartTimingMetric("onPreExecute");
        try {
            try {
                boolean zOnPreExecute = this.kit.onPreExecute();
                timingMetricCreateAndStartTimingMetric.stopMeasuring();
                if (zOnPreExecute) {
                    return;
                }
            } catch (io.fabric.sdk.android.services.concurrency.UnmetDependencyException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failure onPreExecute()", e2);
                timingMetricCreateAndStartTimingMetric.stopMeasuring();
            }
            cancel(true);
        } catch (java.lang.Throwable th) {
            timingMetricCreateAndStartTimingMetric.stopMeasuring();
            cancel(true);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.fabric.sdk.android.services.concurrency.AsyncTask
    public Result doInBackground(java.lang.Void... voidArr) {
        io.fabric.sdk.android.services.common.TimingMetric timingMetricCreateAndStartTimingMetric = createAndStartTimingMetric("doInBackground");
        Result resultDoInBackground = !isCancelled() ? this.kit.doInBackground() : null;
        timingMetricCreateAndStartTimingMetric.stopMeasuring();
        return resultDoInBackground;
    }

    @Override // io.fabric.sdk.android.services.concurrency.AsyncTask
    protected void onPostExecute(Result result) {
        this.kit.onPostExecute(result);
        this.kit.initializationCallback.success(result);
    }

    @Override // io.fabric.sdk.android.services.concurrency.AsyncTask
    protected void onCancelled(Result result) {
        this.kit.onCancelled(result);
        this.kit.initializationCallback.failure(new io.fabric.sdk.android.InitializationException(this.kit.getIdentifier() + " Initialization was cancelled"));
    }

    @Override // io.fabric.sdk.android.services.concurrency.PriorityAsyncTask, io.fabric.sdk.android.services.concurrency.PriorityProvider
    public io.fabric.sdk.android.services.concurrency.Priority getPriority() {
        return io.fabric.sdk.android.services.concurrency.Priority.HIGH;
    }

    private io.fabric.sdk.android.services.common.TimingMetric createAndStartTimingMetric(java.lang.String str) {
        io.fabric.sdk.android.services.common.TimingMetric timingMetric = new io.fabric.sdk.android.services.common.TimingMetric(this.kit.getIdentifier() + "." + str, TIMING_METRIC_TAG);
        timingMetric.startMeasuring();
        return timingMetric;
    }
}
