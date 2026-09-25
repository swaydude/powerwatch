package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: NotFoundClasses.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NotFoundClasses {
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> classes;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> packageFragments;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;

    public NotFoundClasses(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        this.storageManager = storageManager;
        this.module = module;
        this.packageFragments = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$packageFragments$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor invoke(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor(this.this$0.module, fqName);
            }
        });
        this.classes = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$classes$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0031  */
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest classRequest) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classRequest, "<name for destructuring parameter 0>");
                kotlin.reflect.jvm.internal.impl.name.ClassId classIdComponent1 = classRequest.component1();
                java.util.List<java.lang.Integer> listComponent2 = classRequest.component2();
                if (classIdComponent1.isLocal()) {
                    throw new java.lang.UnsupportedOperationException("Unresolved local class: " + classIdComponent1);
                }
                kotlin.reflect.jvm.internal.impl.name.ClassId outerClassId = classIdComponent1.getOuterClassId();
                if (outerClassId == null) {
                    kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull memoizedFunctionToNotNull = this.this$0.packageFragments;
                    kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classIdComponent1.getPackageFqName();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "classId.packageFqName");
                    classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor) memoizedFunctionToNotNull.invoke(packageFqName);
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses = this.this$0;
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(outerClassId, "outerClassId");
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = notFoundClasses.getClass(outerClassId, kotlin.collections.CollectionsKt.drop(listComponent2, 1));
                    if (classDescriptor2 == null) {
                        kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull memoizedFunctionToNotNull2 = this.this$0.packageFragments;
                        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName2 = classIdComponent1.getPackageFqName();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName2, "classId.packageFqName");
                        classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor) memoizedFunctionToNotNull2.invoke(packageFqName2);
                    } else {
                        classDescriptor = classDescriptor2;
                    }
                }
                boolean zIsNestedClass = classIdComponent1.isNestedClass();
                kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager2 = this.this$0.storageManager;
                kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor = classDescriptor;
                kotlin.reflect.jvm.internal.impl.name.Name shortClassName = classIdComponent1.getShortClassName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(shortClassName, "classId.shortClassName");
                java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) listComponent2);
                return new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor(storageManager2, classOrPackageFragmentDescriptor, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: NotFoundClasses.kt */
    static final class ClassRequest {
        private final kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        private final java.util.List<java.lang.Integer> typeParametersCount;

        public final kotlin.reflect.jvm.internal.impl.name.ClassId component1() {
            return this.classId;
        }

        public final java.util.List<java.lang.Integer> component2() {
            return this.typeParametersCount;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest classRequest = (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.classId, classRequest.classId) && kotlin.jvm.internal.Intrinsics.areEqual(this.typeParametersCount, classRequest.typeParametersCount);
        }

        public int hashCode() {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = this.classId;
            int iHashCode = (classId != null ? classId.hashCode() : 0) * 31;
            java.util.List<java.lang.Integer> list = this.typeParametersCount;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "ClassRequest(classId=" + this.classId + ", typeParametersCount=" + this.typeParametersCount + ")";
        }

        public ClassRequest(kotlin.reflect.jvm.internal.impl.name.ClassId classId, java.util.List<java.lang.Integer> typeParametersCount) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParametersCount, "typeParametersCount");
            this.classId = classId;
            this.typeParametersCount = typeParametersCount;
        }
    }

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class MockClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase {
        private final boolean isInner;
        private final kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl typeConstructor;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters;

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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExternal() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isInline() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor container, kotlin.reflect.jvm.internal.impl.name.Name name, boolean z, int i) {
            super(storageManager, container, name, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            this.isInner = z;
            kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, i);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
                kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append('T');
                sb.append(iNextInt);
                arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createWithDefaultBound(this, empty, false, variance, kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString()), iNextInt));
            }
            java.util.ArrayList arrayList2 = arrayList;
            this.typeParameters = arrayList2;
            this.typeConstructor = new kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl(this, arrayList2, kotlin.collections.SetsKt.setOf(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
            return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "Visibilities.PUBLIC");
            return visibility;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl getTypeConstructor() {
            return this.typeConstructor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.typeParameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public boolean isInner() {
            return this.isInner;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getUnsubstitutedMemberScope() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getStaticScope() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
            return kotlin.collections.SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getSealedSubclasses() {
            return kotlin.collections.CollectionsKt.emptyList();
        }

        public java.lang.String toString() {
            return "class " + getName() + " (not found)";
        }
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId, java.util.List<java.lang.Integer> typeParametersCount) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParametersCount, "typeParametersCount");
        return this.classes.invoke(new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest(classId, typeParametersCount));
    }
}
