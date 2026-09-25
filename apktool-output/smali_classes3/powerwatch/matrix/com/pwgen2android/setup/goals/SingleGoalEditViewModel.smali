.class public final Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "SingleGoalEditViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0012J\u0008\u0010\'\u001a\u00020(H\u0016J\u0008\u0010)\u001a\u00020(H\u0007R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u00060\u00060\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\"\u001a\u0010\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010#0#0\u001e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010!R\u001f\u0010%\u001a\u0010\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010#0#0\u001e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010!\u00a8\u0006*"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;",
        "activityContext",
        "Landroid/content/Context;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "settingsLiteCommunicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "goalsNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;",
        "savePreferencesViewModel",
        "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V",
        "newConfig",
        "Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;",
        "config",
        "getConfig",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;",
        "setConfig",
        "(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)V",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "showSaveProgress",
        "Landroidx/databinding/ObservableField;",
        "",
        "getShowSaveProgress",
        "()Landroidx/databinding/ObservableField;",
        "valueField",
        "",
        "getValueField",
        "valueUnitField",
        "getValueUnitField",
        "onBackClicked",
        "",
        "onSaveClicked",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final synthetic $$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

.field private config:Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

.field private final valueField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final valueUnitField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V
    .locals 2

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsLiteCommunicator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBus"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalsNotificationPersistence"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savePreferencesViewModel"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 28
    invoke-direct {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 24
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 25
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

    .line 26
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 27
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    .line 29
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    .line 30
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 33
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->valueField:Landroidx/databinding/ObservableField;

    .line 34
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->valueUnitField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;-><init>(Landroidx/databinding/ObservableField;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object/from16 v9, p8

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 22
    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;-><init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V

    return-void
.end method

.method public static synthetic lambda$2trNlw8s47PGYR_TICtXR5ErZqY(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onSaveClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V

    return-void
.end method

.method public static synthetic lambda$KO8GuAOMQkBXrctbz8PCXFak5P4(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onSaveClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Kvl7Qv3E2xcKMfJJR2gpaaSUR8g(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onSaveClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$ku_LjPW6wcW1Xm3cafutBoCnhzc(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onSaveClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$py3e_SsB56Qtzj1cO4UMDCQxM84(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onSaveClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final onSaveClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getValueField()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 54
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getConfig()Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 v0, 0x0

    goto/16 :goto_5

    .line 56
    :cond_0
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    move-result-object v3

    .line 57
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v15, 0x0

    if-eqz v4, :cond_2

    .line 58
    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_1

    const/16 v1, 0x2710

    const/16 v9, 0x2710

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v9, v1

    :goto_0
    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xdf

    const/4 v14, 0x0

    move-object/from16 v2, p1

    .line 59
    invoke-static/range {v2 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;JIFIIIJZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v1

    .line 60
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Steps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Steps;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-virtual {v0, v2, v15}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;Z)V

    goto/16 :goto_4

    .line 62
    :cond_2
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 63
    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_3

    const/16 v1, 0x7d0

    const/16 v5, 0x7d0

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v5, v1

    :goto_1
    const-wide/16 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xfd

    const/4 v14, 0x0

    move-object/from16 v2, p1

    .line 64
    invoke-static/range {v2 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;JIFIIIJZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v1

    .line 65
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Calories;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Calories;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-virtual {v0, v2, v15}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;Z)V

    goto/16 :goto_4

    .line 67
    :cond_4
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 68
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getValueField()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/text/StringsKt;->toFloatOrNull(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_5

    const/high16 v1, 0x41000000    # 8.0f

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_2
    const/16 v3, 0x3c

    int-to-float v3, v3

    mul-float v1, v1, v3

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 70
    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v8

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xef

    const/4 v14, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;JIFIIIJZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v1

    .line 71
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Sleep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Sleep;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-virtual {v0, v2, v15}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;Z)V

    goto :goto_4

    .line 74
    :cond_6
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 75
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getValueField()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_7

    const/16 v1, 0x3e8

    const/16 v7, 0x3e8

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v7, v1

    :goto_3
    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xf7

    const/4 v14, 0x0

    move-object/from16 v2, p1

    .line 76
    invoke-static/range {v2 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;JIFIIIJZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v1

    .line 77
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Power;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Power;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-virtual {v0, v2, v15}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;Z)V

    goto :goto_4

    :cond_8
    move-object v1, v2

    :goto_4
    move-object v0, v1

    :goto_5
    return-object v0
.end method

.method private static final onSaveClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/CompletableSource;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;Ljava/lang/Object;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    .line 86
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;

    invoke-direct {v1, p1, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    invoke-interface {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;->applySetting(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, p0}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final onSaveClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 91
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onSaveClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onSaveClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Ljava/lang/Throwable;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onBackClicked()V

    return-void
.end method


# virtual methods
.method public final getConfig()Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;
    .locals 1

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->config:Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    return-object v0
.end method

.method public getShowSaveProgress()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public final getValueField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->valueField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getValueUnitField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->valueUnitField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 101
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 102
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method

.method public final onSaveClicked()V
    .locals 5

    .line 48
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 51
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$KO8GuAOMQkBXrctbz8PCXFak5P4;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$KO8GuAOMQkBXrctbz8PCXFak5P4;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    .line 84
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$py3e_SsB56Qtzj1cO4UMDCQxM84;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$py3e_SsB56Qtzj1cO4UMDCQxM84;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    .line 88
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v0

    .line 89
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$Kvl7Qv3E2xcKMfJJR2gpaaSUR8g;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$Kvl7Qv3E2xcKMfJJR2gpaaSUR8g;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 93
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$2trNlw8s47PGYR_TICtXR5ErZqY;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$2trNlw8s47PGYR_TICtXR5ErZqY;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V

    .line 95
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$ku_LjPW6wcW1Xm3cafutBoCnhzc;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$ku_LjPW6wcW1Xm3cafutBoCnhzc;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V

    .line 93
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method

.method public final setConfig(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)V
    .locals 2

    .line 38
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->config:Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    if-eqz p1, :cond_0

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->valueField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->getValue()Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->valueUnitField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->getUnit()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
