package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NewKotlinTypeChecker implements kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker();

    private NewKotlinTypeChecker() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.KotlinType subtype, kotlin.reflect.jvm.internal.impl.types.KotlinType supertype) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subtype, "subtype");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertype, "supertype");
        return isSubtypeOf(new kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext(true, false, 2, null), subtype.unwrap(), supertype.unwrap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean equalTypes(kotlin.reflect.jvm.internal.impl.types.KotlinType a, kotlin.reflect.jvm.internal.impl.types.KotlinType b) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        boolean z = false;
        return equalTypes(new kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext(z, z, 2, null), a.unwrap(), b.unwrap());
    }

    public final boolean equalTypes(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext equalTypes, kotlin.reflect.jvm.internal.impl.types.UnwrappedType a, kotlin.reflect.jvm.internal.impl.types.UnwrappedType b) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(equalTypes, "$this$equalTypes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE.equalTypes(equalTypes, a, b);
    }

    public final boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext isSubtypeOf, kotlin.reflect.jvm.internal.impl.types.UnwrappedType subType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType superType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSubtypeOf, "$this$isSubtypeOf");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subType, "subType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superType, "superType");
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE.isSubtypeOf(isSubtypeOf, subType, superType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType transformToNewType(kotlin.reflect.jvm.internal.impl.types.SimpleType type) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type2;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = type.getConstructor();
        java.lang.Object intersectionTypeConstructor = null;
        if (constructor instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl) {
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl capturedTypeConstructorImpl = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl) constructor;
            kotlin.reflect.jvm.internal.impl.types.TypeProjection projection = capturedTypeConstructorImpl.getProjection();
            if (!(projection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE)) {
                projection = null;
            }
            if (projection != null && (type2 = projection.getType()) != null) {
                intersectionTypeConstructor = type2.unwrap();
            }
            ?? r8 = intersectionTypeConstructor;
            if (capturedTypeConstructorImpl.getNewTypeConstructor() == null) {
                kotlin.reflect.jvm.internal.impl.types.TypeProjection projection2 = capturedTypeConstructorImpl.getProjection();
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = capturedTypeConstructorImpl.mo1269getSupertypes();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collectionMo1269getSupertypes, 10));
                java.util.Iterator it = collectionMo1269getSupertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).unwrap());
                }
                capturedTypeConstructorImpl.setNewTypeConstructor(new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor(projection2, arrayList));
            }
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING;
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newTypeConstructor = capturedTypeConstructorImpl.getNewTypeConstructor();
            if (newTypeConstructor == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(captureStatus, newTypeConstructor, r8, type.getAnnotations(), type.isMarkedNullable());
        }
        if (constructor instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor) {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes2 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor) constructor).mo1269getSupertypes();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collectionMo1269getSupertypes2, 10));
            java.util.Iterator it2 = collectionMo1269getSupertypes2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified((kotlin.reflect.jvm.internal.impl.types.KotlinType) it2.next(), type.isMarkedNullable()));
            }
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(type.getAnnotations(), new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(arrayList2), kotlin.collections.CollectionsKt.emptyList(), false, type.getMemberScope());
        }
        if (!(constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) || !type.isMarkedNullable()) {
            return type;
        }
        ?? r0 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) constructor;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes3 = r0.mo1269getSupertypes();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collectionMo1269getSupertypes3, 10));
        java.util.Iterator it3 = collectionMo1269getSupertypes3.iterator();
        boolean z = false;
        while (it3.hasNext()) {
            arrayList3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable((kotlin.reflect.jvm.internal.impl.types.KotlinType) it3.next()));
            z = true;
        }
        intersectionTypeConstructor = z ? new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(arrayList3) : null;
        if (intersectionTypeConstructor != null) {
            r0 = intersectionTypeConstructor;
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(type.getAnnotations(), (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) r0, kotlin.collections.CollectionsKt.emptyList(), false, r0.createScopeForKotlinType());
    }

    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType transformToNewType(kotlin.reflect.jvm.internal.impl.types.UnwrappedType type) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeFlexibleType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        if (type instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            simpleTypeFlexibleType = transformToNewType((kotlin.reflect.jvm.internal.impl.types.SimpleType) type);
        } else if (type instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) type;
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeTransformToNewType = transformToNewType(flexibleType.getLowerBound());
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeTransformToNewType2 = transformToNewType(flexibleType.getUpperBound());
            simpleTypeFlexibleType = (simpleTypeTransformToNewType == flexibleType.getLowerBound() && simpleTypeTransformToNewType2 == flexibleType.getUpperBound()) ? type : kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleTypeTransformToNewType, simpleTypeTransformToNewType2);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(simpleTypeFlexibleType, type);
    }
}
