package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ValueParameterDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.Companion(null);
    private final boolean declaresDefaultValue;
    private final int index;
    private final boolean isCrossinline;
    private final boolean isNoinline;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor original;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType varargElementType;

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl createWithDestructuringDeclarations(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>> function0) {
        return Companion.createWithDestructuringDeclarations(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement, function0);
    }

    public java.lang.Void getCompileTimeInitializer() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: getCompileTimeInitializer, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue mo1264getCompileTimeInitializer() {
        return (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) getCompileTimeInitializer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor.DefaultImpls.isLateInit(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isCrossinline() {
        return this.isCrossinline;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isNoinline() {
        return this.isNoinline;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getVarargElementType() {
        return this.varargElementType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.types.KotlinType outType, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(outType, "outType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
        this.index = i;
        this.declaresDefaultValue = z;
        this.isCrossinline = z2;
        this.isNoinline = z3;
        this.varargElementType = kotlinType;
        this.original = valueParameterDescriptor != null ? valueParameterDescriptor : this;
    }

    /* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl createWithDestructuringDeclarations(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.types.KotlinType outType, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>> function0) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(outType, "outType");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
            if (function0 == null) {
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(containingDeclaration, valueParameterDescriptor, i, annotations, name, outType, z, z2, z3, kotlinType, source);
            }
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration(containingDeclaration, valueParameterDescriptor, i, annotations, name, outType, z, z2, z3, kotlinType, source, function0);
        }
    }

    /* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
    public static final class WithDestructuringDeclaration extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl {
        static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration.class), "destructuringVariables", "getDestructuringVariables()Ljava/util/List;"))};
        private final kotlin.Lazy destructuringVariables$delegate;

        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor> getDestructuringVariables() {
            kotlin.Lazy lazy = this.destructuringVariables$delegate;
            kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
            return (java.util.List) lazy.getValue();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.types.KotlinType outType, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>> destructuringVariables) {
            super(containingDeclaration, valueParameterDescriptor, i, annotations, name, outType, z, z2, z3, kotlinType, source);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(outType, "outType");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(destructuringVariables, "destructuringVariables");
            this.destructuringVariables$delegate = kotlin.LazyKt.lazy(destructuringVariables);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        public kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor newOwner, kotlin.reflect.jvm.internal.impl.name.Name newName, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newOwner, "newOwner");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newName, "newName");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = getAnnotations();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotations, "annotations");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "type");
            boolean zDeclaresDefaultValue = declaresDefaultValue();
            boolean zIsCrossinline = isCrossinline();
            boolean zIsNoinline = isNoinline();
            kotlin.reflect.jvm.internal.impl.types.KotlinType varargElementType = getVarargElementType();
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceElement, "SourceElement.NO_SOURCE");
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration(newOwner, null, i, annotations, newName, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, sourceElement, new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor> invoke() {
                    return this.this$0.getDestructuringVariables();
                }
            });
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        if (containingDeclaration != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) containingDeclaration;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean declaresDefaultValue() {
        if (this.declaresDefaultValue) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor containingDeclaration = getContainingDeclaration();
            if (containingDeclaration == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            }
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) containingDeclaration).getKind();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kind, "(containingDeclaration a…bleMemberDescriptor).kind");
            if (kind.isReal()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = this.original;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.getOriginal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substitutor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(substitutor, "substitutor");
        if (substitutor.isEmpty()) {
            return this;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> visitor, D d) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitor, "visitor");
        return visitor.visitValueParameterDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor newOwner, kotlin.reflect.jvm.internal.impl.name.Name newName, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newOwner, "newOwner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newName, "newName");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = getAnnotations();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotations, "annotations");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "type");
        boolean zDeclaresDefaultValue = declaresDefaultValue();
        boolean zIsCrossinline = isCrossinline();
        boolean zIsNoinline = isNoinline();
        kotlin.reflect.jvm.internal.impl.types.KotlinType varargElementType = getVarargElementType();
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceElement, "SourceElement.NO_SOURCE");
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(newOwner, null, i, annotations, newName, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.LOCAL;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "Visibilities.LOCAL");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getOverriddenDescriptors() {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> overriddenDescriptors = getContainingDeclaration().getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "containingDeclaration.overriddenDescriptors");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> collection = overriddenDescriptors;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor it : collection) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(it.getValueParameters().get(getIndex()));
        }
        return arrayList;
    }
}
