package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BooleanValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.Boolean> {
    public BooleanValue(boolean z) {
        super(java.lang.Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.reflect.jvm.internal.impl.types.SimpleType booleanType = module.getBuiltIns().getBooleanType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(booleanType, "module.builtIns.booleanType");
        return booleanType;
    }
}
