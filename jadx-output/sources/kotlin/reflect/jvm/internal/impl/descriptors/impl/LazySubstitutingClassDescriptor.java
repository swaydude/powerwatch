package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: loaded from: classes2.dex */
public class LazySubstitutingClassDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor {
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters;
    private kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor newSubstitutor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor original;
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor originalSubstitutor;
    private kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeConstructorParameters;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 2 || i == 4 || i == 14) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 4 || i == 14) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 4) {
            objArr[0] = "typeSubstitution";
        } else if (i != 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 4:
            case 14:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 3:
            case 5:
                objArr[1] = "getMemberScope";
                break;
            case 6:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 7:
                objArr[1] = "getStaticScope";
                break;
            case 8:
                objArr[1] = "getDefaultType";
                break;
            case 9:
                objArr[1] = "getConstructors";
                break;
            case 10:
                objArr[1] = "getAnnotations";
                break;
            case 11:
                objArr[1] = "getName";
                break;
            case 12:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "getContainingDeclaration";
                break;
            case 15:
                objArr[1] = "substitute";
                break;
            case 16:
                objArr[1] = "getKind";
                break;
            case 17:
                objArr[1] = "getModality";
                break;
            case 18:
                objArr[1] = "getVisibility";
                break;
            case 19:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 20:
                objArr[1] = "getSource";
                break;
            case 21:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 22:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 4) {
            objArr[2] = "getMemberScope";
        } else if (i == 14) {
            objArr[2] = "substitute";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 4 && i != 14) {
            throw new java.lang.IllegalStateException(str2);
        }
        throw new java.lang.IllegalArgumentException(str2);
    }

    public LazySubstitutingClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        this.original = classDescriptor;
        this.originalSubstitutor = typeSubstitutor;
    }

    private kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor getSubstitutor() {
        if (this.newSubstitutor == null) {
            if (this.originalSubstitutor.isEmpty()) {
                this.newSubstitutor = this.originalSubstitutor;
            } else {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = this.original.getTypeConstructor().getParameters();
                this.typeConstructorParameters = new java.util.ArrayList(parameters.size());
                this.newSubstitutor = kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor.substituteTypeParameters(parameters, this.originalSubstitutor.getSubstitution(), this, this.typeConstructorParameters);
                this.declaredTypeParameters = kotlin.collections.CollectionsKt.filter(this.typeConstructorParameters, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.1
                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
                        return java.lang.Boolean.valueOf(!typeParameterDescriptor.isCapturedFromOuterDeclaration());
                    }
                });
            }
        }
        return this.newSubstitutor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.original.getTypeConstructor();
        if (this.originalSubstitutor.isEmpty()) {
            if (typeConstructor == null) {
                $$$reportNull$$$0(0);
            }
            return typeConstructor;
        }
        if (this.typeConstructor == null) {
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substitutor = getSubstitutor();
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
            java.util.ArrayList arrayList = new java.util.ArrayList(collectionMo1269getSupertypes.size());
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = collectionMo1269getSupertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(substitutor.substitute(it.next(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT));
            }
            this.typeConstructor = new kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl(this, this.typeConstructorParameters, arrayList, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = this.typeConstructor;
        if (typeConstructor2 == null) {
            $$$reportNull$$$0(1);
        }
        return typeConstructor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(4);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = this.original.getMemberScope(typeSubstitution);
        if (!this.originalSubstitutor.isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope(memberScope, getSubstitutor());
        }
        if (memberScope == null) {
            $$$reportNull$$$0(5);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = this.original.getUnsubstitutedMemberScope();
        if (!this.originalSubstitutor.isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope(unsubstitutedMemberScope, getSubstitutor());
        }
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(6);
        }
        return unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope staticScope = this.original.getStaticScope();
        if (staticScope == null) {
            $$$reportNull$$$0(7);
        }
        return staticScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeSimpleNotNullType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(getAnnotations(), this, kotlin.reflect.jvm.internal.impl.types.TypeUtils.getDefaultTypeProjections(getTypeConstructor().getParameters()));
        if (simpleTypeSimpleNotNullType == null) {
            $$$reportNull$$$0(8);
        }
        return simpleTypeSimpleNotNullType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getThisAsReceiverParameter() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = this.original.getConstructors();
        java.util.ArrayList arrayList = new java.util.ArrayList(constructors.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) classConstructorDescriptor.newCopyBuilder().setOriginal(classConstructorDescriptor.getOriginal()).setModality(classConstructorDescriptor.getModality()).setVisibility(classConstructorDescriptor.getVisibility()).setKind(classConstructorDescriptor.getKind()).setCopyOverrides(false).build()).substitute(getSubstitutor()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = this.original.getAnnotations();
        if (annotations == null) {
            $$$reportNull$$$0(10);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name name = this.original.getName();
        if (name == null) {
            $$$reportNull$$$0(11);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor original = this.original.getOriginal();
        if (original == null) {
            $$$reportNull$$$0(12);
        }
        return original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.original.getContainingDeclaration();
        if (containingDeclaration == null) {
            $$$reportNull$$$0(13);
        }
        return containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(14);
        }
        return typeSubstitutor.isEmpty() ? this : new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor(this, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.createChainedSubstitutor(typeSubstitutor.getSubstitution(), getSubstitutor().getSubstitution()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo1261getCompanionObjectDescriptor() {
        return this.original.mo1261getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind = this.original.getKind();
        if (kind == null) {
            $$$reportNull$$$0(16);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = this.original.getModality();
        if (modality == null) {
            $$$reportNull$$$0(17);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = this.original.getVisibility();
        if (visibility == null) {
            $$$reportNull$$$0(18);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.original.isInner();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return this.original.isData();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.original.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return this.original.isCompanionObject();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.original.isExpect();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.original.isActual();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedInnerClassesScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = this.original.getUnsubstitutedInnerClassesScope();
        if (unsubstitutedInnerClassesScope == null) {
            $$$reportNull$$$0(19);
        }
        return unsubstitutedInnerClassesScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo1262getUnsubstitutedPrimaryConstructor() {
        return this.original.mo1262getUnsubstitutedPrimaryConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        if (sourceElement == null) {
            $$$reportNull$$$0(20);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        getSubstitutor();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = this.declaredTypeParameters;
        if (list == null) {
            $$$reportNull$$$0(21);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getSealedSubclasses() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> sealedSubclasses = this.original.getSealedSubclasses();
        if (sealedSubclasses == null) {
            $$$reportNull$$$0(22);
        }
        return sealedSubclasses;
    }
}
