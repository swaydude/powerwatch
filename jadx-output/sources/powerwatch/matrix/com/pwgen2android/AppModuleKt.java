package powerwatch.matrix.com.pwgen2android;

/* JADX INFO: compiled from: AppModule.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"appModule", "Lorg/koin/core/module/Module;", "appContext", "Landroid/content/Context;", "cloud", "prodEnabled", "", "logger", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class AppModuleKt {
    public static final org.koin.core.module.Module cloud(boolean z) {
        return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule(powerwatch.matrix.com.pwgen2android.EnvironmentKt.cloudConfiguration(z));
    }

    public static final org.koin.core.module.Module logger(boolean z) {
        return powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.loggerModule(new powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig(z ? powerwatch.matrix.com.pwgen2android.shared.logger.Env.PROD.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.logger.Env.DEV.INSTANCE));
    }

    public static final org.koin.core.module.Module appModule(final android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        return org.koin.dsl.ModuleKt.module$default(false, false, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(org.koin.core.module.Module module) {
                invoke2(module);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(org.koin.core.module.Module module) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "$this$module");
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.C00421 c00421 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.BugfenderConfig>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.BugfenderConfig invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.BugfenderConfig();
                    }
                };
                org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.BugfenderConfig.class));
                beanDefinition.setDefinition(c00421);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false));
                final android.content.Context context = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage> function2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorageImpl(context);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage.class));
                beanDefinition2.setDefinition(function2);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false));
                final android.content.Context context2 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver> function3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver(context2, (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver.class));
                beanDefinition3.setDefinition(function3);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false));
                final android.content.Context context3 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver> function4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver(context3, (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory4 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind4 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition4 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver.class));
                beanDefinition4.setDefinition(function4);
                beanDefinition4.setKind(kind4);
                module.declareDefinition(beanDefinition4, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass5 anonymousClass5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DBDataRecovery>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.5
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DBDataRecovery invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.DBDataRecovery((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory5 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind5 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition5 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DBDataRecovery.class));
                beanDefinition5.setDefinition(anonymousClass5);
                beanDefinition5.setKind(kind5);
                module.declareDefinition(beanDefinition5, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass6 anonymousClass6 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.6
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeControllerImpl();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory6 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind6 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition6 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController.class));
                beanDefinition6.setDefinition(anonymousClass6);
                beanDefinition6.setKind(kind6);
                module.declareDefinition(beanDefinition6, new org.koin.core.definition.Options(false, false));
                final android.content.Context context4 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver> function5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver(context4);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory7 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind7 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition7 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver.class));
                beanDefinition7.setDefinition(function5);
                beanDefinition7.setKind(kind7);
                module.declareDefinition(beanDefinition7, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass8 anonymousClass8 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.8
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory8 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind8 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition8 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class));
                beanDefinition8.setDefinition(anonymousClass8);
                beanDefinition8.setKind(kind8);
                module.declareDefinition(beanDefinition8, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass9 anonymousClass9 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.RxBus>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.9
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.RxBus invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.RxBus();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory9 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind9 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition9 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class));
                beanDefinition9.setDefinition(anonymousClass9);
                beanDefinition9.setKind(kind9);
                module.declareDefinition(beanDefinition9, new org.koin.core.definition.Options(false, false));
                final android.content.Context context5 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.utils.LanguageController> function6 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.utils.LanguageController>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.utils.LanguageController invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl((powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), context5);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory10 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind10 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition10 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class));
                beanDefinition10.setDefinition(function6);
                beanDefinition10.setKind(kind10);
                module.declareDefinition(beanDefinition10, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass11 anonymousClass11 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.11
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManagerImpl();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory11 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind11 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition11 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.class));
                beanDefinition11.setDefinition(anonymousClass11);
                beanDefinition11.setKind(kind11);
                module.declareDefinition(beanDefinition11, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass12 anonymousClass12 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.12
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.tracelogger.TraceLoggerImpl((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), null, 2, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory12 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind12 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition12 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger.class));
                beanDefinition12.setDefinition(anonymousClass12);
                beanDefinition12.setKind(kind12);
                module.declareDefinition(beanDefinition12, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass13 anonymousClass13 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.13
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory13 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind13 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition13 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel.class));
                beanDefinition13.setDefinition(anonymousClass13);
                beanDefinition13.setKind(kind13);
                module.declareDefinition(beanDefinition13, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass14 anonymousClass14 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.14
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizerImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory14 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind14 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition14 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class));
                beanDefinition14.setDefinition(anonymousClass14);
                beanDefinition14.setKind(kind14);
                module.declareDefinition(beanDefinition14, new org.koin.core.definition.Options(false, false));
                final android.content.Context context6 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider> function7 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProviderImpl(context6);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory15 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind15 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition15 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider.class));
                beanDefinition15.setDefinition(function7);
                beanDefinition15.setKind(kind15);
                module.declareDefinition(beanDefinition15, new org.koin.core.definition.Options(false, false));
                final android.content.Context context7 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager> function8 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
                        return new powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManagerImpl(defaultAdapter, context7);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory16 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind16 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition16 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class));
                beanDefinition16.setDefinition(function8);
                beanDefinition16.setKind(kind16);
                module.declareDefinition(beanDefinition16, new org.koin.core.definition.Options(false, false));
                final android.content.Context context8 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider> function9 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl(context8);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory17 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind17 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition17 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider.class));
                beanDefinition17.setDefinition(function9);
                beanDefinition17.setKind(kind17);
                module.declareDefinition(beanDefinition17, new org.koin.core.definition.Options(false, false));
                final android.content.Context context9 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener> function10 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListenerImpl(context9);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory18 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind18 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition18 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener.class));
                beanDefinition18.setDefinition(function10);
                beanDefinition18.setKind(kind18);
                module.declareDefinition(beanDefinition18, new org.koin.core.definition.Options(false, false));
                final android.content.Context context10 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService> function11 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.19
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), context10, (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener.class), qualifier2, function0), null, 16, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory19 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind19 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition19 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService.class));
                beanDefinition19.setDefinition(function11);
                beanDefinition19.setKind(kind19);
                module.declareDefinition(beanDefinition19, new org.koin.core.definition.Options(false, false));
                final android.content.Context context11 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager> function12 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.20
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0), context11);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory20 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind20 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition20 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class));
                beanDefinition20.setDefinition(function12);
                beanDefinition20.setKind(kind20);
                module.declareDefinition(beanDefinition20, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass21 anonymousClass21 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.21
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManagerImpl((powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory21 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind21 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition21 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager.class));
                beanDefinition21.setDefinition(anonymousClass21);
                beanDefinition21.setKind(kind21);
                module.declareDefinition(beanDefinition21, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass22 anonymousClass22 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.22
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager$activityContext) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager$activityContext, "$dstr$fragmentManager$activityContext");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM((androidx.fragment.app.FragmentManager) dstr$fragmentManager$activityContext.component1(), (android.content.Context) dstr$fragmentManager$activityContext.component2(), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory22 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind22 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition22 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.ui.NotificationSettingsVM.class));
                beanDefinition22.setDefinition(anonymousClass22);
                beanDefinition22.setKind(kind22);
                module.declareDefinition(beanDefinition22, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition22);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass23 anonymousClass23 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.23
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory23 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind23 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition23 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference.class));
                beanDefinition23.setDefinition(anonymousClass23);
                beanDefinition23.setKind(kind23);
                module.declareDefinition(beanDefinition23, new org.koin.core.definition.Options(false, false));
                final android.content.Context context12 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator> function13 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.24
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl(context12, (powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), null, null, 12, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory24 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind24 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition24 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class));
                beanDefinition24.setDefinition(function13);
                beanDefinition24.setKind(kind24);
                module.declareDefinition(beanDefinition24, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass25 anonymousClass25 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.25
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicatorImpl((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory25 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind25 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition25 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator.class));
                beanDefinition25.setDefinition(anonymousClass25);
                beanDefinition25.setKind(kind25);
                module.declareDefinition(beanDefinition25, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass26 anonymousClass26 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.26
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.strava.StravaController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.strava.StravaController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DBDataRecovery) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DBDataRecovery.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory26 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind26 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition26 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository.class));
                beanDefinition26.setDefinition(anonymousClass26);
                beanDefinition26.setKind(kind26);
                module.declareDefinition(beanDefinition26, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass27 anonymousClass27 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.27
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory27 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind27 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition27 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class));
                beanDefinition27.setDefinition(anonymousClass27);
                beanDefinition27.setKind(kind27);
                module.declareDefinition(beanDefinition27, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass28 anonymousClass28 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.SelectDate>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.28
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.SelectDate invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.SelectDate) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory28 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind28 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition28 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectDate.class));
                beanDefinition28.setDefinition(anonymousClass28);
                beanDefinition28.setKind(kind28);
                module.declareDefinition(beanDefinition28, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass29 anonymousClass29 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.29
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory29 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind29 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition29 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProviderImpl.class));
                beanDefinition29.setDefinition(anonymousClass29);
                beanDefinition29.setKind(kind29);
                module.declareDefinition(beanDefinition29, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass30 anonymousClass30 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.30
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory30 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind30 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition30 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.class));
                beanDefinition30.setDefinition(anonymousClass30);
                beanDefinition30.setKind(kind30);
                module.declareDefinition(beanDefinition30, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass31 anonymousClass31 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.31
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory31 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind31 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition31 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.class));
                beanDefinition31.setDefinition(anonymousClass31);
                beanDefinition31.setKind(kind31);
                module.declareDefinition(beanDefinition31, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass32 anonymousClass32 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitWriter>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.32
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitWriter invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitWriter((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory32 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind32 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition32 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitWriter.class));
                beanDefinition32.setDefinition(anonymousClass32);
                beanDefinition32.setKind(kind32);
                module.declareDefinition(beanDefinition32, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass33 anonymousClass33 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.33
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitWriter) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitWriter.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory33 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind33 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition33 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class));
                beanDefinition33.setDefinition(anonymousClass33);
                beanDefinition33.setKind(kind33);
                module.declareDefinition(beanDefinition33, new org.koin.core.definition.Options(false, false));
                org.koin.core.qualifier.StringQualifier stringQualifierNamed = org.koin.core.qualifier.QualifierKt.named("stravaClient");
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass34 anonymousClass34 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.34
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP.class), qualifier2, function0), "https://www.strava.com", (com.google.gson.Gson) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.gson.Gson.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory34 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind34 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition34 = new org.koin.core.definition.BeanDefinition(stringQualifierNamed, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class));
                beanDefinition34.setDefinition(anonymousClass34);
                beanDefinition34.setKind(kind34);
                module.declareDefinition(beanDefinition34, new org.koin.core.definition.Options(false, false));
                org.koin.core.qualifier.StringQualifier stringQualifierNamed2 = org.koin.core.qualifier.QualifierKt.named("stravaApiClient");
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass35 anonymousClass35 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.35
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP.class), qualifier2, function0), "https://www.strava.com", (com.google.gson.Gson) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.gson.Gson.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory35 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind35 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition35 = new org.koin.core.definition.BeanDefinition(stringQualifierNamed2, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class));
                beanDefinition35.setDefinition(anonymousClass35);
                beanDefinition35.setKind(kind35);
                module.declareDefinition(beanDefinition35, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass36 anonymousClass36 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.36
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), org.koin.core.qualifier.QualifierKt.named("stravaClient"), (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory36 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind36 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition36 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService.class));
                beanDefinition36.setDefinition(anonymousClass36);
                beanDefinition36.setKind(kind36);
                module.declareDefinition(beanDefinition36, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass37 anonymousClass37 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.37
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorageImpl((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory37 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind37 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition37 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage.class));
                beanDefinition37.setDefinition(anonymousClass37);
                beanDefinition37.setKind(kind37);
                module.declareDefinition(beanDefinition37, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass38 anonymousClass38 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.38
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService.class), qualifier2, function0), powerwatch.matrix.com.pwgen2android.EnvironmentKt.stravaConfiguration(), (android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory38 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind38 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition38 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProvider.class));
                beanDefinition38.setDefinition(anonymousClass38);
                beanDefinition38.setKind(kind38);
                module.declareDefinition(beanDefinition38, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass39 anonymousClass39 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.39
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), org.koin.core.qualifier.QualifierKt.named("stravaApiClient"), function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProvider.class), (org.koin.core.qualifier.Qualifier) null, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory39 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind39 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition39 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService.class));
                beanDefinition39.setDefinition(anonymousClass39);
                beanDefinition39.setKind(kind39);
                module.declareDefinition(beanDefinition39, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass40 anonymousClass40 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.40
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl(powerwatch.matrix.com.pwgen2android.EnvironmentKt.stravaConfiguration(), (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory40 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind40 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition40 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud.class));
                beanDefinition40.setDefinition(anonymousClass40);
                beanDefinition40.setKind(kind40);
                module.declareDefinition(beanDefinition40, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass41 anonymousClass41 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.strava.StravaController>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.41
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.strava.StravaController invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.strava.StravaController((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory41 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind41 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition41 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.strava.StravaController.class));
                beanDefinition41.setDefinition(anonymousClass41);
                beanDefinition41.setKind(kind41);
                module.declareDefinition(beanDefinition41, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass42 anonymousClass42 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.42
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel((powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory42 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind42 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition42 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel.class));
                beanDefinition42.setDefinition(anonymousClass42);
                beanDefinition42.setKind(kind42);
                module.declareDefinition(beanDefinition42, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition42);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass43 anonymousClass43 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.43
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory43 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind43 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition43 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM.class));
                beanDefinition43.setDefinition(anonymousClass43);
                beanDefinition43.setKind(kind43);
                module.declareDefinition(beanDefinition43, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition43);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass44 anonymousClass44 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.44
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder((powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory44 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind44 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition44 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder.class));
                beanDefinition44.setDefinition(anonymousClass44);
                beanDefinition44.setKind(kind44);
                module.declareDefinition(beanDefinition44, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass45 anonymousClass45 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.45
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory45 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind45 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition45 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class));
                beanDefinition45.setDefinition(anonymousClass45);
                beanDefinition45.setKind(kind45);
                module.declareDefinition(beanDefinition45, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass46 anonymousClass46 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.46
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.DownloadExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.DownloadExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.OTAExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.OTAExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.FileTransfer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.FileTransfer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory46 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind46 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition46 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor.class));
                beanDefinition46.setDefinition(anonymousClass46);
                beanDefinition46.setKind(kind46);
                module.declareDefinition(beanDefinition46, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass47 anonymousClass47 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.FontUpdateController>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.47
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.FontUpdateController invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.FontUpdateController((powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.FontUpdateExecutor.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory47 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind47 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition47 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.FontUpdateController.class));
                beanDefinition47.setDefinition(anonymousClass47);
                beanDefinition47.setKind(kind47);
                module.declareDefinition(beanDefinition47, new org.koin.core.definition.Options(false, false));
                final android.content.Context context13 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer> function14 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.48
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizerImpl((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), context13, (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.FontUpdateController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.FontUpdateController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.strava.StravaController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.strava.StravaController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.BugfenderConfig) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.BugfenderConfig.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider.class), qualifier2, function0), null, 67108864, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory48 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind48 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition48 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class));
                beanDefinition48.setDefinition(function14);
                beanDefinition48.setKind(kind48);
                module.declareDefinition(beanDefinition48, new org.koin.core.definition.Options(false, false));
                final android.content.Context context14 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl> function15 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.49
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl(context14, (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver.class), qualifier2, function0), null, 16, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory49 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind49 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition49 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.class));
                beanDefinition49.setDefinition(function15);
                beanDefinition49.setKind(kind49);
                module.declareDefinition(beanDefinition49, new org.koin.core.definition.Options(false, false));
                final android.content.Context context15 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator> function16 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.50
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0), context15, null, 32, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory50 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind50 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition50 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.class));
                beanDefinition50.setDefinition(function16);
                beanDefinition50.setKind(kind50);
                module.declareDefinition(beanDefinition50, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass51 anonymousClass51 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.51
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory51 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind51 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition51 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager.class));
                beanDefinition51.setDefinition(anonymousClass51);
                beanDefinition51.setKind(kind51);
                module.declareDefinition(beanDefinition51, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass52 anonymousClass52 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.52
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory52 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind52 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition52 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage.class));
                beanDefinition52.setDefinition(anonymousClass52);
                beanDefinition52.setKind(kind52);
                module.declareDefinition(beanDefinition52, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass53 anonymousClass53 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.53
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory53 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind53 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition53 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear.class));
                beanDefinition53.setDefinition(anonymousClass53);
                beanDefinition53.setKind(kind53);
                module.declareDefinition(beanDefinition53, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass54 anonymousClass54 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.54
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory54 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind54 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition54 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository.class));
                beanDefinition54.setDefinition(anonymousClass54);
                beanDefinition54.setKind(kind54);
                module.declareDefinition(beanDefinition54, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass55 anonymousClass55 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.55
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory55 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind55 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition55 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.RestingLogRepository.class));
                beanDefinition55.setDefinition(anonymousClass55);
                beanDefinition55.setKind(kind55);
                module.declareDefinition(beanDefinition55, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass56 anonymousClass56 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.56
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory56 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind56 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition56 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.SleepLogRepository.class));
                beanDefinition56.setDefinition(anonymousClass56);
                beanDefinition56.setKind(kind56);
                module.declareDefinition(beanDefinition56, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass57 anonymousClass57 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.57
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao.class), qualifier2, function0), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory57 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind57 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition57 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository.class));
                beanDefinition57.setDefinition(anonymousClass57);
                beanDefinition57.setKind(kind57);
                module.declareDefinition(beanDefinition57, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass58 anonymousClass58 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.58
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao.class), qualifier2, function0), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory58 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind58 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition58 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository.class));
                beanDefinition58.setDefinition(anonymousClass58);
                beanDefinition58.setKind(kind58);
                module.declareDefinition(beanDefinition58, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass59 anonymousClass59 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.59
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao.class), qualifier2, function0), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory59 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind59 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition59 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository.class));
                beanDefinition59.setDefinition(anonymousClass59);
                beanDefinition59.setKind(kind59);
                module.declareDefinition(beanDefinition59, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass60 anonymousClass60 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.WalkingDayPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.60
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.WalkingDayPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.WalkingDayPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory60 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind60 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition60 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.WalkingDayPeriodRepository.class));
                beanDefinition60.setDefinition(anonymousClass60);
                beanDefinition60.setKind(kind60);
                module.declareDefinition(beanDefinition60, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass61 anonymousClass61 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.SleepDayPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.61
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.SleepDayPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.SleepDayPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory61 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind61 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition61 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.SleepDayPeriodRepository.class));
                beanDefinition61.setDefinition(anonymousClass61);
                beanDefinition61.setKind(kind61);
                module.declareDefinition(beanDefinition61, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass62 anonymousClass62 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.RestingDayPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.62
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.RestingDayPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.RestingDayPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory62 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind62 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition62 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.RestingDayPeriodRepository.class));
                beanDefinition62.setDefinition(anonymousClass62);
                beanDefinition62.setKind(kind62);
                module.declareDefinition(beanDefinition62, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass63 anonymousClass63 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.WalkingWeekPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.63
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.WalkingWeekPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.WalkingWeekPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory63 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind63 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition63 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.WalkingWeekPeriodRepository.class));
                beanDefinition63.setDefinition(anonymousClass63);
                beanDefinition63.setKind(kind63);
                module.declareDefinition(beanDefinition63, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass64 anonymousClass64 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.SleepWeekPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.64
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.SleepWeekPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.SleepWeekPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory64 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind64 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition64 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.SleepWeekPeriodRepository.class));
                beanDefinition64.setDefinition(anonymousClass64);
                beanDefinition64.setKind(kind64);
                module.declareDefinition(beanDefinition64, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass65 anonymousClass65 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.RestingWeekPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.65
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.RestingWeekPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.RestingWeekPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory65 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind65 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition65 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.RestingWeekPeriodRepository.class));
                beanDefinition65.setDefinition(anonymousClass65);
                beanDefinition65.setKind(kind65);
                module.declareDefinition(beanDefinition65, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass66 anonymousClass66 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.WalkingMonthPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.66
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.WalkingMonthPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.WalkingMonthPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.WalkingHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory66 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind66 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition66 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.WalkingMonthPeriodRepository.class));
                beanDefinition66.setDefinition(anonymousClass66);
                beanDefinition66.setKind(kind66);
                module.declareDefinition(beanDefinition66, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass67 anonymousClass67 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.67
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.SleepHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory67 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind67 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition67 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepository.class));
                beanDefinition67.setDefinition(anonymousClass67);
                beanDefinition67.setKind(kind67);
                module.declareDefinition(beanDefinition67, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass68 anonymousClass68 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.RestingMonthPeriodRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.68
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.RestingMonthPeriodRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.RestingMonthPeriodRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.hour.RestingHourPeriodRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory68 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind68 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition68 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.RestingMonthPeriodRepository.class));
                beanDefinition68.setDefinition(anonymousClass68);
                beanDefinition68.setKind(kind68);
                module.declareDefinition(beanDefinition68, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass69 anonymousClass69 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.69
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory69 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind69 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition69 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository.class));
                beanDefinition69.setDefinition(anonymousClass69);
                beanDefinition69.setKind(kind69);
                module.declareDefinition(beanDefinition69, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass70 anonymousClass70 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.70
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory70 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind70 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition70 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class));
                beanDefinition70.setDefinition(anonymousClass70);
                beanDefinition70.setKind(kind70);
                module.declareDefinition(beanDefinition70, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass71 anonymousClass71 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.71
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory71 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind71 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition71 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class));
                beanDefinition71.setDefinition(anonymousClass71);
                beanDefinition71.setKind(kind71);
                module.declareDefinition(beanDefinition71, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass72 anonymousClass72 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.72
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepositoryImpl((powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory72 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind72 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition72 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class));
                beanDefinition72.setDefinition(anonymousClass72);
                beanDefinition72.setKind(kind72);
                module.declareDefinition(beanDefinition72, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass73 anonymousClass73 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.utils.EmailValidator>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.73
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.utils.EmailValidator invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.utils.EmailValidator();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory73 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind73 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition73 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.EmailValidator.class));
                beanDefinition73.setDefinition(anonymousClass73);
                beanDefinition73.setKind(kind73);
                module.declareDefinition(beanDefinition73, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass74 anonymousClass74 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.utils.PasswordValidator>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.74
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.utils.PasswordValidator invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.utils.PasswordValidator();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory74 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind74 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition74 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.PasswordValidator.class));
                beanDefinition74.setDefinition(anonymousClass74);
                beanDefinition74.setKind(kind74);
                module.declareDefinition(beanDefinition74, new org.koin.core.definition.Options(false, false, 1, null));
                final android.content.Context context16 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider> function17 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.75
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProviderImpl(context16, (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.strava.StravaController) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.strava.StravaController.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory75 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind75 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition75 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider.class));
                beanDefinition75.setDefinition(function17);
                beanDefinition75.setKind(kind75);
                module.declareDefinition(beanDefinition75, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass76 anonymousClass76 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.OTAExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.76
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.OTAExecutor invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.OTAExecutor();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory76 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind76 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition76 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.OTAExecutor.class));
                beanDefinition76.setDefinition(anonymousClass76);
                beanDefinition76.setKind(kind76);
                module.declareDefinition(beanDefinition76, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass77 anonymousClass77 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.77
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository((android.content.Context) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory77 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind77 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition77 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository.class));
                beanDefinition77.setDefinition(anonymousClass77);
                beanDefinition77.setKind(kind77);
                module.declareDefinition(beanDefinition77, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass78 anonymousClass78 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.78
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider((powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory78 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind78 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition78 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.class));
                beanDefinition78.setDefinition(anonymousClass78);
                beanDefinition78.setKind(kind78);
                module.declareDefinition(beanDefinition78, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass79 anonymousClass79 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.79
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory79 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind79 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition79 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.class));
                beanDefinition79.setDefinition(anonymousClass79);
                beanDefinition79.setKind(kind79);
                module.declareDefinition(beanDefinition79, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass80 anonymousClass80 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.80
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory80 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind80 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition80 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor.class));
                beanDefinition80.setDefinition(anonymousClass80);
                beanDefinition80.setKind(kind80);
                module.declareDefinition(beanDefinition80, new org.koin.core.definition.Options(false, false, 1, null));
                final android.content.Context context17 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider> function18 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.81
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), context17);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory81 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind81 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition81 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider.class));
                beanDefinition81.setDefinition(function18);
                beanDefinition81.setKind(kind81);
                module.declareDefinition(beanDefinition81, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass82 anonymousClass82 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.82
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.WalkingDayPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.WalkingDayPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory82 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind82 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition82 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class));
                beanDefinition82.setDefinition(anonymousClass82);
                beanDefinition82.setKind(kind82);
                module.declareDefinition(beanDefinition82, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass83 anonymousClass83 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.83
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.WalkingWeekPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.WalkingWeekPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory83 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind83 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition83 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider.class));
                beanDefinition83.setDefinition(anonymousClass83);
                beanDefinition83.setKind(kind83);
                module.declareDefinition(beanDefinition83, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass84 anonymousClass84 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.84
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.WalkingMonthPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.WalkingMonthPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory84 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind84 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition84 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider.class));
                beanDefinition84.setDefinition(anonymousClass84);
                beanDefinition84.setKind(kind84);
                module.declareDefinition(beanDefinition84, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass85 anonymousClass85 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.85
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.RestingDayPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.RestingDayPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory85 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind85 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition85 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class));
                beanDefinition85.setDefinition(anonymousClass85);
                beanDefinition85.setKind(kind85);
                module.declareDefinition(beanDefinition85, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass86 anonymousClass86 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.86
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.RestingWeekPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.RestingWeekPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory86 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind86 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition86 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider.class));
                beanDefinition86.setDefinition(anonymousClass86);
                beanDefinition86.setKind(kind86);
                module.declareDefinition(beanDefinition86, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass87 anonymousClass87 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.87
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.RestingMonthPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.RestingMonthPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory87 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind87 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition87 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider.class));
                beanDefinition87.setDefinition(anonymousClass87);
                beanDefinition87.setKind(kind87);
                module.declareDefinition(beanDefinition87, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass88 anonymousClass88 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.88
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.SleepDayPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.SleepDayPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory88 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind88 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition88 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class));
                beanDefinition88.setDefinition(anonymousClass88);
                beanDefinition88.setKind(kind88);
                module.declareDefinition(beanDefinition88, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass89 anonymousClass89 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.89
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.SleepWeekPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.week.SleepWeekPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory89 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind89 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition89 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider.class));
                beanDefinition89.setDefinition(anonymousClass89);
                beanDefinition89.setKind(kind89);
                module.declareDefinition(beanDefinition89, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass90 anonymousClass90 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.90
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.SleepMonthPeriodRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory90 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind90 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition90 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider.class));
                beanDefinition90.setDefinition(anonymousClass90);
                beanDefinition90.setKind(kind90);
                module.declareDefinition(beanDefinition90, new org.koin.core.definition.Options(false, false));
                final android.content.Context context18 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence> function19 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.91
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence(context18);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory91 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind91 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition91 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence.class));
                beanDefinition91.setDefinition(function19);
                beanDefinition91.setKind(kind91);
                module.declareDefinition(beanDefinition91, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass92 anonymousClass92 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.92
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory92 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind92 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition92 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class));
                beanDefinition92.setDefinition(anonymousClass92);
                beanDefinition92.setKind(kind92);
                module.declareDefinition(beanDefinition92, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass93 anonymousClass93 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.DownloadExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.93
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.DownloadExecutor invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.DownloadExecutor((powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory93 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind93 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition93 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.DownloadExecutor.class));
                beanDefinition93.setDefinition(anonymousClass93);
                beanDefinition93.setKind(kind93);
                module.declareDefinition(beanDefinition93, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass94 anonymousClass94 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.94
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor((powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory94 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind94 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition94 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor.class));
                beanDefinition94.setDefinition(anonymousClass94);
                beanDefinition94.setKind(kind94);
                module.declareDefinition(beanDefinition94, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass95 anonymousClass95 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.FileTransfer>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.95
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.FileTransfer invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.FileTransfer((powerwatch.matrix.com.pwgen2android.main.OTAExecutor) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.OTAExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory95 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind95 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition95 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.FileTransfer.class));
                beanDefinition95.setDefinition(anonymousClass95);
                beanDefinition95.setKind(kind95);
                module.declareDefinition(beanDefinition95, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass96 anonymousClass96 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.96
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor((powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory96 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind96 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition96 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor.class));
                beanDefinition96.setDefinition(anonymousClass96);
                beanDefinition96.setKind(kind96);
                module.declareDefinition(beanDefinition96, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass97 anonymousClass97 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.97
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutorImpl((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.DownloadExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.DownloadExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.OTAExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.OTAExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.SyncProcessExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.FileTransfer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.FileTransfer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory97 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind97 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition97 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor.class));
                beanDefinition97.setDefinition(anonymousClass97);
                beanDefinition97.setKind(kind97);
                module.declareDefinition(beanDefinition97, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass98 anonymousClass98 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.98
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.DownloadExecutor) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.DownloadExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.OTAExecutor) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.OTAExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.FileTransfer) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.FileTransfer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.GPSDownloadExecutor.class), qualifier2, function0), (android.content.Context) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), qualifier2, function0), null, 1024, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory98 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind98 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition98 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.GPSUpdateProcessExecutor.class));
                beanDefinition98.setDefinition(anonymousClass98);
                beanDefinition98.setKind(kind98);
                module.declareDefinition(beanDefinition98, new org.koin.core.definition.Options(false, false, 1, null));
                final android.content.Context context19 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence> function20 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.99
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence(context19);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory99 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind99 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition99 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence.class));
                beanDefinition99.setDefinition(function20);
                beanDefinition99.setKind(kind99);
                module.declareDefinition(beanDefinition99, new org.koin.core.definition.Options(false, false));
                final android.content.Context context20 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence> function21 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.100
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence(context20);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory100 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind100 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition100 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.class));
                beanDefinition100.setDefinition(function21);
                beanDefinition100.setKind(kind100);
                module.declareDefinition(beanDefinition100, new org.koin.core.definition.Options(false, false));
                final android.content.Context context21 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter> function22 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.101
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter((powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), context21, (powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory101 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind101 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition101 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.class));
                beanDefinition101.setDefinition(function22);
                beanDefinition101.setKind(kind101);
                module.declareDefinition(beanDefinition101, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass102 anonymousClass102 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.102
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel((powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver.class), qualifier2, function0), null, 16384, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory102 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind102 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition102 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.class));
                beanDefinition102.setDefinition(anonymousClass102);
                beanDefinition102.setKind(kind102);
                module.declareDefinition(beanDefinition102, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition102);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass103 anonymousClass103 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.103
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel((android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.shared.SelectDate) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectDate.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory103 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind103 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition103 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel.class));
                beanDefinition103.setDefinition(anonymousClass103);
                beanDefinition103.setKind(kind103);
                module.declareDefinition(beanDefinition103, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition103);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass104 anonymousClass104 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.104
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager$syncViewModel$activity) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager$syncViewModel$activity, "$dstr$fragmentManager$syncViewModel$activity");
                        androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) dstr$fragmentManager$syncViewModel$activity.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel) dstr$fragmentManager$syncViewModel$activity.component2(), (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectDate) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectDate.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), fragmentManager, (android.app.Activity) dstr$fragmentManager$syncViewModel$activity.component3(), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0), null, 16384, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory104 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind104 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition104 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.class));
                beanDefinition104.setDefinition(anonymousClass104);
                beanDefinition104.setKind(kind104);
                module.declareDefinition(beanDefinition104, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition104);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass105 anonymousClass105 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.105
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity, "$dstr$activity");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (android.app.Activity) dstr$activity.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory105 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind105 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition105 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel.class));
                beanDefinition105.setDefinition(anonymousClass105);
                beanDefinition105.setKind(kind105);
                module.declareDefinition(beanDefinition105, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition105);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass106 anonymousClass106 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.106
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory106 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind106 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition106 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel.class));
                beanDefinition106.setDefinition(anonymousClass106);
                beanDefinition106.setKind(kind106);
                module.declareDefinition(beanDefinition106, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition106);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass107 anonymousClass107 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.107
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel((powerwatch.matrix.com.pwgen2android.shared.SelectDate) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectDate.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory107 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind107 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition107 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel.class));
                beanDefinition107.setDefinition(anonymousClass107);
                beanDefinition107.setKind(kind107);
                module.declareDefinition(beanDefinition107, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition107);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass108 anonymousClass108 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.108
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManger$context) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManger$context, "$dstr$fragmentManger$context");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel((powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$fragmentManger$context.component1(), (android.content.Context) dstr$fragmentManger$context.component2(), (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger.class), qualifier2, function0), null, 64, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory108 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind108 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition108 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.class));
                beanDefinition108.setDefinition(anonymousClass108);
                beanDefinition108.setKind(kind108);
                module.declareDefinition(beanDefinition108, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition108);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass109 anonymousClass109 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.109
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManger) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManger, "$dstr$fragmentManger");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel((powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$fragmentManger.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory109 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind109 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition109 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel.class));
                beanDefinition109.setDefinition(anonymousClass109);
                beanDefinition109.setKind(kind109);
                module.declareDefinition(beanDefinition109, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition109);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass110 anonymousClass110 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerDayViewModelDashboard>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.110
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerDayViewModelDashboard invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerDayViewModelDashboard((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), null, 512, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory110 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind110 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition110 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerDayViewModelDashboard.class));
                beanDefinition110.setDefinition(anonymousClass110);
                beanDefinition110.setKind(kind110);
                module.declareDefinition(beanDefinition110, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition110);
                final android.content.Context context22 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerPeriodsViewModel> function23 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerPeriodsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.111
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerPeriodsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerPeriodsViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), context22, activity, null, null, null, 229376, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory111 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind111 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition111 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerPeriodsViewModel.class));
                beanDefinition111.setDefinition(function23);
                beanDefinition111.setKind(kind111);
                module.declareDefinition(beanDefinition111, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition111);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass112 anonymousClass112 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayViewModelDashboard>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.112
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayViewModelDashboard invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayViewModelDashboard((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), null, 512, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory112 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind112 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition112 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayViewModelDashboard.class));
                beanDefinition112.setDefinition(anonymousClass112);
                beanDefinition112.setKind(kind112);
                module.declareDefinition(beanDefinition112, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition112);
                final android.content.Context context23 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesPeriodsViewModel> function24 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesPeriodsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.113
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesPeriodsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesPeriodsViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), context23, activity, null, null, null, 458752, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory113 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind113 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition113 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesPeriodsViewModel.class));
                beanDefinition113.setDefinition(function24);
                beanDefinition113.setKind(kind113);
                module.declareDefinition(beanDefinition113, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition113);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass114 anonymousClass114 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.114
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage.class), qualifier2, function0), null, 128, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory114 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind114 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition114 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard.class));
                beanDefinition114.setDefinition(anonymousClass114);
                beanDefinition114.setKind(kind114);
                module.declareDefinition(beanDefinition114, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition114);
                final android.content.Context context24 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel> function25 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.115
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), context24, activity, (powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage.class), qualifier2, function0), null, null, null, 7168, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory115 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind115 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition115 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel.class));
                beanDefinition115.setDefinition(function25);
                beanDefinition115.setKind(kind115);
                module.declareDefinition(beanDefinition115, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition115);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass116 anonymousClass116 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayViewModelDashboard>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.116
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayViewModelDashboard invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayViewModelDashboard((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider.class), qualifier2, function0), null, 512, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory116 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind116 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition116 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayViewModelDashboard.class));
                beanDefinition116.setDefinition(anonymousClass116);
                beanDefinition116.setKind(kind116);
                module.declareDefinition(beanDefinition116, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition116);
                final android.content.Context context25 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodsViewModel> function26 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.117
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$appActivity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$appActivity$fragmentManager, "$dstr$appActivity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$appActivity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodsViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$appActivity$fragmentManager.component2(), context25, activity, null, null, null, 229376, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory117 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind117 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition117 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodsViewModel.class));
                beanDefinition117.setDefinition(function26);
                beanDefinition117.setKind(kind117);
                module.declareDefinition(beanDefinition117, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition117);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass118 anonymousClass118 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayViewModelDashboard>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.118
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayViewModelDashboard invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayViewModelDashboard((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider.class), qualifier2, function0), null, 512, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory118 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind118 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition118 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayViewModelDashboard.class));
                beanDefinition118.setDefinition(anonymousClass118);
                beanDefinition118.setKind(kind118);
                module.declareDefinition(beanDefinition118, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition118);
                final android.content.Context context26 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodsViewModel> function27 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.119
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$appActivity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$appActivity$fragmentManager, "$dstr$appActivity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$appActivity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodsViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$appActivity$fragmentManager.component2(), context26, activity, null, null, null, 229376, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory119 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind119 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition119 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodsViewModel.class));
                beanDefinition119.setDefinition(function27);
                beanDefinition119.setKind(kind119);
                module.declareDefinition(beanDefinition119, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition119);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass120 anonymousClass120 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayViewModelDashboard>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.120
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayViewModelDashboard invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayViewModelDashboard((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), null, 256, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory120 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind120 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition120 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayViewModelDashboard.class));
                beanDefinition120.setDefinition(anonymousClass120);
                beanDefinition120.setKind(kind120);
                module.declareDefinition(beanDefinition120, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition120);
                final android.content.Context context27 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerPeriodsViewModel> function28 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerPeriodsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.121
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerPeriodsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerPeriodsViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), context27, activity, null, null, null, 229376, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory121 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind121 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition121 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerPeriodsViewModel.class));
                beanDefinition121.setDefinition(function28);
                beanDefinition121.setKind(kind121);
                module.declareDefinition(beanDefinition121, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition121);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass122 anonymousClass122 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.122
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimatorImpl();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory122 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind122 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition122 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator.class));
                beanDefinition122.setDefinition(anonymousClass122);
                beanDefinition122.setKind(kind122);
                module.declareDefinition(beanDefinition122, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass123 anonymousClass123 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.123
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProviderImpl((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory123 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind123 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition123 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider.class));
                beanDefinition123.setDefinition(anonymousClass123);
                beanDefinition123.setKind(kind123);
                module.declareDefinition(beanDefinition123, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass124 anonymousClass124 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.124
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), activity, (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory124 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind124 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition124 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.class));
                beanDefinition124.setDefinition(anonymousClass124);
                beanDefinition124.setKind(kind124);
                module.declareDefinition(beanDefinition124, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition124);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass125 anonymousClass125 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.125
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel((powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory125 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind125 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition125 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel.class));
                beanDefinition125.setDefinition(anonymousClass125);
                beanDefinition125.setKind(kind125);
                module.declareDefinition(beanDefinition125, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition125);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass126 anonymousClass126 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.126
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel((powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory126 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind126 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition126 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel.class));
                beanDefinition126.setDefinition(anonymousClass126);
                beanDefinition126.setKind(kind126);
                module.declareDefinition(beanDefinition126, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition126);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass127 anonymousClass127 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.127
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel((powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory127 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind127 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition127 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel.class));
                beanDefinition127.setDefinition(anonymousClass127);
                beanDefinition127.setKind(kind127);
                module.declareDefinition(beanDefinition127, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition127);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass128 anonymousClass128 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.128
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager$activity) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager$activity, "$dstr$fragmentManager$activity");
                        androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) dstr$fragmentManager$activity.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserActivitySessionRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.class), qualifier2, function0), (android.app.Activity) dstr$fragmentManager$activity.component2(), fragmentManager);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory128 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind128 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition128 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.class));
                beanDefinition128.setDefinition(anonymousClass128);
                beanDefinition128.setKind(kind128);
                module.declareDefinition(beanDefinition128, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition128);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass129 anonymousClass129 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.129
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory129 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind129 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition129 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage.class));
                beanDefinition129.setDefinition(anonymousClass129);
                beanDefinition129.setKind(kind129);
                module.declareDefinition(beanDefinition129, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass130 anonymousClass130 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.130
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage((powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory130 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind130 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition130 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage.class));
                beanDefinition130.setDefinition(anonymousClass130);
                beanDefinition130.setKind(kind130);
                module.declareDefinition(beanDefinition130, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass131 anonymousClass131 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.131
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage((powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory131 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind131 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition131 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage.class));
                beanDefinition131.setDefinition(anonymousClass131);
                beanDefinition131.setKind(kind131);
                module.declareDefinition(beanDefinition131, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass132 anonymousClass132 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.132
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory132 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind132 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition132 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader.class));
                beanDefinition132.setDefinition(anonymousClass132);
                beanDefinition132.setKind(kind132);
                module.declareDefinition(beanDefinition132, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass133 anonymousClass133 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.133
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory133 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind133 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition133 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage.class));
                beanDefinition133.setDefinition(anonymousClass133);
                beanDefinition133.setKind(kind133);
                module.declareDefinition(beanDefinition133, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass134 anonymousClass134 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.134
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragment$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragment$fragmentManager, "$dstr$activity$fragment$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragment$fragmentManager.component1(), (androidx.fragment.app.Fragment) dstr$activity$fragment$fragmentManager.component2(), (androidx.fragment.app.FragmentManager) dstr$activity$fragment$fragmentManager.component3(), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.strava.StravaController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.strava.StravaController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.BugfenderConfig) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.BugfenderConfig.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference.class), qualifier2, function0), null, 4194304, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory134 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind134 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition134 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.class));
                beanDefinition134.setDefinition(anonymousClass134);
                beanDefinition134.setKind(kind134);
                module.declareDefinition(beanDefinition134, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition134);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass135 anonymousClass135 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.135
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager$activity) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager$activity, "$dstr$fragmentManager$activity");
                        return new powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel((androidx.fragment.app.FragmentManager) dstr$fragmentManager$activity.component1(), (android.app.Activity) dstr$fragmentManager$activity.component2(), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory135 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind135 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition135 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.BannerViewModel.class));
                beanDefinition135.setDefinition(anonymousClass135);
                beanDefinition135.setKind(kind135);
                module.declareDefinition(beanDefinition135, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition135);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass136 anonymousClass136 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.WatchGettingStartedViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.136
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.WatchGettingStartedViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.main.watch.WatchGettingStartedViewModel((androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory136 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind136 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition136 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.WatchGettingStartedViewModel.class));
                beanDefinition136.setDefinition(anonymousClass136);
                beanDefinition136.setKind(kind136);
                module.declareDefinition(beanDefinition136, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition136);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass137 anonymousClass137 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.137
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager$activity) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager$activity, "$dstr$fragmentManager$activity");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel((powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$fragmentManager$activity.component1(), (powerwatch.matrix.com.pwgen2android.main.MainActivity) dstr$fragmentManager$activity.component2());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory137 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind137 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition137 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.class));
                beanDefinition137.setDefinition(anonymousClass137);
                beanDefinition137.setKind(kind137);
                module.declareDefinition(beanDefinition137, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition137);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass138 anonymousClass138 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.138
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM((powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory138 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind138 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition138 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM.class));
                beanDefinition138.setDefinition(anonymousClass138);
                beanDefinition138.setKind(kind138);
                module.declareDefinition(beanDefinition138, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition138);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass139 anonymousClass139 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.139
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel((android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), null, 32, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory139 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind139 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition139 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel.class));
                beanDefinition139.setDefinition(anonymousClass139);
                beanDefinition139.setKind(kind139);
                module.declareDefinition(beanDefinition139, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition139);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass140 anonymousClass140 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.140
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingExecutorImpl((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory140 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind140 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition140 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor.class));
                beanDefinition140.setDefinition(anonymousClass140);
                beanDefinition140.setKind(kind140);
                module.declareDefinition(beanDefinition140, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass141 anonymousClass141 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.141
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate((powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory141 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind141 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition141 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate.class));
                beanDefinition141.setDefinition(anonymousClass141);
                beanDefinition141.setKind(kind141);
                module.declareDefinition(beanDefinition141, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass142 anonymousClass142 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.142
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory142 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind142 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition142 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM.class));
                beanDefinition142.setDefinition(anonymousClass142);
                beanDefinition142.setKind(kind142);
                module.declareDefinition(beanDefinition142, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition142);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass143 anonymousClass143 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.143
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeUIStorage.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory143 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind143 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition143 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM.class));
                beanDefinition143.setDefinition(anonymousClass143);
                beanDefinition143.setKind(kind143);
                module.declareDefinition(beanDefinition143, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition143);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass144 anonymousClass144 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.144
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel((android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository.class), qualifier2, function0), null, 128, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory144 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind144 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition144 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel.class));
                beanDefinition144.setDefinition(anonymousClass144);
                beanDefinition144.setKind(kind144);
                module.declareDefinition(beanDefinition144, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition144);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass145 anonymousClass145 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.145
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM((android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory145 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind145 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition145 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM.class));
                beanDefinition145.setDefinition(anonymousClass145);
                beanDefinition145.setKind(kind145);
                module.declareDefinition(beanDefinition145, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition145);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass146 anonymousClass146 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.146
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), activity, null, null, 48, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory146 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind146 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition146 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel.class));
                beanDefinition146.setDefinition(anonymousClass146);
                beanDefinition146.setKind(kind146);
                module.declareDefinition(beanDefinition146, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition146);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass147 anonymousClass147 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.147
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager$fragment) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager$fragment, "$dstr$activity$fragmentManager$fragment");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager$fragment.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager$fragment.component2(), activity, (androidx.fragment.app.Fragment) dstr$activity$fragmentManager$fragment.component3(), null, null, 96, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory147 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind147 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition147 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel.class));
                beanDefinition147.setDefinition(anonymousClass147);
                beanDefinition147.setKind(kind147);
                module.declareDefinition(beanDefinition147, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition147);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass148 anonymousClass148 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.148
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$context$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$context$fragmentManager, "$dstr$context$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel((android.content.Context) dstr$context$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$context$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), null, 64, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory148 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind148 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition148 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel.class));
                beanDefinition148.setDefinition(anonymousClass148);
                beanDefinition148.setKind(kind148);
                module.declareDefinition(beanDefinition148, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition148);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass149 anonymousClass149 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.chooseHourFormat.ChooseHourFormatViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.149
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.chooseHourFormat.ChooseHourFormatViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$context$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$context$fragmentManager, "$dstr$context$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.chooseHourFormat.ChooseHourFormatViewModel((android.content.Context) dstr$context$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$context$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), null, 32, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory149 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind149 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition149 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.chooseHourFormat.ChooseHourFormatViewModel.class));
                beanDefinition149.setDefinition(anonymousClass149);
                beanDefinition149.setKind(kind149);
                module.declareDefinition(beanDefinition149, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition149);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass150 anonymousClass150 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.150
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$context$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$context$fragmentManager, "$dstr$context$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel((android.content.Context) dstr$context$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$context$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.class), qualifier2, function0), null, 128, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory150 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind150 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition150 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel.class));
                beanDefinition150.setDefinition(anonymousClass150);
                beanDefinition150.setKind(kind150);
                module.declareDefinition(beanDefinition150, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition150);
                final android.content.Context context28 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel> function29 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.151
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$context$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$context$fragmentManager, "$dstr$context$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel((android.content.Context) dstr$context$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$context$fragmentManager.component2(), context28, (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController.class), qualifier2, function0), null, null, 1536, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory151 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind151 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition151 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel.class));
                beanDefinition151.setDefinition(function29);
                beanDefinition151.setKind(kind151);
                module.declareDefinition(beanDefinition151, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition151);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass152 anonymousClass152 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.152
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$context$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$context$fragmentManager, "$dstr$context$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator.class), qualifier2, function0), (android.content.Context) dstr$context$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$context$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage.class), qualifier2, function0), null, 256, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory152 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind152 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition152 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.class));
                beanDefinition152.setDefinition(anonymousClass152);
                beanDefinition152.setKind(kind152);
                module.declareDefinition(beanDefinition152, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition152);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass153 anonymousClass153 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.153
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$context$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$context$fragmentManager, "$dstr$context$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.RxBus) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator.class), qualifier2, function0), (android.content.Context) dstr$context$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$context$fragmentManager.component2(), null, 64, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory153 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind153 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition153 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.class));
                beanDefinition153.setDefinition(anonymousClass153);
                beanDefinition153.setKind(kind153);
                module.declareDefinition(beanDefinition153, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition153);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass154 anonymousClass154 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.154
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel((android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory154 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind154 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition154 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.PairingSuccessViewModel.class));
                beanDefinition154.setDefinition(anonymousClass154);
                beanDefinition154.setKind(kind154);
                module.declareDefinition(beanDefinition154, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition154);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass155 anonymousClass155 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.155
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel((androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory155 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind155 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition155 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.PairFailedViewModel.class));
                beanDefinition155.setDefinition(anonymousClass155);
                beanDefinition155.setKind(kind155);
                module.declareDefinition(beanDefinition155, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition155);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass156 anonymousClass156 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.156
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager$fragment) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager$fragment, "$dstr$activity$fragmentManager$fragment");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel((androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager$fragment.component2(), (android.app.Activity) dstr$activity$fragmentManager$fragment.component1(), (androidx.fragment.app.Fragment) dstr$activity$fragmentManager$fragment.component3(), (powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider.class), qualifier2, function0), null, 32, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory156 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind156 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition156 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.class));
                beanDefinition156.setDefinition(anonymousClass156);
                beanDefinition156.setKind(kind156);
                module.declareDefinition(beanDefinition156, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition156);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass157 anonymousClass157 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.157
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory157 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind157 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition157 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel.class));
                beanDefinition157.setDefinition(anonymousClass157);
                beanDefinition157.setKind(kind157);
                module.declareDefinition(beanDefinition157, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition157);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass158 anonymousClass158 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.158
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel((androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory158 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind158 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition158 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.EnterPinCodeViewModel.class));
                beanDefinition158.setDefinition(anonymousClass158);
                beanDefinition158.setKind(kind158);
                module.declareDefinition(beanDefinition158, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition158);
                final android.content.Context context29 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel> function30 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.159
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel((powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), context29);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory159 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind159 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition159 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.class));
                beanDefinition159.setDefinition(function30);
                beanDefinition159.setKind(kind159);
                module.declareDefinition(beanDefinition159, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition159);
                final android.content.Context context30 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel> function31 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.160
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel(context30, (android.app.Activity) dstr$activity$fragmentManager.component1(), (powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory160 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind160 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition160 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.Gen2PairingProgressViewModel.class));
                beanDefinition160.setDefinition(function31);
                beanDefinition160.setKind(kind160);
                module.declareDefinition(beanDefinition160, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition160);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass161 anonymousClass161 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.PairingActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.161
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.PairingActivityViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.pair.PairingActivityViewModel((powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory161 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind161 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition161 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.PairingActivityViewModel.class));
                beanDefinition161.setDefinition(anonymousClass161);
                beanDefinition161.setKind(kind161);
                module.declareDefinition(beanDefinition161, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition161);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass162 anonymousClass162 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.162
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager$intent) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager$intent, "$dstr$activity$fragmentManager$intent");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager$intent.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager$intent.component2(), (android.content.Intent) dstr$activity$fragmentManager$intent.component3(), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.strava.StravaController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.strava.StravaController.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory162 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind162 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition162 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel.class));
                beanDefinition162.setDefinition(anonymousClass162);
                beanDefinition162.setKind(kind162);
                module.declareDefinition(beanDefinition162, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition162);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass163 anonymousClass163 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.163
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel((androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory163 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind163 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition163 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenViewModel.class));
                beanDefinition163.setDefinition(anonymousClass163);
                beanDefinition163.setKind(kind163);
                module.declareDefinition(beanDefinition163, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition163);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass164 anonymousClass164 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.164
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1(), (powerwatch.matrix.com.pwgen2android.utils.EmailValidator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.EmailValidator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.PasswordValidator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.PasswordValidator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.BugfenderConfig) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.BugfenderConfig.class), qualifier2, function0), null, 64, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory164 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind164 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition164 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel.class));
                beanDefinition164.setDefinition(anonymousClass164);
                beanDefinition164.setKind(kind164);
                module.declareDefinition(beanDefinition164, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition164);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass165 anonymousClass165 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.165
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragment$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragment$fragmentManager, "$dstr$activity$fragment$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel((powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragment$fragmentManager.component1(), (androidx.fragment.app.Fragment) dstr$activity$fragment$fragmentManager.component2(), (androidx.fragment.app.FragmentManager) dstr$activity$fragment$fragmentManager.component3(), null, 32, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory165 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind165 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition165 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel.class));
                beanDefinition165.setDefinition(anonymousClass165);
                beanDefinition165.setKind(kind165);
                module.declareDefinition(beanDefinition165, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition165);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass166 anonymousClass166 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.166
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragment) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragment, "$dstr$activity$fragment");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragment.component1(), (androidx.fragment.app.Fragment) dstr$activity$fragment.component2(), (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.strava.StravaController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.strava.StravaController.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory166 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind166 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition166 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel.class));
                beanDefinition166.setDefinition(anonymousClass166);
                beanDefinition166.setKind(kind166);
                module.declareDefinition(beanDefinition166, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition166);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass167 anonymousClass167 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.167
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel((android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory167 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind167 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition167 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel.class));
                beanDefinition167.setDefinition(anonymousClass167);
                beanDefinition167.setKind(kind167);
                module.declareDefinition(beanDefinition167, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition167);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass168 anonymousClass168 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.168
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager.component1();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel((powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), activity, (powerwatch.matrix.com.pwgen2android.utils.EmailValidator) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.EmailValidator.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.BugfenderConfig) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.BugfenderConfig.class), qualifier2, function0), null, 256, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory168 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind168 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition168 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel.class));
                beanDefinition168.setDefinition(anonymousClass168);
                beanDefinition168.setKind(kind168);
                module.declareDefinition(beanDefinition168, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition168);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass169 anonymousClass169 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.169
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager$biometricsViewModel) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager$biometricsViewModel, "$dstr$activity$fragmentManager$biometricsViewModel");
                        android.app.Activity activity = (android.app.Activity) dstr$activity$fragmentManager$biometricsViewModel.component1();
                        androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager$biometricsViewModel.component2();
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel) dstr$activity$fragmentManager$biometricsViewModel.component3(), activity, fragmentManager);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory169 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind169 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition169 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel.class));
                beanDefinition169.setDefinition(anonymousClass169);
                beanDefinition169.setKind(kind169);
                module.declareDefinition(beanDefinition169, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition169);
                final android.content.Context context31 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel> function32 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.170
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel(context31);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory170 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind170 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition170 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel.class));
                beanDefinition170.setDefinition(function32);
                beanDefinition170.setKind(kind170);
                module.declareDefinition(beanDefinition170, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition170);
                final android.content.Context context32 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel> function33 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.171
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity$fragmentManager, "$dstr$activity$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel((powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (android.app.Activity) dstr$activity$fragmentManager.component1(), (androidx.fragment.app.FragmentManager) dstr$activity$fragmentManager.component2(), context32);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory171 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind171 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition171 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel.class));
                beanDefinition171.setDefinition(function33);
                beanDefinition171.setKind(kind171);
                module.declareDefinition(beanDefinition171, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition171);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass172 anonymousClass172 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.172
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel((androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1(), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory172 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind172 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition172 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel.class));
                beanDefinition172.setDefinition(anonymousClass172);
                beanDefinition172.setKind(kind172);
                module.declareDefinition(beanDefinition172, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition172);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass173 anonymousClass173 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.splash.SplashViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.173
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.splash.SplashViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activity) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activity, "$dstr$activity");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.splash.SplashViewModel((powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.utils.LanguageController) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.LanguageController.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (android.app.Activity) dstr$activity.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory173 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind173 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition173 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.splash.SplashViewModel.class));
                beanDefinition173.setDefinition(anonymousClass173);
                beanDefinition173.setKind(kind173);
                module.declareDefinition(beanDefinition173, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition173);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass174 anonymousClass174 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.174
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel((androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory174 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind174 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition174 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.WatchContainerViewModel.class));
                beanDefinition174.setDefinition(anonymousClass174);
                beanDefinition174.setKind(kind174);
                module.declareDefinition(beanDefinition174, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition174);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass175 anonymousClass175 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.175
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activityContext$fragmentManager$fragment) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activityContext$fragmentManager$fragment, "$dstr$activityContext$fragmentManager$fragment");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel((powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge.class), qualifier2, function0), (com.google.gson.Gson) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.gson.Gson.class), qualifier2, function0), (android.content.Context) dstr$activityContext$fragmentManager$fragment.component1(), (androidx.fragment.app.FragmentManager) dstr$activityContext$fragmentManager$fragment.component2(), (powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService.class), qualifier2, function0), (androidx.fragment.app.Fragment) dstr$activityContext$fragmentManager$fragment.component3(), null, 512, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory175 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind175 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition175 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.class));
                beanDefinition175.setDefinition(anonymousClass175);
                beanDefinition175.setKind(kind175);
                module.declareDefinition(beanDefinition175, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition175);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass176 anonymousClass176 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.176
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activityContext) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activityContext, "$dstr$activityContext");
                        return new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.UserActivitySessionDataProvider.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), (android.content.Context) dstr$activityContext.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory176 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind176 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition176 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel.class));
                beanDefinition176.setDefinition(anonymousClass176);
                beanDefinition176.setKind(kind176);
                module.declareDefinition(beanDefinition176, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition176);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass177 anonymousClass177 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.177
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$activityContext) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$activityContext, "$dstr$activityContext");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM((powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.sdk.DeviceManager) viewModel.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier2, function0), (android.app.Activity) dstr$activityContext.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory177 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind177 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition177 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.class));
                beanDefinition177.setDefinition(anonymousClass177);
                beanDefinition177.setKind(kind177);
                module.declareDefinition(beanDefinition177, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition177);
                powerwatch.matrix.com.pwgen2android.AppModuleKt.AnonymousClass1.AnonymousClass178 anonymousClass178 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule.1.178
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel invoke(org.koin.core.scope.Scope viewModel, org.koin.core.parameter.DefinitionParameters dstr$fragmentManager) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dstr$fragmentManager, "$dstr$fragmentManager");
                        return new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel((androidx.fragment.app.FragmentManager) dstr$fragmentManager.component1());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory178 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind178 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition178 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRCodeViewModel.class));
                beanDefinition178.setDefinition(anonymousClass178);
                beanDefinition178.setKind(kind178);
                module.declareDefinition(beanDefinition178, new org.koin.core.definition.Options(false, false, 1, null));
                org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition178);
            }
        }, 3, null);
    }
}
