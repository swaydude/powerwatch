package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyWrappedType extends kotlin.reflect.jvm.internal.impl.types.WrappedType {
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.types.KotlinType> lazyValue;

    public LazyWrappedType(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> computation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computation, "computation");
        this.lazyValue = storageManager.createLazyValue(computation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    protected kotlin.reflect.jvm.internal.impl.types.KotlinType getDelegate() {
        return this.lazyValue.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }
}
