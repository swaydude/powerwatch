package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: ConstantValueFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConstantValueFactory {
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory();

    private ConstantValueFactory() {
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue createArrayValue(java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> value, final kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue(value, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.createArrayValue.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return type;
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> createConstantValue(java.lang.Object obj) {
        if (obj instanceof java.lang.Byte) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue(((java.lang.Number) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue(((java.lang.Number) obj).shortValue());
        }
        if (obj instanceof java.lang.Integer) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue(((java.lang.Number) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue(((java.lang.Number) obj).longValue());
        }
        if (obj instanceof java.lang.Character) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue(((java.lang.Character) obj).charValue());
        }
        if (obj instanceof java.lang.Float) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue(((java.lang.Number) obj).floatValue());
        }
        if (obj instanceof java.lang.Double) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue(((java.lang.Number) obj).doubleValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue(((java.lang.Boolean) obj).booleanValue());
        }
        if (obj instanceof java.lang.String) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue((java.lang.String) obj);
        }
        if (obj instanceof byte[]) {
            return createArrayValue(kotlin.collections.ArraysKt.toList((byte[]) obj), kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return createArrayValue(kotlin.collections.ArraysKt.toList((short[]) obj), kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(kotlin.collections.ArraysKt.toList((int[]) obj), kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(kotlin.collections.ArraysKt.toList((long[]) obj), kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return createArrayValue(kotlin.collections.ArraysKt.toList((char[]) obj), kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return createArrayValue(kotlin.collections.ArraysKt.toList((float[]) obj), kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return createArrayValue(kotlin.collections.ArraysKt.toList((double[]) obj), kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return createArrayValue(kotlin.collections.ArraysKt.toList((boolean[]) obj), kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue createArrayValue(java.util.List<?> list, final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        java.util.List list2 = kotlin.collections.CollectionsKt.toList(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValueCreateConstantValue = createConstantValue(it.next());
            if (constantValueCreateConstantValue != null) {
                arrayList.add(constantValueCreateConstantValue);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue(arrayList, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.createArrayValue.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.types.SimpleType invoke(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
                kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveArrayKotlinType = module.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(primitiveArrayKotlinType, "module.builtIns.getPrimi…KotlinType(componentType)");
                return primitiveArrayKotlinType;
            }
        });
    }
}
