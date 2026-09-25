package kotlin.reflect.full;

/* JADX INFO: compiled from: KClassifiers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\u001a.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a6\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0007\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"starProjectedType", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClassifier;", "starProjectedType$annotations", "(Lkotlin/reflect/KClassifier;)V", "getStarProjectedType", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KType;", "createKotlinType", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "typeAnnotations", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotations;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "nullable", "", "createType", "annotations", "", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KClassifiers {

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.KVariance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.KVariance.INVARIANT.ordinal()] = 1;
            iArr[kotlin.reflect.KVariance.IN.ordinal()] = 2;
            iArr[kotlin.reflect.KVariance.OUT.ordinal()] = 3;
        }
    }

    public static /* synthetic */ void starProjectedType$annotations(kotlin.reflect.KClassifier kClassifier) {
    }

    public static /* synthetic */ kotlin.reflect.KType createType$default(kotlin.reflect.KClassifier kClassifier, java.util.List list, boolean z, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return createType(kClassifier, list, z, list2);
    }

    public static final kotlin.reflect.KType createType(final kotlin.reflect.KClassifier createType, java.util.List<kotlin.reflect.KTypeProjection> arguments, boolean z, java.util.List<? extends java.lang.annotation.Annotation> annotations) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor descriptor;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(createType, "$this$createType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.reflect.jvm.internal.KClassifierImpl kClassifierImpl = (kotlin.reflect.jvm.internal.KClassifierImpl) (!(createType instanceof kotlin.reflect.jvm.internal.KClassifierImpl) ? null : createType);
        if (kClassifierImpl == null || (descriptor = kClassifierImpl.getDescriptor()) == null) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + createType + " (" + createType.getClass() + ')');
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "descriptor.typeConstructor");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "typeConstructor.parameters");
        if (parameters.size() != arguments.size()) {
            throw new java.lang.IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        return new kotlin.reflect.jvm.internal.KTypeImpl(createKotlinType(annotations.isEmpty() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY() : kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), typeConstructor, arguments, z), new kotlin.jvm.functions.Function0() { // from class: kotlin.reflect.full.KClassifiers.createType.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Void invoke() {
                throw new kotlin.NotImplementedError("An operation is not implemented: " + ("Java type is not yet supported for types created with createType (classifier = " + createType + ')'));
            }
        });
    }

    private static final kotlin.reflect.jvm.internal.impl.types.SimpleType createKotlinType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase typeProjectionImpl;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "typeConstructor.parameters");
        java.util.List<kotlin.reflect.KTypeProjection> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (java.lang.Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.KTypeProjection kTypeProjection = (kotlin.reflect.KTypeProjection) obj;
            kotlin.reflect.jvm.internal.KTypeImpl kTypeImpl = (kotlin.reflect.jvm.internal.KTypeImpl) kTypeProjection.getType();
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = kTypeImpl != null ? kTypeImpl.getType() : null;
            kotlin.reflect.KVariance variance = kTypeProjection.getVariance();
            if (variance != null) {
                int i3 = kotlin.reflect.full.KClassifiers.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
                if (i3 == 1) {
                    kotlin.reflect.jvm.internal.impl.types.Variance variance2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
                    if (type == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance2, type);
                } else if (i3 == 2) {
                    kotlin.reflect.jvm.internal.impl.types.Variance variance3 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
                    if (type == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance3, type);
                } else if (i3 == 3) {
                    kotlin.reflect.jvm.internal.impl.types.Variance variance4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
                    if (type == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance4, type);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = parameters.get(i);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameterDescriptor, "parameters[index]");
                typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor);
            }
            arrayList.add(typeProjectionImpl);
            i = i2;
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(annotations, typeConstructor, arrayList, z);
    }

    public static final kotlin.reflect.KType getStarProjectedType(kotlin.reflect.KClassifier starProjectedType) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor descriptor;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(starProjectedType, "$this$starProjectedType");
        kotlin.reflect.jvm.internal.KClassifierImpl kClassifierImpl = (kotlin.reflect.jvm.internal.KClassifierImpl) (!(starProjectedType instanceof kotlin.reflect.jvm.internal.KClassifierImpl) ? null : starProjectedType);
        if (kClassifierImpl == null || (descriptor = kClassifierImpl.getDescriptor()) == null) {
            return createType$default(starProjectedType, null, false, null, 7, null);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "descriptor.typeConstructor");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "descriptor.typeConstructor.parameters");
        if (parameters.isEmpty()) {
            return createType$default(starProjectedType, null, false, null, 7, null);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            arrayList.add(kotlin.reflect.KTypeProjection.INSTANCE.getSTAR());
        }
        return createType$default(starProjectedType, arrayList, false, null, 6, null);
    }
}
