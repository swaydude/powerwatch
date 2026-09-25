.class public final Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "SetGoalsViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u000eJ\u0008\u0010$\u001a\u00020%H\u0016J\u0006\u0010&\u001a\u00020%R\u001f\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u001f\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0014R\u001f\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0014R\u001c\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00060\u00060\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0014R\u001f\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0014R\u001f\u0010 \u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0014R\u001f\u0010\"\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;",
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
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "savePreferencesViewModel",
        "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V",
        "caloriesField",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getCaloriesField",
        "()Landroidx/databinding/ObservableField;",
        "distanceField",
        "getDistanceField",
        "distanceUnitField",
        "getDistanceUnitField",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "showSaveProgress",
        "",
        "getShowSaveProgress",
        "sleepField",
        "getSleepField",
        "sleepUnitField",
        "getSleepUnitField",
        "stepsField",
        "getStepsField",
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

.field private final caloriesField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final distanceField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final distanceUnitField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final sleepField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepUnitField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stepsField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V
    .locals 2

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBus"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savePreferencesViewModel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 25
    invoke-direct {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 23
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 24
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 26
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    .line 29
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 31
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, "0"

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->stepsField:Landroidx/databinding/ObservableField;

    .line 32
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p5, "0.0"

    invoke-direct {p1, p5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->distanceField:Landroidx/databinding/ObservableField;

    .line 33
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->caloriesField:Landroidx/databinding/ObservableField;

    .line 34
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->sleepField:Landroidx/databinding/ObservableField;

    .line 36
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->distanceUnitField:Landroidx/databinding/ObservableField;

    .line 37
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, "h"

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->sleepUnitField:Landroidx/databinding/ObservableField;

    .line 40
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 p2, 0x1

    invoke-static {p3, v0, p2, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p2

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk;

    .line 41
    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 42
    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed()Lio/reactivex/Observable;

    move-result-object p3

    check-cast p3, Lio/reactivex/ObservableSource;

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY;

    invoke-virtual {p2, p3, p4}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p2

    .line 47
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$sfw1eAxehwwf-RFbJymnRO3QNvg;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$sfw1eAxehwwf-RFbJymnRO3QNvg;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$rJqwaZ6STOm-iJfTGr_G-bD-i9c;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$rJqwaZ6STOm-iJfTGr_G-bD-i9c;

    invoke-virtual {p2, p3, p4}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 25
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;

    const/4 p7, 0x1

    const/4 p8, 0x0

    invoke-direct {p6, p8, p7, p8}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;-><init>(Landroidx/databinding/ObservableField;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p6, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 21
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;-><init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V

    return-void
.end method

.method private static final _init_$lambda-0(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    return-object p0
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/Boolean;)Lkotlin/Pair;
    .locals 1

    const-string v0, "goals"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isMetricUsed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final _init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lkotlin/Pair;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    .line 49
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 50
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getDistance()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v1

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getStepsField()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 52
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getDistanceField()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->twoDecimalsFormat(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getDistanceUnitField()Landroidx/databinding/ObservableField;

    move-result-object v1

    if-eqz p1, :cond_0

    const-string p1, "km"

    goto :goto_0

    :cond_0
    const-string p1, "mi"

    :goto_0
    invoke-virtual {v1, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 54
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getSleepField()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result v1

    int-to-float v1, v1

    const/16 v2, 0x3c

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 55
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getCaloriesField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static synthetic lambda$5NYHmslSA1yn4gEdMVMrTGw8qnQ(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->onSaveClicked$lambda-7(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$9rP98uG024Jq4tI-CEfUOw8cbVk(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->_init_$lambda-0(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Ci75bGDOWUgk-bDBwZt8d22X-Zg(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->onSaveClicked$lambda-4(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Jp0i5Wd5bVzNfalVJkV1uMbqaz8(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->onSaveClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$N3-ATP30UQeKYmrlbnbMQbKo-0w(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->onSaveClicked$lambda-8(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V

    return-void
.end method

.method public static synthetic lambda$gdZKAJ9wzBwXLzJufDcU9Fv2WYY(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/Boolean;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/Boolean;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$lhassoqZlPc52vWyCr1W8S_09Pc(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->onSaveClicked$lambda-9(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$rJqwaZ6STOm-iJfTGr_G-bD-i9c(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->_init_$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$sfw1eAxehwwf-RFbJymnRO3QNvg(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->_init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$tZpWdnJ13KaT-1tTKdwhJh8Brj8(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->onSaveClicked$lambda-6(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final onSaveClicked$lambda-4(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    return-object p0
.end method

.method private static final onSaveClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 14

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getDistanceField()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getMetricValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v5

    .line 68
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getSleepField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/16 v1, 0x3c

    int-to-float v1, v1

    mul-float v0, v0, v1

    .line 70
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getCaloriesField()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 71
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getStepsField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 73
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v7

    const-wide/16 v2, 0x0

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc9

    const/4 v13, 0x0

    move-object v1, p1

    .line 69
    invoke-static/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;JIFIIIJZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p0

    return-object p0
.end method

.method private static final onSaveClicked$lambda-6(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/CompletableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;Ljava/lang/Object;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final onSaveClicked$lambda-7(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 82
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onSaveClicked$lambda-8(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onSaveClicked$lambda-9(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->onBackClicked()V

    return-void
.end method


# virtual methods
.method public final getCaloriesField()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->caloriesField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getDistanceField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->distanceField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getDistanceUnitField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->distanceUnitField:Landroidx/databinding/ObservableField;

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public final getSleepField()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->sleepField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSleepUnitField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->sleepUnitField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getStepsField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->stepsField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 92
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 93
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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
    .locals 4

    .line 61
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 62
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 63
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$Ci75bGDOWUgk-bDBwZt8d22X-Zg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$Ci75bGDOWUgk-bDBwZt8d22X-Zg;

    .line 64
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 65
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$Jp0i5Wd5bVzNfalVJkV1uMbqaz8;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$Jp0i5Wd5bVzNfalVJkV1uMbqaz8;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 76
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$tZpWdnJ13KaT-1tTKdwhJh8Brj8;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$tZpWdnJ13KaT-1tTKdwhJh8Brj8;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    .line 79
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v1

    .line 80
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$5NYHmslSA1yn4gEdMVMrTGw8qnQ;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$5NYHmslSA1yn4gEdMVMrTGw8qnQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v1

    .line 84
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$N3-ATP30UQeKYmrlbnbMQbKo-0w;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$N3-ATP30UQeKYmrlbnbMQbKo-0w;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V

    .line 86
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$lhassoqZlPc52vWyCr1W8S_09Pc;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$lhassoqZlPc52vWyCr1W8S_09Pc;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V

    .line 84
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
