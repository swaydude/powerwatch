package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: DBModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u000b"}, d2 = {"createMigrateScript", "", "table", "field", "dbModule", "Lorg/koin/core/module/Module;", "appContext", "Landroid/content/Context;", "migrateHourPeriodModels", "", "migrateLogModels", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class DBModuleKt {
    public static final java.lang.String createMigrateScript(java.lang.String table, java.lang.String field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
        return "ALTER TABLE " + table + " ADD COLUMN " + field + " REAL NOT NULL DEFAULT 0";
    }

    public static final java.util.List<java.lang.String> migrateLogModels(java.lang.String table) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "Log"), "maxSkinTemp"), createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "Log"), "minSkinTemp"), createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "Log"), "maxCaseTemp"), createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "Log"), "minCaseTemp")});
    }

    public static final java.util.List<java.lang.String> migrateHourPeriodModels(java.lang.String table) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "HourPeriod"), "maxSkinTemp"), createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "HourPeriod"), "minSkinTemp"), createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "HourPeriod"), "maxCaseTemp"), createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "HourPeriod"), "minCaseTemp")});
    }

    public static final java.lang.String migrateHourPeriodModels(java.lang.String table, java.lang.String field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
        return createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "HourPeriod"), field);
    }

    public static final java.lang.String migrateLogModels(java.lang.String table, java.lang.String field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
        return createMigrateScript(kotlin.jvm.internal.Intrinsics.stringPlus(table, "Log"), field);
    }

    public static final org.koin.core.module.Module dbModule(final android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        return org.koin.dsl.ModuleKt.module$default(true, false, new kotlin.jvm.functions.Function1<org.koin.core.module.Module, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1
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
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.C00481 c00481 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(org.koin.core.scope.Scope scope, org.koin.core.parameter.DefinitionParameters definitionParameters) {
                        invoke2(scope, definitionParameters);
                        return kotlin.Unit.INSTANCE;
                    }
                };
                org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
                org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class));
                beanDefinition.setDefinition(c00481);
                beanDefinition.setKind(kind);
                module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, false));
                final android.content.Context context = appContext;
                kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB> function2 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return (powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) androidx.room.Room.databaseBuilder(context, powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class, "PowerWatchDB").addMigrations(new androidx.room.migration.Migration() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt$dbModule$1$2$migration20$1
                            @Override // androidx.room.migration.Migration
                            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
                                database.execSQL("ALTER TABLE UpdateInfo ADD COLUMN releaseDate TEXT");
                            }
                        }, new androidx.room.migration.Migration() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt$dbModule$1$2$migration21$1
                            @Override // androidx.room.migration.Migration
                            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
                                database.execSQL("ALTER TABLE SleepLog ADD COLUMN minsInPeriod INTEGER NOT NULL DEFAULT 0");
                            }
                        }, new androidx.room.migration.Migration() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt$dbModule$1$2$migration22$1
                            @Override // androidx.room.migration.Migration
                            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
                                java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Walking", "Resting", "Sleep"});
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf, 10));
                                java.util.Iterator it2 = listListOf.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.migrateLogModels((java.lang.String) it2.next()));
                                }
                                java.util.List listFlatten = kotlin.collections.CollectionsKt.flatten(arrayList);
                                java.util.List listListOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Walking", "Resting", "Sleep"});
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
                                java.util.Iterator it3 = listListOf2.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.migrateHourPeriodModels((java.lang.String) it3.next()));
                                }
                                java.util.Iterator it4 = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.flatten(arrayList2), (java.lang.Iterable) listFlatten).iterator();
                                while (it4.hasNext()) {
                                    database.execSQL((java.lang.String) it4.next());
                                }
                            }
                        }, new androidx.room.migration.Migration() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt$dbModule$1$2$migration23$1
                            @Override // androidx.room.migration.Migration
                            public void migrate(androidx.sqlite.db.SupportSQLiteDatabase database) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
                                java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Walking", "Resting", "Sleep"});
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf, 10));
                                java.util.Iterator it2 = listListOf.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.migrateLogModels((java.lang.String) it2.next(), "hrv"));
                                }
                                java.util.ArrayList arrayList2 = arrayList;
                                java.util.List listListOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Walking", "Resting", "Sleep"});
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
                                java.util.Iterator it3 = listListOf2.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.migrateHourPeriodModels((java.lang.String) it3.next(), "hrv"));
                                }
                                java.util.Iterator it4 = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList3, (java.lang.Iterable) arrayList2).iterator();
                                while (it4.hasNext()) {
                                    database.execSQL((java.lang.String) it4.next());
                                }
                            }
                        }).allowMainThreadQueries().build();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory2 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind2 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition2 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class));
                beanDefinition2.setDefinition(function2);
                beanDefinition2.setKind(kind2);
                module.declareDefinition(beanDefinition2, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass3 anonymousClass3 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.3
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager invoke(org.koin.core.scope.Scope single, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(single, "$this$single");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) single.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null));
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory3 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind3 = org.koin.core.definition.Kind.Single;
                org.koin.core.definition.BeanDefinition beanDefinition3 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager.class));
                beanDefinition3.setDefinition(anonymousClass3);
                beanDefinition3.setKind(kind3);
                module.declareDefinition(beanDefinition3, new org.koin.core.definition.Options(false, false));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass4 anonymousClass4 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.4
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).userDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory4 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind4 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition4 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao.class));
                beanDefinition4.setDefinition(anonymousClass4);
                beanDefinition4.setKind(kind4);
                module.declareDefinition(beanDefinition4, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass5 anonymousClass5 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.5
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).deviceDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory5 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind5 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition5 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao.class));
                beanDefinition5.setDefinition(anonymousClass5);
                beanDefinition5.setKind(kind5);
                module.declareDefinition(beanDefinition5, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass6 anonymousClass6 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.6
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).walkingHourPeriodDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory6 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind6 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition6 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao.class));
                beanDefinition6.setDefinition(anonymousClass6);
                beanDefinition6.setKind(kind6);
                module.declareDefinition(beanDefinition6, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass7 anonymousClass7 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.7
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).restingHourPeriodDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory7 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind7 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition7 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao.class));
                beanDefinition7.setDefinition(anonymousClass7);
                beanDefinition7.setKind(kind7);
                module.declareDefinition(beanDefinition7, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass8 anonymousClass8 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.8
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).sleepHourPeriodDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory8 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind8 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition8 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao.class));
                beanDefinition8.setDefinition(anonymousClass8);
                beanDefinition8.setKind(kind8);
                module.declareDefinition(beanDefinition8, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass9 anonymousClass9 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.9
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).goalConfigurationDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory9 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind9 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition9 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao.class));
                beanDefinition9.setDefinition(anonymousClass9);
                beanDefinition9.setKind(kind9);
                module.declareDefinition(beanDefinition9, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass10 anonymousClass10 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.10
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).walkingLogDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory10 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind10 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition10 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao.class));
                beanDefinition10.setDefinition(anonymousClass10);
                beanDefinition10.setKind(kind10);
                module.declareDefinition(beanDefinition10, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass11 anonymousClass11 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.11
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).restingLogDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory11 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind11 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition11 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao.class));
                beanDefinition11.setDefinition(anonymousClass11);
                beanDefinition11.setKind(kind11);
                module.declareDefinition(beanDefinition11, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass12 anonymousClass12 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.12
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).sleepLogDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory12 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind12 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition12 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao.class));
                beanDefinition12.setDefinition(anonymousClass12);
                beanDefinition12.setKind(kind12);
                module.declareDefinition(beanDefinition12, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass13 anonymousClass13 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.13
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).userActivitySessionDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory13 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind13 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition13 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao.class));
                beanDefinition13.setDefinition(anonymousClass13);
                beanDefinition13.setKind(kind13);
                module.declareDefinition(beanDefinition13, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass14 anonymousClass14 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.14
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).defaultPhoneWatchDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory14 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind14 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition14 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao.class));
                beanDefinition14.setDefinition(anonymousClass14);
                beanDefinition14.setKind(kind14);
                module.declareDefinition(beanDefinition14, new org.koin.core.definition.Options(false, false, 1, null));
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.AnonymousClass1.AnonymousClass15 anonymousClass15 = new kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule.1.15
                    @Override // kotlin.jvm.functions.Function2
                    public final powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao invoke(org.koin.core.scope.Scope factory, org.koin.core.parameter.DefinitionParameters it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "$this$factory");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return ((powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB) factory.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB.class), (org.koin.core.qualifier.Qualifier) null, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) null)).updateInfoDao();
                    }
                };
                org.koin.core.definition.DefinitionFactory definitionFactory15 = org.koin.core.definition.DefinitionFactory.INSTANCE;
                org.koin.core.definition.Kind kind15 = org.koin.core.definition.Kind.Factory;
                org.koin.core.definition.BeanDefinition beanDefinition15 = new org.koin.core.definition.BeanDefinition(qualifier, qualifier, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao.class));
                beanDefinition15.setDefinition(anonymousClass15);
                beanDefinition15.setKind(kind15);
                module.declareDefinition(beanDefinition15, new org.koin.core.definition.Options(false, false, 1, null));
            }
        }, 2, null);
    }
}
