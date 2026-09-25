.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1$DefaultImpls;
.super Ljava/lang/Object;
.source "PeriodGroupers.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPeriodGroupers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodGroupers.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,55:1\n1475#2:56\n1500#2,3:57\n1503#2,3:67\n355#3,7:60\n*S KotlinDebug\n*F\n+ 1 PeriodGroupers.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1$DefaultImpls\n*L\n11#1:56\n11#1:57,3\n11#1:67,3\n11#1:60,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static groupBy(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1;Ljava/util/List;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;",
            ">(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1<",
            "TT;>;",
            "Ljava/util/List<",
            "+TT;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    check-cast p1, Ljava/lang/Iterable;

    .line 56
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 58
    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;

    .line 12
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;->getStartTime()J

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v2

    .line 13
    invoke-interface {p0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1;->groupCriteria(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v2

    .line 60
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    .line 59
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/List;

    .line 63
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 67
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
