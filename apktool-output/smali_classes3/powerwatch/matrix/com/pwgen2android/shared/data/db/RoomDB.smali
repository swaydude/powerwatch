.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;
.super Landroidx/room/RoomDatabase;
.source "RoomDB.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H&J\u0008\u0010\u0005\u001a\u00020\u0006H&J\u0008\u0010\u0007\u001a\u00020\u0008H&J\u0008\u0010\t\u001a\u00020\nH&J\u0008\u0010\u000b\u001a\u00020\u000cH&J\u0008\u0010\r\u001a\u00020\u000eH&J\u0008\u0010\u000f\u001a\u00020\u0010H&J\u0008\u0010\u0011\u001a\u00020\u0012H&J\u0008\u0010\u0013\u001a\u00020\u0014H&J\u0008\u0010\u0015\u001a\u00020\u0016H&J\u0008\u0010\u0017\u001a\u00020\u0018H&J\u0008\u0010\u0019\u001a\u00020\u001aH&J\u0008\u0010\u001b\u001a\u00020\u001cH&\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;",
        "Landroidx/room/RoomDatabase;",
        "()V",
        "defaultPhoneWatchDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;",
        "deviceDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;",
        "goalConfigurationDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;",
        "restingHourPeriodDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;",
        "restingLogDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;",
        "sleepHourPeriodDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;",
        "sleepLogDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;",
        "tokenStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;",
        "updateInfoDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;",
        "userActivitySessionDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;",
        "userDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;",
        "walkingHourPeriodDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;",
        "walkingLogDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Landroidx/room/RoomDatabase;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract defaultPhoneWatchDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;
.end method

.method public abstract deviceDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;
.end method

.method public abstract goalConfigurationDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;
.end method

.method public abstract restingHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;
.end method

.method public abstract restingLogDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;
.end method

.method public abstract sleepHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;
.end method

.method public abstract sleepLogDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;
.end method

.method public abstract tokenStorage()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;
.end method

.method public abstract updateInfoDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;
.end method

.method public abstract userActivitySessionDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;
.end method

.method public abstract userDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;
.end method

.method public abstract walkingHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;
.end method

.method public abstract walkingLogDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;
.end method
