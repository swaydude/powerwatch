package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class TaskUtil {
    public static void setResultOrApiException(com.google.android.gms.common.api.Status status, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        setResultOrApiException(status, null, taskCompletionSource);
    }

    public static <TResult> void setResultOrApiException(com.google.android.gms.common.api.Status status, TResult tresult, com.google.android.gms.tasks.TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(new com.google.android.gms.common.api.ApiException(status));
        }
    }

    @java.lang.Deprecated
    public static com.google.android.gms.tasks.Task<java.lang.Void> toVoidTaskThatFailsOnFalse(com.google.android.gms.tasks.Task<java.lang.Boolean> task) {
        return task.continueWith(new com.google.android.gms.common.api.internal.zacl());
    }
}
