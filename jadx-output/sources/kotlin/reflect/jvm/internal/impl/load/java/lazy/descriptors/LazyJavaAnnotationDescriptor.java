package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotationDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue allValueArguments$delegate;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue fqName$delegate;
    private final boolean isIdeExternalAnnotation;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation;
    private final kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement source;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue type$delegate;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        return (java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.allValueArguments$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.FqName) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.fqName$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType() {
        return (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.type$delegate, this, (kotlin.reflect.KProperty<?>) $$delegatedProperties[1]);
    }

    public LazyJavaAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaAnnotation, "javaAnnotation");
        this.c = c;
        this.javaAnnotation = javaAnnotation;
        this.fqName$delegate = c.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.name.FqName>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$fqName$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.name.FqName invoke() {
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = this.this$0.javaAnnotation.getClassId();
                if (classId != null) {
                    return classId.asSingleFqName();
                }
                return null;
            }
        });
        this.type$delegate = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.this$0.getFqName();
                if (fqName != null) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "fqName ?: return@createL…fqName: $javaAnnotation\")");
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMapJavaToKotlin$default = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.mapJavaToKotlin$default(kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE, fqName, this.this$0.c.getModule().getBuiltIns(), null, 4, null);
                    if (classDescriptorMapJavaToKotlin$default == null) {
                        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClassResolve = this.this$0.javaAnnotation.resolve();
                        classDescriptorMapJavaToKotlin$default = javaClassResolve != null ? this.this$0.c.getComponents().getModuleClassResolver().resolveClass(javaClassResolve) : null;
                    }
                    if (classDescriptorMapJavaToKotlin$default == null) {
                        classDescriptorMapJavaToKotlin$default = this.this$0.createTypeForMissingDependencies(fqName);
                    }
                    return classDescriptorMapJavaToKotlin$default.getDefaultType();
                }
                return kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("No fqName: " + this.this$0.javaAnnotation);
            }
        });
        this.source = c.getComponents().getSourceElementFactory().source(javaAnnotation);
        this.allValueArguments$delegate = c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> invoke() {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> arguments = this.this$0.javaAnnotation.getArguments();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument javaAnnotationArgument : arguments) {
                    kotlin.reflect.jvm.internal.impl.name.Name name = javaAnnotationArgument.getName();
                    if (name == null) {
                        name = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                    }
                    kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue constantValueResolveAnnotationArgument = this.this$0.resolveAnnotationArgument(javaAnnotationArgument);
                    kotlin.Pair pair = constantValueResolveAnnotationArgument != null ? kotlin.TuplesKt.to(name, constantValueResolveAnnotationArgument) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return kotlin.collections.MapsKt.toMap(arrayList);
            }
        });
        this.isIdeExternalAnnotation = javaAnnotation.isIdeExternalAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement getSource() {
        return this.source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveAnnotationArgument(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument) {
            return kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE.createConstantValue(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue());
        }
        if (javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return resolveFromEnumValue(javaEnumValueAnnotationArgument.getEnumClassId(), javaEnumValueAnnotationArgument.getEntryName());
        }
        if (javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument) {
            kotlin.reflect.jvm.internal.impl.name.Name DEFAULT_ANNOTATION_MEMBER_NAME = javaAnnotationArgument.getName();
            if (DEFAULT_ANNOTATION_MEMBER_NAME == null) {
                DEFAULT_ANNOTATION_MEMBER_NAME = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(DEFAULT_ANNOTATION_MEMBER_NAME, "DEFAULT_ANNOTATION_MEMBER_NAME");
            }
            return resolveFromArray(DEFAULT_ANNOTATION_MEMBER_NAME, ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument) javaAnnotationArgument).getElements());
        }
        if (javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument) {
            return resolveFromAnnotation(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
        }
        if (javaAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument) {
            return resolveFromJavaClassObjectType(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType());
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveFromAnnotation(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation) {
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue(new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor(this.c, javaAnnotation));
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveFromArray(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> list) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType;
        kotlin.reflect.jvm.internal.impl.types.SimpleType type = getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "type");
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(type)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(this);
        if (annotationClass == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor annotationParameterByName = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.getAnnotationParameterByName(name, annotationClass);
        if (annotationParameterByName == null || (arrayType = annotationParameterByName.getType()) == null) {
            arrayType = this.c.getComponents().getModule().getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Unknown array element type"));
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayType, "DescriptorResolverUtils.… type\")\n                )");
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue nullValueResolveAnnotationArgument = resolveAnnotationArgument((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument) it.next());
            if (nullValueResolveAnnotationArgument == null) {
                nullValueResolveAnnotationArgument = new kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue();
            }
            arrayList.add(nullValueResolveAnnotationArgument);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE.createArrayValue(arrayList, arrayType);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveFromEnumValue(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, name);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveFromJavaClassObjectType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType) {
        return kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Companion.create(this.c.getTypeResolver().transformJavaType(javaType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, false, null, 3, null)));
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.renderAnnotation$default(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createTypeForMissingDependencies(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module = this.c.getModule();
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(fqName);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(fqName)");
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findNonGenericClassAcrossDependencies(module, classId, this.c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }
}
