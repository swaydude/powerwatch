package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: DeserializedClassDataFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedClassDataFinder implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder {
    private final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider;

    public DeserializedClassDataFinder(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFragmentProvider, "packageFragmentProvider");
        this.packageFragmentProvider = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData findClassData(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classDataFindClassData;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider = this.packageFragmentProvider;
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "classId.packageFqName");
        for (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor : packageFragmentProvider.getPackageFragments(packageFqName)) {
            if ((packageFragmentDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) && (classDataFindClassData = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) packageFragmentDescriptor).getClassDataFinder().findClassData(classId)) != null) {
                return classDataFindClassData;
            }
        }
        return null;
    }
}
