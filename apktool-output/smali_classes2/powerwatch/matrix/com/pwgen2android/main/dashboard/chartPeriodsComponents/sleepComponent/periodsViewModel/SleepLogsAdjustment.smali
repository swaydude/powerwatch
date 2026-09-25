.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;
.super Ljava/lang/Object;
.source "SleepLogsAdjustment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\n2\u0006\u0010\u000c\u001a\u00020\u0006J\"\u0010\r\u001a\u00020\u00042\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0006H\u0002J \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0015\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0006H\u0002J\u001c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;",
        "",
        "()V",
        "enableAdjustment",
        "",
        "threshold",
        "",
        "adjustInitialAndFinalSessions",
        "",
        "sleepPeriodsList",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
        "hourOffset",
        "adjustSessions",
        "lastSession",
        "newSession",
        "appendFakeEntriesAfter",
        "",
        "targetPeriod",
        "count",
        "appendFakeEntriesBefore",
        "period",
        "fillFakeEntriesBetween",
        "lastPeriod",
        "nextPeriod",
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
.field private final enableAdjustment:Z

.field private final threshold:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 11
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->enableAdjustment:Z

    return-void
.end method

.method private final appendFakeEntriesAfter(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)Ljava/util/List;
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            "I)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;"
        }
    .end annotation

    move/from16 v0, p2

    .line 30
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    if-lez v0, :cond_1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 33
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getEndTime()J

    move-result-wide v4

    mul-int/lit8 v2, v2, 0x5

    int-to-long v6, v2

    const-wide/32 v8, 0xea60

    mul-long v6, v6, v8

    add-long/2addr v4, v6

    .line 35
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getEndTime()J

    move-result-wide v10

    add-long v13, v10, v6

    const/4 v2, 0x0

    const/4 v6, 0x1

    .line 36
    invoke-static {v4, v5, v2, v6, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v2

    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->minInHour(Ljava/util/Calendar;)I

    move-result v15

    .line 37
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getEndTime()J

    move-result-wide v4

    mul-int/lit8 v2, v3, 0x5

    int-to-long v6, v2

    mul-long v6, v6, v8

    add-long v25, v4, v6

    .line 38
    sget-object v24, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->SLEEP_AWAKE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const v38, 0x1ff3fc

    const/16 v39, 0x0

    move-object/from16 v12, p1

    .line 35
    invoke-static/range {v12 .. v39}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;JIIFFFFFFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JFIIJIIFFFIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    move-result-object v2

    .line 39
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-lt v3, v0, :cond_0

    goto :goto_1

    :cond_0
    move v2, v3

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method static synthetic appendFakeEntriesAfter$default(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 29
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->appendFakeEntriesAfter(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final appendFakeEntriesBefore(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)Ljava/util/List;
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            "I)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;"
        }
    .end annotation

    move/from16 v0, p2

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    if-lez v0, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v3, 0x1

    .line 19
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v5

    mul-int/lit8 v7, v4, 0x5

    int-to-long v7, v7

    const-wide/32 v9, 0xea60

    mul-long v7, v7, v9

    sub-long/2addr v5, v7

    move-wide v12, v5

    .line 20
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v7

    mul-int/lit8 v3, v3, 0x5

    int-to-long v14, v3

    mul-long v14, v14, v9

    sub-long v24, v7, v14

    const/4 v3, 0x0

    const/4 v7, 0x1

    .line 21
    invoke-static {v5, v6, v3, v7, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v3

    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->minInHour(Ljava/util/Calendar;)I

    move-result v14

    .line 22
    sget-object v23, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->SLEEP_AWAKE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const v37, 0x1ff3fc

    const/16 v38, 0x0

    move-object/from16 v11, p1

    .line 20
    invoke-static/range {v11 .. v38}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;JIIFFFFFFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JFIIJIIFFFIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    move-result-object v3

    .line 23
    invoke-interface {v1, v2, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    if-lt v4, v0, :cond_0

    goto :goto_1

    :cond_0
    move v3, v4

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method static synthetic appendFakeEntriesBefore$default(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 14
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->appendFakeEntriesBefore(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final adjustInitialAndFinalSessions(Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;>;I)V"
        }
    .end annotation

    const-string v0, "sleepPeriodsList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->enableAdjustment:Z

    if-nez v0, :cond_0

    return-void

    .line 80
    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_4

    .line 81
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 82
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 84
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    .line 85
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 86
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object v2

    invoke-static {v2, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->hourInDay(Ljava/util/Calendar;I)I

    move-result v2

    const/16 v3, 0x17

    if-lt v2, v3, :cond_1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getFiveMinsInHour()I

    move-result v2

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    mul-int/lit8 v3, v3, 0x5

    rsub-int/lit8 v3, v3, 0x3c

    if-ge v2, v3, :cond_2

    .line 87
    :cond_1
    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    invoke-direct {p0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->appendFakeEntriesAfter(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 91
    :cond_2
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_4

    .line 92
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 93
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->hourInDay(Ljava/util/Calendar;I)I

    move-result p2

    if-gtz p2, :cond_3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getFiveMinsInHour()I

    move-result p2

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    mul-int/lit8 v1, v1, 0x5

    if-lt p2, v1, :cond_4

    .line 94
    :cond_3
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    invoke-direct {p0, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->appendFakeEntriesBefore(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    return-void
.end method

.method public final adjustSessions(Ljava/util/List;Ljava/util/List;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "lastSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->enableAdjustment:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 64
    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 65
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 67
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getEndTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    iget v5, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    mul-int/lit8 v6, v5, 0xa

    const v7, 0xea60

    mul-int v6, v6, v7

    int-to-long v6, v6

    const/4 v8, 0x0

    cmp-long v9, v3, v6

    if-gez v9, :cond_1

    .line 68
    invoke-virtual {p0, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->fillFakeEntriesBetween(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 69
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v8

    .line 72
    :cond_1
    invoke-direct {p0, v0, v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->appendFakeEntriesAfter(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 73
    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->threshold:I

    invoke-direct {p0, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;->appendFakeEntriesBefore(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p2, v8, p1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    return v1
.end method

.method public final fillFakeEntriesBetween(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;)Ljava/util/List;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "lastPeriod"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextPeriod"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 48
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getEndTime()J

    move-result-wide v3

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lkotlin/ranges/RangesKt;->until(JJ)Lkotlin/ranges/LongRange;

    move-result-object v1

    check-cast v1, Lkotlin/ranges/LongProgression;

    const-wide/32 v3, 0x493e0

    invoke-static {v1, v3, v4}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/LongProgression;J)Lkotlin/ranges/LongProgression;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/ranges/LongProgression;->getFirst()J

    move-result-wide v3

    invoke-virtual {v1}, Lkotlin/ranges/LongProgression;->getLast()J

    move-result-wide v29

    invoke-virtual {v1}, Lkotlin/ranges/LongProgression;->getStep()J

    move-result-wide v31

    const-wide/16 v5, 0x0

    cmp-long v1, v31, v5

    if-lez v1, :cond_0

    cmp-long v5, v3, v29

    if-lez v5, :cond_1

    :cond_0
    if-gez v1, :cond_3

    cmp-long v1, v29, v3

    if-gtz v1, :cond_3

    :cond_1
    move-wide v11, v3

    :goto_0
    add-long v33, v11, v31

    const v1, 0x493e0

    int-to-long v3, v1

    add-long v14, v11, v3

    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 51
    invoke-static {v11, v12, v3, v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->minInHour(Ljava/util/Calendar;)I

    move-result v4

    .line 52
    sget-object v13, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->SLEEP_AWAKE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v1, 0x0

    move-wide/from16 v35, v11

    move v11, v1

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const v27, 0x1ff3fc

    const/16 v28, 0x0

    move-object/from16 v1, p1

    move-wide/from16 v2, v35

    .line 50
    invoke-static/range {v1 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;JIIFFFFFFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JFIIJIIFFFIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    move-result-object v1

    .line 54
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    cmp-long v1, v35, v29

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v2, p1

    move-wide/from16 v11, v33

    goto :goto_0

    :cond_3
    :goto_1
    return-object v0
.end method
