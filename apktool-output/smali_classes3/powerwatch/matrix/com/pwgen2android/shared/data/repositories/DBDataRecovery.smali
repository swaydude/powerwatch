.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;
.super Ljava/lang/Object;
.source "DBDataRecovery.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0008H\u0002J\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;",
        "",
        "appContext",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getAppContext",
        "()Landroid/content/Context;",
        "database",
        "",
        "loadActivities",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "startTime",
        "",
        "endTime",
        "query",
        "db",
        "Lnet/sqlcipher/database/SQLiteDatabase;",
        "loadNotSyncedActivities",
        "loadSingleActivity",
        "activityId",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final appContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->appContext:Landroid/content/Context;

    return-void
.end method

.method private final database()Ljava/lang/String;
    .locals 2

    .line 11
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->appContext:Landroid/content/Context;

    const-string v1, "PowerWatchDB"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "appContext.getDatabasePath(\"PowerWatchDB\").absolutePath"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final loadActivities(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase;)Ljava/util/List;
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/sqlcipher/database/SQLiteDatabase;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation

    const-string v0, "email"

    const-string v1, "notes"

    const-string v2, "locationName"

    const-string v3, "name"

    const-string v4, "id"

    const/4 v5, 0x0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    .line 15
    invoke-virtual {v7, v6, v5}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v5

    .line 16
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/List;

    if-eqz v5, :cond_2

    .line 19
    :try_start_0
    invoke-interface {v5}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    .line 21
    invoke-interface {v5}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v8

    if-lez v8, :cond_2

    .line 23
    :goto_0
    invoke-interface {v5, v4}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 24
    invoke-interface {v5, v3}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    const-string v10, "activityType"

    .line 25
    invoke-interface {v5, v10}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 26
    invoke-interface {v5, v2}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    const-string v12, "distance"

    .line 27
    invoke-interface {v5, v12}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    const-string v13, "steps"

    .line 28
    invoke-interface {v5, v13}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    const-string v14, "startTime"

    .line 29
    invoke-interface {v5, v14}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    const-string v15, "endTime"

    .line 30
    invoke-interface {v5, v15}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    const-string v7, "pace"

    .line 31
    invoke-interface {v5, v7}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    move-object/from16 p1, v6

    const-string v6, "activeCalories"

    .line 32
    invoke-interface {v5, v6}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    move-object/from16 v16, v2

    const-string v2, "bmrCalories"

    .line 33
    invoke-interface {v5, v2}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    move-object/from16 v17, v3

    const-string v3, "splits"

    .line 34
    invoke-interface {v5, v3}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v18, v4

    const-string v4, "gpsPositions"

    .line 35
    invoke-interface {v5, v4}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    move/from16 v19, v4

    const-string v4, "heartRates"

    .line 36
    invoke-interface {v5, v4}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    move/from16 v20, v4

    .line 37
    invoke-interface {v5, v1}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v21, v1

    const-string v1, "shouldSend"

    .line 38
    invoke-interface {v5, v1}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v4

    .line 39
    invoke-interface {v5, v0}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 41
    invoke-interface {v5, v8}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 42
    invoke-interface {v5, v9}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v43, v0

    .line 44
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;-><init>()V

    .line 46
    invoke-interface {v5, v10}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v25, v9

    const-string v9, "typeString"

    .line 47
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;->toActivityType(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object v26

    .line 49
    invoke-interface {v5, v11}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 50
    invoke-interface {v5, v12}, Lnet/sqlcipher/Cursor;->getFloat(I)F

    move-result v28

    .line 52
    invoke-interface {v5, v13}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v29

    .line 53
    invoke-interface {v5, v14}, Lnet/sqlcipher/Cursor;->getLong(I)J

    move-result-wide v30

    .line 55
    invoke-interface {v5, v15}, Lnet/sqlcipher/Cursor;->getLong(I)J

    move-result-wide v32

    .line 56
    invoke-interface {v5, v7}, Lnet/sqlcipher/Cursor;->getFloat(I)F

    move-result v34

    .line 58
    invoke-interface {v5, v6}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v35

    .line 59
    invoke-interface {v5, v2}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v36

    .line 61
    invoke-interface {v5, v3}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "splitsString"

    .line 62
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;->toRunningSplits(Ljava/lang/String;)Ljava/util/List;

    move-result-object v37

    move/from16 v2, v19

    .line 65
    invoke-interface {v5, v2}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "gpsPositionString"

    .line 66
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;->toGPSPositions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v38

    move/from16 v2, v20

    .line 68
    invoke-interface {v5, v2}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "heartRatesString"

    .line 69
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;->toHeartRates(Ljava/lang/String;)Ljava/util/List;

    move-result-object v39

    .line 71
    invoke-interface {v5, v1}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/16 v41, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/16 v41, 0x0

    .line 72
    :goto_1
    invoke-interface {v5, v4}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v22

    .line 74
    invoke-interface {v5, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 75
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-object/from16 v3, v18

    .line 76
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, v17

    move-object/from16 v4, v25

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, v16

    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, v21

    .line 78
    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, v43

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v23, v2

    move-object/from16 v24, v8

    move-object/from16 v25, v4

    move-object/from16 v27, v9

    move-object/from16 v40, v1

    move-object/from16 v42, v0

    .line 75
    invoke-direct/range {v23 .. v42}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V

    move-object/from16 v0, p1

    .line 80
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-interface {v5}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    move-object v4, v3

    move-object v3, v6

    move-object v2, v7

    move-object v1, v10

    move-object/from16 v7, p2

    move-object v6, v0

    move-object v0, v11

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    .line 87
    invoke-interface {v5}, Lnet/sqlcipher/Cursor;->close()V

    .line 88
    invoke-virtual/range {p2 .. p2}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V

    throw v0

    :cond_2
    move-object v0, v6

    .line 87
    :goto_2
    invoke-interface {v5}, Lnet/sqlcipher/Cursor;->close()V

    .line 88
    invoke-virtual/range {p2 .. p2}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V

    return-object v0
.end method


# virtual methods
.method public final getAppContext()Landroid/content/Context;
    .locals 1

    .line 9
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->appContext:Landroid/content/Context;

    return-object v0
.end method

.method public final loadActivities(JJ)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    .line 110
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->database()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT * FROM UserActivitySession WHERE startTime >= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " AND startTime < "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "db"

    .line 112
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadActivities(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final loadNotSyncedActivities()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    .line 95
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->database()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    const-string v1, "db"

    .line 97
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "SELECT * FROM UserActivitySession WHERE shouldSend = 1"

    invoke-direct {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadActivities(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final loadSingleActivity(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;
    .locals 4

    const-string v0, "activityId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    .line 102
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->database()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT * FROM UserActivitySession WHERE id = \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "db"

    .line 104
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DBDataRecovery;->loadActivities(Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    return-object p1
.end method
