package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractModifierChecks {
    public abstract java.util.List<kotlin.reflect.jvm.internal.impl.util.Checks> getChecks$descriptors();

    public final kotlin.reflect.jvm.internal.impl.util.CheckResult check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        for (kotlin.reflect.jvm.internal.impl.util.Checks checks : getChecks$descriptors()) {
            if (checks.isApplicable(functionDescriptor)) {
                return checks.checkAll(functionDescriptor);
            }
        }
        return kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalFunctionName.INSTANCE;
    }
}
