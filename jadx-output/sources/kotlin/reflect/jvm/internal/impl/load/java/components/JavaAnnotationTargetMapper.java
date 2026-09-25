package kotlin.reflect.jvm.internal.impl.load.java.components;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaAnnotationTargetMapper {
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper();
    private static final java.util.Map<java.lang.String, java.util.EnumSet<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget>> targetNameLists = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("PACKAGE", java.util.EnumSet.noneOf(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.class)), kotlin.TuplesKt.to("TYPE", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.CLASS, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FILE)), kotlin.TuplesKt.to("ANNOTATION_TYPE", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.ANNOTATION_CLASS)), kotlin.TuplesKt.to("TYPE_PARAMETER", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.TYPE_PARAMETER)), kotlin.TuplesKt.to("FIELD", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FIELD)), kotlin.TuplesKt.to("LOCAL_VARIABLE", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.LOCAL_VARIABLE)), kotlin.TuplesKt.to("PARAMETER", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.VALUE_PARAMETER)), kotlin.TuplesKt.to("CONSTRUCTOR", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.CONSTRUCTOR)), kotlin.TuplesKt.to("METHOD", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FUNCTION, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.PROPERTY_GETTER, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.PROPERTY_SETTER)), kotlin.TuplesKt.to("TYPE_USE", java.util.EnumSet.of(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.TYPE)));
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention> retentionNameList = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("RUNTIME", kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.RUNTIME), kotlin.TuplesKt.to("CLASS", kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.BINARY), kotlin.TuplesKt.to("SOURCE", kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.SOURCE));

    private JavaAnnotationTargetMapper() {
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> mapJavaTargetArgumentByName(java.lang.String str) {
        java.util.EnumSet<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> enumSet = targetNameLists.get(str);
        return enumSet != null ? enumSet : kotlin.collections.SetsKt.emptySet();
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> arguments) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arguments) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : arrayList) {
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            kotlin.reflect.jvm.internal.impl.name.Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            kotlin.collections.CollectionsKt.addAll(arrayList2, javaAnnotationTargetMapper.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null));
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget : arrayList3) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.annotationTarget);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlinTarget.name());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(kotlinTarget.name)");
            arrayList4.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, nameIdentifier));
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue(arrayList4, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$mapJavaTargetArguments$1
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
                kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor annotationParameterByName = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.getAnnotationParameterByName(kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), module.getBuiltIns().getBuiltInClassByFqName(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.target));
                if (annotationParameterByName != null && (type = annotationParameterByName.getType()) != null) {
                    return type;
                }
                kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Error: AnnotationTarget[]");
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorType, "ErrorUtils.createErrorTy…ror: AnnotationTarget[]\")");
                return simpleTypeCreateErrorType;
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument javaAnnotationArgument) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue enumValue = null;
        if (!(javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument)) {
            javaAnnotationArgument = null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument) javaAnnotationArgument;
        if (javaEnumValueAnnotationArgument != null) {
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention> map = retentionNameList;
            kotlin.reflect.jvm.internal.impl.name.Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention kotlinRetention = map.get(entryName != null ? entryName.asString() : null);
            if (kotlinRetention != null) {
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.annotationRetention);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
                kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlinRetention.name());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(retention.name)");
                enumValue = new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, nameIdentifier);
            }
        }
        return enumValue;
    }
}
