package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CharValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant<java.lang.Character> {
    public CharValue(char c) {
        super(java.lang.Character.valueOf(c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.reflect.jvm.internal.impl.types.SimpleType charType = module.getBuiltIns().getCharType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(charType, "module.builtIns.charType");
        return charType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public java.lang.String toString() {
        java.lang.String str = java.lang.String.format("\\u%04X ('%s')", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(getValue().charValue()), getPrintablePart(getValue().charValue())}, 2));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(this, *args)");
        return str;
    }

    private final java.lang.String getPrintablePart(char c) {
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return isPrintableUnicode(c) ? java.lang.String.valueOf(c) : "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean isPrintableUnicode(char c) {
        byte type = (byte) java.lang.Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }
}
