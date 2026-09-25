package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeConstructorSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createByConstructorsMap(java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> map) {
        return kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.createByConstructorsMap$default(Companion, map, false, 2, null);
    }

    public abstract kotlin.reflect.jvm.internal.impl.types.TypeProjection get(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor);

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection mo1273get(kotlin.reflect.jvm.internal.impl.types.KotlinType key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return get(key.getConstructor());
    }

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createByConstructorsMap$default(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion companion, java.util.Map map, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.createByConstructorsMap(map, z);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createByConstructorsMap(final java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> map, final boolean z) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "map");
            return new kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public kotlin.reflect.jvm.internal.impl.types.TypeProjection get(kotlin.reflect.jvm.internal.impl.types.TypeConstructor key) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
                    return (kotlin.reflect.jvm.internal.impl.types.TypeProjection) map.get(key);
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean isEmpty() {
                    return map.isEmpty();
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateCapturedTypes() {
                    return z;
                }
            };
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinType, "kotlinType");
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "typeConstructor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "typeConstructor.parameters");
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) parameters);
            if (typeParameterDescriptor != null ? typeParameterDescriptor.isCapturedFromOuterDeclaration() : false) {
                kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion companion = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters2, "typeConstructor.parameters");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters2;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor it : list) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                    arrayList.add(it.getTypeConstructor());
                }
                return createByConstructorsMap$default(companion, kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(arrayList, arguments)), false, 2, null);
            }
            return new kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution(parameters, arguments);
        }
    }
}
