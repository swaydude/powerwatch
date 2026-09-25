package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class Goal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal> CREATOR = new com.google.android.gms.fitness.data.zzs();
    public static final int OBJECTIVE_TYPE_DURATION = 2;
    public static final int OBJECTIVE_TYPE_FREQUENCY = 3;
    public static final int OBJECTIVE_TYPE_METRIC = 1;
    private final long zzlj;
    private final long zzlk;
    private final java.util.List<java.lang.Integer> zzll;
    private final com.google.android.gms.fitness.data.Goal.Recurrence zzlm;
    private final int zzln;
    private final com.google.android.gms.fitness.data.Goal.MetricObjective zzlo;
    private final com.google.android.gms.fitness.data.Goal.DurationObjective zzlp;
    private final com.google.android.gms.fitness.data.Goal.FrequencyObjective zzlq;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class DurationObjective extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal.DurationObjective> CREATOR = new com.google.android.gms.fitness.data.zzp();
        private final long zzlr;

        public long getDuration(java.util.concurrent.TimeUnit timeUnit) {
            return timeUnit.convert(this.zzlr, java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        DurationObjective(long j) {
            this.zzlr = j;
        }

        public DurationObjective(long j, java.util.concurrent.TimeUnit timeUnit) {
            this(timeUnit.toNanos(j));
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof com.google.android.gms.fitness.data.Goal.DurationObjective) && this.zzlr == ((com.google.android.gms.fitness.data.Goal.DurationObjective) obj).zzlr;
        }

        public int hashCode() {
            return (int) this.zzlr;
        }

        public java.lang.String toString() {
            return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("duration", java.lang.Long.valueOf(this.zzlr)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzlr);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class FrequencyObjective extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal.FrequencyObjective> CREATOR = new com.google.android.gms.fitness.data.zzr();
        private final int frequency;

        public int getFrequency() {
            return this.frequency;
        }

        public FrequencyObjective(int i) {
            this.frequency = i;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof com.google.android.gms.fitness.data.Goal.FrequencyObjective) && this.frequency == ((com.google.android.gms.fitness.data.Goal.FrequencyObjective) obj).frequency;
        }

        public int hashCode() {
            return this.frequency;
        }

        public java.lang.String toString() {
            return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("frequency", java.lang.Integer.valueOf(this.frequency)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getFrequency());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class MetricObjective extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal.MetricObjective> CREATOR = new com.google.android.gms.fitness.data.zzw();
        private final double value;
        private final java.lang.String zzls;
        private final double zzlt;

        public java.lang.String getDataTypeName() {
            return this.zzls;
        }

        public double getValue() {
            return this.value;
        }

        public MetricObjective(java.lang.String str, double d, double d2) {
            this.zzls = str;
            this.value = d;
            this.zzlt = d2;
        }

        public MetricObjective(java.lang.String str, double d) {
            this(str, d, 0.0d);
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.fitness.data.Goal.MetricObjective)) {
                return false;
            }
            com.google.android.gms.fitness.data.Goal.MetricObjective metricObjective = (com.google.android.gms.fitness.data.Goal.MetricObjective) obj;
            return com.google.android.gms.common.internal.Objects.equal(this.zzls, metricObjective.zzls) && this.value == metricObjective.value && this.zzlt == metricObjective.zzlt;
        }

        public int hashCode() {
            return this.zzls.hashCode();
        }

        public java.lang.String toString() {
            return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypeName", this.zzls).add("value", java.lang.Double.valueOf(this.value)).add("initialValue", java.lang.Double.valueOf(this.zzlt)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getDataTypeName(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 2, getValue());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, this.zzlt);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class MismatchedGoalException extends java.lang.IllegalStateException {
        public MismatchedGoalException(java.lang.String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ObjectiveType {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Recurrence extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal.Recurrence> CREATOR = new com.google.android.gms.fitness.data.zzab();
        public static final int UNIT_DAY = 1;
        public static final int UNIT_MONTH = 3;
        public static final int UNIT_WEEK = 2;
        private final int count;
        private final int zzlu;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface RecurrenceUnit {
        }

        public int getCount() {
            return this.count;
        }

        public int getUnit() {
            return this.zzlu;
        }

        public Recurrence(int i, int i2) {
            this.count = i;
            com.google.android.gms.common.internal.Preconditions.checkState(i2 > 0 && i2 <= 3);
            this.zzlu = i2;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.fitness.data.Goal.Recurrence)) {
                return false;
            }
            com.google.android.gms.fitness.data.Goal.Recurrence recurrence = (com.google.android.gms.fitness.data.Goal.Recurrence) obj;
            return this.count == recurrence.count && this.zzlu == recurrence.zzlu;
        }

        public int hashCode() {
            return this.zzlu;
        }

        public java.lang.String toString() {
            java.lang.String str;
            com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("count", java.lang.Integer.valueOf(this.count));
            int i = this.zzlu;
            if (i == 1) {
                str = "day";
            } else if (i == 2) {
                str = "week";
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalArgumentException("invalid unit value");
                }
                str = "month";
            }
            return toStringHelperAdd.add("unit", str).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getCount());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getUnit());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    public long getCreateTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzlj, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public long getStartTime(java.util.Calendar calendar, java.util.concurrent.TimeUnit timeUnit) {
        if (this.zzlm == null) {
            return timeUnit.convert(this.zzlj, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        int i = this.zzlm.zzlu;
        if (i == 1) {
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (i == 2) {
            calendar2.set(7, 2);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (i == 3) {
            calendar2.set(5, 1);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        int i2 = this.zzlm.zzlu;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(24);
        sb.append("Invalid unit ");
        sb.append(i2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public long getEndTime(java.util.Calendar calendar, java.util.concurrent.TimeUnit timeUnit) {
        if (this.zzlm != null) {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            calendar2.setTime(calendar.getTime());
            int i = this.zzlm.zzlu;
            if (i == 1) {
                calendar2.add(5, 1);
                calendar2.set(11, 0);
                return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            if (i == 2) {
                calendar2.add(4, 1);
                calendar2.set(7, 2);
                calendar2.set(11, 0);
                return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            if (i == 3) {
                calendar2.add(2, 1);
                calendar2.set(5, 1);
                calendar2.set(11, 0);
                return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            int i2 = this.zzlm.zzlu;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(24);
            sb.append("Invalid unit ");
            sb.append(i2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return timeUnit.convert(this.zzlk, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public java.lang.String getActivityName() {
        if (this.zzll.isEmpty() || this.zzll.size() > 1) {
            return null;
        }
        return com.google.android.gms.internal.fitness.zzjn.getName(this.zzll.get(0).intValue());
    }

    public com.google.android.gms.fitness.data.Goal.Recurrence getRecurrence() {
        return this.zzlm;
    }

    public int getObjectiveType() {
        return this.zzln;
    }

    private static java.lang.String zze(int i) {
        if (i == 0) {
            return "unknown";
        }
        if (i == 1) {
            return "metric";
        }
        if (i == 2) {
            return "duration";
        }
        if (i == 3) {
            return "frequency";
        }
        throw new java.lang.IllegalArgumentException("invalid objective type value");
    }

    public com.google.android.gms.fitness.data.Goal.MetricObjective getMetricObjective() {
        zzf(1);
        return this.zzlo;
    }

    public com.google.android.gms.fitness.data.Goal.DurationObjective getDurationObjective() {
        zzf(2);
        return this.zzlp;
    }

    public com.google.android.gms.fitness.data.Goal.FrequencyObjective getFrequencyObjective() {
        zzf(3);
        return this.zzlq;
    }

    Goal(long j, long j2, java.util.List<java.lang.Integer> list, com.google.android.gms.fitness.data.Goal.Recurrence recurrence, int i, com.google.android.gms.fitness.data.Goal.MetricObjective metricObjective, com.google.android.gms.fitness.data.Goal.DurationObjective durationObjective, com.google.android.gms.fitness.data.Goal.FrequencyObjective frequencyObjective) {
        this.zzlj = j;
        this.zzlk = j2;
        this.zzll = list;
        this.zzlm = recurrence;
        this.zzln = i;
        this.zzlo = metricObjective;
        this.zzlp = durationObjective;
        this.zzlq = frequencyObjective;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Goal)) {
            return false;
        }
        com.google.android.gms.fitness.data.Goal goal = (com.google.android.gms.fitness.data.Goal) obj;
        return this.zzlj == goal.zzlj && this.zzlk == goal.zzlk && com.google.android.gms.common.internal.Objects.equal(this.zzll, goal.zzll) && com.google.android.gms.common.internal.Objects.equal(this.zzlm, goal.zzlm) && this.zzln == goal.zzln && com.google.android.gms.common.internal.Objects.equal(this.zzlo, goal.zzlo) && com.google.android.gms.common.internal.Objects.equal(this.zzlp, goal.zzlp) && com.google.android.gms.common.internal.Objects.equal(this.zzlq, goal.zzlq);
    }

    public int hashCode() {
        return this.zzln;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("activity", getActivityName()).add("recurrence", this.zzlm).add("metricObjective", this.zzlo).add("durationObjective", this.zzlp).add("frequencyObjective", this.zzlq).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzlj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzlk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, this.zzll, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getRecurrence(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getObjectiveType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzlo, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzlp, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzlq, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private final void zzf(int i) throws com.google.android.gms.fitness.data.Goal.MismatchedGoalException {
        if (i != this.zzln) {
            throw new com.google.android.gms.fitness.data.Goal.MismatchedGoalException(java.lang.String.format("%s goal does not have %s objective", zze(this.zzln), zze(i)));
        }
    }
}
