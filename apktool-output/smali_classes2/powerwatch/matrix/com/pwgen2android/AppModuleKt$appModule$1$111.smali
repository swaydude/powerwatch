.class final Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$111;
.super Lkotlin/jvm/internal/Lambda;
.source "AppModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1;->invoke(Lorg/koin/core/module/Module;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lorg/koin/core/scope/Scope;",
        "Lorg/koin/core/parameter/DefinitionParameters;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/PedometerPeriodsViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppModule.kt\npowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$111\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,627:1\n80#2,4:628\n*S KotlinDebug\n*F\n+ 1 AppModule.kt\npowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$111\n*L\n421#1:628,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/PedometerPeriodsViewModel;",
        "Lorg/koin/core/scope/Scope;",
        "<name for destructuring parameter 0>",
        "Lorg/koin/core/parameter/DefinitionParameters;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $appContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$111;->$appContext:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 420
    check-cast p1, Lorg/koin/core/scope/Scope;

    check-cast p2, Lorg/koin/core/parameter/DefinitionParameters;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$111;->invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/PedometerPeriodsViewModel;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/PedometerPeriodsViewModel;
    .locals 24

    move-object/from16 v0, p1

    const-string v1, "$this$viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$dstr$activity$fragmentManager"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    invoke-virtual/range {p2 .. p2}, Lorg/koin/core/parameter/DefinitionParameters;->component1()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Landroid/app/Activity;

    invoke-virtual/range {p2 .. p2}, Lorg/koin/core/parameter/DefinitionParameters;->component2()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Landroidx/fragment/app/FragmentManager;

    .line 421
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/PedometerPeriodsViewModel;

    move-object v3, v1

    const/4 v2, 0x0

    .line 628
    move-object v15, v2

    check-cast v15, Lorg/koin/core/qualifier/Qualifier;

    .line 629
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 631
    const-class v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;

    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    invoke-virtual {v0, v4, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {v0, v5, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;

    const-class v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    invoke-virtual {v0, v6, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-virtual {v0, v7, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;

    const-class v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;

    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    invoke-virtual {v0, v8, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;

    const-class v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;

    invoke-static {v9}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v9

    invoke-virtual {v0, v9, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;

    const-class v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;

    invoke-static {v10}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v10

    invoke-virtual {v0, v10, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;

    const-class v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;

    invoke-static {v11}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v11

    invoke-virtual {v0, v11, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;

    const-class v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;

    invoke-static {v12}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v12

    invoke-virtual {v0, v12, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;

    const-class v13, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    invoke-static {v13}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v13

    invoke-virtual {v0, v13, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    const-class v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    invoke-static {v14}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v14

    invoke-virtual {v0, v14, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    const-class v17, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    move-object/from16 p2, v1

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-virtual {v0, v1, v15, v2}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    move-object/from16 v0, p0

    .line 421
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$111;->$appContext:Landroid/content/Context;

    move-object/from16 v17, v1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x38000

    const/16 v23, 0x0

    invoke-direct/range {v3 .. v23}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/PedometerPeriodsViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDayFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerWeekFormatterViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method
