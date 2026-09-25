package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ErrorValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<kotlin.Unit> {
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion(null);

    public ErrorValue() {
        super(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.Unit getValue() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class ErrorValueWithMessage extends kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue {
        private final java.lang.String message;

        public ErrorValueWithMessage(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
            this.message = message;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType(this.message);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorType, "ErrorUtils.createErrorType(message)");
            return simpleTypeCreateErrorType;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public java.lang.String toString() {
            return this.message;
        }
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue create(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.ErrorValueWithMessage(message);
        }
    }
}
