package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: compiled from: OverridingStrategy.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NonReportingOverrideStrategy extends kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy {
    protected abstract void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void overrideConflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor fromSuper, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor fromCurrent) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fromSuper, "fromSuper");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fromCurrent, "fromCurrent");
        conflict(fromSuper, fromCurrent);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void inheritanceConflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor first, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor second) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(first, "first");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(second, "second");
        conflict(first, second);
    }
}
