package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DoubleValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.Double> {
    public DoubleValue(double d) {
        super(java.lang.Double.valueOf(d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.reflect.jvm.internal.impl.types.SimpleType doubleType = module.getBuiltIns().getDoubleType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(doubleType, "module.builtIns.doubleType");
        return doubleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public java.lang.String toString() {
        return getValue().doubleValue() + ".toDouble()";
    }
}
