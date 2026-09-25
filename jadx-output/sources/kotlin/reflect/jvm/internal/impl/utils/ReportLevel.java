package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: Jsr305State.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    public static final kotlin.reflect.jvm.internal.impl.utils.ReportLevel.Companion Companion = new kotlin.reflect.jvm.internal.impl.utils.ReportLevel.Companion(null);
    private final java.lang.String description;

    ReportLevel(java.lang.String str) {
        this.description = str;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    /* JADX INFO: compiled from: Jsr305State.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean isWarning() {
        return this == WARN;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }
}
