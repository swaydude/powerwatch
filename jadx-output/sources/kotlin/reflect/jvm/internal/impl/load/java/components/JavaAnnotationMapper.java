package kotlin.reflect.jvm.internal.impl.load.java.components;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaAnnotationMapper {
    private static final kotlin.reflect.jvm.internal.impl.name.Name DEPRECATED_ANNOTATION_MESSAGE;
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper();
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JAVA_DEPRECATED_FQ_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JAVA_DOCUMENTED_FQ_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JAVA_REPEATABLE_FQ_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JAVA_RETENTION_FQ_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JAVA_TARGET_FQ_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.Name RETENTION_ANNOTATION_VALUE;
    private static final kotlin.reflect.jvm.internal.impl.name.Name TARGET_ANNOTATION_ALLOWED_TARGETS;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.FqName> javaToKotlinNameMap;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.FqName> kotlinToJavaNameMap;

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName(java.lang.annotation.Target.class.getCanonicalName());
        JAVA_TARGET_FQ_NAME = fqName;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = new kotlin.reflect.jvm.internal.impl.name.FqName(java.lang.annotation.Retention.class.getCanonicalName());
        JAVA_RETENTION_FQ_NAME = fqName2;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = new kotlin.reflect.jvm.internal.impl.name.FqName(java.lang.Deprecated.class.getCanonicalName());
        JAVA_DEPRECATED_FQ_NAME = fqName3;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = new kotlin.reflect.jvm.internal.impl.name.FqName(java.lang.annotation.Documented.class.getCanonicalName());
        JAVA_DOCUMENTED_FQ_NAME = fqName4;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName5 = new kotlin.reflect.jvm.internal.impl.name.FqName("java.lang.annotation.Repeatable");
        JAVA_REPEATABLE_FQ_NAME = fqName5;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(\"message\")");
        DEPRECATED_ANNOTATION_MESSAGE = nameIdentifier;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("allowedTargets");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier2, "Name.identifier(\"allowedTargets\")");
        TARGET_ANNOTATION_ALLOWED_TARGETS = nameIdentifier2;
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier3 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("value");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier3, "Name.identifier(\"value\")");
        RETENTION_ANNOTATION_VALUE = nameIdentifier3;
        kotlinToJavaNameMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.target, fqName), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.retention, fqName2), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.repeatable, fqName5), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mustBeDocumented, fqName4));
        javaToKotlinNameMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(fqName, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.target), kotlin.TuplesKt.to(fqName2, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.retention), kotlin.TuplesKt.to(fqName3, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.deprecated), kotlin.TuplesKt.to(fqName5, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.repeatable), kotlin.TuplesKt.to(fqName4, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mustBeDocumented));
    }

    private JavaAnnotationMapper() {
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return DEPRECATED_ANNOTATION_MESSAGE;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return TARGET_ANNOTATION_ALLOWED_TARGETS;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return RETENTION_ANNOTATION_VALUE;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mapOrResolveJavaAnnotation(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation annotation, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotation, "annotation");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = annotation.getClassId();
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(JAVA_TARGET_FQ_NAME))) {
            return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor(annotation, c);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(JAVA_RETENTION_FQ_NAME))) {
            return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor(annotation, c);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(JAVA_REPEATABLE_FQ_NAME))) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.repeatable;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor(c, annotation, fqName);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(JAVA_DOCUMENTED_FQ_NAME))) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mustBeDocumented;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor(c, annotation, fqName2);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(JAVA_DEPRECATED_FQ_NAME))) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor(c, annotation);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor findMappedJavaAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName kotlinName, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner annotationOwner, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c) {
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotationFindAnnotation;
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotationFindAnnotation2;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinName, "kotlinName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationOwner, "annotationOwner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        if (kotlin.jvm.internal.Intrinsics.areEqual(kotlinName, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.deprecated) && ((javaAnnotationFindAnnotation2 = annotationOwner.findAnnotation(JAVA_DEPRECATED_FQ_NAME)) != null || annotationOwner.isDeprecatedInJavaDoc())) {
            return new kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor(javaAnnotationFindAnnotation2, c);
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlinToJavaNameMap.get(kotlinName);
        if (fqName == null || (javaAnnotationFindAnnotation = annotationOwner.findAnnotation(fqName)) == null) {
            return null;
        }
        return INSTANCE.mapOrResolveJavaAnnotation(javaAnnotationFindAnnotation, c);
    }
}
