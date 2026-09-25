package org.koin.androidx.viewmodel;

/* JADX INFO: compiled from: ViewModelParameters.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002BW\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\u0004\u0018\u0001`\u000f¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\u0004\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelParameters;", "T", "", "clazz", "Lkotlin/reflect/KClass;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "from", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lorg/koin/androidx/viewmodel/ViewModelStoreOwnerDefinition;", "parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getClazz", "()Lkotlin/reflect/KClass;", "getFrom", "()Lkotlin/jvm/functions/Function0;", "getOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getParameters", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "koin-androidx-viewmodel_release"}, k = 1, mv = {1, 1, 15})
public final class ViewModelParameters<T> {
    private final kotlin.reflect.KClass<T> clazz;
    private final kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStoreOwner> from;
    private final androidx.lifecycle.LifecycleOwner owner;
    private final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> parameters;
    private final org.koin.core.qualifier.Qualifier qualifier;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelParameters(kotlin.reflect.KClass<T> clazz, androidx.lifecycle.LifecycleOwner owner, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> function0, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(owner, "owner");
        this.clazz = clazz;
        this.owner = owner;
        this.qualifier = qualifier;
        this.from = function0;
        this.parameters = function1;
    }

    public final kotlin.reflect.KClass<T> getClazz() {
        return this.clazz;
    }

    public final androidx.lifecycle.LifecycleOwner getOwner() {
        return this.owner;
    }

    public /* synthetic */ ViewModelParameters(kotlin.reflect.KClass kClass, androidx.lifecycle.LifecycleOwner lifecycleOwner, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, lifecycleOwner, (i & 4) != 0 ? (org.koin.core.qualifier.Qualifier) null : qualifier, (i & 8) != 0 ? (kotlin.jvm.functions.Function0) null : function0, (i & 16) != 0 ? (kotlin.jvm.functions.Function0) null : function1);
    }

    public final org.koin.core.qualifier.Qualifier getQualifier() {
        return this.qualifier;
    }

    public final kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStoreOwner> getFrom() {
        return this.from;
    }

    public final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> getParameters() {
        return this.parameters;
    }
}
