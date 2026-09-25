package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* JADX INFO: compiled from: FunctionClassScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FunctionClassScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Function.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.SuspendFunction.ordinal()] = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor containingClass) {
        super(storageManager, containingClass);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> computeDeclaredFunctions() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingClass = getContainingClass();
        if (containingClass == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        }
        int i = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassScope.WhenMappings.$EnumSwitchMapping$0[((kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor) containingClass).getFunctionKind().ordinal()];
        if (i == 1) {
            return kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory.create((kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor) getContainingClass(), false));
        }
        if (i == 2) {
            return kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory.create((kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor) getContainingClass(), true));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
