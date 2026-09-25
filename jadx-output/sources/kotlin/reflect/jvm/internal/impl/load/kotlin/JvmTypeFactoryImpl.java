package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
final class JvmTypeFactoryImpl implements kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType> {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl();

    private JvmTypeFactoryImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType boxType(kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType possiblyPrimitiveType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive)) {
            return possiblyPrimitiveType;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive primitive = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive) possiblyPrimitiveType;
        if (primitive.getJvmPrimitiveType() == null) {
            return possiblyPrimitiveType;
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByFqNameWithoutInnerClasses = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByFqNameWithoutInnerClasses, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        java.lang.String internalName = jvmClassNameByFqNameWithoutInnerClasses.getInternalName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(internalName, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return createObjectType(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType createFromString(java.lang.String representation) {
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(representation, "representation");
        java.lang.String str = representation;
        str.length();
        char cCharAt = representation.charAt(0);
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[] jvmPrimitiveTypeArrValues = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(null);
        }
        if (cCharAt == '[') {
            java.lang.String strSubstring = representation.substring(1);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Array(createFromString(strSubstring));
        }
        if (cCharAt == 'L') {
            kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str, ';', false, 2, (java.lang.Object) null);
        }
        java.lang.String strSubstring2 = representation.substring(1, representation.length() - 1);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object(strSubstring2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType createObjectType(java.lang.String internalName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(internalName, "internalName");
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public java.lang.String toString(kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType type) {
        java.lang.String desc;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        if (type instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Array) {
            return "[" + toString(((kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Array) type).getElementType());
        }
        if (type instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive) {
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = ((kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive) type).getJvmPrimitiveType();
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? "V" : desc;
        }
        if (!(type instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "L" + ((kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object) type).getInternalName() + ";";
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType getJavaLangClassType() {
        return createObjectType("java/lang/Class");
    }
}
