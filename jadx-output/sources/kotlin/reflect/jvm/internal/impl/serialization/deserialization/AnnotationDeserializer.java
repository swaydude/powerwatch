package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: AnnotationDeserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationDeserializer {
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module;
    private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            iArr2[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
        }
    }

    public AnnotationDeserializer(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(notFoundClasses, "notFoundClasses");
        this.module = module;
        this.notFoundClasses = notFoundClasses;
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor deserializeAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorResolveClass = resolveClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, proto.getId()));
        java.util.Map mapEmptyMap = kotlin.collections.MapsKt.emptyMap();
        if (proto.getArgumentCount() != 0) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = classDescriptorResolveClass;
            if (!kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(classDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isAnnotationClass(classDescriptor)) {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = classDescriptorResolveClass.getConstructors();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructors, "annotationClass.constructors");
                kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) kotlin.collections.CollectionsKt.singleOrNull(constructors);
                if (classConstructorDescriptor != null) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "constructor.valueParameters");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (java.lang.Object obj : list) {
                        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj;
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                        linkedHashMap.put(it.getName(), obj);
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> argumentList = proto.getArgumentList();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(argumentList, "proto.argumentList");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument it2 : argumentList) {
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                        kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> pairResolveArgument = resolveArgument(it2, linkedHashMap, nameResolver);
                        if (pairResolveArgument != null) {
                            arrayList.add(pairResolveArgument);
                        }
                    }
                    mapEmptyMap = kotlin.collections.MapsKt.toMap(arrayList);
                }
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl(classDescriptorResolveClass.getDefaultType(), mapEmptyMap, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
    }

    private final kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> resolveArgument(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument, java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> map, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = map.get(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, argument.getNameId()));
        if (valueParameterDescriptor == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, argument.getNameId());
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = valueParameterDescriptor.getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "parameter.type");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = argument.getValue();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(value, "proto.value");
        return new kotlin.Pair<>(name, resolveValue(type, value, nameResolver));
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveValue(kotlin.reflect.jvm.internal.impl.types.KotlinType expectedType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> uByteValue;
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(expectedType, "expectedType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_UNSIGNED.get(value.getFlags());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_UNSIGNED.get(value.flags)");
        boolean zBooleanValue = bool.booleanValue();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        if (type != null) {
            switch (kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    byte intValue = (byte) value.getIntValue();
                    uByteValue = zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue(intValue) : new kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue(intValue);
                    break;
                case 2:
                    uByteValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue((char) value.getIntValue());
                    break;
                case 3:
                    short intValue2 = (short) value.getIntValue();
                    uByteValue = zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue(intValue2) : new kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue(intValue2);
                    break;
                case 4:
                    int intValue3 = (int) value.getIntValue();
                    uByteValue = zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue(intValue3) : new kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue(intValue3);
                    break;
                case 5:
                    long intValue4 = value.getIntValue();
                    uByteValue = zBooleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue(intValue4) : new kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue(intValue4);
                    break;
                case 6:
                    uByteValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue(value.getFloatValue());
                    break;
                case 7:
                    uByteValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue(value.getDoubleValue());
                    break;
                case 8:
                    uByteValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue(value.getIntValue() != 0);
                    break;
                case 9:
                    uByteValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue(nameResolver.getString(value.getStringValue()));
                    break;
                case 10:
                    uByteValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), value.getArrayDimensionCount());
                    break;
                case 11:
                    uByteValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, value.getEnumValueId()));
                    break;
                case 12:
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = value.getAnnotation();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotation, "value.annotation");
                    uByteValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue(deserializeAnnotation(annotation, nameResolver));
                    break;
                case 13:
                    boolean z = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(expectedType) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveArray(expectedType);
                    java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> arrayElements = value.getArrayElementList();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayElements, "arrayElements");
                    if (!arrayElements.isEmpty()) {
                        java.lang.Object objFirst = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) arrayElements);
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objFirst, "arrayElements.first()");
                        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeResolveArrayElementType = resolveArrayElementType((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) objFirst, nameResolver);
                        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveArrayKotlinTypeByPrimitiveKotlinType = getBuiltIns().getPrimitiveArrayKotlinTypeByPrimitiveKotlinType(simpleTypeResolveArrayElementType);
                        if (primitiveArrayKotlinTypeByPrimitiveKotlinType != null) {
                            simpleType = primitiveArrayKotlinTypeByPrimitiveKotlinType;
                        } else {
                            kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType = getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, simpleTypeResolveArrayElementType);
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayType, "builtIns.getArrayType(Va…RIANT, actualElementType)");
                            simpleType = arrayType;
                        }
                    } else if (z) {
                        simpleType = expectedType;
                    } else {
                        kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType2 = getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, getBuiltIns().getAnyType());
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayType2, "builtIns.getArrayType(Va…ARIANT, builtIns.anyType)");
                        simpleType = arrayType2;
                    }
                    kotlin.reflect.jvm.internal.impl.types.KotlinType arrayElementType = getBuiltIns().getArrayElementType(z ? expectedType : simpleType);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayElementType, "builtIns.getArrayElement…ype else actualArrayType)");
                    kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory constantValueFactory = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE;
                    java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> list = arrayElements;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value it : list) {
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                        arrayList.add(resolveValue(arrayElementType, it, nameResolver));
                    }
                    uByteValue = constantValueFactory.createArrayValue(arrayList, simpleType);
                    break;
            }
            if (kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(uByteValue.getType(this.module), expectedType)) {
                return uByteValue;
            }
            return kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion.create("Unexpected argument value: type " + uByteValue.getType(this.module) + " is not a subtype of " + expectedType + " (value.type = " + value.getType() + ')');
        }
        throw new java.lang.IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + expectedType + ')').toString());
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType resolveArrayElementType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = getBuiltIns();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        if (type != null) {
            switch (kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
                case 1:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType byteType = builtIns.getByteType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(byteType, "byteType");
                    return byteType;
                case 2:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType charType = builtIns.getCharType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(charType, "charType");
                    return charType;
                case 3:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType shortType = builtIns.getShortType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(shortType, "shortType");
                    return shortType;
                case 4:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType intType = builtIns.getIntType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(intType, "intType");
                    return intType;
                case 5:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType longType = builtIns.getLongType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(longType, "longType");
                    return longType;
                case 6:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType floatType = builtIns.getFloatType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(floatType, "floatType");
                    return floatType;
                case 7:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType doubleType = builtIns.getDoubleType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(doubleType, "doubleType");
                    return doubleType;
                case 8:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType booleanType = builtIns.getBooleanType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(booleanType, "booleanType");
                    return booleanType;
                case 9:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType stringType = builtIns.getStringType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(stringType, "stringType");
                    return stringType;
                case 10:
                    throw new java.lang.IllegalStateException("Arrays of class literals are not supported yet".toString());
                case 11:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = resolveClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, value.getClassId())).getDefaultType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "resolveClass(nameResolve…lue.classId)).defaultType");
                    return defaultType;
                case 12:
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = value.getAnnotation();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotation, "value.annotation");
                    kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType2 = resolveClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, annotation.getId())).getDefaultType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType2, "resolveClass(nameResolve…notation.id)).defaultType");
                    return defaultType2;
                case 13:
                    throw new java.lang.IllegalStateException("Array of arrays is impossible".toString());
            }
        }
        throw new java.lang.IllegalStateException(("Unknown type: " + value.getType()).toString());
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
    }
}
