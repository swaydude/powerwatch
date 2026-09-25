package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class MiddleOutFallbackStrategy implements com.crashlytics.android.core.StackTraceTrimmingStrategy {
    private final int maximumStackSize;
    private final com.crashlytics.android.core.MiddleOutStrategy middleOutStrategy;
    private final com.crashlytics.android.core.StackTraceTrimmingStrategy[] trimmingStrategies;

    public MiddleOutFallbackStrategy(int i, com.crashlytics.android.core.StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.maximumStackSize = i;
        this.trimmingStrategies = stackTraceTrimmingStrategyArr;
        this.middleOutStrategy = new com.crashlytics.android.core.MiddleOutStrategy(i);
    }

    @Override // com.crashlytics.android.core.StackTraceTrimmingStrategy
    public java.lang.StackTraceElement[] getTrimmedStackTrace(java.lang.StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.maximumStackSize) {
            return stackTraceElementArr;
        }
        java.lang.StackTraceElement[] trimmedStackTrace = stackTraceElementArr;
        for (com.crashlytics.android.core.StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.trimmingStrategies) {
            if (trimmedStackTrace.length <= this.maximumStackSize) {
                break;
            }
            trimmedStackTrace = stackTraceTrimmingStrategy.getTrimmedStackTrace(stackTraceElementArr);
        }
        return trimmedStackTrace.length > this.maximumStackSize ? this.middleOutStrategy.getTrimmedStackTrace(trimmedStackTrace) : trimmedStackTrace;
    }
}
