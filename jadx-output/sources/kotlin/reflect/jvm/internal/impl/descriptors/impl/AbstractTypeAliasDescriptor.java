package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: AbstractTypeAliasDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeAliasDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl implements kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor {
    private java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParametersImpl;
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1 typeConstructor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibilityImpl;

    protected abstract kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager();

    protected abstract java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeConstructorTypeParameters();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sourceElement, "sourceElement");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visibilityImpl, "visibilityImpl");
        this.visibilityImpl = visibilityImpl;
        this.typeConstructor = new kotlin.reflect.jvm.internal.impl.types.TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public boolean isDenotable() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: getDeclarationDescriptor */
            public kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor mo1268getDeclarationDescriptor() {
                return this.this$0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
                return this.this$0.getTypeConstructorTypeParameters();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: getSupertypes */
            public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo1269getSupertypes() {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = mo1268getDeclarationDescriptor().getUnderlyingType().getConstructor().mo1269getSupertypes();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "declarationDescriptor.un…pe.constructor.supertypes");
                return collectionMo1269getSupertypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(mo1268getDeclarationDescriptor());
            }

            public java.lang.String toString() {
                return "[typealias " + mo1268getDeclarationDescriptor().getName().asString() + ']';
            }
        };
    }

    public final void initialize(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(declaredTypeParameters, "declaredTypeParameters");
        this.declaredTypeParametersImpl = declaredTypeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> visitor, D d) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitor, "visitor");
        return visitor.visitTypeAliasDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(getUnderlyingType(), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.isInner.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
                return java.lang.Boolean.valueOf(invoke2(unwrappedType));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.types.UnwrappedType type) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "type");
                if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(type)) {
                    return false;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = type.getConstructor().mo1268getDeclarationDescriptor();
                return (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor).getContainingDeclaration(), kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.this) ^ true);
            }
        });
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor> getTypeAliasConstructors() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructors, "classDescriptor.constructors");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor it : constructors) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor typeAliasConstructorDescriptorCreateIfAvailable = kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion.createIfAvailable(getStorageManager(), this, it);
            if (typeAliasConstructorDescriptorCreateIfAvailable != null) {
                arrayList.add(typeAliasConstructorDescriptorCreateIfAvailable);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        java.util.List list = this.declaredTypeParametersImpl;
        if (list == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("declaredTypeParametersImpl");
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        return this.visibilityImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public java.lang.String toString() {
        return "typealias " + getName().asString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource original = super.getOriginal();
        if (original != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) original;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
    }

    protected final kotlin.reflect.jvm.internal.impl.types.SimpleType computeDefaultType() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty unsubstitutedMemberScope;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null || (unsubstitutedMemberScope = classDescriptor.getUnsubstitutedMemberScope()) == null) {
            unsubstitutedMemberScope = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeMakeUnsubstitutedType = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeUnsubstitutedType(abstractTypeAliasDescriptor, unsubstitutedMemberScope);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeMakeUnsubstitutedType, "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)");
        return simpleTypeMakeUnsubstitutedType;
    }
}
