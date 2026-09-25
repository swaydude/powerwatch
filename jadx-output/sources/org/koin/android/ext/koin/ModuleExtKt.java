package org.koin.android.ext.koin;

/* JADX INFO: compiled from: ModuleExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"ERROR_MSG", "", "androidApplication", "Landroid/app/Application;", "Lorg/koin/core/scope/Scope;", "androidContext", "Landroid/content/Context;", "koin-android_release"}, k = 2, mv = {1, 1, 15})
public final class ModuleExtKt {
    public static final java.lang.String ERROR_MSG = "Please use androidContext() function in your KoinApplication configuration.";

    public static final android.content.Context androidContext(org.koin.core.scope.Scope androidContext) throws org.koin.android.error.MissingAndroidContextException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(androidContext, "$this$androidContext");
        try {
            return (android.content.Context) androidContext.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
        } catch (java.lang.Exception unused) {
            throw new org.koin.android.error.MissingAndroidContextException("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    public static final android.app.Application androidApplication(org.koin.core.scope.Scope androidApplication) throws org.koin.android.error.MissingAndroidContextException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(androidApplication, "$this$androidApplication");
        try {
            return (android.app.Application) androidApplication.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.app.Application.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
        } catch (java.lang.Exception unused) {
            throw new org.koin.android.error.MissingAndroidContextException("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
