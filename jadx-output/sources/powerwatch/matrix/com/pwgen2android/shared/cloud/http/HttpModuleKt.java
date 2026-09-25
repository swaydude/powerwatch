package powerwatch.matrix.com.pwgen2android.shared.cloud.http;

/* JADX INFO: compiled from: HttpModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"httpModule", "Lorg/koin/core/module/Module;", "httpConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class HttpModuleKt {
    public static final org.koin.core.module.Module httpModule(final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpConfig, "httpConfig");
        return org.koin.dsl.ModuleKt.module$default(true, false, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpModuleKt.httpModule.1
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
                powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpModuleKt.AnonymousClass1.C00471 c00471 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, com.google.gson.Gson>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpModuleKt.httpModule.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public final com.google.gson.Gson invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new com.google.gson.GsonBuilder().registerTypeAdapter(powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope.class, new powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeDeserializer(new com.google.gson.Gson())).addSerializationExclusionStrategy(powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExcludeKt.getStrategy()).create();
                    }
                };
                org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.gson.Gson.class));
                beanDefinition.setDefinition(c00471);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig2 = httpConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig> function2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpModuleKt.httpModule.1.2
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return httpConfig2;
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig.class));
                beanDefinition2.setDefinition(function2);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig3 = httpConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP> function3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpModuleKt.httpModule.1.3
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        new powerwatch.matrix.com.pwgen2android.CloudInterceptLogger((powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).setLevel(powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level.BODY);
                        java.lang.Object objCreate = new retrofit2.Retrofit.Builder().baseUrl("http://www.dummy.com").client(new okhttp3.OkHttpClient.Builder().connectTimeout(httpConfig3.getConnectionTimeout(), java.util.concurrent.TimeUnit.SECONDS).readTimeout(httpConfig3.getReadTimeout(), java.util.concurrent.TimeUnit.SECONDS).writeTimeout(httpConfig3.getWriteTimeout(), java.util.concurrent.TimeUnit.SECONDS).addInterceptor(new powerwatch.matrix.com.pwgen2android.shared.cloud.http.AppInfoInterceptor()).build()).addCallAdapterFactory(retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory.create()).addConverterFactory(retrofit2.converter.scalars.ScalarsConverterFactory.create()).build().create(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP.class);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objCreate, "builder\n                .build()\n                .create(HTTP::class.java)");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP) objCreate;
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP.class));
                beanDefinition3.setDefinition(function3);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false));
            }
        }, 2, null);
    }
}
