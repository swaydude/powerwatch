package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends android.app.job.JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        java.lang.String string = jobParameters.getExtras().getString("backendName");
        java.lang.String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.TransportRuntime.initialize(getApplicationContext());
        com.google.android.datatransport.runtime.TransportContext.Builder priority = com.google.android.datatransport.runtime.TransportContext.builder().setBackendName(string).setPriority(com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(i));
        if (string2 != null) {
            priority.setExtras(android.util.Base64.decode(string2, 0));
        }
        com.google.android.datatransport.runtime.TransportRuntime.getInstance().getUploader().upload(priority.build(), i2, com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService$$Lambda$1.lambdaFactory$(this, jobParameters));
        return true;
    }
}
