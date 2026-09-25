package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LongValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant<java.lang.Long> {
    public LongValue(long j) {
        super(java.lang.Long.valueOf(j));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.reflect.jvm.internal.impl.types.SimpleType longType = module.getBuiltIns().getLongType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(longType, "module.builtIns.longType");
        return longType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public java.lang.String toString() {
        return getValue().longValue() + ".toLong()";
    }
}
