package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class JobInfoSchedulerService$$Lambda$1 implements java.lang.Runnable {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService arg$1;
    private final android.app.job.JobParameters arg$2;

    private JobInfoSchedulerService$$Lambda$1(com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService jobInfoSchedulerService, android.app.job.JobParameters jobParameters) {
        this.arg$1 = jobInfoSchedulerService;
        this.arg$2 = jobParameters;
    }

    public static java.lang.Runnable lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService jobInfoSchedulerService, android.app.job.JobParameters jobParameters) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService$$Lambda$1(jobInfoSchedulerService, jobParameters);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.arg$1.jobFinished(this.arg$2, false);
    }
}
