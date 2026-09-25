package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: descriptorUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClassByFqName(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor resolveClassByFqName, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resolveClassByFqName, "$this$resolveClassByFqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lookupLocation, "lookupLocation");
        if (fqName.isRoot()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameParent = fqName.parent();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameParent, "fqName.parent()");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = resolveClassByFqName.getPackage(fqNameParent).getMemberScope();
        kotlin.reflect.jvm.internal.impl.name.Name nameShortName = fqName.shortName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameShortName, "fqName.shortName()");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier2 = memberScope.mo1270getContributedClassifier(nameShortName, lookupLocation);
        if (!(contributedClassifier2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            contributedClassifier2 = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier2;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameParent2 = fqName.parent();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameParent2, "fqName.parent()");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorResolveClassByFqName = resolveClassByFqName(resolveClassByFqName, fqNameParent2, lookupLocation);
        if (classDescriptorResolveClassByFqName == null || (unsubstitutedInnerClassesScope = classDescriptorResolveClassByFqName.getUnsubstitutedInnerClassesScope()) == null) {
            contributedClassifier = null;
        } else {
            kotlin.reflect.jvm.internal.impl.name.Name nameShortName2 = fqName.shortName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameShortName2, "fqName.shortName()");
            contributedClassifier = unsubstitutedInnerClassesScope.mo1270getContributedClassifier(nameShortName2, lookupLocation);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) (contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? contributedClassifier : null);
    }
}
