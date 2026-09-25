.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$EybpYOVB8FmC7-i4EilpU0AWV68;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

.field public final synthetic f$1:Ljava/util/Calendar;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;Ljava/util/Calendar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$EybpYOVB8FmC7-i4EilpU0AWV68;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$EybpYOVB8FmC7-i4EilpU0AWV68;->f$1:Ljava/util/Calendar;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$EybpYOVB8FmC7-i4EilpU0AWV68;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$EybpYOVB8FmC7-i4EilpU0AWV68;->f$1:Ljava/util/Calendar;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->lambda$EybpYOVB8FmC7-i4EilpU0AWV68(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
