package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: loaded from: classes2.dex */
public class TypeParameterDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor {
    private boolean initialized;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Void> reportCycleError;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 4 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 24) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 11:
            case 17:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
            case 12:
            case 18:
                objArr[0] = "variance";
                break;
            case 3:
            case 8:
            case 13:
            case 19:
                objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 5:
            case 10:
            case 16:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
            case 14:
            case 20:
                objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE;
                break;
            case 15:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 21:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 22:
                objArr[0] = "bound";
                break;
            case 23:
                objArr[0] = "type";
                break;
        }
        if (i == 4) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 4:
            case 24:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createForFurtherModification";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "<init>";
                break;
            case 22:
                objArr[2] = "addUpperBound";
                break;
            case 23:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 24) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor createWithDefaultBound(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.name.Name name, int i) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (variance == null) {
            $$$reportNull$$$0(2);
        }
        if (name == null) {
            $$$reportNull$$$0(3);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl typeParameterDescriptorImplCreateForFurtherModification = createForFurtherModification(declarationDescriptor, annotations, z, variance, name, i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        typeParameterDescriptorImplCreateForFurtherModification.addUpperBound(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(declarationDescriptor).getDefaultBound());
        typeParameterDescriptorImplCreateForFurtherModification.setInitialized();
        if (typeParameterDescriptorImplCreateForFurtherModification == null) {
            $$$reportNull$$$0(4);
        }
        return typeParameterDescriptorImplCreateForFurtherModification;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl createForFurtherModification(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.name.Name name, int i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(5);
        }
        if (annotations == null) {
            $$$reportNull$$$0(6);
        }
        if (variance == null) {
            $$$reportNull$$$0(7);
        }
        if (name == null) {
            $$$reportNull$$$0(8);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(9);
        }
        return createForFurtherModification(declarationDescriptor, annotations, z, variance, name, i, sourceElement, null, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl createForFurtherModification(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.name.Name name, int i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Void> function1, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(10);
        }
        if (annotations == null) {
            $$$reportNull$$$0(11);
        }
        if (variance == null) {
            $$$reportNull$$$0(12);
        }
        if (name == null) {
            $$$reportNull$$$0(13);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(14);
        }
        if (supertypeLoopChecker == null) {
            $$$reportNull$$$0(15);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl(declarationDescriptor, annotations, z, variance, name, i, sourceElement, function1, supertypeLoopChecker);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TypeParameterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.name.Name name, int i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Void> function1, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker) {
        super(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS, declarationDescriptor, annotations, name, variance, z, i, sourceElement, supertypeLoopChecker);
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(16);
        }
        if (annotations == null) {
            $$$reportNull$$$0(17);
        }
        if (variance == null) {
            $$$reportNull$$$0(18);
        }
        if (name == null) {
            $$$reportNull$$$0(19);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(20);
        }
        if (supertypeLoopChecker == null) {
            $$$reportNull$$$0(21);
        }
        this.upperBounds = new java.util.ArrayList(1);
        this.initialized = false;
        this.reportCycleError = function1;
    }

    private void checkInitialized() {
        if (this.initialized) {
            return;
        }
        throw new java.lang.IllegalStateException("Type parameter descriptor is not initialized: " + nameForAssertions());
    }

    private void checkUninitialized() {
        if (this.initialized) {
            throw new java.lang.IllegalStateException("Type parameter descriptor is already initialized: " + nameForAssertions());
        }
    }

    private java.lang.String nameForAssertions() {
        return getName() + " declared in " + kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(getContainingDeclaration());
    }

    public void setInitialized() {
        checkUninitialized();
        this.initialized = true;
    }

    public void addUpperBound(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(22);
        }
        checkUninitialized();
        doAddUpperBound(kotlinType);
    }

    private void doAddUpperBound(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType)) {
            return;
        }
        this.upperBounds.add(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: reportSupertypeLoopError */
    protected void mo1271reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(23);
        }
        kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Void> function1 = this.reportCycleError;
        if (function1 == null) {
            return;
        }
        function1.invoke(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> resolveUpperBounds() {
        checkInitialized();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list = this.upperBounds;
        if (list == null) {
            $$$reportNull$$$0(24);
        }
        return list;
    }
}
