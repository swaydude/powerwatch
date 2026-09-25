package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UIntValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.UnsignedValueConstant<java.lang.Integer> {
    public UIntValue(int i) {
        super(java.lang.Integer.valueOf(i));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.uInt;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "KotlinBuiltIns.FQ_NAMES.uInt");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(module, classId);
        if (classDescriptorFindClassAcrossModuleDependencies != null && (defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType()) != null) {
            return defaultType;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Unsigned type UInt not found");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorType, "ErrorUtils.createErrorTy…ned type UInt not found\")");
        return simpleTypeCreateErrorType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public java.lang.String toString() {
        return getValue().intValue() + ".toUInt()";
    }
}
