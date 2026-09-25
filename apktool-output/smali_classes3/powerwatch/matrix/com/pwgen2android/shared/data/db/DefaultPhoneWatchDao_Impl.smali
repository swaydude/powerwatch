.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;
.source "DefaultPhoneWatchDao_Impl.java"


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfDefaultPhoneWatch:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;",
            ">;"
        }
    .end annotation
.end field


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

    .line 24
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;-><init>()V

    .line 25
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__insertionAdapterOfDefaultPhoneWatch:Landroidx/room/EntityInsertionAdapter;

    return-void
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

    .line 99
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "item"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 54
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__insertionAdapterOfDefaultPhoneWatch:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 55
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 58
    throw p1
.end method

.method public getFirst()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;
    .locals 8

    const-string v0, "SELECT * FROM DefaultPhoneWatch LIMIT 1"

    const/4 v1, 0x0

    .line 64
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 65
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 66
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v1

    :try_start_0
    const-string v2, "uid"

    .line 68
    invoke-static {v1, v2}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string v4, "bluetoothAddress"

    .line 69
    invoke-static {v1, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "serialNumber"

    .line 70
    invoke-static {v1, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    .line 72
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 74
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    .line 76
    invoke-interface {v1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    .line 79
    :cond_0
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 82
    :goto_0
    invoke-interface {v1, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 85
    :cond_1
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 87
    :goto_1
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;

    invoke-direct {v4, v6, v7, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;-><init>(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v4

    .line 93
    :cond_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 94
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-object v3

    :catchall_0
    move-exception v2

    .line 93
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 94
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 95
    throw v2
.end method
