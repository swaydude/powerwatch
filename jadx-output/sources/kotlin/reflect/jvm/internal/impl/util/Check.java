package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Check {
    boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor);

    java.lang.String getDescription();

    java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor);

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class DefaultImpls {
        public static java.lang.String invoke(kotlin.reflect.jvm.internal.impl.util.Check check, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
            if (check.check(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }
}
