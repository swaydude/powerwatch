.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;
.source "PeriodFiller.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<INPUT::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
        "OUTPUT::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;",
        ">",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl<",
        "TINPUT;TOUTPUT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPeriodFiller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodFiller.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n2820#2,5:155\n2833#2,5:160\n*S KotlinDebug\n*F\n+ 1 PeriodFiller.kt\npowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl\n*L\n108#1:155,5\n109#1:160,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0005\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\u000c\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;",
        "INPUT",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;",
        "OUTPUT",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;",
        "()V",
        "fill",
        "output",
        "inputs",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;",
        "mergePeriod",
        "periodToMerge",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;",
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

    .line 103
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic fill(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    .line 103
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;
    .locals 0

    .line 103
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    return-object p1
.end method

.method public fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;
    .locals 7
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

    .line 106
    move-object v0, p1

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-super {p0, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;->fill(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    .line 108
    check-cast p2, Ljava/lang/Iterable;

    .line 156
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 157
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;

    .line 108
    invoke-interface {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;->getSteps()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    .line 161
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 162
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;

    .line 109
    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;->getDistance()D

    move-result-wide v5

    add-double/2addr v3, v5

    goto :goto_1

    .line 111
    :cond_1
    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;->setSteps(I)V

    .line 112
    invoke-interface {v0, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;->setDistance(D)V

    return-object p1
.end method

.method public bridge synthetic mergePeriod(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 103
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;->mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;
    .locals 0

    .line 103
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingPeriodFillerImpl;->mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    return-object p1
.end method

.method public mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOUTPUT;TOUTPUT;)TOUTPUT;"
        }
    .end annotation

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "periodToMerge"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    move-object v0, p2

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    invoke-super {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodFillerImpl;->mergePeriod(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;

    .line 119
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;->getSteps()I

    move-result v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;->getSteps()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;->setSteps(I)V

    .line 120
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;->getDistance()D

    move-result-wide v0

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;->getDistance()D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-interface {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;->setDistance(D)V

    return-object p1
.end method
