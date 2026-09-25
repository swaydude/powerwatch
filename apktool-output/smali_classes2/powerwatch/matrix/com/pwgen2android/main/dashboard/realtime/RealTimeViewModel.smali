.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "RealTimeViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u001bH\u0002J\u0010\u00107\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0010\u00108\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u00109\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010:\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\n\u0010;\u001a\u000205*\u00020<J\n\u0010=\u001a\u000205*\u00020<J\n\u0010>\u001a\u000205*\u00020<J\n\u0010?\u001a\u000205*\u00020<R \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012\"\u0004\u0008\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u0012\"\u0004\u0008\u001d\u0010\u0014R \u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u0012\"\u0004\u0008 \u0010\u0014R \u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u0012\"\u0004\u0008#\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0012R\u0017\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0012R \u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u0012\"\u0004\u0008*\u0010\u0014R \u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010\u0012\"\u0004\u0008-\u0010\u0014R \u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u0010\u0012\"\u0004\u00080\u0010\u0014R \u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010\u0012\"\u0004\u00083\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "realTimeDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;",
        "selectedDateProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "context",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroid/content/Context;)V",
        "bodyPowerField",
        "Landroidx/databinding/ObservableField;",
        "",
        "getBodyPowerField",
        "()Landroidx/databinding/ObservableField;",
        "setBodyPowerField",
        "(Landroidx/databinding/ObservableField;)V",
        "caloriesField",
        "getCaloriesField",
        "setCaloriesField",
        "dataDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "dataField",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
        "getDataField",
        "setDataField",
        "distanceField",
        "getDistanceField",
        "setDistanceField",
        "heartBeatField",
        "getHeartBeatField",
        "setHeartBeatField",
        "selectedDateSubTitle",
        "getSelectedDateSubTitle",
        "selectedDateTitle",
        "getSelectedDateTitle",
        "sleepField",
        "getSleepField",
        "setSleepField",
        "sleepPercentageField",
        "getSleepPercentageField",
        "setSleepPercentageField",
        "solarPowerField",
        "getSolarPowerField",
        "setSolarPowerField",
        "stepsField",
        "getStepsField",
        "setStepsField",
        "fillUpUI",
        "",
        "realTimeData",
        "loadData",
        "onCreateView",
        "onDataReload",
        "onDestroyView",
        "onCaloriesCircleClicked",
        "Landroid/view/View;",
        "onPowerCircleClicked",
        "onSleepCircleClicked",
        "onStepsCircleClicked",
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
.field private bodyPowerField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private caloriesField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private dataField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
            ">;"
        }
    .end annotation
.end field

.field private distanceField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private heartBeatField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final realTimeDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

.field private final selectedDateSubTitle:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedDateTitle:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private sleepField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private sleepPercentageField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private solarPowerField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private stepsField:Landroidx/databinding/ObservableField;
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
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroid/content/Context;)V
    .locals 1

    const-string v0, "realTimeDataProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedDateProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBus"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0, p5, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V

    .line 31
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->realTimeDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

    .line 32
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    .line 33
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 34
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 38
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->bodyPowerField:Landroidx/databinding/ObservableField;

    .line 39
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->solarPowerField:Landroidx/databinding/ObservableField;

    .line 40
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->stepsField:Landroidx/databinding/ObservableField;

    .line 41
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->distanceField:Landroidx/databinding/ObservableField;

    .line 42
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->caloriesField:Landroidx/databinding/ObservableField;

    .line 43
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->heartBeatField:Landroidx/databinding/ObservableField;

    .line 44
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->sleepField:Landroidx/databinding/ObservableField;

    .line 45
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->sleepPercentageField:Landroidx/databinding/ObservableField;

    .line 47
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->selectedDateTitle:Landroidx/databinding/ObservableField;

    .line 48
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->selectedDateSubTitle:Landroidx/databinding/ObservableField;

    .line 50
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->dataField:Landroidx/databinding/ObservableField;

    .line 52
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method private final fillUpUI(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V
    .locals 4

    .line 115
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->bodyPowerField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getBodyPower()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->solarPowerField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSolarPower()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->stepsField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getStepsData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getDistanceData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v0

    .line 121
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->distanceField:Landroidx/databinding/ObservableField;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->twoDecimalsFormat(F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->caloriesField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getCaloriesData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 124
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->heartBeatField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getHeartBeatData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 126
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->sleepField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSleepData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->minutesToHoursAndMinutesFormat(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->sleepPercentageField:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSleepData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt;->showPercentage(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->dataField:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$BigpfZ0HV3rrdfvhQqWsfl5FYHM(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Ljava/util/Calendar;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->loadData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Ljava/util/Calendar;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$GSoM_igsiwj1izhwmlecSBx9hzs(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->loadData$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$KnL7-ZbbORBvOzJFPXTarV8b1oE(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Landroid/content/Context;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->loadData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Landroid/content/Context;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$WvXsB-ROa9XYTllLqOtGGcRksF8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->loadData$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V

    return-void
.end method

.method public static synthetic lambda$m5ZnE_5OBnObst2ZpgkllyCvFV4(Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->loadData$lambda-1$lambda-0(Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ya6Fo_v72uOqrydQoAIIQXEbn-Y(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->loadData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private final loadData(Landroid/content/Context;)V
    .locals 3

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 75
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;->getSelectedDateObservable()Lio/reactivex/Observable;

    move-result-object v1

    .line 76
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$BigpfZ0HV3rrdfvhQqWsfl5FYHM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$BigpfZ0HV3rrdfvhQqWsfl5FYHM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 80
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$KnL7-ZbbORBvOzJFPXTarV8b1oE;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$KnL7-ZbbORBvOzJFPXTarV8b1oE;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 99
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$ya6Fo_v72uOqrydQoAIIQXEbn-Y;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$ya6Fo_v72uOqrydQoAIIQXEbn-Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 103
    invoke-virtual {p1}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object p1

    .line 105
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$WvXsB-ROa9XYTllLqOtGGcRksF8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$WvXsB-ROa9XYTllLqOtGGcRksF8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)V

    .line 108
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$GSoM_igsiwj1izhwmlecSBx9hzs;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$GSoM_igsiwj1izhwmlecSBx9hzs;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)V

    .line 105
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 74
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final loadData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Ljava/util/Calendar;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getLanguage()Lio/reactivex/Observable;

    move-result-object p0

    .line 78
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$m5ZnE_5OBnObst2ZpgkllyCvFV4;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$m5ZnE_5OBnObst2ZpgkllyCvFV4;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final loadData$lambda-1$lambda-0(Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$calendar"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final loadData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Landroid/content/Context;Lkotlin/Pair;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getSelectedDateTitle()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "it.second"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Calendar;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isToday(Ljava/util/Calendar;)Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f0f01bc

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Calendar;

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->monthDayYearFormatText(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 82
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getSelectedDateSubTitle()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Calendar;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->weekDayName(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 84
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtilsKt;->getIncomingCallString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->setIncomingCallString(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtilsKt;->getMissedCallString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->setMissedCallString(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setBatteryTitle(Ljava/lang/String;)V

    .line 88
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryLowMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setBatteryLowMessage(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryCriticalMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setBatteryCriticalMessage(Ljava/lang/String;)V

    .line 91
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchConnectedTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setWatchConnectedTitle(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchConnectedBody(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setWatchConnectedBody(Ljava/lang/String;)V

    .line 93
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchDisconnectedTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setWatchDisconnectedTitle(Ljava/lang/String;)V

    .line 94
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchDisconnectedBody(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setWatchDisconnectedBody(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getGoalMessage(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setGoalsAchievedResource(Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;)V

    return-void
.end method

.method private static final loadData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->realTimeDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;->getSelectedDate()Ljava/util/Calendar;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dayHoursOffsetFromToday(Ljava/util/Calendar;)J

    move-result-wide v2

    const/16 v1, 0x18

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;->observeData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object p0

    .line 101
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final loadData$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 107
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->fillUpUI(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V

    return-void
.end method

.method private static final loadData$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Day data error occurred: Error is: "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getBodyPowerField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->bodyPowerField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

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

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->caloriesField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getDataField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->dataField:Landroidx/databinding/ObservableField;

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

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->distanceField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getHeartBeatField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->heartBeatField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 31
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getSelectedDateSubTitle()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->selectedDateSubTitle:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSelectedDateTitle()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->selectedDateTitle:Landroidx/databinding/ObservableField;

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

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->sleepField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSleepPercentageField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->sleepPercentageField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSolarPowerField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->solarPowerField:Landroidx/databinding/ObservableField;

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

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->stepsField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onCaloriesCircleClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap$CaloriesWidgetTap;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap$CaloriesWidgetTap;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 62
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7f

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->fillUpUI(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V

    .line 63
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->loadData(Landroid/content/Context;)V

    return-void
.end method

.method public onDataReload(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDataReload(Landroid/content/Context;)V

    .line 56
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->loadData(Landroid/content/Context;)V

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 69
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public final onPowerCircleClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap$PowerWidgetTap;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap$PowerWidgetTap;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    return-void
.end method

.method public final onSleepCircleClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap$SleepWidgetTap;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap$SleepWidgetTap;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    return-void
.end method

.method public final onStepsCircleClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap$StepsWidgetTap;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap$StepsWidgetTap;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    return-void
.end method

.method public final setBodyPowerField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->bodyPowerField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public final setCaloriesField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->caloriesField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public final setDataField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->dataField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public final setDistanceField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->distanceField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public final setHeartBeatField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->heartBeatField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public final setSleepField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->sleepField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public final setSleepPercentageField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->sleepPercentageField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public final setSolarPowerField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->solarPowerField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public final setStepsField(Landroidx/databinding/ObservableField;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->stepsField:Landroidx/databinding/ObservableField;

    return-void
.end method
