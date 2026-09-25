package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: compiled from: CloneableClassScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CloneableClassScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope {
    private static final kotlin.reflect.jvm.internal.impl.name.Name CLONE_NAME;
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingClass) {
        super(storageManager, containingClass);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> computeDeclaredFunctions() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl.create(getContainingClass(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), CLONE_NAME, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        simpleFunctionDescriptorImplCreate.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, getContainingClass().getThisAsReceiverParameter(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(getContainingClass()).getAnyType(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PROTECTED);
        return kotlin.collections.CollectionsKt.listOf(simpleFunctionDescriptorImplCreate);
    }

    /* JADX INFO: compiled from: CloneableClassScope.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.name.Name getCLONE_NAME$descriptors_jvm() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.CLONE_NAME;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("clone");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(\"clone\")");
        CLONE_NAME = nameIdentifier;
    }
}
