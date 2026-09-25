.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$cuqJUyD4vjFdH82s7bepIeuDkS8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$cuqJUyD4vjFdH82s7bepIeuDkS8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$cuqJUyD4vjFdH82s7bepIeuDkS8;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$cuqJUyD4vjFdH82s7bepIeuDkS8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$cuqJUyD4vjFdH82s7bepIeuDkS8;->f$1:Landroid/content/Context;

    check-cast p1, Ljava/util/Calendar;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->lambda$cuqJUyD4vjFdH82s7bepIeuDkS8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;Landroid/content/Context;Ljava/util/Calendar;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
