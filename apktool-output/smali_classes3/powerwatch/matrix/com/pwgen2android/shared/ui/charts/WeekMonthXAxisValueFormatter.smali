.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;
.super Ljava/lang/Object;
.source "CubicLineChartFragment.kt"

# interfaces
.implements Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00052\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;",
        "Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;",
        "indexAxisValueFormatter",
        "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;",
        "offsetValue",
        "",
        "(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;F)V",
        "getFormattedValue",
        "",
        "value",
        "axis",
        "Lcom/github/mikephil/charting/components/AxisBase;",
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
.field private final indexAxisValueFormatter:Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

.field private final offsetValue:F


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;F)V
    .locals 1

    const-string v0, "indexAxisValueFormatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 529
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 530
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;->indexAxisValueFormatter:Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;->offsetValue:F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 530
    new-instance p1, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    invoke-direct {p1, p3}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    .line 529
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;-><init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;F)V

    return-void
.end method


# virtual methods
.method public getFormattedValue(FLcom/github/mikephil/charting/components/AxisBase;)Ljava/lang/String;
    .locals 8

    .line 533
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;->offsetValue:F

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    cmpg-float v3, p2, v0

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const-string v4, "h"

    const-string v5, "java.lang.String.format(format, *args)"

    const-string v6, "%02d"

    if-eqz v3, :cond_1

    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, v2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v6, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v3, 0x18

    int-to-float v3, v3

    sub-float p2, v3, p2

    add-float/2addr p2, p1

    const/high16 p1, 0x41c00000    # 24.0f

    cmpl-float v7, p2, p1

    if-lez v7, :cond_2

    sub-float/2addr p2, v3

    :cond_2
    cmpg-float p1, p2, p1

    if-nez p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    const/4 p2, 0x0

    :cond_4
    cmpg-float p1, p2, v0

    if-gez p1, :cond_5

    add-float/2addr p2, v3

    .line 540
    :cond_5
    sget-object p1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v2

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v6, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
