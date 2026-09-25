package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: ReflectKotlinClassFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findBuiltInsData", "Ljava/io/InputStream;", "packageFqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "findKotlinClass", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder$Result;", "fqName", "", "findKotlinClassOrContent", "javaClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findMetadata", "hasMetadataPackage", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectKotlinClassFinder implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder {
    private final java.lang.ClassLoader classLoader;

    public ReflectKotlinClassFinder(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classLoader, "classLoader");
        this.classLoader = classLoader;
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClass(java.lang.String fqName) {
        kotlin.reflect.jvm.internal.components.ReflectKotlinClass reflectKotlinClassCreate;
        java.lang.Class<?> clsTryLoadClass = kotlin.reflect.jvm.internal.components.ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, fqName);
        return (clsTryLoadClass == null || (reflectKotlinClassCreate = kotlin.reflect.jvm.internal.components.ReflectKotlinClass.INSTANCE.create(clsTryLoadClass)) == null) ? null : new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass(reflectKotlinClassCreate);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        return findKotlinClass(kotlin.reflect.jvm.internal.components.ReflectKotlinClassFinderKt.toRuntimeFqName(classId));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        java.lang.String strAsString;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaClass, "javaClass");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = javaClass.getFqName();
        if (fqName == null || (strAsString = fqName.asString()) == null) {
            return null;
        }
        return findKotlinClass(strAsString);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    public java.io.InputStream findBuiltInsData(kotlin.reflect.jvm.internal.impl.name.FqName packageFqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
        if (packageFqName.startsWith(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_NAME)) {
            return this.classLoader.getResourceAsStream(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(packageFqName));
        }
        return null;
    }
}
