.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WeekToMonthPeriodGrouper1;
.super Ljava/lang/Object;
.source "PeriodGroupers.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;",
        ">",
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WeekToMonthPeriodGrouper1;",
        "T",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseTimePeriod;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1;",
        "offset",
        "",
        "(I)V",
        "groupCriteria",
        "",
        "cal",
        "Ljava/util/Calendar;",
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
.field private final offset:I


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WeekToMonthPeriodGrouper1;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WeekToMonthPeriodGrouper1;->offset:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 50
    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WeekToMonthPeriodGrouper1;-><init>(I)V

    return-void
.end method


# virtual methods
.method public groupBy(Ljava/util/List;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .line 50
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1$DefaultImpls;->groupBy(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/PeriodGrouper1;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public groupCriteria(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 2

    const-string v0, "cal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WeekToMonthPeriodGrouper1;->offset:I

    const/16 v1, 0xb

    invoke-virtual {p1, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 53
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->monthUniqueID(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
