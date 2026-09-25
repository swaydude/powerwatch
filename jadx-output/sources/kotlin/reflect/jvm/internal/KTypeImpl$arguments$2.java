package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KTypeImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "invoke"}, k = 3, mv = {1, 1, 15})
final class KTypeImpl$arguments$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.KTypeProjection>> {
    final /* synthetic */ kotlin.reflect.jvm.internal.KTypeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KTypeImpl$arguments$2(kotlin.reflect.jvm.internal.KTypeImpl kTypeImpl) {
        super(0);
        this.this$0 = kTypeImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.List<? extends kotlin.reflect.KTypeProjection> invoke() {
        kotlin.reflect.KTypeProjection kTypeProjectionInvariant;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = this.this$0.getType().getArguments();
        if (arguments.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.util.List<? extends java.lang.reflect.Type>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$parameterizedTypeArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends java.lang.reflect.Type> invoke() {
                return kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getParameterizedTypeArguments(this.this$0.this$0.getJavaType$kotlin_reflection());
            }
        });
        final kotlin.reflect.KProperty kProperty = kotlin.reflect.jvm.internal.KTypeImpl.$$delegatedProperties[3];
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> list = arguments;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        final int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) obj;
            if (typeProjection.isStarProjection()) {
                kTypeProjectionInvariant = kotlin.reflect.KTypeProjection.INSTANCE.getSTAR();
            } else {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "typeProjection.type");
                kotlin.reflect.jvm.internal.KTypeImpl kTypeImpl = new kotlin.reflect.jvm.internal.KTypeImpl(type, new kotlin.jvm.functions.Function0<java.lang.reflect.Type>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.reflect.Type invoke() {
                        java.lang.reflect.Type javaType$kotlin_reflection = this.this$0.getJavaType$kotlin_reflection();
                        if (javaType$kotlin_reflection instanceof java.lang.Class) {
                            java.lang.Class cls = (java.lang.Class) javaType$kotlin_reflection;
                            java.lang.Class<?> componentType = cls.isArray() ? cls.getComponentType() : java.lang.Object.class;
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(componentType, "if (javaType.isArray) ja…Type else Any::class.java");
                            return componentType;
                        }
                        if (javaType$kotlin_reflection instanceof java.lang.reflect.GenericArrayType) {
                            if (i != 0) {
                                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + this.this$0);
                            }
                            java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) javaType$kotlin_reflection).getGenericComponentType();
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericComponentType, "javaType.genericComponentType");
                            return genericComponentType;
                        }
                        if (javaType$kotlin_reflection instanceof java.lang.reflect.ParameterizedType) {
                            java.lang.reflect.Type type2 = (java.lang.reflect.Type) ((java.util.List) lazy.getValue()).get(i);
                            if (type2 instanceof java.lang.reflect.WildcardType) {
                                java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type2;
                                java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
                                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lowerBounds, "argument.lowerBounds");
                                java.lang.reflect.Type type3 = (java.lang.reflect.Type) kotlin.collections.ArraysKt.firstOrNull(lowerBounds);
                                if (type3 != null) {
                                    type2 = type3;
                                } else {
                                    java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "argument.upperBounds");
                                    type2 = (java.lang.reflect.Type) kotlin.collections.ArraysKt.first(upperBounds);
                                }
                            }
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "if (argument !is Wildcar…ument.upperBounds.first()");
                            return type2;
                        }
                        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + this.this$0);
                    }
                });
                int i3 = kotlin.reflect.jvm.internal.KTypeImpl.WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                if (i3 == 1) {
                    kTypeProjectionInvariant = kotlin.reflect.KTypeProjection.INSTANCE.invariant(kTypeImpl);
                } else if (i3 == 2) {
                    kTypeProjectionInvariant = kotlin.reflect.KTypeProjection.INSTANCE.contravariant(kTypeImpl);
                } else {
                    if (i3 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kTypeProjectionInvariant = kotlin.reflect.KTypeProjection.INSTANCE.covariant(kTypeImpl);
                }
            }
            arrayList.add(kTypeProjectionInvariant);
            i = i2;
        }
        return arrayList;
    }
}
