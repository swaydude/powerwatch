.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$1;
.super Landroidx/room/EntityInsertionAdapter;
.source "WalkingHourPeriodDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertionAdapter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;Landroidx/room/RoomDatabase;)V
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
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl;

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
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao_Impl$1;->bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V

    return-void
.end method

.method public bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V
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
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 47
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getEndTime()J

    move-result-wide v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 48
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHourInDay()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 49
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMaxHeartRate()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 50
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinHeartRate()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 51
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHeartRate()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 52
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 53
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMaxSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x8

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 54
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinSkinTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x9

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 55
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getBodyPower()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 56
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getSolarPower()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xb

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 57
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHrv()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xc

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 58
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getPeakTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0xd

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 59
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getActiveCalories()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 60
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getSteps()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xf

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 61
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getDistance()D

    move-result-wide v0

    const/16 v2, 0x10

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 62
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getLastUpdated()J

    move-result-wide v0

    const/16 v2, 0x11

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 63
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinsInPeriod()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 64
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getBmrCalories()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 65
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getCaseTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x14

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 66
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMinCaseTemp()F

    move-result v0

    float-to-double v0, v0

    const/16 v2, 0x15

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    .line 67
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getMaxCaseTemp()F

    move-result p2

    float-to-double v0, p2

    const/16 p2, 0x16

    invoke-interface {p1, p2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindDouble(ID)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `WalkingHourPeriod` (`startTime`,`endTime`,`hourInDay`,`maxHeartRate`,`minHeartRate`,`heartRate`,`skinTemp`,`maxSkinTemp`,`minSkinTemp`,`bodyPower`,`solarPower`,`hrv`,`peakTemp`,`activeCalories`,`steps`,`distance`,`lastUpdated`,`minsInPeriod`,`bmrCalories`,`caseTemp`,`minCaseTemp`,`maxCaseTemp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
