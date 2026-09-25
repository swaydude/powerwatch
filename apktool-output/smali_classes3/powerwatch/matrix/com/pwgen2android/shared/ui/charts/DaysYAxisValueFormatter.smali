.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;
.super Ljava/lang/Object;
.source "CubicLineChartFragment.kt"

# interfaces
.implements Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;",
        "Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;",
        "values",
        "",
        "",
        "indexAxisValueFormatter",
        "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;",
        "(Ljava/util/List;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V",
        "counter",
        "",
        "getValues",
        "()Ljava/util/List;",
        "getFormattedValue",
        "value",
        "",
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
.field private counter:I

.field private final indexAxisValueFormatter:Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

.field private final values:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;",
            ")V"
        }
    .end annotation

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "indexAxisValueFormatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 509
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->values:Ljava/util/List;

    .line 510
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->indexAxisValueFormatter:Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 510
    new-instance p2, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    invoke-direct {p2, p3}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    .line 509
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;-><init>(Ljava/util/List;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V

    return-void
.end method


# virtual methods
.method public getFormattedValue(FLcom/github/mikephil/charting/components/AxisBase;)Ljava/lang/String;
    .locals 1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 515
    :cond_0
    iget p1, p2, Lcom/github/mikephil/charting/components/AxisBase;->mEntryCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->values:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, p2, :cond_2

    :goto_1
    const-string p1, ""

    return-object p1

    .line 518
    :cond_2
    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->counter:I

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->values:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_3

    .line 519
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->values:Ljava/util/List;

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->counter:I

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_2

    :cond_3
    const-string p1, "ERROR"

    .line 522
    :goto_2
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->counter:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->counter:I

    .line 523
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_4

    const/4 p2, 0x0

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->counter:I

    :cond_4
    return-object p1
.end method

.method public final getValues()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 509
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;->values:Ljava/util/List;

    return-object v0
.end method
