package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
final class SessionEvent {
    static final java.lang.String ACTIVITY_KEY = "activity";
    static final java.lang.String EXCEPTION_NAME_KEY = "exceptionName";
    static final java.lang.String INSTALLED_AT_KEY = "installedAt";
    static final java.lang.String SESSION_ID_KEY = "sessionId";
    public final java.util.Map<java.lang.String, java.lang.Object> customAttributes;
    public final java.lang.String customType;
    public final java.util.Map<java.lang.String, java.lang.String> details;
    public final java.util.Map<java.lang.String, java.lang.Object> predefinedAttributes;
    public final java.lang.String predefinedType;
    public final com.crashlytics.android.answers.SessionEventMetadata sessionEventMetadata;
    private java.lang.String stringRepresentation;
    public final long timestamp;
    public final com.crashlytics.android.answers.SessionEvent.Type type;

    enum Type {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    public static com.crashlytics.android.answers.SessionEvent.Builder lifecycleEventBuilder(com.crashlytics.android.answers.SessionEvent.Type type, android.app.Activity activity) {
        return new com.crashlytics.android.answers.SessionEvent.Builder(type).details(java.util.Collections.singletonMap(ACTIVITY_KEY, activity.getClass().getName()));
    }

    public static com.crashlytics.android.answers.SessionEvent.Builder installEventBuilder(long j) {
        return new com.crashlytics.android.answers.SessionEvent.Builder(com.crashlytics.android.answers.SessionEvent.Type.INSTALL).details(java.util.Collections.singletonMap(INSTALLED_AT_KEY, java.lang.String.valueOf(j)));
    }

    public static com.crashlytics.android.answers.SessionEvent.Builder crashEventBuilder(java.lang.String str) {
        return new com.crashlytics.android.answers.SessionEvent.Builder(com.crashlytics.android.answers.SessionEvent.Type.CRASH).details(java.util.Collections.singletonMap(SESSION_ID_KEY, str));
    }

    public static com.crashlytics.android.answers.SessionEvent.Builder crashEventBuilder(java.lang.String str, java.lang.String str2) {
        return crashEventBuilder(str).customAttributes(java.util.Collections.singletonMap(EXCEPTION_NAME_KEY, str2));
    }

    public static com.crashlytics.android.answers.SessionEvent.Builder customEventBuilder(com.crashlytics.android.answers.CustomEvent customEvent) {
        return new com.crashlytics.android.answers.SessionEvent.Builder(com.crashlytics.android.answers.SessionEvent.Type.CUSTOM).customType(customEvent.getCustomType()).customAttributes(customEvent.getCustomAttributes());
    }

    public static com.crashlytics.android.answers.SessionEvent.Builder predefinedEventBuilder(com.crashlytics.android.answers.PredefinedEvent<?> predefinedEvent) {
        return new com.crashlytics.android.answers.SessionEvent.Builder(com.crashlytics.android.answers.SessionEvent.Type.PREDEFINED).predefinedType(predefinedEvent.getPredefinedType()).predefinedAttributes(predefinedEvent.getPredefinedAttributes()).customAttributes(predefinedEvent.getCustomAttributes());
    }

    private SessionEvent(com.crashlytics.android.answers.SessionEventMetadata sessionEventMetadata, long j, com.crashlytics.android.answers.SessionEvent.Type type, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map2, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map3) {
        this.sessionEventMetadata = sessionEventMetadata;
        this.timestamp = j;
        this.type = type;
        this.details = map;
        this.customType = str;
        this.customAttributes = map2;
        this.predefinedType = str2;
        this.predefinedAttributes = map3;
    }

    static class Builder {
        final com.crashlytics.android.answers.SessionEvent.Type type;
        final long timestamp = java.lang.System.currentTimeMillis();
        java.util.Map<java.lang.String, java.lang.String> details = null;
        java.lang.String customType = null;
        java.util.Map<java.lang.String, java.lang.Object> customAttributes = null;
        java.lang.String predefinedType = null;
        java.util.Map<java.lang.String, java.lang.Object> predefinedAttributes = null;

        public Builder(com.crashlytics.android.answers.SessionEvent.Type type) {
            this.type = type;
        }

        public com.crashlytics.android.answers.SessionEvent.Builder details(java.util.Map<java.lang.String, java.lang.String> map) {
            this.details = map;
            return this;
        }

        public com.crashlytics.android.answers.SessionEvent.Builder customType(java.lang.String str) {
            this.customType = str;
            return this;
        }

        public com.crashlytics.android.answers.SessionEvent.Builder customAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.customAttributes = map;
            return this;
        }

        public com.crashlytics.android.answers.SessionEvent.Builder predefinedType(java.lang.String str) {
            this.predefinedType = str;
            return this;
        }

        public com.crashlytics.android.answers.SessionEvent.Builder predefinedAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.predefinedAttributes = map;
            return this;
        }

        public com.crashlytics.android.answers.SessionEvent build(com.crashlytics.android.answers.SessionEventMetadata sessionEventMetadata) {
            return new com.crashlytics.android.answers.SessionEvent(sessionEventMetadata, this.timestamp, this.type, this.details, this.customType, this.customAttributes, this.predefinedType, this.predefinedAttributes);
        }
    }

    public java.lang.String toString() {
        if (this.stringRepresentation == null) {
            this.stringRepresentation = "[" + getClass().getSimpleName() + ": timestamp=" + this.timestamp + ", type=" + this.type + ", details=" + this.details + ", customType=" + this.customType + ", customAttributes=" + this.customAttributes + ", predefinedType=" + this.predefinedType + ", predefinedAttributes=" + this.predefinedAttributes + ", metadata=[" + this.sessionEventMetadata + "]]";
        }
        return this.stringRepresentation;
    }
}
