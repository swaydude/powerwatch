package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
@dagger.Module
abstract class ExecutionModule {
    ExecutionModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    static java.util.concurrent.Executor executor() {
        return java.util.concurrent.Executors.newSingleThreadExecutor();
    }
}
