package org.koin.dsl;

/* JADX INFO: compiled from: DefinitionBinding.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0004\u001a,\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007H\u0086\u0004¢\u0006\u0002\u0010\b\u001a?\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001e\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u0002H\u0002`\fH\u0086\u0004\u001a?\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001e\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u0002H\u0002`\u000eH\u0086\u0004¨\u0006\u000f"}, d2 = {"bind", "Lorg/koin/core/definition/BeanDefinition;", "T", "clazz", "Lkotlin/reflect/KClass;", "binds", "classes", "", "(Lorg/koin/core/definition/BeanDefinition;[Lkotlin/reflect/KClass;)Lorg/koin/core/definition/BeanDefinition;", "onClose", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "onRelease", "Lorg/koin/core/definition/OnReleaseCallback;", "koin-core"}, k = 2, mv = {1, 1, 15})
public final class DefinitionBindingKt {
    public static final <T> org.koin.core.definition.BeanDefinition<T> bind(org.koin.core.definition.BeanDefinition<T> bind, kotlin.reflect.KClass<?> clazz) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(bind, "$this$bind");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        bind.getSecondaryTypes().add(clazz);
        return bind;
    }

    public static final org.koin.core.definition.BeanDefinition<?> binds(org.koin.core.definition.BeanDefinition<?> binds, kotlin.reflect.KClass<?>[] classes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(binds, "$this$binds");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classes, "classes");
        kotlin.collections.CollectionsKt.addAll(binds.getSecondaryTypes(), classes);
        return binds;
    }

    public static final <T> org.koin.core.definition.BeanDefinition<T> onRelease(org.koin.core.definition.BeanDefinition<T> onRelease, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onRelease2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onRelease, "$this$onRelease");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onRelease2, "onRelease");
        onRelease.setOnRelease(onRelease2);
        return onRelease;
    }

    public static final <T> org.koin.core.definition.BeanDefinition<T> onClose(org.koin.core.definition.BeanDefinition<T> onClose, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onClose2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onClose, "$this$onClose");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onClose2, "onClose");
        onClose.setOnClose(onClose2);
        return onClose;
    }
}
