package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: TypeAliasConstructorDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeAliasConstructorDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor;
    private kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor underlyingConstructorDescriptor;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue withDispatchReceiver$delegate;

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptor, annotations, kind, sourceElement);
    }

    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.storageManager;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getTypeAliasDescriptor() {
        return this.typeAliasDescriptor;
    }

    private TypeAliasConstructorDescriptorImpl(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, annotations, kotlin.reflect.jvm.internal.impl.name.Name.special("<init>"), kind, sourceElement);
        this.storageManager = storageManager;
        this.typeAliasDescriptor = typeAliasDescriptor;
        setActual(getTypeAliasDescriptor().isActual());
        this.withDispatchReceiver$delegate = storageManager.createNullableLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl invoke() {
                kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager2 = this.this$0.getStorageManager();
                kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor2 = this.this$0.getTypeAliasDescriptor();
                kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor2 = classConstructorDescriptor;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.this$0;
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2 = classConstructorDescriptor2.getAnnotations();
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind2 = classConstructorDescriptor.getKind();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kind2, "underlyingConstructorDescriptor.kind");
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = this.this$0.getTypeAliasDescriptor().getSource();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(source, "typeAliasDescriptor.source");
                kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl(storageManager2, typeAliasDescriptor2, classConstructorDescriptor2, typeAliasConstructorDescriptorImpl, annotations2, kind2, source, null);
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorForUnderlyingClass = kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion.getTypeSubstitutorForUnderlyingClass(this.this$0.getTypeAliasDescriptor());
                if (typeSubstitutorForUnderlyingClass == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor.getDispatchReceiverParameter();
                typeAliasConstructorDescriptorImpl2.initialize(null, dispatchReceiverParameter != null ? dispatchReceiverParameter.substitute(typeSubstitutorForUnderlyingClass) : null, this.this$0.getTypeAliasDescriptor().getDeclaredTypeParameters(), this.this$0.getValueParameters(), this.this$0.getReturnType(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, this.this$0.getTypeAliasDescriptor().getVisibility());
                return typeAliasConstructorDescriptorImpl2;
            }
        });
        this.underlyingConstructorDescriptor = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor getUnderlyingConstructorDescriptor() {
        return this.underlyingConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean isPrimary() {
        return getUnderlyingConstructorDescriptor().isPrimary();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getContainingDeclaration() {
        return getTypeAliasDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getConstructedClass() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor constructedClass = getUnderlyingConstructorDescriptor().getConstructedClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructedClass, "underlyingConstructorDescriptor.constructedClass");
        return constructedClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = super.getReturnType();
        if (returnType == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return returnType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = super.getOriginal();
        if (original != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor) original;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substitutor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(substitutor, "substitutor");
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorSubstitute = super.substitute(substitutor);
        if (functionDescriptorSubstitute == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl) functionDescriptorSubstitute;
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorCreate = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(typeAliasConstructorDescriptorImpl.getReturnType());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeSubstitutorCreate, "TypeSubstitutor.create(s…asConstructor.returnType)");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptorSubstitute = getUnderlyingConstructorDescriptor().getOriginal().substitute(typeSubstitutorCreate);
        if (classConstructorDescriptorSubstitute == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.underlyingConstructorDescriptor = classConstructorDescriptorSubstitute;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor newOwner, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newOwner, "newOwner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modality, "modality");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visibility, "visibility");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorBuild = newCopyBuilder().setOwner(newOwner).setModality(modality).setVisibility(visibility).setKind(kind).setCopyOverrides(z).build();
        if (functionDescriptorBuild != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor) functionDescriptorBuild;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor newOwner, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newOwner, "newOwner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
        if (kind != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind2 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl(this.storageManager, getTypeAliasDescriptor(), getUnderlyingConstructorDescriptor(), this, annotations, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, source);
    }

    /* JADX INFO: compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor getTypeSubstitutorForUnderlyingClass(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor) {
            if (typeAliasDescriptor.getClassDescriptor() == null) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(typeAliasDescriptor.getExpandedType());
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor createIfAvailable(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor constructor) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptorSubstitute;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorForUnderlyingClass = getTypeSubstitutorForUnderlyingClass(typeAliasDescriptor);
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
            if (typeSubstitutorForUnderlyingClass != null && (classConstructorDescriptorSubstitute = constructor.substitute(typeSubstitutorForUnderlyingClass)) != null) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = constructor.getAnnotations();
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = constructor.getKind();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kind, "constructor.kind");
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = typeAliasDescriptor.getSource();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(source, "typeAliasDescriptor.source");
                kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, classConstructorDescriptorSubstitute, null, annotations, kind, source, null);
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> substitutedValueParameters = kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.getSubstitutedValueParameters(typeAliasConstructorDescriptorImpl, constructor.getValueParameters(), typeSubstitutorForUnderlyingClass);
                if (substitutedValueParameters != null) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(substitutedValueParameters, "FunctionDescriptorImpl.g…         ) ?: return null");
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeLowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(classConstructorDescriptorSubstitute.getReturnType().unwrap());
                    kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = typeAliasDescriptor.getDefaultType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "typeAliasDescriptor.defaultType");
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeWithAbbreviation = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withAbbreviation(simpleTypeLowerIfFlexible, defaultType);
                    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor it = constructor.getDispatchReceiverParameter();
                    if (it != null) {
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                        receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(typeAliasConstructorDescriptorImpl, typeSubstitutorForUnderlyingClass.safeSubstitute(it.getType(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
                    }
                    typeAliasConstructorDescriptorImpl.initialize(receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, null, typeAliasDescriptor.getDeclaredTypeParameters(), substitutedValueParameters, simpleTypeWithAbbreviation, kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, typeAliasDescriptor.getVisibility());
                    return typeAliasConstructorDescriptorImpl;
                }
            }
            return null;
        }
    }
}
