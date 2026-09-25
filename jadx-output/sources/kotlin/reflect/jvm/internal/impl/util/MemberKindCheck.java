package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MemberKindCheck implements kotlin.reflect.jvm.internal.impl.util.Check {
    private final java.lang.String description;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class MemberOrExtension extends kotlin.reflect.jvm.internal.impl.util.MemberKindCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension INSTANCE = new kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension();

        private MemberOrExtension() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.getDispatchReceiverParameter() == null && functionDescriptor.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    private MemberKindCheck(java.lang.String str) {
        this.description = str;
    }

    public /* synthetic */ MemberKindCheck(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
    public static final class Member extends kotlin.reflect.jvm.internal.impl.util.MemberKindCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.Member INSTANCE = new kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.Member();

        private Member() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getDispatchReceiverParameter() != null;
        }
    }
}
