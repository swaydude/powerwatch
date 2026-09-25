package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NewCapturedTypeKt {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType captureFromArguments$default(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function2 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.getDO_NOTHING_2();
        }
        return captureFromArguments(simpleType, captureStatus, function2);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType captureFromArguments(kotlin.reflect.jvm.internal.impl.types.SimpleType type, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus status, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType, kotlin.Unit> acceptNewCapturedType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(status, "status");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(acceptNewCapturedType, "acceptNewCapturedType");
        if (type.getArguments().size() != type.getConstructor().getParameters().size()) {
            return null;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = type.getArguments();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> list = arguments;
        boolean z = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT)) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionAsTypeProjection : list) {
            if (typeProjectionAsTypeProjection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                typeProjectionAsTypeProjection = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(status, (typeProjectionAsTypeProjection.isStarProjection() || typeProjectionAsTypeProjection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) ? null : typeProjectionAsTypeProjection.getType().unwrap(), typeProjectionAsTypeProjection));
            }
            arrayList.add(typeProjectionAsTypeProjection);
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorBuildSubstitutor = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(type.getConstructor(), arrayList2).buildSubstitutor();
        int size = arguments.size();
        for (int i = 0; i < size; i++) {
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = arguments.get(i);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) arrayList2.get(i);
            if (typeProjection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = type.getConstructor().getParameters().get(i);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameterDescriptor, "type.constructor.parameters[index]");
                java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "type.constructor.parameters[index].upperBounds");
                java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list2 = upperBounds;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.INSTANCE.transformToNewType(typeSubstitutorBuildSubstitutor.safeSubstitute((kotlin.reflect.jvm.internal.impl.types.KotlinType) it2.next(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT).unwrap()));
                }
                java.util.ArrayList arrayListPlus = arrayList3;
                if (!typeProjection.isStarProjection() && typeProjection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) {
                    arrayListPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType>) arrayListPlus, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.INSTANCE.transformToNewType(typeProjection.getType().unwrap()));
                }
                kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = typeProjection2.getType();
                if (type2 == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                }
                kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType newCapturedType = (kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) type2;
                newCapturedType.getConstructor().initializeSupertypes(arrayListPlus);
                acceptNewCapturedType.invoke(java.lang.Integer.valueOf(i), newCapturedType);
            }
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(type.getAnnotations(), type.getConstructor(), arrayList2, type.isMarkedNullable());
    }
}
