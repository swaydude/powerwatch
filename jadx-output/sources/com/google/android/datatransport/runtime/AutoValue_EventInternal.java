package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EventInternal extends com.google.android.datatransport.runtime.EventInternal {
    private final java.util.Map<java.lang.String, java.lang.String> autoMetadata;
    private final java.lang.Integer code;
    private final com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
    private final long eventMillis;
    private final java.lang.String transportName;
    private final long uptimeMillis;

    private AutoValue_EventInternal(java.lang.String str, java.lang.Integer num, com.google.android.datatransport.runtime.EncodedPayload encodedPayload, long j, long j2, java.util.Map<java.lang.String, java.lang.String> map) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = encodedPayload;
        this.eventMillis = j;
        this.uptimeMillis = j2;
        this.autoMetadata = map;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.String getTransportName() {
        return this.transportName;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public com.google.android.datatransport.runtime.EncodedPayload getEncodedPayload() {
        return this.encodedPayload;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.eventMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    protected java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
        return this.autoMetadata;
    }

    public java.lang.String toString() {
        return "EventInternal{transportName=" + this.transportName + ", code=" + this.code + ", encodedPayload=" + this.encodedPayload + ", eventMillis=" + this.eventMillis + ", uptimeMillis=" + this.uptimeMillis + ", autoMetadata=" + this.autoMetadata + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.EventInternal)) {
            return false;
        }
        com.google.android.datatransport.runtime.EventInternal eventInternal = (com.google.android.datatransport.runtime.EventInternal) obj;
        return this.transportName.equals(eventInternal.getTransportName()) && ((num = this.code) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.encodedPayload.equals(eventInternal.getEncodedPayload()) && this.eventMillis == eventInternal.getEventMillis() && this.uptimeMillis == eventInternal.getUptimeMillis() && this.autoMetadata.equals(eventInternal.getAutoMetadata());
    }

    public int hashCode() {
        int iHashCode = (this.transportName.hashCode() ^ 1000003) * 1000003;
        java.lang.Integer num = this.code;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.encodedPayload.hashCode()) * 1000003;
        long j = this.eventMillis;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.uptimeMillis;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.autoMetadata.hashCode();
    }

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    static final class Builder extends com.google.android.datatransport.runtime.EventInternal.Builder {
        private java.util.Map<java.lang.String, java.lang.String> autoMetadata;
        private java.lang.Integer code;
        private com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
        private java.lang.Long eventMillis;
        private java.lang.String transportName;
        private java.lang.Long uptimeMillis;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setTransportName(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "Null transportName");
            this.transportName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setCode(java.lang.Integer num) {
            this.code = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setEncodedPayload(com.google.android.datatransport.runtime.EncodedPayload encodedPayload) {
            java.util.Objects.requireNonNull(encodedPayload, "Null encodedPayload");
            this.encodedPayload = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setEventMillis(long j) {
            this.eventMillis = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setUptimeMillis(long j) {
            this.uptimeMillis = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected com.google.android.datatransport.runtime.EventInternal.Builder setAutoMetadata(java.util.Map<java.lang.String, java.lang.String> map) {
            java.util.Objects.requireNonNull(map, "Null autoMetadata");
            this.autoMetadata = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
            java.util.Map<java.lang.String, java.lang.String> map = this.autoMetadata;
            if (map != null) {
                return map;
            }
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal build() {
            java.lang.String str = "";
            if (this.transportName == null) {
                str = " transportName";
            }
            if (this.encodedPayload == null) {
                str = str + " encodedPayload";
            }
            if (this.eventMillis == null) {
                str = str + " eventMillis";
            }
            if (this.uptimeMillis == null) {
                str = str + " uptimeMillis";
            }
            if (this.autoMetadata == null) {
                str = str + " autoMetadata";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.runtime.AutoValue_EventInternal(this.transportName, this.code, this.encodedPayload, this.eventMillis.longValue(), this.uptimeMillis.longValue(), this.autoMetadata);
        }
    }
}
