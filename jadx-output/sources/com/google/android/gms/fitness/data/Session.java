package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class Session extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Session> CREATOR = new com.google.android.gms.fitness.data.zzae();
    public static final java.lang.String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final java.lang.String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
    private final java.lang.String description;
    private final java.lang.String name;
    private final long zzib;
    private final long zzic;
    private final int zzip;
    private final com.google.android.gms.fitness.data.zzc zzjg;
    private final java.lang.String zzma;
    private final java.lang.Long zzmb;

    public Session(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, com.google.android.gms.fitness.data.zzc zzcVar, java.lang.Long l) {
        this.zzib = j;
        this.zzic = j2;
        this.name = str;
        this.zzma = str2;
        this.description = str3;
        this.zzip = i;
        this.zzjg = zzcVar;
        this.zzmb = l;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class Builder {
        private java.lang.Long zzmb;
        private long zzib = 0;
        private long zzic = 0;
        private java.lang.String name = null;
        private java.lang.String zzma = null;
        private java.lang.String description = "";
        private int zzip = 4;

        public com.google.android.gms.fitness.data.Session.Builder setStartTime(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkState(j > 0, "Start time should be positive.");
            this.zzib = timeUnit.toMillis(j);
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setEndTime(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkState(j >= 0, "End time should be positive.");
            this.zzic = timeUnit.toMillis(j);
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setName(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str.length() <= 100, "Session name cannot exceed %d characters", 100);
            this.name = str;
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setIdentifier(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str != null && android.text.TextUtils.getTrimmedLength(str) > 0);
            this.zzma = str;
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setDescription(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str.length() <= 1000, "Session description cannot exceed %d characters", 1000);
            this.description = str;
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setActivity(java.lang.String str) {
            this.zzip = com.google.android.gms.internal.fitness.zzjn.zzp(str);
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setActiveTime(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.zzmb = java.lang.Long.valueOf(timeUnit.toMillis(j));
            return this;
        }

        public com.google.android.gms.fitness.data.Session build() {
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzib > 0, "Start time should be specified.");
            long j = this.zzic;
            if (j != 0 && j <= this.zzib) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "End time should be later than start time.");
            if (this.zzma == null) {
                java.lang.String str = this.name;
                if (str == null) {
                    str = "";
                }
                long j2 = this.zzib;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 20);
                sb.append(str);
                sb.append(j2);
                this.zzma = sb.toString();
            }
            return new com.google.android.gms.fitness.data.Session(this);
        }
    }

    private Session(com.google.android.gms.fitness.data.Session.Builder builder) {
        this(builder.zzib, builder.zzic, builder.name, builder.zzma, builder.description, builder.zzip, null, builder.zzmb);
    }

    public static com.google.android.gms.fitness.data.Session extract(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return (com.google.android.gms.fitness.data.Session) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_SESSION, CREATOR);
    }

    public static java.lang.String getMimeType(java.lang.String str) {
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        return strValueOf.length() != 0 ? MIME_TYPE_PREFIX.concat(strValueOf) : new java.lang.String(MIME_TYPE_PREFIX);
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzib, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzic, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public long getActiveTime(java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzmb != null, "Active time is not set");
        return timeUnit.convert(this.zzmb.longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public boolean hasActiveTime() {
        return this.zzmb != null;
    }

    public boolean isOngoing() {
        return this.zzic == 0;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getIdentifier() {
        return this.zzma;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getActivity() {
        return com.google.android.gms.internal.fitness.zzjn.getName(this.zzip);
    }

    public java.lang.String getAppPackageName() {
        com.google.android.gms.fitness.data.zzc zzcVar = this.zzjg;
        if (zzcVar == null) {
            return null;
        }
        return zzcVar.getPackageName();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Session)) {
            return false;
        }
        com.google.android.gms.fitness.data.Session session = (com.google.android.gms.fitness.data.Session) obj;
        return this.zzib == session.zzib && this.zzic == session.zzic && com.google.android.gms.common.internal.Objects.equal(this.name, session.name) && com.google.android.gms.common.internal.Objects.equal(this.zzma, session.zzma) && com.google.android.gms.common.internal.Objects.equal(this.description, session.description) && com.google.android.gms.common.internal.Objects.equal(this.zzjg, session.zzjg) && this.zzip == session.zzip;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzib), java.lang.Long.valueOf(this.zzic), this.zzma);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTime", java.lang.Long.valueOf(this.zzib)).add("endTime", java.lang.Long.valueOf(this.zzic)).add(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).add(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_IDENTIFIER_KEY, this.zzma).add("description", this.description).add("activity", java.lang.Integer.valueOf(this.zzip)).add("application", this.zzjg).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zzib);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzic);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getIdentifier(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getDescription(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzip);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzjg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 9, this.zzmb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
