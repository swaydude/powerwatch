package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: LoggerModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"loggerModule", "Lorg/koin/core/module/Module;", "loggerConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class LoggerModuleKt {
    public static final org.koin.core.module.Module loggerModule(final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerConfig, "loggerConfig");
        return org.koin.dsl.ModuleKt.module$default(true, false, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.loggerModule.1
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
                powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.AnonymousClass1.C00491 c00491 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.loggerModule.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput.class));
                beanDefinition.setDefinition(c00491);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.AnonymousClass1.AnonymousClass2 anonymousClass2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.loggerModule.1.2
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput.class));
                beanDefinition2.setDefinition(anonymousClass2);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig2 = loggerConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger> function2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.loggerModule.1.3
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerImpl(loggerConfig2);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger.class));
                beanDefinition3.setDefinition(function2);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false));
                final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig3 = loggerConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension> function3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.loggerModule.1.4
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtensionImpl((powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), loggerConfig3);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory4 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind4 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition4 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension.class));
                beanDefinition4.setDefinition(function3);
                beanDefinition4.setKind(kind4);
                module.declareDefinition(beanDefinition4, new org.koin.core.definition.Options(false, false));
                final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig4 = loggerConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension> function4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.loggerModule.1.5
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl((powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), loggerConfig4);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory5 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind5 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition5 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension.class));
                beanDefinition5.setDefinition(function4);
                beanDefinition5.setKind(kind5);
                module.declareDefinition(beanDefinition5, new org.koin.core.definition.Options(false, false));
                final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig5 = loggerConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension> function5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension>() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.LoggerModuleKt.loggerModule.1.6
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtensionImpl((powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), loggerConfig5);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory6 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind6 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition6 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension.class));
                beanDefinition6.setDefinition(function5);
                beanDefinition6.setKind(kind6);
                module.declareDefinition(beanDefinition6, new org.koin.core.definition.Options(false, false));
            }
        }, 2, null);
    }
}
