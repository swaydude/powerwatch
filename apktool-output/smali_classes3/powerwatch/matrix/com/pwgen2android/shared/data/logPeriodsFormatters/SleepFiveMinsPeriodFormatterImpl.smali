.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;
.source "SleepPeriodFormatters.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSleepPeriodFormatters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepPeriodFormatters.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n764#2:120\n855#2,2:121\n125#3:123\n152#3,3:124\n*S KotlinDebug\n*F\n+ 1 SleepPeriodFormatters.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl\n*L\n19#1:120\n19#1:121,2\n25#1:123\n25#1:124,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\'\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;",
        "periods",
        "",
        "lastStoredPeriod",
        "offset",
        "",
        "(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)V",
        "emptyPeriod",
        "getEmptyPeriod",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
        "filler",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;",
        "formatFromRecords",
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
.field private final filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;"
        }
    .end annotation
.end field

.field private final lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

.field private final offset:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            "I)V"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 8
    invoke-direct {p0, p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;-><init>(Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 8
    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->offset:I

    .line 10
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;I)V

    return-void
.end method


# virtual methods
.method protected formatFromRecords(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;",
            ">;)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    .line 19
    check-cast p1, Ljava/lang/Iterable;

    .line 120
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 121
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;

    .line 20
    invoke-interface {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;->getStartTime()J

    move-result-wide v3

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 122
    :cond_2
    move-object p1, v0

    check-cast p1, Ljava/util/List;

    .line 23
    :cond_3
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/LogToFiveMinGrouper1;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->offset:I

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/LogToFiveMinGrouper1;-><init>(I)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/LogToFiveMinGrouper1;->groupBy(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    .line 123
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 124
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 26
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-virtual {v3, v4, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 27
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-static {v3, v4, v5, v1, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v3

    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->minInHour(Ljava/util/Calendar;)I

    move-result v3

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->setFiveMinsInHour(I)V

    .line 28
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v3

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getStartTime()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_4

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getFiveMinsInHour()I

    move-result v3

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;->getFiveMinsInHour()I

    move-result v4

    if-ne v3, v4, :cond_4

    .line 29
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->lastStoredPeriod:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-virtual {v3, v2, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;->mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    .line 31
    :cond_4
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 126
    :cond_5
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic getEmptyPeriod()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepFiveMinsPeriodFormatterImpl;->getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    move-result-object v0

    return-object v0
.end method

.method protected getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;
    .locals 29

    .line 13
    new-instance v28, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    move-object/from16 v0, v28

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const v26, 0x3fffff

    const/16 v27, 0x0

    invoke-direct/range {v0 .. v27}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;-><init>(JIIFFFFFFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JFIIJIIFFFIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v28
.end method
