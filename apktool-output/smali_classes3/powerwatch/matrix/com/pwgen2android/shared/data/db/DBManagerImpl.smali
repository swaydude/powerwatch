.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;
.super Ljava/lang/Object;
.source "DBManager.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\u0006H\u0016J\u0008\u0010\n\u001a\u00020\u0008H\u0016J\u0008\u0010\u000b\u001a\u00020\u0006H\u0016J\u0008\u0010\u000c\u001a\u00020\u0008H\u0016J\u0008\u0010\r\u001a\u00020\u0006H\u0016J\u0008\u0010\u000e\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;",
        "roomDB",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;)V",
        "clearAllData",
        "",
        "clearAllDataCompletable",
        "Lio/reactivex/Completable;",
        "clearBackgroundAndActivityLogs",
        "clearBackgroundAndActivityLogsCompletable",
        "clearDevices",
        "clearDevicesCompletable",
        "clearGoalConfigurations",
        "clearGoalConfigurationsCompletable",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;)V
    .locals 1

    const-string v0, "roomDB"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    return-void
.end method

.method private static final clearAllDataCompletable$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->clearAllTables()V

    return-void
.end method

.method private static final clearBackgroundAndActivityLogsCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->clearBackgroundAndActivityLogs()V

    return-void
.end method

.method private static final clearDevicesCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->clearDevices()V

    return-void
.end method

.method private static final clearGoalConfigurationsCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->clearGoalConfigurations()V

    return-void
.end method

.method public static synthetic lambda$63ZjLdETDQn0a-11GZ7WMfOvNpo(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->clearDevicesCompletable$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V

    return-void
.end method

.method public static synthetic lambda$SbVXz28VpAcOKbZpiwV4yislEHw(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->clearGoalConfigurationsCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V

    return-void
.end method

.method public static synthetic lambda$ewzN08DnBk1fQEowplsL5u92vBI(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->clearBackgroundAndActivityLogsCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V

    return-void
.end method

.method public static synthetic lambda$ivQHAtJq-rezm5fUHYH9JV5V3ys(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->clearAllDataCompletable$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V

    return-void
.end method


# virtual methods
.method public clearAllData()V
    .locals 1

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->clearAllTables()V

    return-void
.end method

.method public clearAllDataCompletable()Lio/reactivex/Completable;
    .locals 2

    .line 59
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DBManagerImpl$ivQHAtJq-rezm5fUHYH9JV5V3ys;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DBManagerImpl$ivQHAtJq-rezm5fUHYH9JV5V3ys;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n        roomDB.clearAllTables()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public clearBackgroundAndActivityLogs()V
    .locals 1

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->walkingHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;->deleteAll()V

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->restingHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;->deleteAll()V

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->sleepHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;->deleteAll()V

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->userActivitySessionDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->deleteAll()V

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->userActivitySessionDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;->deleteAllActivityDates()V

    return-void
.end method

.method public clearBackgroundAndActivityLogsCompletable()Lio/reactivex/Completable;
    .locals 2

    .line 47
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DBManagerImpl$ewzN08DnBk1fQEowplsL5u92vBI;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DBManagerImpl$ewzN08DnBk1fQEowplsL5u92vBI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n        clearBackgroundAndActivityLogs()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public clearDevices()V
    .locals 1

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->deviceDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->deleteAll()V

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->updateInfoDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->deleteAll()V

    return-void
.end method

.method public clearDevicesCompletable()Lio/reactivex/Completable;
    .locals 2

    .line 55
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DBManagerImpl$63ZjLdETDQn0a-11GZ7WMfOvNpo;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DBManagerImpl$63ZjLdETDQn0a-11GZ7WMfOvNpo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n        clearDevices()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public clearGoalConfigurations()V
    .locals 1

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;->roomDB:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->goalConfigurationDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;->deleteAll()V

    return-void
.end method

.method public clearGoalConfigurationsCompletable()Lio/reactivex/Completable;
    .locals 2

    .line 51
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DBManagerImpl$SbVXz28VpAcOKbZpiwV4yislEHw;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DBManagerImpl$SbVXz28VpAcOKbZpiwV4yislEHw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n        clearGoalConfigurations()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
