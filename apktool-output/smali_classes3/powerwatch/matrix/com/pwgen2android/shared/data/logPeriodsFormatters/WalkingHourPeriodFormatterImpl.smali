.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;
.source "WalkingPeriodFormatters.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalkingPeriodFormatters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalkingPeriodFormatters.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,105:1\n125#2:106\n152#2,3:107\n*S KotlinDebug\n*F\n+ 1 WalkingPeriodFormatters.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl\n*L\n21#1:106\n21#1:107,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\u0008\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
        "walkingLogs",
        "",
        "lastStoredPeriod",
        "(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V",
        "emptyPeriod",
        "getEmptyPeriod",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        "filler",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;",
        "formatFromRecords",
        "periods",
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
.field private final filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;"
        }
    .end annotation
.end field

.field private final lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;


# direct methods
.method public constructor <init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ")V"
        }
    .end annotation

    const-string v0, "walkingLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 9
    invoke-direct {p0, p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;-><init>(Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 11
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;

    return-void
.end method


# virtual methods
.method protected formatFromRecords(Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
            ">;)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/LogToHourGrouper1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/LogToHourGrouper1;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/LogToHourGrouper1;->groupBy(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 107
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v4, v5, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 23
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v4

    invoke-static {v4, v5, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v4

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->hourInDay(Ljava/util/Calendar;)I

    move-result v4

    invoke-virtual {v1, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->setHourInDay(I)V

    .line 24
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    if-eqz v4, :cond_0

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v4

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getStartTime()J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-lez v8, :cond_0

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHourInDay()I

    move-result v4

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;->getHourInDay()I

    move-result v5

    if-ne v4, v5, :cond_0

    .line 25
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    invoke-virtual {v4, v1, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;->mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    .line 27
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 109
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic getEmptyPeriod()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingHourPeriodFormatterImpl;->getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    move-result-object v0

    return-object v0
.end method

.method protected getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;
    .locals 30

    .line 14
    new-instance v29, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;

    move-object/from16 v0, v29

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const v27, 0x3fffff

    const/16 v28, 0x0

    invoke-direct/range {v0 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;-><init>(JJIIIFFFFFFFFIIDJIIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v29
.end method
