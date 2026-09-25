.class public final Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "ChooseUnitsViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0010J\u0008\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u001cJ\n\u0010\u001e\u001a\u00020\u001c*\u00020\u001fJ\n\u0010 \u001a\u00020\u001c*\u00020\u001fR\u001c\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00060\u00060\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;",
        "activityContext",
        "Landroid/content/Context;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "settingsLiteCommunicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "savePreferencesViewModel",
        "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "metricChecked",
        "Landroidx/databinding/ObservableField;",
        "",
        "getMetricChecked",
        "()Landroidx/databinding/ObservableField;",
        "showSaveProgress",
        "getShowSaveProgress",
        "onBackClicked",
        "",
        "onSaveClicked",
        "onImperialChecked",
        "Landroid/view/View;",
        "onMetricChecked",
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

.field private final metricChecked:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V
    .locals 2

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsLiteCommunicator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBus"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savePreferencesViewModel"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 25
    invoke-direct {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 22
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

    .line 23
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 26
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    .line 29
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 30
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->metricChecked:Landroidx/databinding/ObservableField;

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed()Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$hMRiQzXafiyfWGcFfq5_evG7DQU;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$hMRiQzXafiyfWGcFfq5_evG7DQU;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$lSajDM3DxLlIgkBu5339mMhI7BY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$lSajDM3DxLlIgkBu5339mMhI7BY;

    invoke-virtual {p2, p3, p4}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;-><init>(Landroidx/databinding/ObservableField;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 20
    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;-><init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->getMetricChecked()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static synthetic lambda$1uq8nZmkjmCtxgO-SPyk6ziAftg(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->onSaveClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V

    return-void
.end method

.method public static synthetic lambda$VXTMG6p_uta83GlfsutOUdPVyEY(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->onSaveClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$dvnje4eh8uT1QAPNlkmBKbEZffg(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->onSaveClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$g03d9u6jse1SJIChc0I2TuM_VX4(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->onSaveClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$hMRiQzXafiyfWGcFfq5_evG7DQU(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$lSajDM3DxLlIgkBu5339mMhI7BY(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->_init_$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onSaveClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->getMetricChecked()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;

    goto :goto_0

    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;

    :goto_0
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 56
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v14

    const/4 v15, 0x0

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType;->getType()Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x5

    const/16 v19, 0x0

    invoke-static/range {v14 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v14

    const/16 v15, 0x3ff

    const/16 v16, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v1

    .line 57
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v2

    .line 58
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->settingsLiteCommunicator:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;

    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    invoke-interface {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;->applySetting(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    invoke-virtual {v2, v0}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method

.method private static final onSaveClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    .line 64
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onSaveClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onSaveClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->onBackClicked()V

    return-void
.end method


# virtual methods
.method public final getMetricChecked()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->metricChecked:Landroidx/databinding/ObservableField;

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 47
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onImperialChecked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->metricChecked:Landroidx/databinding/ObservableField;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onMetricChecked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->metricChecked:Landroidx/databinding/ObservableField;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onSaveClicked()V
    .locals 6

    .line 52
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v1, v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v1

    .line 54
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$dvnje4eh8uT1QAPNlkmBKbEZffg;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$dvnje4eh8uT1QAPNlkmBKbEZffg;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    .line 61
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v1

    .line 62
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$g03d9u6jse1SJIChc0I2TuM_VX4;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$g03d9u6jse1SJIChc0I2TuM_VX4;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v1

    .line 66
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$1uq8nZmkjmCtxgO-SPyk6ziAftg;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$1uq8nZmkjmCtxgO-SPyk6ziAftg;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V

    .line 68
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$VXTMG6p_uta83GlfsutOUdPVyEY;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$VXTMG6p_uta83GlfsutOUdPVyEY;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V

    .line 66
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
