package com.google.android.datatransport.runtime.backends;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CreationContext extends com.google.android.datatransport.runtime.backends.CreationContext {
    private final android.content.Context applicationContext;
    private final java.lang.String backendName;
    private final com.google.android.datatransport.runtime.time.Clock monotonicClock;
    private final com.google.android.datatransport.runtime.time.Clock wallClock;

    AutoValue_CreationContext(android.content.Context context, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, java.lang.String str) {
        java.util.Objects.requireNonNull(context, "Null applicationContext");
        this.applicationContext = context;
        java.util.Objects.requireNonNull(clock, "Null wallClock");
        this.wallClock = clock;
        java.util.Objects.requireNonNull(clock2, "Null monotonicClock");
        this.monotonicClock = clock2;
        java.util.Objects.requireNonNull(str, "Null backendName");
        this.backendName = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public android.content.Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public com.google.android.datatransport.runtime.time.Clock getWallClock() {
        return this.wallClock;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public com.google.android.datatransport.runtime.time.Clock getMonotonicClock() {
        return this.monotonicClock;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public java.lang.String getBackendName() {
        return this.backendName;
    }

    public java.lang.String toString() {
        return "CreationContext{applicationContext=" + this.applicationContext + ", wallClock=" + this.wallClock + ", monotonicClock=" + this.monotonicClock + ", backendName=" + this.backendName + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.backends.CreationContext)) {
            return false;
        }
        com.google.android.datatransport.runtime.backends.CreationContext creationContext = (com.google.android.datatransport.runtime.backends.CreationContext) obj;
        return this.applicationContext.equals(creationContext.getApplicationContext()) && this.wallClock.equals(creationContext.getWallClock()) && this.monotonicClock.equals(creationContext.getMonotonicClock()) && this.backendName.equals(creationContext.getBackendName());
    }

    public int hashCode() {
        return ((((((this.applicationContext.hashCode() ^ 1000003) * 1000003) ^ this.wallClock.hashCode()) * 1000003) ^ this.monotonicClock.hashCode()) * 1000003) ^ this.backendName.hashCode();
    }
}
