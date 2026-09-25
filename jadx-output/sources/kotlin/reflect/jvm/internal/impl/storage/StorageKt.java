package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: compiled from: storage.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StorageKt {
    public static final <T> T getValue(kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<? extends T> getValue, java.lang.Object obj, kotlin.reflect.KProperty<?> p) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getValue, "$this$getValue");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p, "p");
        return getValue.invoke();
    }

    public static final <T> T getValue(kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<? extends T> getValue, java.lang.Object obj, kotlin.reflect.KProperty<?> p) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getValue, "$this$getValue");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p, "p");
        return getValue.invoke();
    }
}
