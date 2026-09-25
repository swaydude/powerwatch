package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaae {
    private final com.google.android.gms.common.api.internal.ApiKey<?> zaft;
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> zafu = new com.google.android.gms.tasks.TaskCompletionSource<>();

    public zaae(com.google.android.gms.common.api.internal.ApiKey<?> apiKey) {
        this.zaft = apiKey;
    }

    public final com.google.android.gms.common.api.internal.ApiKey<?> getApiKey() {
        return this.zaft;
    }

    public final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> zaaj() {
        return this.zafu;
    }
}
