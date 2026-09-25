.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;
.source "RestingHourPeriodDao_Impl.java"


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfRestingHourPeriod:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteRestingHourPeriod:Landroidx/room/SharedSQLiteStatement;


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

    .line 36
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;-><init>()V

    .line 37
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 38
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__insertionAdapterOfRestingHourPeriod:Landroidx/room/EntityInsertionAdapter;

    .line 68
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__preparedStmtOfDeleteRestingHourPeriod:Landroidx/room/SharedSQLiteStatement;

    .line 75
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 27
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

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

    .line 405
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addRestingHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "period"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 87
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 89
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__insertionAdapterOfRestingHourPeriod:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 90
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 93
    throw p1
.end method

.method public addRestingHourPeriods(Ljava/util/List;)V
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;)V"
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 101
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__insertionAdapterOfRestingHourPeriod:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Iterable;)V

    .line 102
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 105
    throw p1
.end method

.method public deleteAll()V
    .locals 3

    .line 126
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 127
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 128
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 130
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 131
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 134
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 133
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 134
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 135
    throw v1
.end method

.method public deleteRestingHourPeriod(J)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 111
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__preparedStmtOfDeleteRestingHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    .line 113
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 114
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 116
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 117
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 120
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__preparedStmtOfDeleteRestingHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 119
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 120
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__preparedStmtOfDeleteRestingHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 121
    throw p1
.end method

.method public getRestingHourPeriod(J)Lio/reactivex/Maybe;
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM RestingHourPeriod WHERE startTime = ?"

    const/4 v1, 0x1

    .line 141
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 143
    invoke-virtual {v0, v1, p1, p2}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 144
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$4;

    invoke-direct {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {p1}, Lio/reactivex/Maybe;->fromCallable(Ljava/util/concurrent/Callable;)Lio/reactivex/Maybe;

    move-result-object p1

    return-object p1
.end method

.method public getRestingHourPeriods(JJ)Lio/reactivex/Single;
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM RestingHourPeriod WHERE startTime >= ? AND startTime < ?"

    const/4 v1, 0x2

    .line 232
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    const/4 v2, 0x1

    .line 234
    invoke-virtual {v0, v2, p1, p2}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 236
    invoke-virtual {v0, v1, p3, p4}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 237
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$5;

    invoke-direct {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {p1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public lastRestingHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;
    .locals 47

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM RestingHourPeriod ORDER BY startTime DESC LIMIT 1"

    const/4 v2, 0x0

    .line 327
    invoke-static {v0, v2}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v3

    .line 328
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 329
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "startTime"

    .line 331
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "endTime"

    .line 332
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "hourInDay"

    .line 333
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "heartRate"

    .line 334
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "maxHeartRate"

    .line 335
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "minHeartRate"

    .line 336
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "hrv"

    .line 337
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "skinTemp"

    .line 338
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "maxSkinTemp"

    .line 339
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "minSkinTemp"

    .line 340
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "bodyPower"

    .line 341
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "solarPower"

    .line 342
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v4, "peakTemp"

    .line 343
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v1, "activeCalories"

    .line 344
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v16, v3

    :try_start_1
    const-string v3, "lastUpdated"

    .line 345
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "minsInPeriod"

    .line 346
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "bmrCalories"

    .line 347
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "caseTemp"

    .line 348
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "minCaseTemp"

    .line 349
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "maxCaseTemp"

    .line 350
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    .line 352
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v22

    if-eqz v22, :cond_0

    .line 354
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v24

    .line 356
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v26

    .line 358
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v28

    .line 360
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getFloat(I)F

    move-result v29

    .line 362
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v30

    .line 364
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v31

    .line 366
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getFloat(I)F

    move-result v32

    .line 368
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getFloat(I)F

    move-result v33

    .line 370
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getFloat(I)F

    move-result v34

    .line 372
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getFloat(I)F

    move-result v35

    .line 374
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getFloat(I)F

    move-result v36

    .line 376
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getFloat(I)F

    move-result v37

    .line 378
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getFloat(I)F

    move-result v38

    .line 380
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v39

    move/from16 v0, v17

    .line 382
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v40

    move/from16 v0, v18

    .line 384
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v42

    move/from16 v0, v19

    .line 386
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v43

    move/from16 v0, v20

    .line 388
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v44

    move/from16 v0, v21

    .line 390
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v45

    .line 392
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getFloat(I)F

    move-result v46

    .line 393
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    move-object/from16 v23, v4

    invoke-direct/range {v23 .. v46}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;-><init>(JJIFIIFFFFFFFIJIIFFF)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 399
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 400
    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-object v4

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v16, v3

    .line 399
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 400
    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 401
    throw v0
.end method
