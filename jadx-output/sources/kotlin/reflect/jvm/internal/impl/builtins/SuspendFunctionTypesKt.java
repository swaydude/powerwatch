package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: compiled from: suspendFunctionTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SuspendFunctionTypesKt {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL;
    private static final kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE;

    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor getFAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL() {
        return FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL;
    }

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor errorModule = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.getErrorModule();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(errorModule, "ErrorUtils.getErrorModule()");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor mutableClassDescriptor = new kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor(new kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor(errorModule, fqName), kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE, false, false, kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL.shortName(), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS);
        mutableClassDescriptor.setModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT);
        mutableClassDescriptor.setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC);
        mutableClassDescriptor.setTypeParameterDescriptors(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), false, kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE, kotlin.reflect.jvm.internal.impl.name.Name.identifier("T"), 0)));
        mutableClassDescriptor.createTypeConstructor();
        FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL = mutableClassDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor errorModule2 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.getErrorModule();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(errorModule2, "ErrorUtils.getErrorModule()");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor mutableClassDescriptor2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor(new kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor(errorModule2, fqName2), kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE, false, false, kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_RELEASE.shortName(), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS);
        mutableClassDescriptor2.setModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT);
        mutableClassDescriptor2.setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC);
        mutableClassDescriptor2.setTypeParameterDescriptors(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), false, kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE, kotlin.reflect.jvm.internal.impl.name.Name.identifier("T"), 0)));
        mutableClassDescriptor2.createTypeConstructor();
        FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE = mutableClassDescriptor2;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor getFAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE() {
        return FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType transformSuspendFunctionToRuntimeFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType suspendFunType, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(suspendFunType, "suspendFunType");
        kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(suspendFunType);
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(suspendFunType);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = suspendFunType.getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverTypeFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReceiverTypeFromFunctionType(suspendFunType);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> valueParameterTypesFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(suspendFunType);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(valueParameterTypesFromFunctionType, 10));
        java.util.Iterator<T> it = valueParameterTypesFromFunctionType.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getType());
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        if (z) {
            typeConstructor = FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE.getTypeConstructor();
        } else {
            typeConstructor = FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL.getTypeConstructor();
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
        java.util.List listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType>) arrayList2, kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(empty, typeConstructor, kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReturnTypeFromFunctionType(suspendFunType))), false));
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(suspendFunType).getNullableAnyType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nullableAnyType, "suspendFunType.builtIns.nullableAnyType");
        return kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, listPlus, null, nullableAnyType, (64 & 64) != 0 ? false : false).makeNullableAsSpecified(suspendFunType.isMarkedNullable());
    }

    public static final boolean isContinuation(kotlin.reflect.jvm.internal.impl.name.FqName fqName, boolean z) {
        if (z) {
            return kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_RELEASE);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL);
    }
}
