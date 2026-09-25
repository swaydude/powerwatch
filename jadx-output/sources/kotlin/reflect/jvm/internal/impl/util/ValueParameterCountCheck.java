package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ValueParameterCountCheck implements kotlin.reflect.jvm.internal.impl.util.Check {
    private final java.lang.String description;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class NoValueParameters extends kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    private ValueParameterCountCheck(java.lang.String str) {
        this.description = str;
    }

    public /* synthetic */ ValueParameterCountCheck(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public java.lang.String getDescription() {
        return this.description;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        return kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class SingleValueParameter extends kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class AtLeast extends kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck {
        private final int n;

        public AtLeast(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? "s" : "");
            super(sb.toString(), null);
            this.n = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() >= this.n;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class Equals extends kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck {
        private final int n;

        public Equals(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.n = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == this.n;
        }
    }
}
