package kotlin.reflect.full;

/* JADX INFO: compiled from: KProperties.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0007\u001a/\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"getExtensionDelegate", "", "Lkotlin/reflect/KProperty1;", "D", "Lkotlin/reflect/KProperty2;", "receiver", "(Lkotlin/reflect/KProperty2;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KProperties {
    public static final java.lang.Object getExtensionDelegate(kotlin.reflect.KProperty1<?, ?> getExtensionDelegate) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getExtensionDelegate, "$this$getExtensionDelegate");
        return getExtensionDelegate.getDelegate(kotlin.reflect.jvm.internal.KPropertyImpl.INSTANCE.getEXTENSION_PROPERTY_DELEGATE());
    }

    public static final <D> java.lang.Object getExtensionDelegate(kotlin.reflect.KProperty2<D, ?, ?> getExtensionDelegate, D d) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getExtensionDelegate, "$this$getExtensionDelegate");
        return getExtensionDelegate.getDelegate(d, kotlin.reflect.jvm.internal.KPropertyImpl.INSTANCE.getEXTENSION_PROPERTY_DELEGATE());
    }
}
