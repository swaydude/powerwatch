.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;
.source "RestingPeriodFormatters.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRestingPeriodFormatters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RestingPeriodFormatters.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n125#2:110\n152#2,2:111\n154#2:116\n1741#3,3:113\n*S KotlinDebug\n*F\n+ 1 RestingPeriodFormatters.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl\n*L\n69#1:110\n69#1:111,2\n69#1:116\n73#1:113,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0014R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
        "periods",
        "",
        "(Ljava/util/List;)V",
        "emptyPeriod",
        "getEmptyPeriod",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;",
        "filler",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingBaseLog;",
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
.field private final filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingBaseLog;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
            ">;)V"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 62
    invoke-direct {p0, p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/AbstractPeriodFormatter;-><init>(Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;

    return-void
.end method


# virtual methods
.method protected formatFromRecords(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
            ">;)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "periods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/DayToWeekGrouper1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/DayToWeekGrouper1;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/DayToWeekGrouper1;->groupBy(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 111
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

    .line 70
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;->filler:Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;->getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v5, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingPeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    .line 71
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->setRestingDays(Ljava/util/List;)V

    .line 72
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->getStartTime()J

    move-result-wide v6

    invoke-static {v6, v7, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v6

    invoke-static {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->weekOfMonth(Ljava/util/Calendar;)I

    move-result v6

    invoke-virtual {v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->setWeekInMonth(I)V

    .line 73
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 113
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

    .line 114
    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    .line 73
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMalformed()Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v4, 0x1

    :goto_1
    invoke-virtual {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;->setMalformed(Z)V

    .line 74
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 116
    :cond_3
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic getEmptyPeriod()Ljava/lang/Object;
    .locals 1

    .line 61
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;->getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    move-result-object v0

    return-object v0
.end method

.method protected getEmptyPeriod()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;
    .locals 28

    .line 81
    new-instance v27, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;

    move-object/from16 v0, v27

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

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, 0x1fffff

    const/16 v26, 0x0

    invoke-direct/range {v0 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;-><init>(JJFIIFFFFFFFIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v27
.end method
