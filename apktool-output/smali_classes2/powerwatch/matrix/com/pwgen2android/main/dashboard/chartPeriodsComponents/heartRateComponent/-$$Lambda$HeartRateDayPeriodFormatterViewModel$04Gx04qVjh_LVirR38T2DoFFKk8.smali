.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayPeriodFormatterViewModel$04Gx04qVjh_LVirR38T2DoFFKk8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;

.field public final synthetic f$1:Ljava/util/Calendar;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;Ljava/util/Calendar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayPeriodFormatterViewModel$04Gx04qVjh_LVirR38T2DoFFKk8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayPeriodFormatterViewModel$04Gx04qVjh_LVirR38T2DoFFKk8;->f$1:Ljava/util/Calendar;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayPeriodFormatterViewModel$04Gx04qVjh_LVirR38T2DoFFKk8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/-$$Lambda$HeartRateDayPeriodFormatterViewModel$04Gx04qVjh_LVirR38T2DoFFKk8;->f$1:Ljava/util/Calendar;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;->lambda$04Gx04qVjh_LVirR38T2DoFFKk8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
