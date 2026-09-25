package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends android.content.BroadcastReceiver {
    static /* synthetic */ void lambda$onReceive$0() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String queryParameter = intent.getData().getQueryParameter("backendName");
        java.lang.String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = java.lang.Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.TransportRuntime.initialize(context);
        com.google.android.datatransport.runtime.TransportContext.Builder priority = com.google.android.datatransport.runtime.TransportContext.builder().setBackendName(queryParameter).setPriority(com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(iIntValue));
        if (queryParameter2 != null) {
            priority.setExtras(android.util.Base64.decode(queryParameter2, 0));
        }
        com.google.android.datatransport.runtime.TransportRuntime.getInstance().getUploader().upload(priority.build(), i, com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver$$Lambda$1.instance);
    }
}
