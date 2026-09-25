package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor {
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.Companion(null);
    private static final java.util.Set<java.lang.String> PUBLIC_METHOD_NAMES_IN_OBJECT = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor additionalSupertypeClassDescriptor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>> declaredParameters;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper innerClassesScope;
    private final boolean isInner;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality modality;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext outerContext;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope staticScope;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor typeConstructor;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope unsubstitutedMemberScope;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo1261getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo1262getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getJClass() {
        return this.jClass;
    }

    public /* synthetic */ LazyJavaClassDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i & 8) != 0 ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) null : classDescriptor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext outerContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modalityConvertFromFlags;
        super(outerContext.getStorageManager(), containingDeclaration, jClass.getName(), outerContext.getComponents().getSourceElementFactory().source(jClass), false);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(outerContext, "outerContext");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        this.outerContext = outerContext;
        this.jClass = jClass;
        this.additionalSupertypeClassDescriptor = classDescriptor;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForClassOrPackage$default(outerContext, this, jClass, 0, 4, null);
        this.c = lazyJavaResolverContextChildForClassOrPackage$default;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = this;
        lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaResolverCache().recordClass(jClass, lazyJavaClassDescriptor);
        jClass.getLightClassOriginKind();
        if (jClass.isAnnotationType()) {
            classKind = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS;
        } else if (jClass.isInterface()) {
            classKind = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE;
        } else {
            classKind = jClass.isEnum() ? kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS : kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
        }
        this.kind = classKind;
        boolean z = false;
        if (jClass.isAnnotationType() || jClass.isEnum()) {
            modalityConvertFromFlags = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        } else {
            modalityConvertFromFlags = kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion.convertFromFlags(jClass.isAbstract() || jClass.isInterface(), !jClass.isFinal());
        }
        this.modality = modalityConvertFromFlags;
        this.visibility = jClass.getVisibility();
        if (jClass.getOuterClass() != null && !jClass.isStatic()) {
            z = true;
        }
        this.isInner = z;
        this.typeConstructor = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor();
        this.unsubstitutedMemberScope = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope(lazyJavaResolverContextChildForClassOrPackage$default, lazyJavaClassDescriptor, jClass);
        this.innerClassesScope = new kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper(getUnsubstitutedMemberScope());
        this.staticScope = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope(lazyJavaResolverContextChildForClassOrPackage$default, jClass, this);
        this.annotations = kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, jClass);
        this.declaredParameters = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> invoke() {
                java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter> typeParameters = this.this$0.getJClass().getTypeParameters();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
                for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter : typeParameters) {
                    kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = this.this$0.c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
                    if (typeParameterDescriptorResolveTypeParameter == null) {
                        throw new java.lang.AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + this.this$0.getJClass() + ", so it must be resolved");
                    }
                    arrayList.add(typeParameterDescriptorResolveTypeParameter);
                }
                return arrayList;
            }
        });
    }

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        return this.modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = (kotlin.jvm.internal.Intrinsics.areEqual(this.visibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE) && this.jClass.getOuterClass() == null) ? kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.PACKAGE_VISIBILITY : this.visibility;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "if (visibility == Visibi…ISIBILITY else visibility");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.isInner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        return this.unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedInnerClassesScope() {
        return this.innerClassesScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope() {
        return this.staticScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        return this.unsubstitutedMemberScope.getConstructors$descriptors_jvm().invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.declaredParameters.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getSealedSubclasses() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public java.lang.String toString() {
        return "Lazy Java class " + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(this);
    }

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    private final class LazyJavaClassTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor {
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>> parameters;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        public LazyJavaClassTypeConstructor() {
            super(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.c.getStorageManager());
            this.parameters = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.c.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> invoke() {
                    return kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.computeConstructorTypeParameters(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            return this.parameters.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes() {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> supertypes = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.getJClass().getSupertypes();
            java.util.ArrayList arrayList = new java.util.ArrayList(supertypes.size());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(0);
            kotlin.reflect.jvm.internal.impl.types.KotlinType purelyImplementedSupertype = getPurelyImplementedSupertype();
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> it = supertypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType next = it.next();
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeTransformJavaType = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.c.getTypeResolver().transformJavaType(next, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE, false, null, 3, null));
                if (kotlinTypeTransformJavaType.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlinTypeTransformJavaType.getConstructor(), purelyImplementedSupertype != null ? purelyImplementedSupertype.getConstructor() : null) && !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAnyOrNullableAny(kotlinTypeTransformJavaType)) {
                    arrayList.add(kotlinTypeTransformJavaType);
                }
            }
            java.util.ArrayList arrayList3 = arrayList;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.additionalSupertypeClassDescriptor;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList3, classDescriptor != null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this).buildSubstitutor().substitute(classDescriptor.getDefaultType(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) : null);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList3, purelyImplementedSupertype);
            if (!arrayList2.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.c.getComponents().getErrorReporter();
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMo1268getDeclarationDescriptor = mo1268getDeclarationDescriptor();
                java.util.ArrayList<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType> arrayList4 = arrayList2;
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType : arrayList4) {
                    if (javaType == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    }
                    arrayList5.add(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) javaType).getPresentableText());
                }
                errorReporter.reportIncompleteHierarchy(classDescriptorMo1268getDeclarationDescriptor, arrayList5);
            }
            return arrayList3.isEmpty() ^ true ? kotlin.collections.CollectionsKt.toList(arrayList) : kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.c.getModule().getBuiltIns().getAnyType());
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType getPurelyImplementedSupertype() {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorResolveTopLevelClass;
            java.util.ArrayList arrayList;
            kotlin.reflect.jvm.internal.impl.name.FqName purelyImplementsFqNameFromAnnotation = getPurelyImplementsFqNameFromAnnotation();
            if (purelyImplementsFqNameFromAnnotation == null) {
                purelyImplementsFqNameFromAnnotation = null;
            } else if (!(!purelyImplementsFqNameFromAnnotation.isRoot() && purelyImplementsFqNameFromAnnotation.startsWith(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_NAME))) {
                purelyImplementsFqNameFromAnnotation = null;
            }
            kotlin.reflect.jvm.internal.impl.name.FqName purelyImplementedInterface = purelyImplementsFqNameFromAnnotation != null ? purelyImplementsFqNameFromAnnotation : kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider.INSTANCE.getPurelyImplementedInterface(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this));
            if (purelyImplementedInterface != null && (classDescriptorResolveTopLevelClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.resolveTopLevelClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.c.getModule(), purelyImplementedInterface, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER)) != null) {
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classDescriptorResolveTopLevelClass.getTypeConstructor();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "classDescriptor.typeConstructor");
                int size = typeConstructor.getParameters().size();
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.getTypeConstructor().getParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "getTypeConstructor().parameters");
                int size2 = parameters.size();
                if (size2 == size) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor parameter : list) {
                        kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameter, "parameter");
                        arrayList2.add(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, parameter.getDefaultType()));
                    }
                    arrayList = arrayList2;
                } else if (size2 == 1 && size > 1 && purelyImplementsFqNameFromAnnotation == null) {
                    kotlin.reflect.jvm.internal.impl.types.Variance variance2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
                    java.lang.Object objSingle = kotlin.collections.CollectionsKt.single((java.util.List<? extends java.lang.Object>) parameters);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle, "typeParameters.single()");
                    kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance2, ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) objSingle).getDefaultType());
                    kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, size);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
                    java.util.Iterator<java.lang.Integer> it = intRange.iterator();
                    while (it.hasNext()) {
                        ((kotlin.collections.IntIterator) it).nextInt();
                        arrayList3.add(typeProjectionImpl);
                    }
                    arrayList = arrayList3;
                }
                return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), classDescriptorResolveTopLevelClass, arrayList);
            }
            return null;
        }

        private final kotlin.reflect.jvm.internal.impl.name.FqName getPurelyImplementsFqNameFromAnnotation() {
            java.lang.String value;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorMo1263findAnnotation = annotations.mo1263findAnnotation(fqName);
            if (annotationDescriptorMo1263findAnnotation == null) {
                return null;
            }
            java.lang.Object objSingleOrNull = kotlin.collections.CollectionsKt.singleOrNull(annotationDescriptorMo1263findAnnotation.getAllValueArguments().values());
            if (!(objSingleOrNull instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue)) {
                objSingleOrNull = null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue stringValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue) objSingleOrNull;
            if (stringValue == null || (value = stringValue.getValue()) == null || !kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.isValidJavaFqName(value)) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.name.FqName(value);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
            return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.c.getComponents().getSupertypeLoopChecker();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo1268getDeclarationDescriptor() {
            return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this;
        }

        public java.lang.String toString() {
            java.lang.String strAsString = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.getName().asString();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "name.asString()");
            return strAsString;
        }
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor copy$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaResolverCache, "javaResolverCache");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext = this.c;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContextReplaceComponents = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.replaceComponents(lazyJavaResolverContext, lazyJavaResolverContext.getComponents().replace(javaResolverCache));
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "containingDeclaration");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor(lazyJavaResolverContextReplaceComponents, containingDeclaration, this.jClass, classDescriptor);
    }
}
