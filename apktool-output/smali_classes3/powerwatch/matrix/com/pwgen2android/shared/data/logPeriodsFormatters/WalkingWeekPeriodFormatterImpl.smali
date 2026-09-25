.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;
.source "WalkingPeriodFormatters.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalkingPeriodFormatters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalkingPeriodFormatters.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n125#2:106\n152#2,2:107\n154#2:112\n1741#3,3:109\n*S KotlinDebug\n*F\n+ 1 WalkingPeriodFormatters.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl\n*L\n66#1:106\n66#1:107,2\n66#1:112\n70#1:109,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\u0008\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
        "periods",
        "",
        "lastStoredPeriod",
        "(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;)V",
        "emptyPeriod",
        "getEmptyPeriod",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
        "filler",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
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
.field private final filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
            ")V"
        }
    .end annotation

    const-string p2, "periods"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, p1, p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;-><init>(Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 58
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;)V

    return-void
.end method


# virtual methods
.method protected formatFromRecords(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
            ">;)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/DayToWeekGrouper1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/DayToWeekGrouper1;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/DayToWeekGrouper1;->groupBy(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 107
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 67
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl;->getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v5, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    .line 68
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->setWalkingDays(Ljava/util/List;)V

    .line 69
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->getStartTime()J

    move-result-wide v6

    invoke-static {v6, v7, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v6

    invoke-static {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->weekOfMonth(Ljava/util/Calendar;)I

    move-result v6

    invoke-virtual {v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->setWeekInMonth(I)V

    .line 70
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 109
    instance-of v6, v4, Ljava/util/Collection;

    if-eqz v6, :cond_1

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    .line 110
    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    .line 70
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMalformed()Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v4, 0x1

    :goto_1
    invoke-virtual {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;->setMalformed(Z)V

    .line 71
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 112
    :cond_3
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic getEmptyPeriod()Ljava/lang/Object;
    .locals 1

    .line 58
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingWeekPeriodFormatterImpl;->getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    move-result-object v0

    return-object v0
.end method

.method protected getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;
    .locals 31

    .line 77
    new-instance v30, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;

    move-object/from16 v0, v30

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

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v28, 0x7fffff

    const/16 v29, 0x0

    invoke-direct/range {v0 .. v29}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;-><init>(JJIFIIFFFFFFFDIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v30
.end method
