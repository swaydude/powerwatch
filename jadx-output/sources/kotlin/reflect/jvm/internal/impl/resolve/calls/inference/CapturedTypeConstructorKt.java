package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CapturedTypeConstructorKt {
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType createCapturedType(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeProjection, "typeProjection");
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(kotlin.reflect.jvm.internal.impl.types.KotlinType isCaptured) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isCaptured, "$this$isCaptured");
        return isCaptured.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeSubstitution wrapWithCapturingSubstitution$default(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution wrapWithCapturingSubstitution(final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution wrapWithCapturingSubstitution, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(wrapWithCapturingSubstitution, "$this$wrapWithCapturingSubstitution");
        if (wrapWithCapturingSubstitution instanceof kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution) {
            kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution indexedParametersSubstitution = (kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution) wrapWithCapturingSubstitution;
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
            java.util.List<kotlin.Pair> listZip = kotlin.collections.ArraysKt.zip(indexedParametersSubstitution.getArguments(), indexedParametersSubstitution.getParameters());
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
            for (kotlin.Pair pair : listZip) {
                arrayList.add(createCapturedIfNeeded((kotlin.reflect.jvm.internal.impl.types.TypeProjection) pair.getFirst(), (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) pair.getSecond()));
            }
            java.lang.Object[] array = arrayList.toArray(new kotlin.reflect.jvm.internal.impl.types.TypeProjection[0]);
            if (array != null) {
                return new kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution(parameters, (kotlin.reflect.jvm.internal.impl.types.TypeProjection[]) array, z);
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return new kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution(wrapWithCapturingSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution.2
            @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return z;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: get */
            public kotlin.reflect.jvm.internal.impl.types.TypeProjection mo1273get(kotlin.reflect.jvm.internal.impl.types.KotlinType key) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
                kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionMo1273get = super.mo1273get(key);
                if (typeProjectionMo1273get == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = key.getConstructor().mo1268getDeclarationDescriptor();
                return kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.createCapturedIfNeeded(typeProjectionMo1273get, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor ? classifierDescriptorMo1268getDeclarationDescriptor : null));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection createCapturedIfNeeded(final kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() == typeProjection.getProjectionKind()) {
            if (typeProjection.isStarProjection()) {
                kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(storageManager, "LockBasedStorageManager.NO_LOCKS");
                return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(new kotlin.reflect.jvm.internal.impl.types.LazyWrappedType(storageManager, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.createCapturedIfNeeded.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke() {
                        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "this@createCapturedIfNeeded.type");
                        return type;
                    }
                }));
            }
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeProjection.getType());
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(createCapturedType(typeProjection));
    }
}
