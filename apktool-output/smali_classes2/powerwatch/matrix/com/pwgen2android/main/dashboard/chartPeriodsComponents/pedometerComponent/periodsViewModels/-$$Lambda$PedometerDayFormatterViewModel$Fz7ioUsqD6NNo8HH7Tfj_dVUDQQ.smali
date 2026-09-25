.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerDayFormatterViewModel$Fz7ioUsqD6NNo8HH7Tfj_dVUDQQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDayFormatterViewModel;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDayFormatterViewModel;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerDayFormatterViewModel$Fz7ioUsqD6NNo8HH7Tfj_dVUDQQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDayFormatterViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerDayFormatterViewModel$Fz7ioUsqD6NNo8HH7Tfj_dVUDQQ;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerDayFormatterViewModel$Fz7ioUsqD6NNo8HH7Tfj_dVUDQQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDayFormatterViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerDayFormatterViewModel$Fz7ioUsqD6NNo8HH7Tfj_dVUDQQ;->f$1:Landroid/content/Context;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDayFormatterViewModel;->lambda$Fz7ioUsqD6NNo8HH7Tfj_dVUDQQ(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDayFormatterViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    move-result-object p1

    return-object p1
.end method
