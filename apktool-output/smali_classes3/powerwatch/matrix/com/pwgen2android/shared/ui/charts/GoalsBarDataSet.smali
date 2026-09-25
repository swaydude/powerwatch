.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;
.super Lcom/github/mikephil/charting/data/BarDataSet;
.source "BarChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBarChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n1547#2:316\n1618#2,3:317\n*S KotlinDebug\n*F\n+ 1 BarChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet\n*L\n292#1:316\n292#1:317,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0018\u00002\u00020\u0001BC\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0012\u001a\u00020\n2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;",
        "Lcom/github/mikephil/charting/data/BarDataSet;",
        "multipleColors",
        "",
        "context",
        "Landroid/content/Context;",
        "yValues",
        "",
        "Lcom/github/mikephil/charting/data/BarEntry;",
        "min",
        "",
        "max",
        "barColors",
        "(ZLandroid/content/Context;Ljava/util/List;IILjava/util/List;)V",
        "getContext",
        "()Landroid/content/Context;",
        "getColor",
        "index",
        "getEntryIndex",
        "e",
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
.field private final context:Landroid/content/Context;

.field private final max:I

.field private final min:I

.field private final multipleColors:Z

.field private final yValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLandroid/content/Context;Ljava/util/List;IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "yValues"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barColors"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    .line 288
    invoke-direct {p0, p3, v0}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 283
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->multipleColors:Z

    .line 284
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->context:Landroid/content/Context;

    .line 285
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->yValues:Ljava/util/List;

    .line 286
    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->min:I

    .line 287
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->max:I

    .line 291
    check-cast p6, Ljava/lang/Iterable;

    .line 316
    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p6, p2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 317
    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 318
    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    .line 293
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 319
    :cond_0
    check-cast p1, Ljava/util/List;

    .line 316
    check-cast p1, Ljava/util/Collection;

    .line 295
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object p1

    .line 296
    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->setColors([I)V

    return-void
.end method

.method public synthetic constructor <init>(ZLandroid/content/Context;Ljava/util/List;IILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    .line 282
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;-><init>(ZLandroid/content/Context;Ljava/util/List;IILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public getColor(I)I
    .locals 4

    .line 305
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->multipleColors:Z

    const-string v1, "mColors[0]"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->mColors:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    .line 306
    :cond_0
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object p1

    check-cast p1, Lcom/github/mikephil/charting/data/BarEntry;

    .line 308
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->getY()F

    move-result v0

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->min:I

    int-to-float v3, v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_1

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->mColors:Ljava/util/List;

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "mColors[2]"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_0

    .line 309
    :cond_1
    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->getY()F

    move-result v0

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->min:I

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_2

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/BarEntry;->getY()F

    move-result p1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->max:I

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_2

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->mColors:Ljava/util/List;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "mColors[1]"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_0

    .line 310
    :cond_2
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->mColors:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 284
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getEntryIndex(Lcom/github/mikephil/charting/data/BarEntry;)I
    .locals 1

    .line 301
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->yValues:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->indexOf(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getEntryIndex(Lcom/github/mikephil/charting/data/Entry;)I
    .locals 0

    .line 282
    check-cast p1, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;->getEntryIndex(Lcom/github/mikephil/charting/data/BarEntry;)I

    move-result p1

    return p1
.end method
