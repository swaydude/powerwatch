package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ContextKt {
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext child(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext child, kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver typeParameterResolver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(child, "$this$child");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameterResolver, "typeParameterResolver");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(child.getComponents(), typeParameterResolver, child.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext computeNewDefaultTypeQualifiers, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations additionalAnnotations) {
        java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus> nullabilityQualifiers;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computeNewDefaultTypeQualifiers, "$this$computeNewDefaultTypeQualifiers");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalAnnotations, "additionalAnnotations");
        if (computeNewDefaultTypeQualifiers.getComponents().getAnnotationTypeQualifierResolver().getDisabled()) {
            return computeNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = additionalAnnotations.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability nullabilityQualifierWithApplicabilityExtractDefaultNullabilityQualifier = extractDefaultNullabilityQualifier(computeNewDefaultTypeQualifiers, it.next());
            if (nullabilityQualifierWithApplicabilityExtractDefaultNullabilityQualifier != null) {
                arrayList.add(nullabilityQualifierWithApplicabilityExtractDefaultNullabilityQualifier);
            }
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return computeNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType defaultTypeQualifiers = computeNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
        java.util.EnumMap enumMap = (defaultTypeQualifiers == null || (nullabilityQualifiers = defaultTypeQualifiers.getNullabilityQualifiers()) == null) ? new java.util.EnumMap(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.class) : new java.util.EnumMap((java.util.EnumMap) nullabilityQualifiers);
        boolean z = false;
        for (kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability : arrayList2) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusComponent1 = nullabilityQualifierWithApplicability.component1();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> it2 = nullabilityQualifierWithApplicability.component2().iterator();
            while (it2.hasNext()) {
                enumMap.put(it2.next(), nullabilityQualifierWithMigrationStatusComponent1);
                z = true;
            }
        }
        return !z ? computeNewDefaultTypeQualifiers.getDefaultTypeQualifiers() : new kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType(enumMap);
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability extractDefaultNullabilityQualifier(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusCopy$default;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver annotationTypeQualifierResolver = lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability nullabilityQualifierWithApplicabilityResolveQualifierBuiltInDefaultAnnotation = annotationTypeQualifierResolver.resolveQualifierBuiltInDefaultAnnotation(annotationDescriptor);
        if (nullabilityQualifierWithApplicabilityResolveQualifierBuiltInDefaultAnnotation != null) {
            return nullabilityQualifierWithApplicabilityResolveQualifierBuiltInDefaultAnnotation;
        }
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.TypeQualifierWithApplicability typeQualifierWithApplicabilityResolveTypeQualifierDefaultAnnotation = annotationTypeQualifierResolver.resolveTypeQualifierDefaultAnnotation(annotationDescriptor);
        if (typeQualifierWithApplicabilityResolveTypeQualifierDefaultAnnotation != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorComponent1 = typeQualifierWithApplicabilityResolveTypeQualifierDefaultAnnotation.component1();
            java.util.List<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType> listComponent2 = typeQualifierWithApplicabilityResolveTypeQualifierDefaultAnnotation.component2();
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel reportLevelResolveJsr305CustomState = annotationTypeQualifierResolver.resolveJsr305CustomState(annotationDescriptor);
            if (reportLevelResolveJsr305CustomState == null) {
                reportLevelResolveJsr305CustomState = annotationTypeQualifierResolver.resolveJsr305AnnotationState(annotationDescriptorComponent1);
            }
            if (!reportLevelResolveJsr305CustomState.isIgnore() && (nullabilityQualifierWithMigrationStatusExtractNullability = lazyJavaResolverContext.getComponents().getSignatureEnhancement().extractNullability(annotationDescriptorComponent1)) != null && (nullabilityQualifierWithMigrationStatusCopy$default = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusExtractNullability, null, reportLevelResolveJsr305CustomState.isWarning(), 1, null)) != null) {
                return new kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability(nullabilityQualifierWithMigrationStatusCopy$default, listComponent2);
            }
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext replaceComponents(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext replaceComponents, kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents components) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replaceComponents, "$this$replaceComponents");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(components, "components");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(components, replaceComponents.getTypeParameterResolver(), replaceComponents.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext child(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i, kotlin.Lazy<kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType> lazy) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver typeParameterResolver;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents components = lazyJavaResolverContext.getComponents();
        if (javaTypeParameterListOwner != null) {
            typeParameterResolver = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
        } else {
            typeParameterResolver = lazyJavaResolverContext.getTypeParameterResolver();
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(components, typeParameterResolver, lazy);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForMethod$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForMethod(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForMethod, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner typeParameterOwner, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(childForMethod, "$this$childForMethod");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameterOwner, "typeParameterOwner");
        return child(childForMethod, containingDeclaration, typeParameterOwner, i, childForMethod.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForClassOrPackage$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            javaTypeParameterListOwner = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForClassOrPackage(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForClassOrPackage, final kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(childForClassOrPackage, "$this$childForClassOrPackage");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
        return child(childForClassOrPackage, containingDeclaration, javaTypeParameterListOwner, i, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForClassOrPackage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.computeNewDefaultTypeQualifiers(childForClassOrPackage, containingDeclaration.getAnnotations());
            }
        }));
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext copyWithNewDefaultTypeQualifiers, final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations additionalAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(copyWithNewDefaultTypeQualifiers, "$this$copyWithNewDefaultTypeQualifiers");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? copyWithNewDefaultTypeQualifiers : new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(copyWithNewDefaultTypeQualifiers.getComponents(), copyWithNewDefaultTypeQualifiers.getTypeParameterResolver(), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.computeNewDefaultTypeQualifiers(copyWithNewDefaultTypeQualifiers, additionalAnnotations);
            }
        }));
    }
}
