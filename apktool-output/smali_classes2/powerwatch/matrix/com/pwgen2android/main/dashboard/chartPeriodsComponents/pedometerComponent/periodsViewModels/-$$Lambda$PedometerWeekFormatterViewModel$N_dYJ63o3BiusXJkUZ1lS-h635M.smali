.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerWeekFormatterViewModel$N_dYJ63o3BiusXJkUZ1lS-h635M;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerWeekFormatterViewModel;

.field public final synthetic f$1:Ljava/util/Calendar;

.field public final synthetic f$2:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerWeekFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerWeekFormatterViewModel$N_dYJ63o3BiusXJkUZ1lS-h635M;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerWeekFormatterViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerWeekFormatterViewModel$N_dYJ63o3BiusXJkUZ1lS-h635M;->f$1:Ljava/util/Calendar;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerWeekFormatterViewModel$N_dYJ63o3BiusXJkUZ1lS-h635M;->f$2:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerWeekFormatterViewModel$N_dYJ63o3BiusXJkUZ1lS-h635M;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerWeekFormatterViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerWeekFormatterViewModel$N_dYJ63o3BiusXJkUZ1lS-h635M;->f$1:Ljava/util/Calendar;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/-$$Lambda$PedometerWeekFormatterViewModel$N_dYJ63o3BiusXJkUZ1lS-h635M;->f$2:Landroid/content/Context;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerWeekFormatterViewModel;->lambda$N_dYJ63o3BiusXJkUZ1lS-h635M(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerWeekFormatterViewModel;Ljava/util/Calendar;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;

    move-result-object p1

    return-object p1
.end method
