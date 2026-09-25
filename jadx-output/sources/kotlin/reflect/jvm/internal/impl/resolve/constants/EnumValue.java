package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<kotlin.Pair<? extends kotlin.reflect.jvm.internal.impl.name.ClassId, ? extends kotlin.reflect.jvm.internal.impl.name.Name>> {
    private final kotlin.reflect.jvm.internal.impl.name.ClassId enumClassId;
    private final kotlin.reflect.jvm.internal.impl.name.Name enumEntryName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(kotlin.reflect.jvm.internal.impl.name.ClassId enumClassId, kotlin.reflect.jvm.internal.impl.name.Name enumEntryName) {
        super(kotlin.TuplesKt.to(enumClassId, enumEntryName));
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enumClassId, "enumClassId");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enumEntryName, "enumEntryName");
        this.enumClassId = enumClassId;
        this.enumEntryName = enumEntryName;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getEnumEntryName() {
        return this.enumEntryName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(module, this.enumClassId);
        if (classDescriptorFindClassAcrossModuleDependencies != null) {
            if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isEnumClass(classDescriptorFindClassAcrossModuleDependencies)) {
                classDescriptorFindClassAcrossModuleDependencies = null;
            }
            if (classDescriptorFindClassAcrossModuleDependencies != null && (defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType()) != null) {
                return defaultType;
            }
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Containing class for error-class based enum entry " + this.enumClassId + '.' + this.enumEntryName);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorType, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
        return simpleTypeCreateErrorType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.enumClassId.getShortClassName());
        sb.append('.');
        sb.append(this.enumEntryName);
        return sb.toString();
    }
}
