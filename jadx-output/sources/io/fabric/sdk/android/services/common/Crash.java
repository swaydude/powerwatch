package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Crash {
    private static final java.lang.String UNKNOWN_EXCEPTION = "<unknown>";
    private final java.lang.String exceptionName;
    private final java.lang.String sessionId;

    public Crash(java.lang.String str) {
        this(str, UNKNOWN_EXCEPTION);
    }

    public Crash(java.lang.String str, java.lang.String str2) {
        this.sessionId = str;
        this.exceptionName = str2;
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    public java.lang.String getExceptionName() {
        return this.exceptionName;
    }

    public static class LoggedException extends io.fabric.sdk.android.services.common.Crash {
        public LoggedException(java.lang.String str) {
            super(str);
        }

        public LoggedException(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class FatalException extends io.fabric.sdk.android.services.common.Crash {
        public FatalException(java.lang.String str) {
            super(str);
        }

        public FatalException(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }
}
