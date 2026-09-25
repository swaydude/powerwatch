package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* JADX INFO: compiled from: FunctionClassDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FunctionClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor {
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId functionClassId = new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME, kotlin.reflect.jvm.internal.impl.name.Name.identifier("Function"));
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId kFunctionClassId = new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), kotlin.reflect.jvm.internal.impl.name.Name.identifier("KFunction"));
    private final int arity;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor containingDeclaration;
    private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind functionKind;
    private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassScope memberScope;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;
    private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.FunctionTypeConstructor typeConstructor;

    public java.lang.Void getCompanionObjectDescriptor() {
        return null;
    }

    public java.lang.Void getUnsubstitutedPrimaryConstructor() {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo1261getCompanionObjectDescriptor() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo1262getUnsubstitutedPrimaryConstructor() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) getUnsubstitutedPrimaryConstructor();
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind getFunctionKind() {
        return this.functionKind;
    }

    public final int getArity() {
        return this.arity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind functionKind, int i) {
        super(storageManager, functionKind.numberedClassName(i));
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionKind, "functionKind");
        this.storageManager = storageManager;
        this.containingDeclaration = containingDeclaration;
        this.functionKind = functionKind;
        this.arity = i;
        this.typeConstructor = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.FunctionTypeConstructor();
        this.memberScope = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassScope(storageManager, this);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.Variance, java.lang.String, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.Variance, java.lang.String, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.types.Variance variance, java.lang.String str) {
                invoke2(variance, str);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.types.Variance variance, java.lang.String name) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(variance, "variance");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
                arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createWithDefaultBound(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), false, variance, kotlin.reflect.jvm.internal.impl.name.Name.identifier(name), arrayList.size()));
            }
        };
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, i);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('P');
            sb.append(iNextInt);
            function2.invoke2(variance, sb.toString());
            arrayList2.add(kotlin.Unit.INSTANCE);
        }
        function2.invoke2(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, "R");
        this.parameters = kotlin.collections.CollectionsKt.toList(arrayList);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Function' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    public static final class Kind {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind[] $VALUES;
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Companion Companion;
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind Function;
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind KFunction;
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind KSuspendFunction;
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind SuspendFunction;
        private final java.lang.String classNamePrefix;
        private final kotlin.reflect.jvm.internal.impl.name.FqName packageFqName;

        public static kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.class, str);
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind[] values() {
            return (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind[]) $VALUES.clone();
        }

        private Kind(java.lang.String str, int i, kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.lang.String str2) {
            super(str, i);
            this.packageFqName = fqName;
            this.classNamePrefix = str2;
        }

        public final java.lang.String getClassNamePrefix() {
            return this.classNamePrefix;
        }

        public final kotlin.reflect.jvm.internal.impl.name.FqName getPackageFqName() {
            return this.packageFqName;
        }

        static {
            kotlin.reflect.jvm.internal.impl.name.FqName BUILT_INS_PACKAGE_FQ_NAME = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(BUILT_INS_PACKAGE_FQ_NAME, "BUILT_INS_PACKAGE_FQ_NAME");
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind("Function", 0, BUILT_INS_PACKAGE_FQ_NAME, "Function");
            Function = kind;
            kotlin.reflect.jvm.internal.impl.name.FqName COROUTINES_PACKAGE_FQ_NAME_RELEASE = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(COROUTINES_PACKAGE_FQ_NAME_RELEASE, "COROUTINES_PACKAGE_FQ_NAME_RELEASE");
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind2 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind("SuspendFunction", 1, COROUTINES_PACKAGE_FQ_NAME_RELEASE, "SuspendFunction");
            SuspendFunction = kind2;
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind3 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind("KFunction", 2, kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), "KFunction");
            KFunction = kind3;
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind4 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind("KSuspendFunction", 3, kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), "KSuspendFunction");
            KSuspendFunction = kind4;
            $VALUES = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind[]{kind, kind2, kind3, kind4};
            Companion = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Companion(null);
        }

        public final kotlin.reflect.jvm.internal.impl.name.Name numberedClassName(int i) {
            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(this.classNamePrefix + i);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(\"$classNamePrefix$arity\")");
            return nameIdentifier;
        }

        /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind byClassNamePrefix(kotlin.reflect.jvm.internal.impl.name.FqName packageFqName, java.lang.String className) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(className, "className");
                for (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind : kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kind.getPackageFqName(), packageFqName) && kotlin.text.StringsKt.startsWith$default(className, kind.getClassNamePrefix(), false, 2, (java.lang.Object) null)) {
                        return kind;
                    }
                }
                return null;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getStaticScope() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassScope getUnsubstitutedMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "Visibilities.PUBLIC");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceElement, "SourceElement.NO_SOURCE");
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getSealedSubclasses() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.parameters;
    }

    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    private final class FunctionTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Function.ordinal()] = 1;
                iArr[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.KFunction.ordinal()] = 2;
                iArr[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.SuspendFunction.ordinal()] = 3;
                iArr[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.KSuspendFunction.ordinal()] = 4;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        public FunctionTypeConstructor() {
            super(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes() {
            java.util.List listListOf;
            int i = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.FunctionTypeConstructor.WhenMappings.$EnumSwitchMapping$0[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getFunctionKind().ordinal()];
            if (i == 1) {
                listListOf = kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.functionClassId);
            } else if (i == 2) {
                listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.ClassId[]{kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.kFunctionClassId, new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Function.numberedClassName(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getArity()))});
            } else if (i == 3) {
                listListOf = kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.functionClassId);
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.ClassId[]{kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.kFunctionClassId, new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.SuspendFunction.numberedClassName(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getArity()))});
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingDeclaration = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.containingDeclaration.getContainingDeclaration();
            java.util.List<kotlin.reflect.jvm.internal.impl.name.ClassId> list = listListOf;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (kotlin.reflect.jvm.internal.impl.name.ClassId classId : list) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
                if (classDescriptorFindClassAcrossModuleDependencies == null) {
                    throw new java.lang.IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = getParameters();
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "descriptor.typeConstructor");
                java.util.List listTakeLast = kotlin.collections.CollectionsKt.takeLast(parameters, typeConstructor.getParameters().size());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listTakeLast, 10));
                java.util.Iterator it = listTakeLast.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()).getDefaultType()));
                }
                arrayList.add(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), classDescriptorFindClassAcrossModuleDependencies, arrayList2));
            }
            return kotlin.collections.CollectionsKt.toList(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            return kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.parameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor mo1268getDeclarationDescriptor() {
            return kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this;
        }

        public java.lang.String toString() {
            return mo1268getDeclarationDescriptor().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
            return kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE;
        }
    }

    public java.lang.String toString() {
        java.lang.String strAsString = getName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "name.asString()");
        return strAsString;
    }

    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
