.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;->f$3:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$4XAGdCiHV6nElandwOLnAtUl8wU;->f$3:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$4XAGdCiHV6nElandwOLnAtUl8wU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/RestingLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;Lkotlin/Pair;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
