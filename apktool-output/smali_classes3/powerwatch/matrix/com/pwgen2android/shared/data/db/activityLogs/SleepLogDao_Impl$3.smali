.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;
.super Ljava/lang/Object;
.source "SleepLogDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->all()Lio/reactivex/Single;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;

.field final synthetic val$_statement:Landroidx/room/RoomSQLiteQuery;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;Landroidx/room/RoomSQLiteQuery;)V
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

    .line 120
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;->val$_statement:Landroidx/room/RoomSQLiteQuery;

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

    .line 120
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;->call()Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    move-result-object v0

    return-object v0
.end method

.method public call()Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;
    .locals 46
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 123
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->access$100(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "startTime"

    .line 125
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "endTime"

    .line 126
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "heartRate"

    .line 127
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "bodyPower"

    .line 128
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "solarPower"

    .line 129
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "skinTemp"

    .line 130
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "maxSkinTemp"

    .line 131
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "minSkinTemp"

    .line 132
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "caseTemp"

    .line 133
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "maxCaseTemp"

    .line 134
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "minCaseTemp"

    .line 135
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "activeCalories"

    .line 136
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v3, "sleepType"

    .line 137
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "hrv"

    .line 138
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v16, v4

    const-string v4, "shouldSend"

    .line 139
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v17, v4

    const-string v4, "bmrCalories"

    .line 140
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v18, v4

    const-string v4, "minHeartRate"

    .line 141
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v19, v4

    const-string v4, "maxHeartRate"

    .line 142
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v20, v4

    const-string v4, "email"

    .line 143
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v21, v4

    const-string v4, "minsInPeriod"

    .line 144
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    .line 146
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v22

    if-eqz v22, :cond_3

    .line 148
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v24

    .line 150
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v26

    .line 152
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getFloat(I)F

    move-result v28

    .line 154
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getFloat(I)F

    move-result v29

    .line 156
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getFloat(I)F

    move-result v30

    .line 158
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getFloat(I)F

    move-result v31

    .line 160
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getFloat(I)F

    move-result v32

    .line 162
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getFloat(I)F

    move-result v33

    .line 164
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getFloat(I)F

    move-result v34

    .line 166
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getFloat(I)F

    move-result v35

    .line 168
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getFloat(I)F

    move-result v36

    .line 170
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v37

    .line 173
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 176
    :cond_0
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 178
    :goto_0
    iget-object v3, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;

    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;->access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;

    move-result-object v3

    invoke-virtual {v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;->toSleepType(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v38

    move/from16 v0, v16

    .line 180
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v39

    move/from16 v0, v17

    .line 183
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    move/from16 v0, v18

    const/16 v40, 0x1

    goto :goto_1

    :cond_1
    move/from16 v0, v18

    const/16 v40, 0x0

    .line 186
    :goto_1
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v41

    move/from16 v0, v19

    .line 188
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v42

    move/from16 v0, v20

    .line 190
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v43

    move/from16 v0, v21

    .line 192
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v44, 0x0

    goto :goto_2

    .line 195
    :cond_2
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v44, v0

    .line 198
    :goto_2
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v45

    .line 199
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    move-object/from16 v23, v4

    invoke-direct/range {v23 .. v45}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;-><init>(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_4

    .line 208
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v4

    .line 204
    :cond_4
    :try_start_1
    new-instance v0, Landroidx/room/EmptyResultSetException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Query returned empty result set: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v4}, Landroidx/room/RoomSQLiteQuery;->getSql()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Landroidx/room/EmptyResultSetException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 208
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 209
    throw v0
.end method

.method protected finalize()V
    .locals 1

    .line 214
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao_Impl$3;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-void
.end method
