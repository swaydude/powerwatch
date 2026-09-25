package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IndexedParametersSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    private final boolean approximateCapturedTypes;
    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection[] arguments;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] parameters;

    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] getParameters() {
        return this.parameters;
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection[] getArguments() {
        return this.arguments;
    }

    public /* synthetic */ IndexedParametersSubstitution(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] typeParameterDescriptorArr, kotlin.reflect.jvm.internal.impl.types.TypeProjection[] typeProjectionArr, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i & 4) != 0 ? false : z);
    }

    public IndexedParametersSubstitution(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] parameters, kotlin.reflect.jvm.internal.impl.types.TypeProjection[] arguments, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        this.parameters = parameters;
        this.arguments = arguments;
        this.approximateCapturedTypes = z;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IndexedParametersSubstitution(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> argumentsList) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(argumentsList, "argumentsList");
        java.lang.Object[] array = parameters.toArray(new kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[0]);
        if (array == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] typeParameterDescriptorArr = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[]) array;
        java.lang.Object[] array2 = argumentsList.toArray(new kotlin.reflect.jvm.internal.impl.types.TypeProjection[0]);
        if (array2 != null) {
            this(typeParameterDescriptorArr, (kotlin.reflect.jvm.internal.impl.types.TypeProjection[]) array2, false, 4, null);
            return;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.arguments.length == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.approximateCapturedTypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection mo1273get(kotlin.reflect.jvm.internal.impl.types.KotlinType key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = key.getConstructor().mo1268getDeclarationDescriptor();
        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
            classifierDescriptorMo1268getDeclarationDescriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
        if (typeParameterDescriptor != null) {
            int index = typeParameterDescriptor.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] typeParameterDescriptorArr = this.parameters;
            if (index < typeParameterDescriptorArr.length && kotlin.jvm.internal.Intrinsics.areEqual(typeParameterDescriptorArr[index].getTypeConstructor(), typeParameterDescriptor.getTypeConstructor())) {
                return this.arguments[index];
            }
        }
        return null;
    }
}
