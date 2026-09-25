package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: JvmAnnotationNames.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmAnnotationNamesKt {
    private static final kotlin.reflect.jvm.internal.impl.name.FqName ANDROIDX_RECENTLY_NON_NULL_ANNOTATION;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName ANDROIDX_RECENTLY_NULLABLE_ANNOTATION;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName COMPATQUAL_NONNULL_ANNOTATION;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName COMPATQUAL_NULLABLE_ANNOTATION;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JAVAX_CHECKFORNULL_ANNOTATION;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JAVAX_NONNULL_ANNOTATION;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> MUTABLE_ANNOTATIONS;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> NOT_NULL_ANNOTATIONS;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> NULLABILITY_ANNOTATIONS;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> NULLABLE_ANNOTATIONS;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> READ_ONLY_ANNOTATIONS;

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> getNULLABLE_ANNOTATIONS() {
        return NULLABLE_ANNOTATIONS;
    }

    static {
        java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("android.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("com.android.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.eclipse.jdt.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.qual.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.CheckForNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations.Nullable"), new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("io.reactivex.annotations.Nullable")});
        NULLABLE_ANNOTATIONS = listListOf;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.Nonnull");
        JAVAX_NONNULL_ANNOTATION = fqName;
        JAVAX_CHECKFORNULL_ANNOTATION = new kotlin.reflect.jvm.internal.impl.name.FqName("javax.annotation.CheckForNull");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> listListOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, new kotlin.reflect.jvm.internal.impl.name.FqName("edu.umd.cs.findbugs.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("android.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("com.android.annotations.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.eclipse.jdt.annotation.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.qual.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("lombok.NonNull"), new kotlin.reflect.jvm.internal.impl.name.FqName("io.reactivex.annotations.NonNull")});
        NOT_NULL_ANNOTATIONS = listListOf2;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        COMPATQUAL_NULLABLE_ANNOTATION = fqName2;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = new kotlin.reflect.jvm.internal.impl.name.FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        COMPATQUAL_NONNULL_ANNOTATION = fqName3;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.RecentlyNullable");
        ANDROIDX_RECENTLY_NULLABLE_ANNOTATION = fqName4;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName5 = new kotlin.reflect.jvm.internal.impl.name.FqName("androidx.annotation.RecentlyNonNull");
        ANDROIDX_RECENTLY_NON_NULL_ANNOTATION = fqName5;
        NULLABILITY_ANNOTATIONS = kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.name.FqName>) kotlin.collections.SetsKt.plus((java.util.Set) new java.util.LinkedHashSet(), (java.lang.Iterable) listListOf), fqName), (java.lang.Iterable) listListOf2), fqName2), fqName3), fqName4), fqName5);
        READ_ONLY_ANNOTATIONS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.READONLY_ANNOTATION});
        MUTABLE_ANNOTATIONS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.MUTABLE_ANNOTATION});
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJAVAX_NONNULL_ANNOTATION() {
        return JAVAX_NONNULL_ANNOTATION;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJAVAX_CHECKFORNULL_ANNOTATION() {
        return JAVAX_CHECKFORNULL_ANNOTATION;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> getNOT_NULL_ANNOTATIONS() {
        return NOT_NULL_ANNOTATIONS;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getCOMPATQUAL_NULLABLE_ANNOTATION() {
        return COMPATQUAL_NULLABLE_ANNOTATION;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getCOMPATQUAL_NONNULL_ANNOTATION() {
        return COMPATQUAL_NONNULL_ANNOTATION;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getANDROIDX_RECENTLY_NULLABLE_ANNOTATION() {
        return ANDROIDX_RECENTLY_NULLABLE_ANNOTATION;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getANDROIDX_RECENTLY_NON_NULL_ANNOTATION() {
        return ANDROIDX_RECENTLY_NON_NULL_ANNOTATION;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> getREAD_ONLY_ANNOTATIONS() {
        return READ_ONLY_ANNOTATIONS;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> getMUTABLE_ANNOTATIONS() {
        return MUTABLE_ANNOTATIONS;
    }
}
