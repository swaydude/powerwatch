package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: PackagePartProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface PackagePartProvider {
    java.util.List<java.lang.String> findPackageParts(java.lang.String str);

    /* JADX INFO: compiled from: PackagePartProvider.kt */
    public static final class Empty implements kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider {
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider.Empty INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider.Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        public java.util.List<java.lang.String> findPackageParts(java.lang.String packageFqName) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
