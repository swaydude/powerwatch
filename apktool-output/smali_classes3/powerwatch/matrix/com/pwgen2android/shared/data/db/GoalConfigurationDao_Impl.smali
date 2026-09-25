.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;
.source "GoalConfigurationDao_Impl.java"


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfGoalConfiguration:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;


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
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;-><init>()V

    .line 38
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 39
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__insertionAdapterOfGoalConfiguration:Landroidx/room/EntityInsertionAdapter;

    .line 58
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    .line 65
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 28
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

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

    .line 316
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public add(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "item"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;)V"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 89
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 91
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__insertionAdapterOfGoalConfiguration:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Iterable;)V

    .line 92
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 95
    throw p1
.end method

.method public add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "item"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 79
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__insertionAdapterOfGoalConfiguration:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 80
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 83
    throw p1
.end method

.method public all()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM GoalConfiguration ORDER BY createdAt"

    const/4 v1, 0x0

    .line 187
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 188
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$5;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public count()J
    .locals 5

    const-string v0, "SELECT COUNT(id) FROM GoalConfiguration"

    const/4 v1, 0x0

    .line 298
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 299
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 300
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    .line 303
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 304
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    .line 310
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 311
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-wide v3

    :catchall_0
    move-exception v1

    .line 310
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 311
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 312
    throw v1
.end method

.method public delete(J)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    .line 103
    invoke-interface {v0, v1, p1, p2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 104
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 106
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 107
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 110
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 109
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 110
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 111
    throw p1
.end method

.method public deleteAll()V
    .locals 3

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 117
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 118
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 120
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 121
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 124
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 123
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 124
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 125
    throw v1
.end method

.method public get(J)Lio/reactivex/Maybe;
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
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM GoalConfiguration WHERE id = ?"

    const/4 v1, 0x1

    .line 131
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 133
    invoke-virtual {v0, v1, p1, p2}, Landroidx/room/RoomSQLiteQuery;->bindLong(IJ)V

    .line 134
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$4;

    invoke-direct {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {p1}, Lio/reactivex/Maybe;->fromCallable(Ljava/util/concurrent/Callable;)Lio/reactivex/Maybe;

    move-result-object p1

    return-object p1
.end method

.method public lastByCreated()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM GoalConfiguration ORDER BY createdAt DESC LIMIT 1"

    const/4 v1, 0x0

    .line 244
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 245
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v3, "GoalConfiguration"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;

    invoke-direct {v4, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v2, v1, v3, v4}, Landroidx/room/RxRoom;->createObservable(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
