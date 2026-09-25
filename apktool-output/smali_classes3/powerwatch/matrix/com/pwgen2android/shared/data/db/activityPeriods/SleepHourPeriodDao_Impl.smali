.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;
.source "SleepHourPeriodDao_Impl.java"


# instance fields
.field private final __activityHourDataConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;

.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfSleepHourPeriod:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteSleepHourPeriod:Landroidx/room/SharedSQLiteStatement;

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

    .line 44
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;-><init>()V

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__activityHourDataConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;

    .line 38
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__sleepTypeTypeConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    .line 45
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 46
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__insertionAdapterOfSleepHourPeriod:Landroidx/room/EntityInsertionAdapter;

    .line 89
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__preparedStmtOfDeleteSleepHourPeriod:Landroidx/room/SharedSQLiteStatement;

    .line 96
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;
    .locals 0

    .line 31
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__activityHourDataConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;

    return-object p0
.end method

.method static synthetic access$100(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;
    .locals 0

    .line 31
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__sleepTypeTypeConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    return-object p0
.end method

.method static synthetic access$200(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 31
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

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

    .line 489
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addSleepHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "period"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 108
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 110
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__insertionAdapterOfSleepHourPeriod:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 111
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 114
    throw p1
.end method

.method public addSleepHourPeriods(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "periods"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;)V"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 120
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 122
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__insertionAdapterOfSleepHourPeriod:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Iterable;)V

    .line 123
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 126
    throw p1
.end method

.method public deleteAll()V
    .locals 3

    .line 147
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 148
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 149
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 151
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 152
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 155
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 154
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 155
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 156
    throw v1
.end method

.method public deleteSleepHourPeriod(J)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 132
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__preparedStmtOfDeleteSleepHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    .line 134
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 135
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 137
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 138
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 141
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__preparedStmtOfDeleteSleepHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 140
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 141
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__preparedStmtOfDeleteSleepHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 142
    throw p1
.end method

.method public getSleepHourPeriod(J)Lio/reactivex/Maybe;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM SleepHourPeriod WHERE startTime = ?"

    const/4 v1, 0x1

    .line 162
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 164
    invoke-virtual {v0, v1, p1, p2}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 165
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$4;

    invoke-direct {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {p1}, Lio/reactivex/Maybe;->fromCallable(Ljava/util/concurrent/Callable;)Lio/reactivex/Maybe;

    move-result-object p1

    return-object p1
.end method

.method public getSleepHourPeriods(JJ)Lio/reactivex/Single;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "startTime",
            "endTime"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM SleepHourPeriod WHERE startTime >= ? AND startTime < ?"

    const/4 v1, 0x2

    .line 274
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    const/4 v2, 0x1

    .line 276
    invoke-virtual {v0, v2, p1, p2}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 278
    invoke-virtual {v0, v1, p3, p4}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 279
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;

    invoke-direct {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {p1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public lastSleepHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;
    .locals 53

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM SleepHourPeriod ORDER BY startTime DESC LIMIT 1"

    const/4 v2, 0x0

    .line 390
    invoke-static {v0, v2}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v3

    .line 391
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 392
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "startTime"

    .line 394
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "endTime"

    .line 395
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "heartRate"

    .line 396
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "maxHeartRate"

    .line 397
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "minHeartRate"

    .line 398
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "skinTemp"

    .line 399
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "maxSkinTemp"

    .line 400
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "minSkinTemp"

    .line 401
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "hrv"

    .line 402
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "bodyPower"

    .line 403
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "solarPower"

    .line 404
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "peakTemp"

    .line 405
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v4, "activeCalories"

    .line 406
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-object/from16 v16, v3

    :try_start_1
    const-string v3, "hourInDay"

    .line 407
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    const-string v1, "restlessMinutes"

    .line 408
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "sleepFiveMins"

    .line 409
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "sleepType"

    .line 410
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "lastUpdated"

    .line 411
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "minsInPeriod"

    .line 412
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    const-string v1, "bmrCalories"

    .line 413
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v1

    const-string v1, "caseTemp"

    .line 414
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v23, v1

    const-string v1, "minCaseTemp"

    .line 415
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v24, v1

    const-string v1, "maxCaseTemp"

    .line 416
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    .line 418
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v25

    if-eqz v25, :cond_2

    .line 420
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v27

    .line 422
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v29

    .line 424
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getFloat(I)F

    move-result v31

    .line 426
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v32

    .line 428
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    .line 430
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getFloat(I)F

    move-result v34

    .line 432
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getFloat(I)F

    move-result v35

    .line 434
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getFloat(I)F

    move-result v36

    .line 436
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getFloat(I)F

    move-result v37

    .line 438
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getFloat(I)F

    move-result v38

    .line 440
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getFloat(I)F

    move-result v39

    .line 442
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getFloat(I)F

    move-result v40

    .line 444
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v41

    .line 446
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v42

    move/from16 v0, v17

    .line 448
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v43

    move/from16 v0, v18

    .line 451
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object/from16 v3, p0

    goto :goto_1

    .line 454
    :cond_0
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 456
    :goto_1
    :try_start_3
    iget-object v4, v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__activityHourDataConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;

    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;->toSleepMins(Ljava/lang/String;)Ljava/util/List;

    move-result-object v44

    move/from16 v0, v19

    .line 459
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    goto :goto_2

    .line 462
    :cond_1
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 464
    :goto_2
    iget-object v0, v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->__sleepTypeTypeConverter:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;->toSleepType(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v45

    move/from16 v0, v20

    .line 466
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v46

    move/from16 v0, v21

    .line 468
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v48

    move/from16 v0, v22

    .line 470
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v49

    move/from16 v0, v23

    .line 472
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v50

    move/from16 v0, v24

    .line 474
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v51

    .line 476
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getFloat(I)F

    move-result v52

    .line 477
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    move-object/from16 v26, v4

    invoke-direct/range {v26 .. v52}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JIIFFF)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_2
    move-object/from16 v3, p0

    const/4 v4, 0x0

    .line 483
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 484
    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-object v4

    :catchall_1
    move-exception v0

    move-object/from16 v3, p0

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object/from16 v16, v3

    :goto_4
    move-object v3, v1

    .line 483
    :goto_5
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 484
    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 485
    throw v0
.end method
