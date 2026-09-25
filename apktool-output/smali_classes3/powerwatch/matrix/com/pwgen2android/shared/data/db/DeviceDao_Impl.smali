.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;
.source "DeviceDao_Impl.java"


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfDevice:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteDevice:Landroidx/room/SharedSQLiteStatement;


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

    .line 39
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;-><init>()V

    .line 40
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 41
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__insertionAdapterOfDevice:Landroidx/room/EntityInsertionAdapter;

    .line 87
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__preparedStmtOfDeleteDevice:Landroidx/room/SharedSQLiteStatement;

    .line 94
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 30
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

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

    .line 640
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "device"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 106
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 108
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__insertionAdapterOfDevice:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 109
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 112
    throw p1
.end method

.method public count()I
    .locals 4

    const-string v0, "SELECT COUNT(serialNumber) FROM Device"

    const/4 v1, 0x0

    .line 622
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 623
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 624
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    .line 627
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 628
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 634
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 635
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return v1

    :catchall_0
    move-exception v1

    .line 634
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 635
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 636
    throw v1
.end method

.method public deleteAll()V
    .locals 3

    .line 137
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 138
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 139
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 141
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 142
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 145
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 144
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 145
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 146
    throw v1
.end method

.method public deleteDevice(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "serialNumber"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 118
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__preparedStmtOfDeleteDevice:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    .line 121
    invoke-interface {v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 123
    :cond_0
    invoke-interface {v0, v1, p1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 125
    :goto_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 127
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 128
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 131
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__preparedStmtOfDeleteDevice:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {p1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception p1

    .line 130
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 131
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__preparedStmtOfDeleteDevice:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 132
    throw p1
.end method

.method public getAllDevices()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM Device"

    const/4 v1, 0x0

    .line 434
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 435
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$7;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$7;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public getDevice(Ljava/lang/String;)Lio/reactivex/Maybe;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "serialNumber"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM Device WHERE serialNumber = ?"

    const/4 v1, 0x1

    .line 337
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    if-nez p1, :cond_0

    .line 340
    invoke-virtual {v0, v1}, Landroidx/room/RoomSQLiteQuery;->bindNull(I)V

    goto :goto_0

    .line 342
    :cond_0
    invoke-virtual {v0, v1, p1}, Landroidx/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 344
    :goto_0
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$6;

    invoke-direct {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$6;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {p1}, Lio/reactivex/Maybe;->fromCallable(Ljava/util/concurrent/Callable;)Lio/reactivex/Maybe;

    move-result-object p1

    return-object p1
.end method

.method public getFirst()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM Device WHERE uid = 0 LIMIT 1"

    const/4 v1, 0x0

    .line 152
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 153
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$4;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public getNotRegisteredDevices()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM Device WHERE shouldSync = 1"

    const/4 v1, 0x0

    .line 528
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 529
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$8;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v1}, Landroidx/room/RxRoom;->createSingle(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public observeFirst()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM Device WHERE uid = 0 LIMIT 1"

    const/4 v1, 0x0

    .line 246
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 247
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const-string v3, "Device"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$5;

    invoke-direct {v4, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v2, v1, v3, v4}, Landroidx/room/RxRoom;->createObservable(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
