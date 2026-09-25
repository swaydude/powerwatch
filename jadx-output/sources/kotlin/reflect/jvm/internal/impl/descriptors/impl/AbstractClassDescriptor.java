package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractClassDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.types.SimpleType> defaultType;
    private final kotlin.reflect.jvm.internal.impl.name.Name name;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> thisAsReceiverParameter;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> unsubstitutedInnerClassesScope;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 9 || i == 11 || i == 12) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 9 || i == 11 || i == 12) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
                objArr[0] = "typeArguments";
                break;
            case 8:
                objArr[0] = "typeSubstitution";
                break;
            case 10:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 7 || i == 9) {
            objArr[1] = "getMemberScope";
        } else if (i == 11) {
            objArr[1] = "substitute";
        } else if (i != 12) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                break;
            case 6:
            case 8:
                objArr[2] = "getMemberScope";
                break;
            case 10:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 7 && i != 9 && i != 11 && i != 12) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getOriginal() {
        return this;
    }

    public AbstractClassDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        if (name == null) {
            $$$reportNull$$$0(1);
        }
        this.name = name;
        this.defaultType = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.1
            @Override // kotlin.jvm.functions.Function0
            public kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor abstractClassDescriptor = kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.this;
                return kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope());
            }
        });
        this.unsubstitutedInnerClassesScope = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.2
            @Override // kotlin.jvm.functions.Function0
            public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke() {
                return new kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.this.getUnsubstitutedMemberScope());
            }
        });
        this.thisAsReceiverParameter = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.3
            @Override // kotlin.jvm.functions.Function0
            public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor invoke() {
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyClassReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.this);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name name = this.name;
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedInnerClassesScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeInvoke = this.unsubstitutedInnerClassesScope.invoke();
        if (memberScopeInvoke == null) {
            $$$reportNull$$$0(4);
        }
        return memberScopeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getThisAsReceiverParameter() {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptorInvoke = this.thisAsReceiverParameter.invoke();
        if (receiverParameterDescriptorInvoke == null) {
            $$$reportNull$$$0(5);
        }
        return receiverParameterDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(8);
        }
        if (!typeSubstitution.isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope(getUnsubstitutedMemberScope(), kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(typeSubstitution));
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope();
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(9);
        }
        return unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(10);
        }
        return typeSubstitutor.isEmpty() ? this : new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeInvoke = this.defaultType.invoke();
        if (simpleTypeInvoke == null) {
            $$$reportNull$$$0(12);
        }
        return simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d);
    }
}
