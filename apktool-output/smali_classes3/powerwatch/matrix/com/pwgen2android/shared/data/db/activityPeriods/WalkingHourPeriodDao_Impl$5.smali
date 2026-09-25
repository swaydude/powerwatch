.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;
.super Ljava/lang/Object;
.source "WalkingHourPeriodDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->getWalkingHourPeriods(JJ)Lio/reactivex/Single;
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
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;

.field final synthetic val$_statement:Landroidx/room/RoomSQLiteQuery;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;Landroidx/room/RoomSQLiteQuery;)V
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
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

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
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 248
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;->access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "startTime"

    .line 250
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v3, "endTime"

    .line 251
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "hourInDay"

    .line 252
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "maxHeartRate"

    .line 253
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "minHeartRate"

    .line 254
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "heartRate"

    .line 255
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "skinTemp"

    .line 256
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "maxSkinTemp"

    .line 257
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "minSkinTemp"

    .line 258
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "bodyPower"

    .line 259
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "solarPower"

    .line 260
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "hrv"

    .line 261
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "peakTemp"

    .line 262
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "activeCalories"

    .line 263
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v1, "steps"

    .line 264
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "distance"

    .line 265
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "lastUpdated"

    .line 266
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "minsInPeriod"

    .line 267
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "bmrCalories"

    .line 268
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "caseTemp"

    .line 269
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    const-string v1, "minCaseTemp"

    .line 270
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v1

    const-string v1, "maxCaseTemp"

    .line 271
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v23, v1

    .line 272
    new-instance v1, Ljava/util/ArrayList;

    move/from16 v24, v15

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v15

    invoke-direct {v1, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 273
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v15

    if-eqz v15, :cond_0

    .line 276
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v26

    .line 278
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v28

    .line 280
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v30

    .line 282
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v31

    .line 284
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v32

    .line 286
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getFloat(I)F

    move-result v33

    .line 288
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getFloat(I)F

    move-result v34

    .line 290
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getFloat(I)F

    move-result v35

    .line 292
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getFloat(I)F

    move-result v36

    .line 294
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getFloat(I)F

    move-result v37

    .line 296
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getFloat(I)F

    move-result v38

    .line 298
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getFloat(I)F

    move-result v39

    .line 300
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getFloat(I)F

    move-result v40

    move/from16 v15, v24

    .line 302
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v41

    move/from16 v24, v0

    move/from16 v0, v16

    .line 304
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v42

    move/from16 v16, v0

    move/from16 v0, v17

    .line 306
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v43

    move/from16 v17, v0

    move/from16 v0, v18

    .line 308
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v45

    move/from16 v18, v0

    move/from16 v0, v19

    .line 310
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v47

    move/from16 v19, v0

    move/from16 v0, v20

    .line 312
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v48

    move/from16 v20, v0

    move/from16 v0, v21

    .line 314
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v49

    move/from16 v21, v0

    move/from16 v0, v22

    .line 316
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v50

    move/from16 v22, v0

    move/from16 v0, v23

    .line 318
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v51

    move/from16 v23, v0

    .line 319
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    move-object/from16 v25, v0

    invoke-direct/range {v25 .. v51}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;-><init>(JJIIIFFFFFFFFIIDJIIFFF)V

    .line 320
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v0, v24

    move/from16 v24, v15

    goto/16 :goto_0

    .line 327
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 328
    throw v0
.end method

.method protected finalize()V
    .locals 1

    .line 333
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-void
.end method
