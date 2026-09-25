package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: annotationUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationUtilKt {
    private static final kotlin.reflect.jvm.internal.impl.name.Name DEPRECATED_LEVEL_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.Name DEPRECATED_MESSAGE_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.Name DEPRECATED_REPLACE_WITH_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.Name REPLACE_WITH_EXPRESSION_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.Name REPLACE_WITH_IMPORTS_NAME;

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor createDeprecatedAnnotation$default(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor createDeprecatedAnnotation(final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns createDeprecatedAnnotation, java.lang.String message, java.lang.String replaceWith, java.lang.String level) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(createDeprecatedAnnotation, "$this$createDeprecatedAnnotation");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replaceWith, "replaceWith");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.replaceWith;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.replaceWith");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(createDeprecatedAnnotation, fqName, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(REPLACE_WITH_EXPRESSION_NAME, new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue(replaceWith)), kotlin.TuplesKt.to(REPLACE_WITH_IMPORTS_NAME, new kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue(kotlin.collections.CollectionsKt.emptyList(), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.types.SimpleType invoke(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
                kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType = module.getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, createDeprecatedAnnotation.getStringType());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayType, "module.builtIns.getArray…ce.INVARIANT, stringType)");
                return arrayType;
            }
        }))));
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.deprecated;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "KotlinBuiltIns.FQ_NAMES.deprecated");
        kotlin.reflect.jvm.internal.impl.name.Name name = DEPRECATED_LEVEL_NAME;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.deprecationLevel);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(level);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(level)");
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(createDeprecatedAnnotation, fqName2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(DEPRECATED_MESSAGE_NAME, new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue(message)), kotlin.TuplesKt.to(DEPRECATED_REPLACE_WITH_NAME, new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue(builtInAnnotationDescriptor)), kotlin.TuplesKt.to(name, new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, nameIdentifier))));
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(\"message\")");
        DEPRECATED_MESSAGE_NAME = nameIdentifier;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("replaceWith");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier2, "Name.identifier(\"replaceWith\")");
        DEPRECATED_REPLACE_WITH_NAME = nameIdentifier2;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier3 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier3, "Name.identifier(\"level\")");
        DEPRECATED_LEVEL_NAME = nameIdentifier3;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier4 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("expression");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier4, "Name.identifier(\"expression\")");
        REPLACE_WITH_EXPRESSION_NAME = nameIdentifier4;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier5 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("imports");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier5, "Name.identifier(\"imports\")");
        REPLACE_WITH_IMPORTS_NAME = nameIdentifier5;
    }
}
