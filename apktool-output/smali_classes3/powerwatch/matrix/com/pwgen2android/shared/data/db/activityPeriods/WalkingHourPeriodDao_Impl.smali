.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;
.source "WalkingHourPeriodDao_Impl.java"


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfWalkingHourPeriod:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteWalkingHourPeriod:Landroidx/room/SharedSQLiteStatement;


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
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;-><init>()V

    .line 37
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 38
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__insertionAdapterOfWalkingHourPeriod:Landroidx/room/EntityInsertionAdapter;

    .line 70
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__preparedStmtOfDeleteWalkingHourPeriod:Landroidx/room/SharedSQLiteStatement;

    .line 77
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 27
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

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

    .line 425
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addWalkingHourPeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "period"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 89
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 91
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__insertionAdapterOfWalkingHourPeriod:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 92
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 95
    throw p1
.end method

.method public addWalkingHourPeriods(Ljava/util/List;)V
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;)V"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 103
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__insertionAdapterOfWalkingHourPeriod:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Iterable;)V

    .line 104
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 107
    throw p1
.end method

.method public deleteAll()V
    .locals 3

    .line 128
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 129
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 130
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 132
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 133
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 136
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 135
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 136
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 137
    throw v1
.end method

.method public deleteWalkingHourPeriod(J)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 113
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__preparedStmtOfDeleteWalkingHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    .line 115
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 116
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 118
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 119
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 122
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__preparedStmtOfDeleteWalkingHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 121
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 122
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__preparedStmtOfDeleteWalkingHourPeriod:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 123
    throw p1
.end method

.method public getWalkingHourPeriod(J)Lio/reactivex/Maybe;
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM WalkingHourPeriod WHERE startTime = ?"

    const/4 v1, 0x1

    .line 143
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 145
    invoke-virtual {v0, v1, p1, p2}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 146
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$4;

    invoke-direct {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {p1}, Lio/reactivex/Maybe;->fromCallable(Ljava/util/concurrent/Callable;)Lio/reactivex/Maybe;

    move-result-object p1

    return-object p1
.end method

.method public getWalkingHourPeriods(JJ)Lio/reactivex/Single;
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM WalkingHourPeriod WHERE startTime >= ? AND startTime < ?"

    const/4 v1, 0x2

    .line 240
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    const/4 v2, 0x1

    .line 242
    invoke-virtual {v0, v2, p1, p2}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 244
    invoke-virtual {v0, v1, p3, p4}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 245
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;

    invoke-direct {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {p1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public lastWalkingHour()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;
    .locals 52

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM WalkingHourPeriod ORDER BY startTime DESC LIMIT 1"

    const/4 v2, 0x0

    .line 341
    invoke-static {v0, v2}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v3

    .line 342
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 343
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "startTime"

    .line 345
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "endTime"

    .line 346
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "hourInDay"

    .line 347
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "maxHeartRate"

    .line 348
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "minHeartRate"

    .line 349
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "heartRate"

    .line 350
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "skinTemp"

    .line 351
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "maxSkinTemp"

    .line 352
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "minSkinTemp"

    .line 353
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "bodyPower"

    .line 354
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "solarPower"

    .line 355
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "hrv"

    .line 356
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v4, "peakTemp"

    .line 357
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v1, "activeCalories"

    .line 358
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v16, v3

    :try_start_1
    const-string v3, "steps"

    .line 359
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "distance"

    .line 360
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "lastUpdated"

    .line 361
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "minsInPeriod"

    .line 362
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "bmrCalories"

    .line 363
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "caseTemp"

    .line 364
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "minCaseTemp"

    .line 365
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "maxCaseTemp"

    .line 366
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    .line 368
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v24

    if-eqz v24, :cond_0

    .line 370
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v26

    .line 372
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v28

    .line 374
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v30

    .line 376
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v31

    .line 378
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v32

    .line 380
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getFloat(I)F

    move-result v33

    .line 382
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getFloat(I)F

    move-result v34

    .line 384
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getFloat(I)F

    move-result v35

    .line 386
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getFloat(I)F

    move-result v36

    .line 388
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getFloat(I)F

    move-result v37

    .line 390
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getFloat(I)F

    move-result v38

    .line 392
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getFloat(I)F

    move-result v39

    .line 394
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getFloat(I)F

    move-result v40

    .line 396
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v41

    move/from16 v0, v17

    .line 398
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v42

    move/from16 v0, v18

    .line 400
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v43

    move/from16 v0, v19

    .line 402
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v45

    move/from16 v0, v20

    .line 404
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v47

    move/from16 v0, v21

    .line 406
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v48

    move/from16 v0, v22

    .line 408
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v49

    move/from16 v0, v23

    .line 410
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v50

    .line 412
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getFloat(I)F

    move-result v51

    .line 413
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    move-object/from16 v25, v4

    invoke-direct/range {v25 .. v51}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;-><init>(JJIIIFFFFFFFFIIDJIIFFF)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 419
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 420
    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-object v4

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v16, v3

    .line 419
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 420
    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 421
    throw v0
.end method
