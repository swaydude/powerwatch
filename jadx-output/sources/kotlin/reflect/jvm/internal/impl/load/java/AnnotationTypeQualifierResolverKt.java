package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: AnnotationTypeQualifierResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationTypeQualifierResolverKt {
    private static final kotlin.reflect.jvm.internal.impl.name.FqName TYPE_QUALIFIER_NICKNAME_FQNAME = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.meta.TypeQualifierNickname");
    private static final kotlin.reflect.jvm.internal.impl.name.FqName TYPE_QUALIFIER_FQNAME = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.meta.TypeQualifier");
    private static final kotlin.reflect.jvm.internal.impl.name.FqName TYPE_QUALIFIER_DEFAULT_FQNAME = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.meta.TypeQualifierDefault");
    private static final kotlin.reflect.jvm.internal.impl.name.FqName MIGRATION_ANNOTATION_FQNAME = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.annotations.jvm.UnderMigration");
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability> BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.ParametersAreNullableByDefault"), new kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, false, 2, null), kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER))), kotlin.TuplesKt.to(new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.ParametersAreNonnullByDefault"), new kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, false, 2, null), kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.VALUE_PARAMETER))));
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> BUILT_IN_TYPE_QUALIFIER_FQ_NAMES = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION(), kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getJAVAX_CHECKFORNULL_ANNOTATION()});

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getTYPE_QUALIFIER_NICKNAME_FQNAME() {
        return TYPE_QUALIFIER_NICKNAME_FQNAME;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getTYPE_QUALIFIER_DEFAULT_FQNAME() {
        return TYPE_QUALIFIER_DEFAULT_FQNAME;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getMIGRATION_ANNOTATION_FQNAME() {
        return MIGRATION_ANNOTATION_FQNAME;
    }

    public static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability> getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAnnotatedWithTypeQualifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        return BUILT_IN_TYPE_QUALIFIER_FQ_NAMES.contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(classDescriptor)) || classDescriptor.getAnnotations().hasAnnotation(TYPE_QUALIFIER_FQNAME);
    }
}
