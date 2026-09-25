package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: FCMModule.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"fcmModule", "Lorg/koin/core/module/Module;", "appContext", "Landroid/content/Context;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FCMModuleKt {
    public static final org.koin.core.module.Module fcmModule(final android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        return org.koin.dsl.ModuleKt.module$default(false, false, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.fcm.FCMModuleKt.fcmModule.1
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
                final android.content.Context context = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory> function2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory>() { // from class: powerwatch.matrix.com.pwgen2android.fcm.FCMModuleKt.fcmModule.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory(context, null, 2, null);
                    }
                };
                org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory.class));
                beanDefinition.setDefinition(function2);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false));
                final android.content.Context context2 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.fcm.PushNotificationsFactory> function3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.fcm.PushNotificationsFactory>() { // from class: powerwatch.matrix.com.pwgen2android.fcm.FCMModuleKt.fcmModule.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.fcm.PushNotificationsFactory invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.fcm.PushNotificationsFactory(context2, null, null, 6, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.fcm.PushNotificationsFactory.class));
                beanDefinition2.setDefinition(function3);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false));
                final android.content.Context context3 = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider> function4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider>() { // from class: powerwatch.matrix.com.pwgen2android.fcm.FCMModuleKt.fcmModule.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.fcm.FirebaseTokenProviderImpl(context3);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider.class));
                beanDefinition3.setDefinition(function4);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false));
            }
        }, 3, null);
    }
}
