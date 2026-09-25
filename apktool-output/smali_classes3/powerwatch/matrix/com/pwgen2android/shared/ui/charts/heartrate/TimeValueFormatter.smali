.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/TimeValueFormatter;
.super Ljava/lang/Object;
.source "ActivityHeartRateChartFragment.kt"

# interfaces
.implements Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/TimeValueFormatter;",
        "Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;",
        "indexAxisValueFormatter",
        "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;",
        "(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V",
        "counter",
        "",
        "getFormattedValue",
        "",
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


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/TimeValueFormatter;-><init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V
    .locals 1

    const-string v0, "indexAxisValueFormatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/TimeValueFormatter;->indexAxisValueFormatter:Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 208
    new-instance p1, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-direct {p1, p2}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/TimeValueFormatter;-><init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;)V

    return-void
.end method


# virtual methods
.method public getFormattedValue(FLcom/github/mikephil/charting/components/AxisBase;)Ljava/lang/String;
    .locals 0

    float-to-long p1, p1

    .line 213
    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->completeTimeFormat(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
