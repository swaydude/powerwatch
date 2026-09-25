package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaPackageScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageScope extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope {
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> classes;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage jPackage;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<java.util.Set<java.lang.String>> knownClassNamesInPackage;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment ownerDescriptor;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void computeNonDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> result, kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(result, "result");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage jPackage, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment ownerDescriptor) {
        super(c);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jPackage, "jPackage");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(ownerDescriptor, "ownerDescriptor");
        this.jPackage = jPackage;
        this.ownerDescriptor = ownerDescriptor;
        this.knownClassNamesInPackage = c.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0<java.util.Set<? extends java.lang.String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$knownClassNamesInPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Set<? extends java.lang.String> invoke() {
                return c.getComponents().getFinder().knownClassNamesInPackage(this.this$0.getOwnerDescriptor().getFqName());
            }
        });
        this.classes = c.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$classes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest request) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result resultFindKotlinClassOrContent;
                byte[] content;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(request, "request");
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = new kotlin.reflect.jvm.internal.impl.name.ClassId(this.this$0.getOwnerDescriptor().getFqName(), request.getName());
                if (request.getJavaClass() != null) {
                    resultFindKotlinClassOrContent = c.getComponents().getKotlinClassFinder().findKotlinClassOrContent(request.getJavaClass());
                } else {
                    resultFindKotlinClassOrContent = c.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId);
                }
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass = resultFindKotlinClassOrContent != null ? resultFindKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
                kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
                if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult kotlinClassLookupResultResolveKotlinBinaryClass = this.this$0.resolveKotlinBinaryClass(kotlinJvmBinaryClass);
                if (kotlinClassLookupResultResolveKotlinBinaryClass instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found) {
                    return ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found) kotlinClassLookupResultResolveKotlinBinaryClass).getDescriptor();
                }
                if (kotlinClassLookupResultResolveKotlinBinaryClass instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass) {
                    return null;
                }
                if (kotlinClassLookupResultResolveKotlinBinaryClass instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound) {
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass = request.getJavaClass();
                    if (javaClass == null) {
                        kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder finder = c.getComponents().getFinder();
                        if (resultFindKotlinClassOrContent == null) {
                            content = null;
                        } else {
                            if (!(resultFindKotlinClassOrContent instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent)) {
                                resultFindKotlinClassOrContent = null;
                            }
                            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent classFileContent = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent) resultFindKotlinClassOrContent;
                            if (classFileContent != null) {
                                content = classFileContent.getContent();
                            } else {
                                content = null;
                            }
                        }
                        javaClass = finder.findClass(new kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request(classId, content, null, 4, null));
                    }
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass2 = javaClass;
                    if ((javaClass2 != null ? javaClass2.getLightClassOriginKind() : null) == kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.BINARY) {
                        throw new java.lang.IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass2 + "\nClassId: " + classId + "\nfindKotlinClass(JavaClass) = " + kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(c.getComponents().getKotlinClassFinder(), javaClass2) + "\nfindKotlinClass(ClassId) = " + kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(c.getComponents().getKotlinClassFinder(), classId) + '\n');
                    }
                    kotlin.reflect.jvm.internal.impl.name.FqName fqName = javaClass2 != null ? javaClass2.getFqName() : null;
                    if (fqName != null && !fqName.isRoot() && !(!kotlin.jvm.internal.Intrinsics.areEqual(fqName.parent(), this.this$0.getOwnerDescriptor().getFqName()))) {
                        lazyJavaClassDescriptor = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor(c, this.this$0.getOwnerDescriptor(), javaClass2, null, 8, null);
                        c.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                    }
                    return lazyJavaClassDescriptor;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    static abstract class KotlinClassLookupResult {

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class Found extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult {
            private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
                this.descriptor = descriptor;
            }

            public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getDescriptor() {
                return this.descriptor;
            }
        }

        private KotlinClassLookupResult() {
        }

        public /* synthetic */ KotlinClassLookupResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class NotFound extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult {
            public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound();

            private NotFound() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class SyntheticClass extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult {
            public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult resolveKotlinBinaryClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().getKind() == kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorResolveClass = getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
            return classDescriptorResolveClass != null ? new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found(classDescriptorResolveClass) : kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound.INSTANCE;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    static final class FindClassRequest {
        private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass;
        private final kotlin.reflect.jvm.internal.impl.name.Name name;

        public FindClassRequest(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            this.name = name;
            this.javaClass = javaClass;
        }

        public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getJavaClass() {
            return this.javaClass;
        }

        public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
            return this.name;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest) obj).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return findClassifier(name, null);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        if (!kotlin.reflect.jvm.internal.impl.name.SpecialNames.isSafeIdentifier(name)) {
            return null;
        }
        java.util.Set<java.lang.String> setInvoke = this.knownClassNamesInPackage.invoke();
        if (javaClass != null || setInvoke == null || setInvoke.contains(name.asString())) {
            return this.classes.invoke(new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest(name, javaClass));
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassifierByJavaClass$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaClass, "javaClass");
        return findClassifier(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation location) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(location, "location");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex computeMemberIndex() {
        return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        if (!kindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.Set<java.lang.String> setInvoke = this.knownClassNamesInPackage.invoke();
        if (setInvoke == null) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage javaPackage = this.jPackage;
            if (function1 == null) {
                function1 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.alwaysTrue();
            }
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass> classes = javaPackage.getClasses(function1);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass : classes) {
                kotlin.reflect.jvm.internal.impl.name.Name name = javaClass.getLightClassOriginKind() == kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.SOURCE ? null : javaClass.getName();
                if (name != null) {
                    linkedHashSet.add(name);
                }
            }
            return linkedHashSet;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<T> it = setInvoke.iterator();
        while (it.hasNext()) {
            hashSet.add(kotlin.reflect.jvm.internal.impl.name.Name.identifier((java.lang.String) it.next()));
        }
        return hashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter kindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> nameFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kindFilter, "kindFilter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameFilter, "nameFilter");
        return computeDescriptors(kindFilter, nameFilter);
    }
}
