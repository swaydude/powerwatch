.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$4;
.super Ljava/lang/Object;
.source "WalkingLogDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;->notSyncedLogs()Lio/reactivex/Single;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;

.field final synthetic val$_statement:Landroidx/room/RoomSQLiteQuery;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;Landroidx/room/RoomSQLiteQuery;)V
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

    .line 228
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$4;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$4;->val$_statement:Landroidx/room/RoomSQLiteQuery;

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

    .line 228
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$4;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 231
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$4;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;->access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$4;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "startTime"

    .line 233
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "steps"

    .line 234
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "distance"

    .line 235
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "endTime"

    .line 236
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "heartRate"

    .line 237
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "bodyPower"

    .line 238
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "solarPower"

    .line 239
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "skinTemp"

    .line 240
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "maxSkinTemp"

    .line 241
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "minSkinTemp"

    .line 242
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "caseTemp"

    .line 243
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "maxCaseTemp"

    .line 244
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v3, "minCaseTemp"

    .line 245
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "activeCalories"

    .line 246
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v1, "hrv"

    .line 247
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "shouldSend"

    .line 248
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "bmrCalories"

    .line 249
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "minHeartRate"

    .line 250
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "maxHeartRate"

    .line 251
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "email"

    .line 252
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    .line 253
    new-instance v1, Ljava/util/ArrayList;

    move/from16 v22, v4

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 254
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 256
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    invoke-direct {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;-><init>()V

    move/from16 v23, v14

    move/from16 v24, v15

    .line 258
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    .line 259
    invoke-virtual {v4, v14, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setStartTime(J)V

    .line 261
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v14

    .line 262
    invoke-virtual {v4, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setSteps(I)V

    .line 264
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v14

    .line 265
    invoke-virtual {v4, v14, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setDistance(D)V

    .line 267
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    .line 268
    invoke-virtual {v4, v14, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setEndTime(J)V

    .line 270
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getFloat(I)F

    move-result v14

    .line 271
    invoke-virtual {v4, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setHeartRate(F)V

    .line 273
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getFloat(I)F

    move-result v14

    .line 274
    invoke-virtual {v4, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setBodyPower(F)V

    .line 276
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getFloat(I)F

    move-result v14

    .line 277
    invoke-virtual {v4, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setSolarPower(F)V

    .line 279
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getFloat(I)F

    move-result v14

    .line 280
    invoke-virtual {v4, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setSkinTemp(F)V

    .line 282
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getFloat(I)F

    move-result v14

    .line 283
    invoke-virtual {v4, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMaxSkinTemp(F)V

    .line 285
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getFloat(I)F

    move-result v14

    .line 286
    invoke-virtual {v4, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMinSkinTemp(F)V

    move/from16 v14, v23

    .line 288
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getFloat(I)F

    move-result v15

    .line 289
    invoke-virtual {v4, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setCaseTemp(F)V

    move/from16 v23, v0

    move/from16 v15, v24

    .line 291
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 292
    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMaxCaseTemp(F)V

    .line 294
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 295
    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMinCaseTemp(F)V

    move/from16 v0, v22

    move/from16 v22, v3

    .line 297
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    .line 298
    invoke-virtual {v4, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setActiveCalories(I)V

    move/from16 v3, v16

    move/from16 v16, v0

    .line 300
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 301
    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setHrv(F)V

    move/from16 v0, v17

    .line 304
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v17

    if-eqz v17, :cond_0

    const/16 v17, 0x1

    move/from16 v17, v0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    move/from16 v17, v0

    const/4 v0, 0x0

    .line 306
    :goto_1
    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setShouldSend(Z)V

    move/from16 v0, v18

    move/from16 v18, v3

    .line 308
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    .line 309
    invoke-virtual {v4, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setBmrCalories(I)V

    move/from16 v3, v19

    move/from16 v19, v0

    .line 311
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 312
    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMinHeartRate(I)V

    move/from16 v0, v20

    move/from16 v20, v3

    .line 314
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    .line 315
    invoke-virtual {v4, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMaxHeartRate(I)V

    move/from16 v3, v21

    .line 317
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v21

    if-eqz v21, :cond_1

    move/from16 v24, v0

    const/4 v0, 0x0

    goto :goto_2

    .line 320
    :cond_1
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v21

    move/from16 v24, v0

    move-object/from16 v0, v21

    .line 322
    :goto_2
    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setEmail(Ljava/lang/String;)V

    .line 323
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v21, v3

    move/from16 v3, v22

    move/from16 v0, v23

    move/from16 v22, v16

    move/from16 v16, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v24

    goto/16 :goto_0

    .line 330
    :cond_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 331
    throw v0
.end method

.method protected finalize()V
    .locals 1

    .line 336
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$4;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-void
.end method
