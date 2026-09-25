package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaPackageFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageFragment extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue binaryClasses$delegate;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage jPackage;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue partToFacade$delegate;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope scope;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName>> subPackages;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
        }
    }

    public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.binaryClasses$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext outerContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage jPackage) {
        super(outerContext.getModule(), jPackage.getFqName());
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(outerContext, "outerContext");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jPackage, "jPackage");
        this.jPackage = jPackage;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForClassOrPackage$default(outerContext, this, null, 0, 6, null);
        this.c = lazyJavaResolverContextChildForClassOrPackage$default;
        this.binaryClasses$delegate = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$binaryClasses$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Map<java.lang.String, ? extends kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass> invoke() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider packagePartProvider = this.this$0.c.getComponents().getPackagePartProvider();
                java.lang.String strAsString = this.this$0.getFqName().asString();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "fqName.asString()");
                java.util.List<java.lang.String> listFindPackageParts = packagePartProvider.findPackageParts(strAsString);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : listFindPackageParts) {
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByInternalName = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(str);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByInternalName, "JvmClassName.byInternalName(partName)");
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(jvmClassNameByInternalName.getFqNameForTopLevelClassMaybeWithDollars());
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(this.this$0.c.getComponents().getKotlinClassFinder(), classId);
                    kotlin.Pair pair = kotlinJvmBinaryClassFindKotlinClass != null ? kotlin.TuplesKt.to(str, kotlinJvmBinaryClassFindKotlinClass) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return kotlin.collections.MapsKt.toMap(arrayList);
            }
        });
        this.scope = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope(lazyJavaResolverContextChildForClassOrPackage$default, jPackage, this);
        this.subPackages = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.FqName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$subPackages$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.FqName> invoke() {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage> subPackages = this.this$0.jPackage.getSubPackages();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subPackages, 10));
                java.util.Iterator<T> it = subPackages.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage) it.next()).getFqName());
                }
                return arrayList;
            }
        }, kotlin.collections.CollectionsKt.emptyList());
        this.annotations = lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getAnnotationTypeQualifierResolver().getDisabled() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY() : kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, jPackage);
        this.partToFacade$delegate = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName> invoke() {
                java.util.HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName> map = new java.util.HashMap<>();
                for (java.util.Map.Entry<java.lang.String, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass> entry : this.this$0.getBinaryClasses$descriptors_jvm().entrySet()) {
                    java.lang.String key = entry.getKey();
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass value = entry.getValue();
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByInternalName = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(key);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByInternalName, "JvmClassName.byInternalName(partInternalName)");
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader = value.getClassHeader();
                    int i = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                    if (i == 1) {
                        java.util.HashMap<kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName> map2 = map;
                        java.lang.String multifileClassName = classHeader.getMultifileClassName();
                        if (multifileClassName != null) {
                            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByInternalName2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(multifileClassName);
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByInternalName2, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                            map2.put(jvmClassNameByInternalName, jvmClassNameByInternalName2);
                        }
                    } else if (i == 2) {
                        map.put(jvmClassNameByInternalName, jvmClassNameByInternalName);
                    }
                }
                return map;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.annotations;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackageFqNames$descriptors_jvm() {
        return this.subPackages.invoke();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassifierByJavaClass$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        return this.scope.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(jClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope getMemberScope() {
        return this.scope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public java.lang.String toString() {
        return "Lazy Java package fragment: " + getFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement(this);
    }
}
