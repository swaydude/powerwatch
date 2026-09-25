package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class PendingResultUtil {
    private static final com.google.android.gms.common.internal.PendingResultUtil.zaa zapf = new com.google.android.gms.common.internal.zai();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface ResultConverter<R extends com.google.android.gms.common.api.Result, T> {
        T convert(R r);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface zaa {
        com.google.android.gms.common.api.ApiException zaf(com.google.android.gms.common.api.Status status);
    }

    public static <R extends com.google.android.gms.common.api.Result, T> com.google.android.gms.tasks.Task<T> toTask(com.google.android.gms.common.api.PendingResult<R> pendingResult, com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<R, T> resultConverter) {
        com.google.android.gms.common.internal.PendingResultUtil.zaa zaaVar = zapf;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        pendingResult.addStatusListener(new com.google.android.gms.common.internal.zak(pendingResult, taskCompletionSource, resultConverter, zaaVar));
        return taskCompletionSource.getTask();
    }

    public static <R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.Response<R>> com.google.android.gms.tasks.Task<T> toResponseTask(com.google.android.gms.common.api.PendingResult<R> pendingResult, T t) {
        return toTask(pendingResult, new com.google.android.gms.common.internal.zaj(t));
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.tasks.Task<java.lang.Void> toVoidTask(com.google.android.gms.common.api.PendingResult<R> pendingResult) {
        return toTask(pendingResult, new com.google.android.gms.common.internal.zal());
    }
}
