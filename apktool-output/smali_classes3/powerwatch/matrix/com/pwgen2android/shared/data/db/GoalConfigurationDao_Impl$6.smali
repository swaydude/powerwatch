.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;
.super Ljava/lang/Object;
.source "GoalConfigurationDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->lastByCreated()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;

.field final synthetic val$_statement:Landroidx/room/RoomSQLiteQuery;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;Landroidx/room/RoomSQLiteQuery;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$0",
            "val$_statement"
        }
    .end annotation

    .line 245
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 245
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;->call()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v0

    return-object v0
.end method

.method public call()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 248
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;->access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "id"

    .line 250
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "calories"

    .line 251
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "distance"

    .line 252
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "power"

    .line 253
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "sleep"

    .line 254
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "steps"

    .line 255
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "createdAt"

    .line 256
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "shouldSync"

    .line 257
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    .line 259
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v12

    if-eqz v12, :cond_1

    .line 261
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    .line 263
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    .line 265
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getFloat(I)F

    move-result v17

    .line 267
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    .line 269
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v19

    .line 271
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v20

    .line 273
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v21

    .line 276
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    const/16 v23, 0x1

    goto :goto_0

    :cond_0
    const/16 v23, 0x0

    .line 278
    :goto_0
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-object v13, v4

    invoke-direct/range {v13 .. v23}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;-><init>(JIFIIIJZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    # --- PW_OFFLINE: an EMPTY goals table makes this Callable return null, and RxJava1
    # CombineLatest silently DROPS null emissions, so RealTimeDataProviderImpl.observeData's
    # combineLatest(liveData, goalsRepository.load()) never fired and the dashboard "Today"
    # card stayed at its initial zeros forever (offline fresh install: goals never arrive
    # from the cloud). Return the vendor's own default goal (all zeros, same values as the
    # fallback in GoalConfigurationRepositoryImpl.all()) via the primary ctor (JIFIIIJZ)V
    # so the combineLatest can pair.
    # CRITICAL: the condition is `if-nez` — v4 is the PARSED ROW here when one exists, so
    # NON-NULL means "row found, skip the default" and NULL (empty table) means "build the
    # zero default". An `if-eqz` here is INVERTED and clobbers every real row with the
    # zero default on read (that was the "0 steps displayed" bug: the insert worked, the
    # read destroyed it). v4 must be left untouched by any code above on the empty path
    # (see the probe's v4 constraint) so it is genuinely Null when empty. The two long
    # args need WIDE-SHAPED registers (plain const/4 halves fail ART verification) — a
    # const-wide/16 0L scratch pair at even v12 is copied onto both long slots via
    # move-wide.
    if-nez v4, :pw_goals_ok

    const-wide/16 v12, 0x0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-wide v1, v12

    const/4 v3, 0x0

    const v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide v8, v12

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;-><init>(JIFIIIJZ)V

    move-object v4, v0

    :pw_goals_ok

    return-object v4

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 285
    throw v0
.end method

.method protected finalize()V
    .locals 1

    .line 290
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao_Impl$6;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-void
.end method
