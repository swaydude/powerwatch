.class public final Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "SingleWheelViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSingleWheelViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleWheelViewModel.kt\npowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0014J\u0008\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nH\u0016J\u0018\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0007R\u001c\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u000c0\u000c0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "settingsLiteCommunicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;",
        "activityContext",
        "Landroid/content/Context;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "sleepTimeStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;",
        "savePreferencesViewModel",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "goal",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "showSaveProgress",
        "Landroidx/databinding/ObservableField;",
        "",
        "getShowSaveProgress",
        "()Landroidx/databinding/ObservableField;",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "onSaveClicked",
        "wheelConfig",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;",
        "pickerValue",
        "",
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

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private goal:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

.field private final goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

.field private final sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

.field private user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V
    .locals 2

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsLiteCommunicator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBus"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTimeStorage"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savePreferencesViewModel"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 38
    invoke-direct {p0, p4, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 30
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 31
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

    .line 34
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 35
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 36
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    .line 38
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    .line 40
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;-><init>(Landroidx/databinding/ObservableField;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p9

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    .line 29
    invoke-direct/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V

    return-void
.end method

.method public static synthetic lambda$JsjYoV96W8NhxT8GnO5Apx5w_yo(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onSaveClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)V

    return-void
.end method

.method public static synthetic lambda$KRovPt9xNaeT3dknYdjwjtNTEE4(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V

    return-void
.end method

.method public static synthetic lambda$NCBSUHELuuxFeVuwFVmRZAokLrM(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onSaveClicked$lambda-6(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;)V

    return-void
.end method

.method public static synthetic lambda$N_DfCfnmH6Fwb0YlOG-fAhPn3Sg(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onSaveClicked$lambda-7(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$azlnd4vBpGtlL8jZ2qc2Qi4kcvs(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$jMNSohqGm-NSJ4PggUlvXRwcaiw(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onCreateView$lambda-2(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$zFPz9j0XPF-c5Y35NzqEliJ8758(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onSaveClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 51
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->goal:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    return-void
.end method

.method private static final onCreateView$lambda-2(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onSaveClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getSleepTime()I

    move-result p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;->saveSleepTime(I)V

    return-void
.end method

.method private static final onSaveClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    .line 136
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onSaveClicked$lambda-6(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onSaveClicked$lambda-7(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->onBackClicked()V

    return-void
.end method


# virtual methods
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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 146
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 147
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->popBackStackAllowingStateLoss(Landroidx/fragment/app/FragmentManager;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 47
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userPrefs()Lio/reactivex/Observable;

    move-result-object v0

    .line 49
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    .line 50
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$azlnd4vBpGtlL8jZ2qc2Qi4kcvs;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$azlnd4vBpGtlL8jZ2qc2Qi4kcvs;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    .line 54
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v0, v1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 55
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    .line 56
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$KRovPt9xNaeT3dknYdjwjtNTEE4;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$KRovPt9xNaeT3dknYdjwjtNTEE4;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$jMNSohqGm-NSJ4PggUlvXRwcaiw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$jMNSohqGm-NSJ4PggUlvXRwcaiw;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onSaveClicked(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;Ljava/lang/String;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "wheelConfig"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "pickerValue"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    const-string v7, "user"

    const/4 v8, 0x0

    if-eqz v4, :cond_27

    invoke-virtual {v2, v4}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v9

    .line 67
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    move-result-object v2

    .line 69
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const-string v5, ""

    const/4 v10, 0x2

    if-eqz v4, :cond_4

    .line 71
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getAdapter()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    move-result-object v2

    if-nez v2, :cond_0

    :goto_0
    move-object v2, v5

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->getUnit()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 73
    :catch_0
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v1, v2, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->defaultUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v1

    .line 75
    :goto_2
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v11, :cond_3

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v2, v1, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getMetricValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x7bf

    const/16 v25, 0x0

    invoke-static/range {v11 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v1

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 76
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;

    if-eqz v1, :cond_2

    invoke-direct {v2, v1, v8, v10, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    goto/16 :goto_f

    :cond_2
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 75
    :cond_3
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 78
    :cond_4
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 80
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getAdapter()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    move-result-object v2

    if-nez v2, :cond_5

    :goto_3
    move-object v2, v5

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->getUnit()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    :goto_4
    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object/from16 v1, p2

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    .line 82
    :catch_1
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v1, v2, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->defaultUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v1

    int-to-float v1, v1

    .line 84
    :goto_5
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v11, :cond_8

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v2, v1, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getMetricValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v20

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x77f

    const/16 v25, 0x0

    invoke-static/range {v11 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v1

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 85
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;

    if-eqz v1, :cond_7

    invoke-direct {v2, v1, v8, v10, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    goto/16 :goto_f

    :cond_7
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 84
    :cond_8
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 87
    :cond_9
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 89
    :try_start_2
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move/from16 v18, v1

    goto :goto_6

    :catch_2
    const/16 v1, 0x19

    const/16 v18, 0x19

    .line 93
    :goto_6
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v11, :cond_b

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x7df

    const/16 v25, 0x0

    invoke-static/range {v11 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v1

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 94
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;

    if-eqz v1, :cond_a

    invoke-direct {v2, v1, v8, v10, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    goto/16 :goto_f

    :cond_a
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 93
    :cond_b
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 96
    :cond_c
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_14

    .line 97
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getAdapter()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    move-result-object v2

    if-nez v2, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->getPosition(Ljava/lang/String;)I

    move-result v5

    .line 98
    :goto_7
    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v11, :cond_13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getAdapter()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    move-result-object v1

    if-nez v1, :cond_e

    move-object v1, v8

    goto :goto_8

    :cond_e
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->getPickedData()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-result-object v1

    :goto_8
    if-nez v1, :cond_f

    :goto_9
    move-object v1, v8

    goto :goto_a

    :cond_f
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getDisplayedValues()[Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_10

    goto :goto_9

    :cond_10
    aget-object v1, v1, v5

    :goto_a
    if-nez v1, :cond_11

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v1

    :cond_11
    move-object/from16 v21, v1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x6ff

    const/16 v25, 0x0

    invoke-static/range {v11 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v1

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 99
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;

    if-eqz v1, :cond_12

    invoke-direct {v2, v1, v8, v10, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    goto/16 :goto_f

    :cond_12
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 98
    :cond_13
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 101
    :cond_14
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    :try_start_3
    const-string v2, "h"

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object/from16 v1, p2

    .line 103
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move v14, v1

    goto :goto_b

    :catch_3
    const/16 v1, 0xc

    const/16 v14, 0xc

    .line 107
    :goto_b
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v1, :cond_17

    const-wide/16 v2, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x3

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v27

    const/16 v28, 0x3ff

    const/16 v29, 0x0

    move-object v15, v1

    move-wide/from16 v16, v2

    invoke-static/range {v15 .. v29}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v1

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 108
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;

    if-eqz v1, :cond_15

    invoke-direct {v2, v1, v8, v10, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    goto/16 :goto_f

    :cond_15
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 107
    :cond_16
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    :cond_17
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    .line 110
    :cond_18
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 112
    move-object v2, v8

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    goto/16 :goto_f

    .line 114
    :cond_19
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_26

    .line 115
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;->getLanguageInfos()Ljava/util/List;

    move-result-object v2

    .line 116
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    :cond_1a
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object v4

    iget-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v6, :cond_1b

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getLanguage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1a

    goto :goto_c

    :cond_1b
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    :cond_1c
    move-object v3, v8

    :goto_c
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    if-nez v3, :cond_1d

    move-object v2, v8

    goto :goto_d

    :cond_1d
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLocale()Ljava/util/Locale;

    move-result-object v2

    :goto_d
    if-nez v2, :cond_1e

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;->getDefaultLanguageInfo()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLocale()Ljava/util/Locale;

    move-result-object v2

    .line 118
    :cond_1e
    move-object v9, v1

    check-cast v9, Ljava/lang/CharSequence;

    const-string v1, ":"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x6

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1f

    goto :goto_e

    :cond_1f
    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_20

    goto :goto_e

    :cond_20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 119
    :goto_e
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v3, :cond_25

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->goal:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-eqz v4, :cond_24

    invoke-direct {v1, v3, v2, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/util/Locale;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;I)V

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    .line 124
    :goto_f
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 125
    instance-of v1, v2, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;

    if-eqz v1, :cond_21

    .line 126
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

    invoke-interface {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;->applySetting(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)Lio/reactivex/Completable;

    move-result-object v1

    .line 127
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$JsjYoV96W8NhxT8GnO5Apx5w_yo;

    invoke-direct {v3, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$JsjYoV96W8NhxT8GnO5Apx5w_yo;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)V

    invoke-static {v3}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v2

    check-cast v2, Lio/reactivex/CompletableSource;

    .line 126
    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v1

    goto :goto_11

    .line 131
    :cond_21
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v3, :cond_23

    invoke-interface {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v1

    if-eqz v2, :cond_22

    .line 132
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;->settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

    invoke-interface {v3, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;->applySetting(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)Lio/reactivex/Completable;

    move-result-object v2

    goto :goto_10

    :cond_22
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v2

    const-string v3, "complete()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_10
    check-cast v2, Lio/reactivex/CompletableSource;

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v1

    .line 133
    :goto_11
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v1

    .line 134
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$zFPz9j0XPF-c5Y35NzqEliJ8758;

    invoke-direct {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$zFPz9j0XPF-c5Y35NzqEliJ8758;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v1

    .line 138
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$NCBSUHELuuxFeVuwFVmRZAokLrM;

    invoke-direct {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$NCBSUHELuuxFeVuwFVmRZAokLrM;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;)V

    .line 140
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$N_DfCfnmH6Fwb0YlOG-fAhPn3Sg;

    invoke-direct {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$SingleWheelViewModel$N_DfCfnmH6Fwb0YlOG-fAhPn3Sg;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;)V

    .line 138
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void

    .line 131
    :cond_23
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    :cond_24
    const-string v1, "goal"

    .line 119
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    :cond_25
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8

    :cond_26
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 65
    :cond_27
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v8
.end method
