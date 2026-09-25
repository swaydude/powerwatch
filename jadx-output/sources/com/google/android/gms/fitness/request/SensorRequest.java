package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SensorRequest {
    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;
    private final com.google.android.gms.fitness.data.DataType zzhz;
    private final com.google.android.gms.fitness.data.DataSource zzia;
    private final long zzmc;
    private final int zzmd;
    private final long zzpu;
    private final long zzpv;
    private final long zzpy;

    private SensorRequest(com.google.android.gms.fitness.request.SensorRequest.Builder builder) {
        this.zzia = builder.zzia;
        this.zzhz = builder.zzhz;
        this.zzmc = builder.zzmc;
        this.zzpv = builder.zzpv;
        this.zzpu = builder.zzpu;
        this.zzmd = builder.zzmd;
        this.zzpy = builder.zzpy;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.DataType zzhz;
        private com.google.android.gms.fitness.data.DataSource zzia;
        private long zzmc = -1;
        private long zzpv = 0;
        private long zzpu = 0;
        private boolean zzpz = false;
        private int zzmd = 2;
        private long zzpy = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;

        public com.google.android.gms.fitness.request.SensorRequest.Builder setDataSource(com.google.android.gms.fitness.data.DataSource dataSource) {
            this.zzia = dataSource;
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setDataType(com.google.android.gms.fitness.data.DataType dataType) {
            this.zzhz = dataType;
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setSamplingRate(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "Cannot use a negative sampling interval");
            long micros = timeUnit.toMicros(j);
            this.zzmc = micros;
            if (!this.zzpz) {
                this.zzpv = micros / 2;
            }
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setFastestRate(int i, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0, "Cannot use a negative interval");
            this.zzpz = true;
            this.zzpv = timeUnit.toMicros(i);
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setMaxDeliveryLatency(int i, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0, "Cannot use a negative delivery interval");
            this.zzpu = timeUnit.toMicros(i);
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setAccuracyMode(int i) {
            if (i != 1 && i != 3) {
                i = 2;
            }
            this.zzmd = i;
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setTimeout(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Invalid time out value specified: %d", java.lang.Long.valueOf(j));
            com.google.android.gms.common.internal.Preconditions.checkArgument(timeUnit != null, "Invalid time unit specified");
            this.zzpy = timeUnit.toMicros(j);
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest build() {
            com.google.android.gms.fitness.data.DataSource dataSource;
            com.google.android.gms.common.internal.Preconditions.checkState((this.zzia == null && this.zzhz == null) ? false : true, "Must call setDataSource() or setDataType()");
            com.google.android.gms.fitness.data.DataType dataType = this.zzhz;
            com.google.android.gms.common.internal.Preconditions.checkState(dataType == null || (dataSource = this.zzia) == null || dataType.equals(dataSource.getDataType()), "Specified data type is incompatible with specified data source");
            return new com.google.android.gms.fitness.request.SensorRequest(this);
        }
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzia;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzhz;
    }

    public long getSamplingRate(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzmc, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public long getFastestRate(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzpv, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzpu, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public int getAccuracyMode() {
        return this.zzmd;
    }

    public final long zzab() {
        return this.zzpy;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataSource", this.zzia).add("dataType", this.zzhz).add("samplingRateMicros", java.lang.Long.valueOf(this.zzmc)).add("deliveryLatencyMicros", java.lang.Long.valueOf(this.zzpu)).add("timeOutMicros", java.lang.Long.valueOf(this.zzpy)).toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.request.SensorRequest) {
                com.google.android.gms.fitness.request.SensorRequest sensorRequest = (com.google.android.gms.fitness.request.SensorRequest) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.zzia, sensorRequest.zzia) && com.google.android.gms.common.internal.Objects.equal(this.zzhz, sensorRequest.zzhz) && this.zzmc == sensorRequest.zzmc && this.zzpv == sensorRequest.zzpv && this.zzpu == sensorRequest.zzpu && this.zzmd == sensorRequest.zzmd && this.zzpy == sensorRequest.zzpy) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzia, this.zzhz, java.lang.Long.valueOf(this.zzmc), java.lang.Long.valueOf(this.zzpv), java.lang.Long.valueOf(this.zzpu), java.lang.Integer.valueOf(this.zzmd), java.lang.Long.valueOf(this.zzpy));
    }
}
