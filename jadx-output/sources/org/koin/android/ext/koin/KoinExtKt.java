package org.koin.android.ext.koin;

/* JADX INFO: compiled from: KoinExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"androidContext", "Lorg/koin/core/KoinApplication;", "Landroid/content/Context;", "androidFileProperties", "koinPropertyFile", "", "androidLogger", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "Lorg/koin/core/logger/Level;", "koin-android_release"}, k = 2, mv = {1, 1, 15})
public final class KoinExtKt {
    public static /* synthetic */ org.koin.core.KoinApplication androidLogger$default(org.koin.core.KoinApplication koinApplication, org.koin.core.logger.Level level, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            level = org.koin.core.logger.Level.INFO;
        }
        return androidLogger(koinApplication, level);
    }

    public static final org.koin.core.KoinApplication androidLogger(org.koin.core.KoinApplication androidLogger, org.koin.core.logger.Level level) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(androidLogger, "$this$androidLogger");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
        org.koin.core.KoinApplication.INSTANCE.setLogger(new org.koin.android.logger.AndroidLogger(level));
        return androidLogger;
    }

    public static final org.koin.core.KoinApplication androidContext(org.koin.core.KoinApplication androidContext, final android.content.Context androidContext2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(androidContext, "$this$androidContext");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(androidContext2, "androidContext");
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.INFO)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().info("[init] declare Android Context");
        }
        org.koin.core.registry.BeanRegistry beanRegistry = androidContext.getKoin().getRootScope().getBeanRegistry();
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, android.content.Context> function2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, android.content.Context>() { // from class: org.koin.android.ext.koin.KoinExtKt.androidContext.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final android.content.Context invoke(org.koin.core.scope.Scope receiver, org.koin.core.parameter.DefinitionParameters it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return androidContext2;
            }
        };
        org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
        org.koin.core.definition.BeanDefinition<?> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        beanRegistry.saveDefinition(beanDefinition);
        if (androidContext2 instanceof android.app.Application) {
            org.koin.core.registry.BeanRegistry beanRegistry2 = androidContext.getKoin().getRootScope().getBeanRegistry();
            org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
            kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, android.app.Application> function3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, android.app.Application>() { // from class: org.koin.android.ext.koin.KoinExtKt.androidContext.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final android.app.Application invoke(org.koin.core.scope.Scope receiver, org.koin.core.parameter.DefinitionParameters it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return (android.app.Application) androidContext2;
                }
            };
            org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Single;
            org.koin.core.definition.BeanDefinition<?> beanDefinition2 = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.app.Application.class));
            beanDefinition2.setDefinition(function3);
            beanDefinition2.setKind(kind2);
            beanRegistry2.saveDefinition(beanDefinition2);
        }
        return androidContext;
    }

    public static /* synthetic */ org.koin.core.KoinApplication androidFileProperties$default(org.koin.core.KoinApplication koinApplication, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "koin.properties";
        }
        return androidFileProperties(koinApplication, str);
    }

    public static final org.koin.core.KoinApplication androidFileProperties(org.koin.core.KoinApplication androidFileProperties, java.lang.String koinPropertyFile) {
        java.lang.String[] list;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(androidFileProperties, "$this$androidFileProperties");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(koinPropertyFile, "koinPropertyFile");
        java.util.Properties properties = new java.util.Properties();
        android.content.Context context = (android.content.Context) androidFileProperties.getKoin().getRootScope().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
        try {
            android.content.res.AssetManager assets = context.getAssets();
            if ((assets == null || (list = assets.list("")) == null) ? false : kotlin.collections.ArraysKt.contains(list, koinPropertyFile)) {
                try {
                    java.io.InputStream inputStreamOpen = context.getAssets().open(koinPropertyFile);
                    java.lang.Throwable th = (java.lang.Throwable) null;
                    try {
                        properties.load(inputStreamOpen);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(inputStreamOpen, th);
                        androidFileProperties.getKoin().getPropertyRegistry().saveProperties(properties);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.INFO)) {
                            org.koin.core.KoinApplication.INSTANCE.getLogger().info("[Android-Properties] loaded " + unit2 + " properties from assets/koin.properties");
                        }
                    } catch (java.lang.Throwable th2) {
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            kotlin.io.CloseableKt.closeFinally(inputStreamOpen, th2);
                            throw th3;
                        }
                    }
                } catch (java.lang.Exception e) {
                    org.koin.core.KoinApplication.INSTANCE.getLogger().error("[Android-Properties] error for binding properties : " + e);
                }
            } else if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.INFO)) {
                org.koin.core.KoinApplication.INSTANCE.getLogger().info("[Android-Properties] no assets/koin.properties file to load");
            }
        } catch (java.lang.Exception e2) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().error("[Android-Properties] error while loading properties from assets/koin.properties : " + e2);
        }
        return androidFileProperties;
    }
}
