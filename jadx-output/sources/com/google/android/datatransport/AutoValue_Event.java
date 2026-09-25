package com.google.android.datatransport;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Event<T> extends com.google.android.datatransport.Event<T> {
    private final java.lang.Integer code;
    private final T payload;
    private final com.google.android.datatransport.Priority priority;

    AutoValue_Event(java.lang.Integer num, T t, com.google.android.datatransport.Priority priority) {
        this.code = num;
        java.util.Objects.requireNonNull(t, "Null payload");
        this.payload = t;
        java.util.Objects.requireNonNull(priority, "Null priority");
        this.priority = priority;
    }

    @Override // com.google.android.datatransport.Event
    public java.lang.Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public com.google.android.datatransport.Priority getPriority() {
        return this.priority;
    }

    public java.lang.String toString() {
        return "Event{code=" + this.code + ", payload=" + this.payload + ", priority=" + this.priority + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.Event)) {
            return false;
        }
        com.google.android.datatransport.Event event = (com.google.android.datatransport.Event) obj;
        java.lang.Integer num = this.code;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.payload.equals(event.getPayload()) && this.priority.equals(event.getPriority())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Integer num = this.code;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode();
    }
}
