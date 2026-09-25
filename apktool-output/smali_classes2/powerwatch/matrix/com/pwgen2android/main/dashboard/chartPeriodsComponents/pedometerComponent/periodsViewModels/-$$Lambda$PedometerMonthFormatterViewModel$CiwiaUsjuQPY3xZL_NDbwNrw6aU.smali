.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;

    check-cast p2, Ljava/util/List;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;->lambda$CiwiaUsjuQPY3xZL_NDbwNrw6aU(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
