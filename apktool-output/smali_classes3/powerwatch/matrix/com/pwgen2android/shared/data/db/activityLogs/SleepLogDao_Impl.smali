.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;
.source "SleepLogDao_Impl.java"


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __deletionAdapterOfSleepLog:Landroidx/room/EntityDeletionOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeletionOrUpdateAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertionAdapterOfSleepLog:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;"
        }
    .end annotation
.end field

.field private final __sleepTypeTypeConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "__db"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;-><init>()V

    .line 33
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__sleepTypeTypeConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    .line 38
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 39
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__insertionAdapterOfSleepLog:Landroidx/room/EntityInsertionAdapter;

    .line 79
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__deletionAdapterOfSleepLog:Landroidx/room/EntityDeletionOrUpdateAdapter;

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;
    .locals 0

    .line 28
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__sleepTypeTypeConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    return-object p0
.end method

.method static synthetic access$100(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 28
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    return-object p0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 343
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public all()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM SleepLog"

    const/4 v1, 0x0

    .line 119
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 120
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public delete(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "sleepLogs"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;)V"
        }
    .end annotation

    .line 106
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 107
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 109
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__deletionAdapterOfSleepLog:Landroidx/room/EntityDeletionOrUpdateAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityDeletionOrUpdateAdapter;->handleMultiple(Ljava/lang/Iterable;)I

    .line 110
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 113
    throw p1
.end method

.method public notSyncedLogs()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM SleepLog WHERE shouldSend = 1"

    const/4 v1, 0x0

    .line 222
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 223
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$4;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public notSyncedLogsCount()J
    .locals 5

    const-string v0, "SELECT COUNT(startTime) FROM SleepLog WHERE shouldSend = 1"

    const/4 v1, 0x0

    .line 325
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 326
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 327
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    .line 330
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 331
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    .line 337
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 338
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-wide v3

    :catchall_0
    move-exception v1

    .line 337
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 338
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 339
    throw v1
.end method

.method public save(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "walkingLogs"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;)V"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 95
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 97
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__insertionAdapterOfSleepLog:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Iterable;)V

    .line 98
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 101
    throw p1
.end method
