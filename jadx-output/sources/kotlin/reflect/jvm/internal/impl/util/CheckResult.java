package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CheckResult {
    private final boolean isSuccess;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class IllegalSignature extends kotlin.reflect.jvm.internal.impl.util.CheckResult {
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(java.lang.String error) {
            super(false, null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(error, "error");
            this.error = error;
        }
    }

    private CheckResult(boolean z) {
        this.isSuccess = z;
    }

    public /* synthetic */ CheckResult(boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class IllegalFunctionName extends kotlin.reflect.jvm.internal.impl.util.CheckResult {
        public static final kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalFunctionName INSTANCE = new kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalFunctionName();

        private IllegalFunctionName() {
            super(false, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class SuccessCheck extends kotlin.reflect.jvm.internal.impl.util.CheckResult {
        public static final kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck INSTANCE = new kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck();

        private SuccessCheck() {
            super(true, null);
        }
    }
}
