.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$1;
.super Landroidx/room/EntityInsertionAdapter;
.source "RestingHourPeriodDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertionAdapter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V
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

    .line 38
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl;

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

    .line 38
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao_Impl$1;->bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V

    return-void
.end method

.method public bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;)V
    .locals 3
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

    .line 46
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getStartTime()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 47
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getEndTime()J

    move-result-wide v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 48
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHourInDay()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 49
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHeartRate()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 50
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxHeartRate()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 51
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinHeartRate()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 52
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getHrv()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 53
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 54
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 55
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 56
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBodyPower()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 57
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getSolarPower()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 58
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getPeakTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xd

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 59
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getActiveCalories()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 60
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getLastUpdated()J

    move-result-wide v0

    const/16 v2, 0xf

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 61
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinsInPeriod()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x10

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 62
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getBmrCalories()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x11

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 63
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getCaseTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 64
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMinCaseTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 65
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;->getMaxCaseTemp()F

    move-result p2

    float-to-double v0, p2

    const/16 p2, 0x14

    invoke-interface {p1, p2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `RestingHourPeriod` (`startTime`,`endTime`,`hourInDay`,`heartRate`,`maxHeartRate`,`minHeartRate`,`hrv`,`skinTemp`,`maxSkinTemp`,`minSkinTemp`,`bodyPower`,`solarPower`,`peakTemp`,`activeCalories`,`lastUpdated`,`minsInPeriod`,`bmrCalories`,`caseTemp`,`minCaseTemp`,`maxCaseTemp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
