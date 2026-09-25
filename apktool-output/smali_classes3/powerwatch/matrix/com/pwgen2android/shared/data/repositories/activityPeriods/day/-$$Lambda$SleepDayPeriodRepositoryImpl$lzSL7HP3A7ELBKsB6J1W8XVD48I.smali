.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/-$$Lambda$SleepDayPeriodRepositoryImpl$lzSL7HP3A7ELBKsB6J1W8XVD48I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepositoryImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/-$$Lambda$SleepDayPeriodRepositoryImpl$lzSL7HP3A7ELBKsB6J1W8XVD48I;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepositoryImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/-$$Lambda$SleepDayPeriodRepositoryImpl$lzSL7HP3A7ELBKsB6J1W8XVD48I;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/-$$Lambda$SleepDayPeriodRepositoryImpl$lzSL7HP3A7ELBKsB6J1W8XVD48I;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepositoryImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/-$$Lambda$SleepDayPeriodRepositoryImpl$lzSL7HP3A7ELBKsB6J1W8XVD48I;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepositoryImpl;->lambda$lzSL7HP3A7ELBKsB6J1W8XVD48I(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/SleepDayPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
