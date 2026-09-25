.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

.field public final synthetic f$4:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$3:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$4:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$3:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$s9nqm2QnkiODKyXb9yDLGKrLGio;->f$4:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$s9nqm2QnkiODKyXb9yDLGKrLGio(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/WalkingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/SleepHourPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
