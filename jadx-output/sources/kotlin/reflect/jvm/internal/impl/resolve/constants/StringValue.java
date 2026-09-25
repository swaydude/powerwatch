package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StringValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValue(java.lang.String value) {
        super(value);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.reflect.jvm.internal.impl.types.SimpleType stringType = module.getBuiltIns().getStringType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(stringType, "module.builtIns.stringType");
        return stringType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public java.lang.String toString() {
        return kotlin.text.Typography.quote + getValue() + kotlin.text.Typography.quote;
    }
}
