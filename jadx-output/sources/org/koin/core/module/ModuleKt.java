package org.koin.core.module;

/* JADX INFO: compiled from: Module.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\u0004"}, d2 = {"plus", "", "Lorg/koin/core/module/Module;", "module", "koin-core"}, k = 2, mv = {1, 1, 15})
public final class ModuleKt {
    public static final java.util.List<org.koin.core.module.Module> plus(java.util.List<org.koin.core.module.Module> plus, org.koin.core.module.Module module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(plus, "$this$plus");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) plus, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(module));
    }
}
