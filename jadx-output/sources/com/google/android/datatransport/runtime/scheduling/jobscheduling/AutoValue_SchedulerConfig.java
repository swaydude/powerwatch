package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SchedulerConfig extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig {
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> values;

    AutoValue_SchedulerConfig(com.google.android.datatransport.runtime.time.Clock clock, java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> map) {
        java.util.Objects.requireNonNull(clock, "Null clock");
        this.clock = clock;
        java.util.Objects.requireNonNull(map, "Null values");
        this.values = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    com.google.android.datatransport.runtime.time.Clock getClock() {
        return this.clock;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> getValues() {
        return this.values;
    }

    public java.lang.String toString() {
        return "SchedulerConfig{clock=" + this.clock + ", values=" + this.values + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig)) {
            return false;
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig) obj;
        return this.clock.equals(schedulerConfig.getClock()) && this.values.equals(schedulerConfig.getValues());
    }

    public int hashCode() {
        return ((this.clock.hashCode() ^ 1000003) * 1000003) ^ this.values.hashCode();
    }
}
