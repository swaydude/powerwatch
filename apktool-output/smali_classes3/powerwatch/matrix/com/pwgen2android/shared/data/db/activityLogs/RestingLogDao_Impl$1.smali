.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl$1;
.super Landroidx/room/EntityInsertionAdapter;
.source "RestingLogDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertionAdapter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl;Landroidx/room/RoomDatabase;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0
        }
        names = {
            "this$0",
            "database"
        }
    .end annotation

    .line 35
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/EntityInsertionAdapter;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "stmt",
            "value"
        }
    .end annotation

    .line 35
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao_Impl$1;->bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;)V

    return-void
.end method

.method public bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "stmt",
            "value"
        }
    .end annotation

    .line 43
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getStartTime()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 44
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getEndTime()J

    move-result-wide v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 45
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getHeartRate()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 46
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getBodyPower()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 47
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getSolarPower()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 48
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 49
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getMaxSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 50
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getMinSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 51
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getCaseTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 52
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getMaxCaseTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 53
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getMinCaseTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 54
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getActiveCalories()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 55
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getHrv()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xd

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 56
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getShouldSend()Z

    move-result v0

    const/16 v1, 0xe

    int-to-long v2, v0

    .line 57
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    const/16 v0, 0xf

    .line 58
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getBmrCalories()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    const/16 v0, 0x10

    .line 59
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getMinHeartRate()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    const/16 v0, 0x11

    .line 60
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getMaxHeartRate()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 61
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getEmail()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_0

    .line 62
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getEmail()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `RestingLog` (`startTime`,`endTime`,`heartRate`,`bodyPower`,`solarPower`,`skinTemp`,`maxSkinTemp`,`minSkinTemp`,`caseTemp`,`maxCaseTemp`,`minCaseTemp`,`activeCalories`,`hrv`,`shouldSend`,`bmrCalories`,`minHeartRate`,`maxHeartRate`,`email`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
