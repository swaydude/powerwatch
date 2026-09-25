package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmAnnotationNames {
    public static final kotlin.reflect.jvm.internal.impl.name.Name DEFAULT_ANNOTATION_MEMBER_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName DEFAULT_NULL_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName DEFAULT_VALUE_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName ENHANCED_MUTABILITY_ANNOTATION;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName ENHANCED_NULLABILITY_ANNOTATION;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName JETBRAINS_MUTABLE_ANNOTATION;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName JETBRAINS_NOT_NULL_ANNOTATION;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName JETBRAINS_NULLABLE_ANNOTATION;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName JETBRAINS_READONLY_ANNOTATION;
    public static final java.lang.String METADATA_DESC;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName METADATA_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName MUTABLE_ANNOTATION;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName PARAMETER_NAME_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName PURELY_IMPLEMENTS_ANNOTATION;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName READONLY_ANNOTATION;

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.Metadata");
        METADATA_FQ_NAME = fqName;
        METADATA_DESC = "L" + kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byFqNameWithoutInnerClasses(fqName).getInternalName() + ";";
        DEFAULT_ANNOTATION_MEMBER_NAME = kotlin.reflect.jvm.internal.impl.name.Name.identifier("value");
        JETBRAINS_NOT_NULL_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jetbrains.annotations.NotNull");
        JETBRAINS_NULLABLE_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jetbrains.annotations.Nullable");
        JETBRAINS_MUTABLE_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jetbrains.annotations.Mutable");
        JETBRAINS_READONLY_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("org.jetbrains.annotations.ReadOnly");
        READONLY_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.annotations.jvm.ReadOnly");
        MUTABLE_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.annotations.jvm.Mutable");
        PURELY_IMPLEMENTS_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.PurelyImplements");
        ENHANCED_NULLABILITY_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.internal.EnhancedNullability");
        ENHANCED_MUTABILITY_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.internal.EnhancedMutability");
        PARAMETER_NAME_FQ_NAME = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.annotations.jvm.internal.ParameterName");
        DEFAULT_VALUE_FQ_NAME = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.annotations.jvm.internal.DefaultValue");
        DEFAULT_NULL_FQ_NAME = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.annotations.jvm.internal.DefaultNull");
    }
}
