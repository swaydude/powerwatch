package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: compiled from: VisibilityUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VisibilityUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor findMemberWithMaxVisibility(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> descriptors) {
        java.lang.Integer numCompare;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptors, "descriptors");
        descriptors.isEmpty();
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) null;
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 : descriptors) {
            if (callableMemberDescriptor == null || ((numCompare = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.compare(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && numCompare.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        if (callableMemberDescriptor == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return callableMemberDescriptor;
    }
}
