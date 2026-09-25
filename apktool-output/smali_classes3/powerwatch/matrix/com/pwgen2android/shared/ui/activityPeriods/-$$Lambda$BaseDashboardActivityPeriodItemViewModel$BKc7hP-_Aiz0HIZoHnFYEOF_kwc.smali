.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/-$$Lambda$BaseDashboardActivityPeriodItemViewModel$BKc7hP-_Aiz0HIZoHnFYEOF_kwc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/-$$Lambda$BaseDashboardActivityPeriodItemViewModel$BKc7hP-_Aiz0HIZoHnFYEOF_kwc;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/-$$Lambda$BaseDashboardActivityPeriodItemViewModel$BKc7hP-_Aiz0HIZoHnFYEOF_kwc;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/-$$Lambda$BaseDashboardActivityPeriodItemViewModel$BKc7hP-_Aiz0HIZoHnFYEOF_kwc;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/-$$Lambda$BaseDashboardActivityPeriodItemViewModel$BKc7hP-_Aiz0HIZoHnFYEOF_kwc;->f$1:Landroid/content/Context;

    check-cast p1, Ljava/util/Calendar;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;->lambda$BKc7hP-_Aiz0HIZoHnFYEOF_kwc(Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;Landroid/content/Context;Ljava/util/Calendar;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
