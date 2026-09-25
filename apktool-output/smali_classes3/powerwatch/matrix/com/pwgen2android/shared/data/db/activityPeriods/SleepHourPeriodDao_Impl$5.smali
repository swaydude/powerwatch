.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;
.super Ljava/lang/Object;
.source "SleepHourPeriodDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->getSleepHourPeriods(JJ)Lio/reactivex/Single;
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
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;

.field final synthetic val$_statement:Landroidx/room/RoomSQLiteQuery;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;Landroidx/room/RoomSQLiteQuery;)V
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

    .line 279
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

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

    .line 279
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 282
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->access$200(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "startTime"

    .line 284
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v3, "endTime"

    .line 285
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v5, "heartRate"

    .line 286
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "maxHeartRate"

    .line 287
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "minHeartRate"

    .line 288
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "skinTemp"

    .line 289
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "maxSkinTemp"

    .line 290
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "minSkinTemp"

    .line 291
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "hrv"

    .line 292
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "bodyPower"

    .line 293
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "solarPower"

    .line 294
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "peakTemp"

    .line 295
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "activeCalories"

    .line 296
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v4, "hourInDay"

    .line 297
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    const-string v1, "restlessMinutes"

    .line 298
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "sleepFiveMins"

    .line 299
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "sleepType"

    .line 300
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "lastUpdated"

    .line 301
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "minsInPeriod"

    .line 302
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "bmrCalories"

    .line 303
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    const-string v1, "caseTemp"

    .line 304
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v1

    const-string v1, "minCaseTemp"

    .line 305
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v23, v1

    const-string v1, "maxCaseTemp"

    .line 306
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v24, v1

    .line 307
    new-instance v1, Ljava/util/ArrayList;

    move/from16 v25, v4

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 308
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 311
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v27

    .line 313
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v29

    .line 315
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getFloat(I)F

    move-result v31

    .line 317
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v32

    .line 319
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    .line 321
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getFloat(I)F

    move-result v34

    .line 323
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getFloat(I)F

    move-result v35

    .line 325
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getFloat(I)F

    move-result v36

    .line 327
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getFloat(I)F

    move-result v37

    .line 329
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getFloat(I)F

    move-result v38

    .line 331
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getFloat(I)F

    move-result v39

    .line 333
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getFloat(I)F

    move-result v40

    .line 335
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v41

    move/from16 v4, v25

    .line 337
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v42

    move/from16 v25, v0

    move/from16 v0, v16

    .line 339
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v43

    move/from16 v16, v0

    move/from16 v0, v17

    .line 342
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_0

    move/from16 v53, v0

    move/from16 v17, v3

    move/from16 v54, v4

    const/4 v0, 0x0

    :goto_1
    move-object/from16 v3, p0

    goto :goto_2

    .line 345
    :cond_0
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 v53, v0

    move/from16 v54, v4

    move-object/from16 v0, v17

    move/from16 v17, v3

    goto :goto_1

    .line 347
    :goto_2
    :try_start_2
    iget-object v4, v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;

    move-result-object v4

    invoke-virtual {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;->toSleepMins(Ljava/lang/String;)Ljava/util/List;

    move-result-object v44

    move/from16 v0, v18

    .line 350
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move/from16 v18, v0

    const/4 v4, 0x0

    goto :goto_3

    .line 353
    :cond_1
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move/from16 v18, v0

    .line 355
    :goto_3
    iget-object v0, v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;->access$100(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    move-result-object v0

    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;->toSleepType(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v45

    move/from16 v0, v19

    .line 357
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v46

    move/from16 v4, v20

    .line 359
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v48

    move/from16 v19, v0

    move/from16 v0, v21

    .line 361
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v49

    move/from16 v21, v0

    move/from16 v0, v22

    .line 363
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v50

    move/from16 v22, v0

    move/from16 v0, v23

    .line 365
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v51

    move/from16 v23, v0

    move/from16 v0, v24

    .line 367
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v52

    move/from16 v24, v0

    .line 368
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;

    move-object/from16 v26, v0

    invoke-direct/range {v26 .. v52}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JIIFFF)V

    .line 369
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move/from16 v20, v4

    move/from16 v3, v17

    move/from16 v0, v25

    move/from16 v17, v53

    move/from16 v25, v54

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_2
    move-object/from16 v3, p0

    .line 376
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v1

    :catchall_1
    move-exception v0

    move-object/from16 v3, p0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v3, v1

    :goto_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 377
    throw v0
.end method

.method protected finalize()V
    .locals 1

    .line 382
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-void
.end method
