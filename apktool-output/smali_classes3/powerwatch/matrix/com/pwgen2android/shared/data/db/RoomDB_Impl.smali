.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;
.source "RoomDB_Impl.java"


# instance fields
.field private volatile _defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

.field private volatile _deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

.field private volatile _goalConfigurationDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

.field private volatile _restingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

.field private volatile _restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

.field private volatile _sleepHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

.field private volatile _sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

.field private volatile _tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

.field private volatile _updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

.field private volatile _userActivitySessionDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

.field private volatile _userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

.field private volatile _walkingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

.field private volatile _walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$1000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$300(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$400(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$500(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$602(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)Landroidx/sqlite/db/SupportSQLiteDatabase;
    .locals 0

    .line 48
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mDatabase:Landroidx/sqlite/db/SupportSQLiteDatabase;

    return-object p1
.end method

.method static synthetic access$700(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 0

    .line 48
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->internalInitInvalidationTracker(Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    return-void
.end method

.method static synthetic access$800(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$900(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;)Ljava/util/List;
    .locals 0

    .line 48
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->mCallbacks:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public clearAllTables()V
    .locals 4

    const-string v0, "VACUUM"

    const-string v1, "PRAGMA wal_checkpoint(FULL)"

    .line 506
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->assertNotMainThread()V

    .line 507
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->getOpenHelper()Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    move-result-object v2

    invoke-interface {v2}, Landroidx/sqlite/db/SupportSQLiteOpenHelper;->getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;

    move-result-object v2

    .line 509
    :try_start_0
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->beginTransaction()V

    const-string v3, "DELETE FROM `PasswordCredentials`"

    .line 510
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `User`"

    .line 511
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `Device`"

    .line 512
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `WalkingHourPeriod`"

    .line 513
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `RestingHourPeriod`"

    .line 514
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `SleepHourPeriod`"

    .line 515
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `GoalConfiguration`"

    .line 516
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `WalkingLog`"

    .line 517
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `SleepLog`"

    .line 518
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `RestingLog`"

    .line 519
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `UserActivitySession`"

    .line 520
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `DefaultPhoneWatch`"

    .line 521
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `UpdateInfo`"

    .line 522
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v3, "DELETE FROM `UserActivityDate`"

    .line 523
    invoke-interface {v2, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 524
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 526
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->endTransaction()V

    .line 527
    invoke-interface {v2, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 528
    invoke-interface {v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->inTransaction()Z

    move-result v1

    if-nez v1, :cond_0

    .line 529
    invoke-interface {v2, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v3

    .line 526
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;->endTransaction()V

    .line 527
    invoke-interface {v2, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 528
    invoke-interface {v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->inTransaction()Z

    move-result v1

    if-nez v1, :cond_1

    .line 529
    invoke-interface {v2, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 531
    :cond_1
    throw v3
.end method

.method protected createInvalidationTracker()Landroidx/room/InvalidationTracker;
    .locals 17

    .line 499
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 500
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 501
    new-instance v1, Landroidx/room/InvalidationTracker;

    const-string v3, "PasswordCredentials"

    const-string v4, "User"

    const-string v5, "Device"

    const-string v6, "WalkingHourPeriod"

    const-string v7, "RestingHourPeriod"

    const-string v8, "SleepHourPeriod"

    const-string v9, "GoalConfiguration"

    const-string v10, "WalkingLog"

    const-string v11, "SleepLog"

    const-string v12, "RestingLog"

    const-string v13, "UserActivitySession"

    const-string v14, "DefaultPhoneWatch"

    const-string v15, "UpdateInfo"

    const-string v16, "UserActivityDate"

    filled-new-array/range {v3 .. v16}, [Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    invoke-direct {v1, v4, v0, v2, v3}, Landroidx/room/InvalidationTracker;-><init>(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method protected createOpenHelper(Landroidx/room/DatabaseConfiguration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "configuration"
        }
    .end annotation

    .line 77
    new-instance v0, Landroidx/room/RoomOpenHelper;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl$1;

    const/16 v2, 0x17

    invoke-direct {v1, p0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;I)V

    const-string v2, "7eea0e60d59cd2ba54d78e05b0b90fa3"

    const-string v3, "a63635e5b06ca08d14da0823e8bcc47c"

    invoke-direct {v0, p1, v1, v2, v3}, Landroidx/room/RoomOpenHelper;-><init>(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;Ljava/lang/String;)V

    .line 489
    iget-object v1, p1, Landroidx/room/DatabaseConfiguration;->context:Landroid/content/Context;

    invoke-static {v1}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;->builder(Landroid/content/Context;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;

    move-result-object v1

    iget-object v2, p1, Landroidx/room/DatabaseConfiguration;->name:Ljava/lang/String;

    .line 490
    invoke-virtual {v1, v2}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;->name(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;

    move-result-object v1

    .line 491
    invoke-virtual {v1, v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;->callback(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;

    move-result-object v0

    .line 492
    invoke-virtual {v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;->build()Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;

    move-result-object v0

    .line 493
    iget-object p1, p1, Landroidx/room/DatabaseConfiguration;->sqliteOpenHelperFactory:Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;->create(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    move-result-object p1

    return-object p1
.end method

.method public defaultPhoneWatchDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;
    .locals 1

    .line 721
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    if-eqz v0, :cond_0

    .line 722
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    return-object v0

    .line 724
    :cond_0
    monitor-enter p0

    .line 725
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    if-nez v0, :cond_1

    .line 726
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    .line 728
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_defaultPhoneWatchDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 729
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public deviceDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;
    .locals 1

    .line 595
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    if-eqz v0, :cond_0

    .line 596
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    return-object v0

    .line 598
    :cond_0
    monitor-enter p0

    .line 599
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    if-nez v0, :cond_1

    .line 600
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    .line 602
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_deviceDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 603
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "autoMigrationSpecsMap"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/room/migration/Migration;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    new-array p1, p1, [Landroidx/room/migration/Migration;

    .line 562
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getRequiredAutoMigrationSpecs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/room/migration/AutoMigrationSpec;",
            ">;>;"
        }
    .end annotation

    .line 555
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method protected getRequiredTypeConverters()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    .line 536
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 537
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    const-class v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->getRequiredConverters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public goalConfigurationDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;
    .locals 1

    .line 651
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_goalConfigurationDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    if-eqz v0, :cond_0

    .line 652
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_goalConfigurationDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    return-object v0

    .line 654
    :cond_0
    monitor-enter p0

    .line 655
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_goalConfigurationDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    if-nez v0, :cond_1

    .line 656
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_goalConfigurationDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    .line 658
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_goalConfigurationDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 659
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public restingHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;
    .locals 1

    .line 623
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    if-eqz v0, :cond_0

    .line 624
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    return-object v0

    .line 626
    :cond_0
    monitor-enter p0

    .line 627
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    if-nez v0, :cond_1

    .line 628
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    .line 630
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 631
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public restingLogDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;
    .locals 1

    .line 693
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    if-eqz v0, :cond_0

    .line 694
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    return-object v0

    .line 696
    :cond_0
    monitor-enter p0

    .line 697
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    if-nez v0, :cond_1

    .line 698
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    .line 700
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_restingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 701
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public sleepHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;
    .locals 1

    .line 637
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

    if-eqz v0, :cond_0

    .line 638
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

    return-object v0

    .line 640
    :cond_0
    monitor-enter p0

    .line 641
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

    if-nez v0, :cond_1

    .line 642
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

    .line 644
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 645
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public sleepLogDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;
    .locals 1

    .line 679
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    if-eqz v0, :cond_0

    .line 680
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    return-object v0

    .line 682
    :cond_0
    monitor-enter p0

    .line 683
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    if-nez v0, :cond_1

    .line 684
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    .line 686
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_sleepLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 687
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public tokenStorage()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;
    .locals 1

    .line 567
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    if-eqz v0, :cond_0

    .line 568
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    return-object v0

    .line 570
    :cond_0
    monitor-enter p0

    .line 571
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    if-nez v0, :cond_1

    .line 572
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    .line 574
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 575
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public updateInfoDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;
    .locals 1

    .line 735
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    if-eqz v0, :cond_0

    .line 736
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    return-object v0

    .line 738
    :cond_0
    monitor-enter p0

    .line 739
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    if-nez v0, :cond_1

    .line 740
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    .line 742
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_updateInfoDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 743
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public userActivitySessionDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;
    .locals 1

    .line 707
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userActivitySessionDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    if-eqz v0, :cond_0

    .line 708
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userActivitySessionDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    return-object v0

    .line 710
    :cond_0
    monitor-enter p0

    .line 711
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userActivitySessionDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    if-nez v0, :cond_1

    .line 712
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userActivitySessionDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    .line 714
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userActivitySessionDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 715
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public userDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;
    .locals 1

    .line 581
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    if-eqz v0, :cond_0

    .line 582
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    return-object v0

    .line 584
    :cond_0
    monitor-enter p0

    .line 585
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    if-nez v0, :cond_1

    .line 586
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    .line 588
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 589
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public walkingHourPeriodDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;
    .locals 1

    .line 609
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

    if-eqz v0, :cond_0

    .line 610
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

    return-object v0

    .line 612
    :cond_0
    monitor-enter p0

    .line 613
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

    if-nez v0, :cond_1

    .line 614
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

    .line 616
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingHourPeriodDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 617
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public walkingLogDao()Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;
    .locals 1

    .line 665
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    if-eqz v0, :cond_0

    .line 666
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    return-object v0

    .line 668
    :cond_0
    monitor-enter p0

    .line 669
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    if-nez v0, :cond_1

    .line 670
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    .line 672
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB_Impl;->_walkingLogDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 673
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
