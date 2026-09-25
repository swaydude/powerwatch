package powerwatch.matrix.com.pwgen2android.report;

/* JADX INFO: compiled from: ReportingModule.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"reportingModule", "Lorg/koin/core/module/Module;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ReportingModuleKt {
    public static final org.koin.core.module.Module reportingModule() {
        return org.koin.dsl.ModuleKt.module(false, true, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(org.koin.core.module.Module module) {
                invoke2(module);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(org.koin.core.module.Module module) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "$this$module");
                powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.AnonymousClass1.C00441 c00441 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView>() { // from class: powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewImpl((android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView.class));
                beanDefinition.setDefinition(c00441);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.AnonymousClass1.AnonymousClass2 anonymousClass2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient>() { // from class: powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule.1.2
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.class));
                beanDefinition2.setDefinition(anonymousClass2);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.AnonymousClass1.AnonymousClass3 anonymousClass3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge>() { // from class: powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule.1.3
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl((powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.class), qualifier2, function0), (android.content.Context) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class), qualifier2, function0), null, null, 24, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge.class));
                beanDefinition3.setDefinition(anonymousClass3);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.AnonymousClass1.AnonymousClass4 anonymousClass4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeDeserializer>() { // from class: powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule.1.4
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeDeserializer invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeDeserializer((com.google.gson.Gson) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.gson.Gson.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory4 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind4 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition4 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeDeserializer.class));
                beanDefinition4.setDefinition(anonymousClass4);
                beanDefinition4.setKind(kind4);
                module.declareDefinition(beanDefinition4, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.AnonymousClass1.AnonymousClass5 anonymousClass5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider>() { // from class: powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule.1.5
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider((powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory5 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind5 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition5 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider.class));
                beanDefinition5.setDefinition(anonymousClass5);
                beanDefinition5.setKind(kind5);
                module.declareDefinition(beanDefinition5, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.AnonymousClass1.AnonymousClass6 anonymousClass6 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension>() { // from class: powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule.1.6
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtensionImpl((com.google.gson.Gson) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.gson.Gson.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory6 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind6 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition6 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension.class));
                beanDefinition6.setDefinition(anonymousClass6);
                beanDefinition6.setKind(kind6);
                module.declareDefinition(beanDefinition6, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.AnonymousClass1.AnonymousClass7 anonymousClass7 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.google.gson.Gson>() { // from class: powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule.1.7
                    @Override // kotlin.jvm.functions.Function2
                    public final com.google.gson.Gson invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        com.google.gson.Gson gsonCreate = new com.google.gson.GsonBuilder().registerTypeAdapter(powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope.class, new powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeDeserializer(new com.google.gson.Gson())).create();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().registerTypeAdapter(Envelope::class.java, EnvelopeDeserializer(Gson())).create()");
                        return gsonCreate;
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory7 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind7 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition7 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.gson.Gson.class));
                beanDefinition7.setDefinition(anonymousClass7);
                beanDefinition7.setKind(kind7);
                module.declareDefinition(beanDefinition7, new org.koin.core.definition.Options(false, false));
            }
        });
    }
}
