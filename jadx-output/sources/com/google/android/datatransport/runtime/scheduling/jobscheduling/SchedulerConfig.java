package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class SchedulerConfig {
    private static final long ONE_SECOND = 1000;
    private static final long THIRTY_SECONDS = 30000;
    private static final long TWENTY_FOUR_HOURS = 86400000;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    abstract com.google.android.datatransport.runtime.time.Clock getClock();

    abstract java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> getValues();

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static abstract class ConfigValue {

        /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
        public static abstract class Builder {
            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue build();

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setDelta(long j);

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setFlags(java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> set);

            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j);
        }

        abstract long getDelta();

        abstract java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> getFlags();

        abstract long getMaxAllowedDelay();

        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder builder() {
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue.Builder().setFlags(java.util.Collections.emptySet());
        }
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig getDefault(com.google.android.datatransport.runtime.time.Clock clock) {
        return builder().addConfig(com.google.android.datatransport.Priority.DEFAULT, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.builder().setDelta(THIRTY_SECONDS).setMaxAllowedDelay(TWENTY_FOUR_HOURS).build()).addConfig(com.google.android.datatransport.Priority.HIGHEST, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.builder().setDelta(ONE_SECOND).setMaxAllowedDelay(TWENTY_FOUR_HOURS).build()).addConfig(com.google.android.datatransport.Priority.VERY_LOW, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.builder().setDelta(TWENTY_FOUR_HOURS).setMaxAllowedDelay(TWENTY_FOUR_HOURS).setFlags(immutableSetOf(com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.NETWORK_UNMETERED, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.DEVICE_IDLE)).build()).setClock(clock).build();
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Builder builder() {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Builder();
    }

    static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig create(com.google.android.datatransport.runtime.time.Clock clock, java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig(clock, map);
    }

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static class Builder {
        private com.google.android.datatransport.runtime.time.Clock clock;
        private java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> values = new java.util.HashMap();

        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Builder setClock(com.google.android.datatransport.runtime.time.Clock clock) {
            this.clock = clock;
            return this;
        }

        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Builder addConfig(com.google.android.datatransport.Priority priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue configValue) {
            this.values.put(priority, configValue);
            return this;
        }

        public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig build() {
            java.util.Objects.requireNonNull(this.clock, "missing required property: clock");
            if (this.values.keySet().size() < com.google.android.datatransport.Priority.values().length) {
                throw new java.lang.IllegalStateException("Not all priorities have been configured");
            }
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> map = this.values;
            this.values = new java.util.HashMap();
            return com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.create(this.clock, map);
        }
    }

    public long getScheduleDelay(com.google.android.datatransport.Priority priority, long j, int i) {
        long time = j - getClock().getTime();
        com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue configValue = getValues().get(priority);
        return java.lang.Math.min(java.lang.Math.max(((long) java.lang.Math.pow(2.0d, i - 1)) * configValue.getDelta(), time), configValue.getMaxAllowedDelay());
    }

    public android.app.job.JobInfo.Builder configureJob(android.app.job.JobInfo.Builder builder, com.google.android.datatransport.Priority priority, long j, int i) {
        builder.setMinimumLatency(getScheduleDelay(priority, j, i));
        populateFlags(builder, getValues().get(priority).getFlags());
        return builder;
    }

    private void populateFlags(android.app.job.JobInfo.Builder builder, java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> set) {
        if (set.contains(com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> getFlags(com.google.android.datatransport.Priority priority) {
        return getValues().get(priority).getFlags();
    }

    private static <T> java.util.Set<T> immutableSetOf(T... tArr) {
        return java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(tArr)));
    }
}
