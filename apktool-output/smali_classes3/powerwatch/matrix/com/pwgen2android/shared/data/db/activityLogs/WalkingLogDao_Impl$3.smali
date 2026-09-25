.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$3;
.super Ljava/lang/Object;
.source "WalkingLogDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;->all()Lio/reactivex/Single;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        ">;"
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

    .line 111
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$3;->val$_statement:Landroidx/room/RoomSQLiteQuery;

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

    .line 111
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$3;->call()Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    move-result-object v0

    return-object v0
.end method

.method public call()Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 114
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;->access$000(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$3;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "startTime"

    .line 116
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "steps"

    .line 117
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "distance"

    .line 118
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "endTime"

    .line 119
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "heartRate"

    .line 120
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "bodyPower"

    .line 121
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "solarPower"

    .line 122
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "skinTemp"

    .line 123
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "maxSkinTemp"

    .line 124
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "minSkinTemp"

    .line 125
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "caseTemp"

    .line 126
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "maxCaseTemp"

    .line 127
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v3, "minCaseTemp"

    .line 128
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "activeCalories"

    .line 129
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    const-string v1, "hrv"

    .line 130
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "shouldSend"

    .line 131
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "bmrCalories"

    .line 132
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "minHeartRate"

    .line 133
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "maxHeartRate"

    .line 134
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "email"

    .line 135
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    .line 137
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v21

    if-eqz v21, :cond_2

    move/from16 v21, v1

    .line 138
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;-><init>()V

    move/from16 v22, v3

    move/from16 v23, v4

    .line 140
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 141
    invoke-virtual {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setStartTime(J)V

    .line 143
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 144
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setSteps(I)V

    .line 146
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v3

    .line 147
    invoke-virtual {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setDistance(D)V

    .line 149
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 150
    invoke-virtual {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setEndTime(J)V

    .line 152
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 153
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setHeartRate(F)V

    .line 155
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 156
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setBodyPower(F)V

    .line 158
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 159
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setSolarPower(F)V

    .line 161
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 162
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setSkinTemp(F)V

    .line 164
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 165
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMaxSkinTemp(F)V

    .line 167
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 168
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMinSkinTemp(F)V

    .line 170
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 171
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setCaseTemp(F)V

    .line 173
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 174
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMaxCaseTemp(F)V

    move/from16 v0, v22

    .line 176
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 177
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMinCaseTemp(F)V

    move/from16 v0, v23

    .line 179
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 180
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setActiveCalories(I)V

    move/from16 v0, v16

    .line 182
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    .line 183
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setHrv(F)V

    move/from16 v0, v17

    .line 186
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 188
    :goto_0
    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setShouldSend(Z)V

    move/from16 v0, v18

    .line 190
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 191
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setBmrCalories(I)V

    move/from16 v0, v19

    .line 193
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 194
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMinHeartRate(I)V

    move/from16 v0, v20

    .line 196
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 197
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setMaxHeartRate(I)V

    move/from16 v0, v21

    .line 199
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    .line 202
    :cond_1
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 204
    :goto_1
    invoke-virtual {v1, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->setEmail(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v4, v1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_3

    .line 213
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v4

    .line 209
    :cond_3
    :try_start_2
    new-instance v0, Landroidx/room/EmptyResultSetException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Query returned empty result set: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v3, p0

    :try_start_3
    iget-object v4, v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$3;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v4}, Landroidx/room/RoomSQLiteQuery;->getSql()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/room/EmptyResultSetException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object/from16 v3, p0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v3, v1

    .line 213
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 214
    throw v0
.end method

.method protected finalize()V
    .locals 1

    .line 219
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao_Impl$3;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-void
.end method
