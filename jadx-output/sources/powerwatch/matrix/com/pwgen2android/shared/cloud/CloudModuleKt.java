package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"cloudModule", "Lorg/koin/core/module/Module;", "cloudConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class CloudModuleKt {
    public static final org.koin.core.module.Module cloudModule(final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudConfig, "cloudConfig");
        return org.koin.dsl.ModuleKt.module$default(true, false, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1
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
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.C00461 c00461 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService.class));
                beanDefinition.setDefinition(c00461);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass2 anonymousClass2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.2
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler.class));
                beanDefinition2.setDefinition(anonymousClass2);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass3 anonymousClass3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.3
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService.class));
                beanDefinition3.setDefinition(anonymousClass3);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass4 anonymousClass4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.4
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory4 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind4 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition4 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceCloudService.class));
                beanDefinition4.setDefinition(anonymousClass4);
                beanDefinition4.setKind(kind4);
                module.declareDefinition(beanDefinition4, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass5 anonymousClass5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.5
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory5 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind5 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition5 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.WalkingHourPeriodCloudService.class));
                beanDefinition5.setDefinition(anonymousClass5);
                beanDefinition5.setKind(kind5);
                module.declareDefinition(beanDefinition5, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass6 anonymousClass6 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.6
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory6 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind6 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition6 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService.class));
                beanDefinition6.setDefinition(anonymousClass6);
                beanDefinition6.setKind(kind6);
                module.declareDefinition(beanDefinition6, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass7 anonymousClass7 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.7
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory7 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind7 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition7 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService.class));
                beanDefinition7.setDefinition(anonymousClass7);
                beanDefinition7.setKind(kind7);
                module.declareDefinition(beanDefinition7, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass8 anonymousClass8 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.8
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory8 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind8 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition8 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService.class));
                beanDefinition8.setDefinition(anonymousClass8);
                beanDefinition8.setKind(kind8);
                module.declareDefinition(beanDefinition8, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass9 anonymousClass9 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.9
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory9 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind9 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition9 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService.class));
                beanDefinition9.setDefinition(anonymousClass9);
                beanDefinition9.setKind(kind9);
                module.declareDefinition(beanDefinition9, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass10 anonymousClass10 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.10
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory10 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind10 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition10 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService.class));
                beanDefinition10.setDefinition(anonymousClass10);
                beanDefinition10.setKind(kind10);
                module.declareDefinition(beanDefinition10, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass11 anonymousClass11 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.11
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory11 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind11 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition11 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.RestingLogCloudService.class));
                beanDefinition11.setDefinition(anonymousClass11);
                beanDefinition11.setKind(kind11);
                module.declareDefinition(beanDefinition11, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass12 anonymousClass12 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.12
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory12 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind12 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition12 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService.class));
                beanDefinition12.setDefinition(anonymousClass12);
                beanDefinition12.setKind(kind12);
                module.declareDefinition(beanDefinition12, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass13 anonymousClass13 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.13
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory13 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind13 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition13 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService.class));
                beanDefinition13.setDefinition(anonymousClass13);
                beanDefinition13.setKind(kind13);
                module.declareDefinition(beanDefinition13, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig2 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService> function2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.14
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountServiceImpl(cloudConfig2.getUserAccountConfig(), (powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), null, null, null, 28, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory14 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind14 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition14 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService.class));
                beanDefinition14.setDefinition(function2);
                beanDefinition14.setKind(kind14);
                module.declareDefinition(beanDefinition14, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig3 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService> function3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.15
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig3.getDeviceConfig(), null, null, null, null, null, 124, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory15 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind15 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition15 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService.class));
                beanDefinition15.setDefinition(function3);
                beanDefinition15.setKind(kind15);
                module.declareDefinition(beanDefinition15, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig4 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingDayPeriodService> function4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingDayPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.16
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingDayPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingDayPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig4.getWalkingDayPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory16 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind16 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition16 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingDayPeriodService.class));
                beanDefinition16.setDefinition(function4);
                beanDefinition16.setKind(kind16);
                module.declareDefinition(beanDefinition16, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig5 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingDayPeriodService> function5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingDayPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.17
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingDayPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingDayPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig5.getRestingDayPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory17 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind17 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition17 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingDayPeriodService.class));
                beanDefinition17.setDefinition(function5);
                beanDefinition17.setKind(kind17);
                module.declareDefinition(beanDefinition17, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig6 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepDayPeriodService> function6 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepDayPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.18
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepDayPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepDayPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig6.getSleepDayPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory18 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind18 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition18 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepDayPeriodService.class));
                beanDefinition18.setDefinition(function6);
                beanDefinition18.setKind(kind18);
                module.declareDefinition(beanDefinition18, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig7 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingWeekPeriodService> function7 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingWeekPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.19
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingWeekPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingWeekPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig7.getWalkingWeekPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory19 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind19 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition19 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingWeekPeriodService.class));
                beanDefinition19.setDefinition(function7);
                beanDefinition19.setKind(kind19);
                module.declareDefinition(beanDefinition19, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig8 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingWeekPeriodService> function8 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingWeekPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.20
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingWeekPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingWeekPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig8.getRestingWeekPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory20 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind20 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition20 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingWeekPeriodService.class));
                beanDefinition20.setDefinition(function8);
                beanDefinition20.setKind(kind20);
                module.declareDefinition(beanDefinition20, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig9 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepWeekPeriodService> function9 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepWeekPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.21
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepWeekPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepWeekPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig9.getSleepWeekPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory21 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind21 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition21 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepWeekPeriodService.class));
                beanDefinition21.setDefinition(function9);
                beanDefinition21.setKind(kind21);
                module.declareDefinition(beanDefinition21, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig10 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingMonthPeriodService> function10 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingMonthPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.22
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingMonthPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingMonthPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig10.getWalkingMonthPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory22 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind22 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition22 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingMonthPeriodService.class));
                beanDefinition22.setDefinition(function10);
                beanDefinition22.setKind(kind22);
                module.declareDefinition(beanDefinition22, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig11 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingMonthPeriodService> function11 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingMonthPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.23
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingMonthPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingMonthPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig11.getRestingMonthPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory23 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind23 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition23 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingMonthPeriodService.class));
                beanDefinition23.setDefinition(function11);
                beanDefinition23.setKind(kind23);
                module.declareDefinition(beanDefinition23, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig12 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepMonthPeriodService> function12 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepMonthPeriodService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.24
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepMonthPeriodService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepMonthPeriodServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig12.getSleepMonthPeriodConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory24 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind24 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition24 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepMonthPeriodService.class));
                beanDefinition24.setDefinition(function12);
                beanDefinition24.setKind(kind24);
                module.declareDefinition(beanDefinition24, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig13 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService> function13 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.25
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig13.getWalkingLogConfiguration(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory25 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind25 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition25 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService.class));
                beanDefinition25.setDefinition(function13);
                beanDefinition25.setKind(kind25);
                module.declareDefinition(beanDefinition25, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig14 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogService> function14 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.26
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig14.getRestingLogConfiguration(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory26 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind26 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition26 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogService.class));
                beanDefinition26.setDefinition(function14);
                beanDefinition26.setKind(kind26);
                module.declareDefinition(beanDefinition26, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig15 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService> function15 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.27
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig15.getSleepLogConfiguration(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory27 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind27 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition27 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService.class));
                beanDefinition27.setDefinition(function15);
                beanDefinition27.setKind(kind27);
                module.declareDefinition(beanDefinition27, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig16 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService> function16 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.28
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig16.getUserActivityConfig(), null, null, null, null, 60, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory28 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind28 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition28 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService.class));
                beanDefinition28.setDefinition(function16);
                beanDefinition28.setKind(kind28);
                module.declareDefinition(beanDefinition28, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig17 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService> function17 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.29
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig17.getUpdateInfoConfig(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory29 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind29 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition29 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService.class));
                beanDefinition29.setDefinition(function17);
                beanDefinition29.setKind(kind29);
                module.declareDefinition(beanDefinition29, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig18 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService> function18 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.30
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig18.getGoalConfigurationConfig(), null, null, null, 28, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory30 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind30 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition30 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService.class));
                beanDefinition30.setDefinition(function18);
                beanDefinition30.setKind(kind30);
                module.declareDefinition(beanDefinition30, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass31 anonymousClass31 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.31
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory31 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind31 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition31 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService.class));
                beanDefinition31.setDefinition(anonymousClass31);
                beanDefinition31.setKind(kind31);
                module.declareDefinition(beanDefinition31, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig19 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService> function19 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.32
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), qualifier2, function0), cloudConfig19.getFontUpdateConfiguration(), new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadJSONServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), qualifier2, function0)), null, 8, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory32 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind32 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition32 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService.class));
                beanDefinition32.setDefinition(function19);
                beanDefinition32.setKind(kind32);
                module.declareDefinition(beanDefinition32, new org.koin.core.definition.Options(false, false, 1, null));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig20 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl> function20 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.33
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl(cloudConfig20, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingLogService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider.class), qualifier2, function0), null, null, null, null, null, null, null, null, null, null, null, null, null, 268402688, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory33 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind33 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition33 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudImpl.class));
                beanDefinition33.setDefinition(function20);
                beanDefinition33.setKind(kind33);
                module.declareDefinition(beanDefinition33, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass34 anonymousClass34 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.34
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory34 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind34 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition34 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService.class));
                beanDefinition34.setDefinition(anonymousClass34);
                beanDefinition34.setKind(kind34);
                module.declareDefinition(beanDefinition34, new org.koin.core.definition.Options(false, false));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig21 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient> function21 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.35
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP.class), qualifier2, function0), cloudConfig21.getBaseURL(), (com.google.gson.Gson) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.gson.Gson.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory35 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind35 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition35 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class));
                beanDefinition35.setDefinition(function21);
                beanDefinition35.setKind(kind35);
                module.declareDefinition(beanDefinition35, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass36 anonymousClass36 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.36
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider(((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).tokenStorage());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory36 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind36 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition36 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider.class));
                beanDefinition36.setDefinition(anonymousClass36);
                beanDefinition36.setKind(kind36);
                module.declareDefinition(beanDefinition36, new org.koin.core.definition.Options(false, false));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig22 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration> function22 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.37
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration(cloudConfig22.getLogsUploadEndpoint());
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory37 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind37 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition37 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration.class));
                beanDefinition37.setDefinition(function22);
                beanDefinition37.setKind(kind37);
                module.declareDefinition(beanDefinition37, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.AnonymousClass1.AnonymousClass38 anonymousClass38 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.38
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        org.koin.core.qualifier.Qualifier qualifier2 = (org.koin.core.qualifier.Qualifier) null;
                        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = (kotlin.jvm.functions.Function0) null;
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), qualifier2, function0), (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration.class), qualifier2, function0));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory38 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind38 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition38 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService.class));
                beanDefinition38.setDefinition(anonymousClass38);
                beanDefinition38.setKind(kind38);
                module.declareDefinition(beanDefinition38, new org.koin.core.definition.Options(false, false));
                final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig23 = cloudConfig;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService> function23 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.CloudModuleKt.cloudModule.1.39
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService((powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null), cloudConfig23.getMetricsConfiguration(), null, 4, null);
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory39 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind39 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition39 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService.class));
                beanDefinition39.setDefinition(function23);
                beanDefinition39.setKind(kind39);
                module.declareDefinition(beanDefinition39, new org.koin.core.definition.Options(false, false, 1, null));
            }
        }, 2, null);
    }
}
