package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutionModule_ExecutorFactory implements dagger.internal.Factory<java.util.concurrent.Executor> {
    private static final com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory INSTANCE = new com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory();

    @Override // javax.inject.Provider
    public java.util.concurrent.Executor get() {
        return executor();
    }

    public static com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory create() {
        return INSTANCE;
    }

    public static java.util.concurrent.Executor executor() {
        return (java.util.concurrent.Executor) dagger.internal.Preconditions.checkNotNull(com.google.android.datatransport.runtime.ExecutionModule.executor(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
