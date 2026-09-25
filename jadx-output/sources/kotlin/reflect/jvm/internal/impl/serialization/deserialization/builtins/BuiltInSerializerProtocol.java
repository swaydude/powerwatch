package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* JADX INFO: compiled from: BuiltInSerializerProtocol.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInSerializerProtocol extends kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol();

    /* JADX WARN: Illegal instructions before constructor call */
    private BuiltInSerializerProtocol() {
        kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLiteNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.newInstance();
        kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(extensionRegistryLiteNewInstance, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, java.lang.Integer> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.packageFqName;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "BuiltInsProtoBuf.packageFqName");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension2 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.constructorAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension2, "BuiltInsProtoBuf.constructorAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension3 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.classAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension3, "BuiltInsProtoBuf.classAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension4 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.functionAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension4, "BuiltInsProtoBuf.functionAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension5 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.propertyAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension5, "BuiltInsProtoBuf.propertyAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension6 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.propertyGetterAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension6, "BuiltInsProtoBuf.propertyGetterAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension7 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.propertySetterAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension7, "BuiltInsProtoBuf.propertySetterAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension8 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.enumEntryAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension8, "BuiltInsProtoBuf.enumEntryAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> generatedExtension9 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.compileTimeValue;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension9, "BuiltInsProtoBuf.compileTimeValue");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension10 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.parameterAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension10, "BuiltInsProtoBuf.parameterAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension11 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.typeAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension11, "BuiltInsProtoBuf.typeAnnotation");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension12 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.typeParameterAnnotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension12, "BuiltInsProtoBuf.typeParameterAnnotation");
        super(extensionRegistryLiteNewInstance, generatedExtension, generatedExtension2, generatedExtension3, generatedExtension4, generatedExtension5, generatedExtension6, generatedExtension7, generatedExtension8, generatedExtension9, generatedExtension10, generatedExtension11, generatedExtension12);
    }

    public final java.lang.String getBuiltInsFilePath(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strAsString = fqName.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "fqName.asString()");
        sb.append(kotlin.text.StringsKt.replace$default(strAsString, '.', '/', false, 4, (java.lang.Object) null));
        sb.append("/");
        sb.append(getBuiltInsFileName(fqName));
        return sb.toString();
    }

    public final java.lang.String getBuiltInsFileName(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return shortName(fqName) + ".kotlin_builtins";
    }

    private final java.lang.String shortName(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (fqName.isRoot()) {
            return "default-package";
        }
        java.lang.String strAsString = fqName.shortName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "fqName.shortName().asString()");
        return strAsString;
    }
}
