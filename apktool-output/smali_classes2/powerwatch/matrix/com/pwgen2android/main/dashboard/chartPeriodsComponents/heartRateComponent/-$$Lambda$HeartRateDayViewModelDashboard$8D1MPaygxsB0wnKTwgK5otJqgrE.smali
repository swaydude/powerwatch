.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayViewModelDashboard$8D1MPaygxsB0wnKTwgK5otJqgrE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayViewModelDashboard$8D1MPaygxsB0wnKTwgK5otJqgrE;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayViewModelDashboard$8D1MPaygxsB0wnKTwgK5otJqgrE;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayViewModelDashboard$8D1MPaygxsB0wnKTwgK5otJqgrE;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayViewModelDashboard$8D1MPaygxsB0wnKTwgK5otJqgrE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayViewModelDashboard$8D1MPaygxsB0wnKTwgK5otJqgrE;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayViewModelDashboard;->lambda$8D1MPaygxsB0wnKTwgK5otJqgrE(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
