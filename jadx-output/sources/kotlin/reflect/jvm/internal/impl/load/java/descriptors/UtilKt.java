package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UtilKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> copyValueParameters(java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData> newValueParametersTypes, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> oldValueParameters, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor newOwner) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newValueParametersTypes, "newValueParametersTypes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(oldValueParameters, "oldValueParameters");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newOwner, "newOwner");
        newValueParametersTypes.size();
        oldValueParameters.size();
        java.util.List<kotlin.Pair> listZip = kotlin.collections.CollectionsKt.zip(newValueParametersTypes, oldValueParameters);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (kotlin.Pair pair : listZip) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData valueParameterData = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData) pair.component1();
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) pair.component2();
            int index = valueParameterDescriptor.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = valueParameterDescriptor.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.Name name = valueParameterDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "oldParameter.name");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = valueParameterData.getType();
            boolean hasDefaultValue = valueParameterData.getHasDefaultValue();
            boolean zIsCrossinline = valueParameterDescriptor.isCrossinline();
            boolean zIsNoinline = valueParameterDescriptor.isNoinline();
            kotlin.reflect.jvm.internal.impl.types.KotlinType arrayElementType = valueParameterDescriptor.getVarargElementType() != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(newOwner).getBuiltIns().getArrayElementType(valueParameterData.getType()) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = valueParameterDescriptor.getSource();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(source, "oldParameter.source");
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(newOwner, null, index, annotations, name, type, hasDefaultValue, zIsCrossinline, zIsNoinline, arrayElementType, source));
        }
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope getParentJavaStaticClassScope(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getParentJavaStaticClassScope) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getParentJavaStaticClassScope, "$this$getParentJavaStaticClassScope");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor superClassNotAny = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getSuperClassNotAny(getParentJavaStaticClassScope);
        if (superClassNotAny == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope staticScope = superClassNotAny.getStaticScope();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope lazyJavaStaticClassScope = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope) (staticScope instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope ? staticScope : null);
        return lazyJavaStaticClassScope != null ? lazyJavaStaticClassScope : getParentJavaStaticClassScope(superClassNotAny);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.descriptors.AnnotationDefaultValue getDefaultValueFromAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getDefaultValueFromAnnotation) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValueFirstArgument;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getDefaultValueFromAnnotation, "$this$getDefaultValueFromAnnotation");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = getDefaultValueFromAnnotation.getAnnotations();
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorMo1263findAnnotation = annotations.mo1263findAnnotation(fqName);
        if (annotationDescriptorMo1263findAnnotation != null && (constantValueFirstArgument = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstArgument(annotationDescriptorMo1263findAnnotation)) != null) {
            if (!(constantValueFirstArgument instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue)) {
                constantValueFirstArgument = null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue stringValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue) constantValueFirstArgument;
            if (stringValue != null && (value = stringValue.getValue()) != null) {
                return new kotlin.reflect.jvm.internal.impl.load.java.descriptors.StringDefaultValue(value);
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2 = getDefaultValueFromAnnotation.getAnnotations();
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_NULL_FQ_NAME;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
        if (annotations2.hasAnnotation(fqName2)) {
            return kotlin.reflect.jvm.internal.impl.load.java.descriptors.NullDefaultValue.INSTANCE;
        }
        return null;
    }
}
