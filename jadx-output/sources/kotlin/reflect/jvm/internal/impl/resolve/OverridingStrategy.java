package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: compiled from: OverridingStrategy.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OverridingStrategy {
    public abstract void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor);

    public abstract void inheritanceConflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void overrideConflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2);

    public void setOverriddenDescriptors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor member, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overridden) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(member, "member");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(overridden, "overridden");
        member.setOverriddenDescriptors(overridden);
    }
}
