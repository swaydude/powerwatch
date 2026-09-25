.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;
.source "PeriodFiller.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<INPUT::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;",
        "OUTPUT::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;",
        ">",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl<",
        "TINPUT;TOUTPUT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPeriodFiller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodFiller.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1534#2:155\n764#2:157\n855#2,2:158\n1547#2:160\n1618#2,3:161\n2505#2,7:164\n1#3:156\n*S KotlinDebug\n*F\n+ 1 PeriodFiller.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl\n*L\n132#1:155\n136#1:157\n136#1:158,2\n137#1:160\n137#1:161,3\n143#1:164,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;",
        "INPUT",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;",
        "OUTPUT",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;",
        "()V",
        "fill",
        "output",
        "inputs",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 128
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic fill(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    .line 128
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;
    .locals 0

    .line 128
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    return-object p1
.end method

.method public fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOUTPUT;",
            "Ljava/util/List<",
            "+TINPUT;>;)TOUTPUT;"
        }
    .end annotation

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-super {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;

    .line 132
    check-cast p2, Ljava/lang/Iterable;

    .line 155
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl$fill$$inlined$groupingBy$1;

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepPeriodFillerImpl$fill$$inlined$groupingBy$1;-><init>(Ljava/lang/Iterable;)V

    check-cast v0, Lkotlin/collections/Grouping;

    .line 132
    invoke-static {v0}, Lkotlin/collections/GroupingKt;->eachCount(Lkotlin/collections/Grouping;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v1

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-ge v3, v5, :cond_3

    move-object v1, v4

    move v3, v5

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    :goto_1
    if-nez v2, :cond_5

    .line 133
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->RESTLESS:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    .line 157
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 158
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;

    .line 136
    invoke-interface {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;->getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v5

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->RESTLESS:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    if-ne v5, v6, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_6

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 159
    :cond_8
    check-cast v0, Ljava/util/List;

    .line 157
    check-cast v0, Ljava/lang/Iterable;

    .line 160
    new-instance p2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p2, Ljava/util/Collection;

    .line 161
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 162
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;

    .line 139
    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;->getEndTime()J

    move-result-wide v5

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;->getStartTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    long-to-double v5, v5

    const v1, 0xea60

    int-to-double v7, v1

    div-double/2addr v5, v7

    invoke-static {v5, v6}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 163
    :cond_9
    check-cast p2, Ljava/util/List;

    .line 142
    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_c

    .line 143
    check-cast p2, Ljava/lang/Iterable;

    .line 164
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 165
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 166
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 167
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 168
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    .line 143
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_5

    .line 170
    :cond_a
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v4

    goto :goto_6

    .line 165
    :cond_b
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Empty collection can\'t be reduced."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 147
    :cond_c
    :goto_6
    invoke-interface {p1, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;->setRestlessMinutes(I)V

    .line 148
    invoke-interface {p1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;->setSleepType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)V

    return-object p1
.end method
