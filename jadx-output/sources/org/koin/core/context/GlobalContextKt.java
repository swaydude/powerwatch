package org.koin.core.context;

/* JADX INFO: compiled from: GlobalContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004\u001a#\u0010\u0006\u001a\u00020\u00072\u001b\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tj\u0002`\n¢\u0006\u0002\b\u000b\u001a\u0006\u0010\f\u001a\u00020\u0001\u001a\u0014\u0010\r\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"loadKoinModules", "", "modules", "", "Lorg/koin/core/module/Module;", "module", "startKoin", "Lorg/koin/core/KoinApplication;", "appDeclaration", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "stopKoin", "unloadKoinModules", "koin-core"}, k = 2, mv = {1, 1, 15})
public final class GlobalContextKt {
    public static final org.koin.core.KoinApplication startKoin(kotlin.jvm.functions.Function1<? super org.koin.core.KoinApplication, kotlin.Unit> appDeclaration) throws org.koin.core.error.KoinAppAlreadyStartedException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(appDeclaration, "appDeclaration");
        org.koin.core.KoinApplication koinApplicationCreate = org.koin.core.KoinApplication.INSTANCE.create();
        org.koin.core.context.GlobalContext.start(koinApplicationCreate);
        appDeclaration.invoke(koinApplicationCreate);
        koinApplicationCreate.createEagerInstances();
        return koinApplicationCreate;
    }

    public static final void stopKoin() {
        org.koin.core.context.GlobalContext.stop();
    }

    public static final void loadKoinModules(org.koin.core.module.Module module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        org.koin.core.context.GlobalContext.get().modules(kotlin.collections.CollectionsKt.listOf(module));
    }

    public static final void loadKoinModules(java.util.List<org.koin.core.module.Module> modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        org.koin.core.context.GlobalContext.get().modules(modules);
    }

    public static final void unloadKoinModules(org.koin.core.module.Module module) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(module, "module");
        org.koin.core.context.GlobalContext.get().unloadModules(kotlin.collections.CollectionsKt.listOf(module));
    }

    public static final void unloadKoinModules(java.util.List<org.koin.core.module.Module> modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        org.koin.core.context.GlobalContext.get().unloadModules(modules);
    }
}
