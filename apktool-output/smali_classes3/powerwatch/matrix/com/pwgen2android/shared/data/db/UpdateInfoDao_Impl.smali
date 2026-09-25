.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;
.source "UpdateInfoDao_Impl.java"


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfUpdateInfo:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
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

    .line 34
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;-><init>()V

    .line 35
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__insertionAdapterOfUpdateInfo:Landroidx/room/EntityInsertionAdapter;

    .line 77
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    .line 84
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 25
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

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

    .line 292
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "item"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 96
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 98
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__insertionAdapterOfUpdateInfo:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 99
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 102
    throw p1
.end method

.method public delete()V
    .locals 3

    .line 107
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 108
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 109
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 111
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 112
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 115
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 114
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 115
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 116
    throw v1
.end method

.method public deleteAll()V
    .locals 3

    .line 121
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 122
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 123
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 125
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 126
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 129
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 128
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 129
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 130
    throw v1
.end method

.method public get()Lio/reactivex/Maybe;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM UpdateInfo WHERE uid = 0"

    const/4 v1, 0x0

    .line 136
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 137
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$4;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v1}, Lio/reactivex/Maybe;->fromCallable(Ljava/util/concurrent/Callable;)Lio/reactivex/Maybe;

    move-result-object v0

    return-object v0
.end method

.method public observeUpdateInfo()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM UpdateInfo WHERE uid = 0"

    const/4 v1, 0x0

    .line 215
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 216
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v3, "UpdateInfo"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$5;

    invoke-direct {v4, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v2, v1, v3, v4}, Landroidx/room/RxRoom;->createObservable(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
