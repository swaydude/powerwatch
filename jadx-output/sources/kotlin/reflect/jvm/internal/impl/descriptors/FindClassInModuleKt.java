package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: findClassInModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FindClassInModuleKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor findClassAcrossModuleDependencies, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(findClassAcrossModuleDependencies, "$this$findClassAcrossModuleDependencies");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "classId.packageFqName");
        kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor = findClassAcrossModuleDependencies.getPackage(packageFqName);
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> listPathSegments = classId.getRelativeClassName().pathSegments();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(listPathSegments, "classId.relativeClassName.pathSegments()");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = packageViewDescriptor.getMemberScope();
        java.lang.Object objFirst = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) listPathSegments);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objFirst, "segments.first()");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = memberScope.mo1270getContributedClassifier((kotlin.reflect.jvm.internal.impl.name.Name) objFirst, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
        if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            contributedClassifier = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
        if (classDescriptor == null) {
            return null;
        }
        for (kotlin.reflect.jvm.internal.impl.name.Name name : listPathSegments.subList(1, listPathSegments.size())) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier2 = unsubstitutedInnerClassesScope.mo1270getContributedClassifier(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
            if (!(contributedClassifier2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                contributedClassifier2 = null;
            }
            classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier2;
            if (classDescriptor == null) {
                return null;
            }
        }
        return classDescriptor;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findNonGenericClassAcrossDependencies(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor findNonGenericClassAcrossDependencies, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(findNonGenericClassAcrossDependencies, "$this$findNonGenericClassAcrossDependencies");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(notFoundClasses, "notFoundClasses");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(findNonGenericClassAcrossDependencies, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.generateSequence(classId, kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.INSTANCE), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.ClassId, java.lang.Integer>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2(kotlin.reflect.jvm.internal.impl.name.ClassId it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return 0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(kotlin.reflect.jvm.internal.impl.name.ClassId classId2) {
                return java.lang.Integer.valueOf(invoke2(classId2));
            }
        })));
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor findTypeAliasAcrossModuleDependencies, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(findTypeAliasAcrossModuleDependencies, "$this$findTypeAliasAcrossModuleDependencies");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "classId.packageFqName");
        kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor = findTypeAliasAcrossModuleDependencies.getPackage(packageFqName);
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> listPathSegments = classId.getRelativeClassName().pathSegments();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(listPathSegments, "classId.relativeClassName.pathSegments()");
        int size = listPathSegments.size() - 1;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = packageViewDescriptor.getMemberScope();
        java.lang.Object objFirst = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) listPathSegments);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objFirst, "segments.first()");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = memberScope.mo1270getContributedClassifier((kotlin.reflect.jvm.internal.impl.name.Name) objFirst, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
        if (size == 0) {
            if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor)) {
                contributedClassifier = null;
            }
            return (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) contributedClassifier;
        }
        if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            contributedClassifier = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
        if (classDescriptor == null) {
            return null;
        }
        for (kotlin.reflect.jvm.internal.impl.name.Name name : listPathSegments.subList(1, size)) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier2 = unsubstitutedInnerClassesScope.mo1270getContributedClassifier(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
            if (!(contributedClassifier2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                contributedClassifier2 = null;
            }
            classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier2;
            if (classDescriptor == null) {
                return null;
            }
        }
        kotlin.reflect.jvm.internal.impl.name.Name lastName = listPathSegments.get(size);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = classDescriptor.getUnsubstitutedMemberScope();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lastName, "lastName");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier3 = unsubstitutedMemberScope.mo1270getContributedClassifier(lastName, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
        return (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) (contributedClassifier3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor ? contributedClassifier3 : null);
    }
}
