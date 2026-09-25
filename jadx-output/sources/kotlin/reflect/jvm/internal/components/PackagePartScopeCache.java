package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: PackagePartScopeCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/components/PackagePartScopeCache;", "", "resolver", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializedDescriptorResolver;", "kotlinClassFinder", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "(Lorg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver;Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getPackagePartScope", "fileClass", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class PackagePartScopeCache {
    private final java.util.concurrent.ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> cache;
    private final kotlin.reflect.jvm.internal.components.ReflectKotlinClassFinder kotlinClassFinder;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver resolver;

    public PackagePartScopeCache(kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver resolver, kotlin.reflect.jvm.internal.components.ReflectKotlinClassFinder kotlinClassFinder) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resolver, "resolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinClassFinder, "kotlinClassFinder");
        this.resolver = resolver;
        this.kotlinClassFinder = kotlinClassFinder;
        this.cache = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getPackagePartScope(kotlin.reflect.jvm.internal.components.ReflectKotlinClass fileClass) {
        java.util.ArrayList arrayListListOf;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fileClass, "fileClass");
        java.util.concurrent.ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> concurrentHashMap = this.cache;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = fileClass.getClassId();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreate = concurrentHashMap.get(classId);
        if (memberScopeCreate == null) {
            kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = fileClass.getClassId().getPackageFqName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "fileClass.classId.packageFqName");
            if (fileClass.getClassHeader().getKind() == kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                java.util.List<java.lang.String> multifilePartNames = fileClass.getClassHeader().getMultifilePartNames();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = multifilePartNames.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByInternalName = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName((java.lang.String) it.next());
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByInternalName, "JvmClassName.byInternalName(partName)");
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(jvmClassNameByInternalName.getFqNameForTopLevelClassMaybeWithDollars());
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId2, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, classId2);
                    if (kotlinJvmBinaryClassFindKotlinClass != null) {
                        arrayList.add(kotlinJvmBinaryClassFindKotlinClass);
                    }
                }
                arrayListListOf = arrayList;
            } else {
                arrayListListOf = kotlin.collections.CollectionsKt.listOf(fileClass);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor(this.resolver.getComponents().getModuleDescriptor(), packageFqName);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayListListOf.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreateKotlinPackagePartScope = this.resolver.createKotlinPackagePartScope(emptyPackageFragmentDescriptor, (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass) it2.next());
                if (memberScopeCreateKotlinPackagePartScope != null) {
                    arrayList2.add(memberScopeCreateKotlinPackagePartScope);
                }
            }
            java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> list = kotlin.collections.CollectionsKt.toList(arrayList2);
            memberScopeCreate = kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion.create("package " + packageFqName + " (" + fileClass + ')', list);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(classId, memberScopeCreate);
            if (memberScopePutIfAbsent != null) {
                memberScopeCreate = memberScopePutIfAbsent;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(memberScopeCreate, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return memberScopeCreate;
    }
}
