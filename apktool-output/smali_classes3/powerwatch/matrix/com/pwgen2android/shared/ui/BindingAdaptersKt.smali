.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;
.super Ljava/lang/Object;
.source "bindingAdapters.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nbindingAdapters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 bindingAdapters.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1849#2,2:126\n764#2:128\n855#2,2:129\n1858#2,2:131\n1720#2,3:133\n1860#2:136\n*S KotlinDebug\n*F\n+ 1 bindingAdapters.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt\n*L\n29#1:126,2\n41#1:128\n41#1:129,2\n41#1:131,2\n62#1:133,3\n41#1:136\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u001e\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0007\u001a\u001e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00120\rH\u0007\u001a\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u00a8\u0006\u001c"
    }
    d2 = {
        "centerHorizontalInRelative",
        "",
        "view",
        "Landroid/view/View;",
        "centered",
        "",
        "enabledIf",
        "enabled",
        "goneUnless",
        "visible",
        "setLineData",
        "Lcom/github/mikephil/charting/charts/LineChart;",
        "data",
        "",
        "Lcom/github/mikephil/charting/data/LineDataSet;",
        "setSplitsData",
        "splitsView",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitsLayoutContainer;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitItemView;",
        "showWithTimer",
        "swipeEnabled",
        "swipeRefreshLayout",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;",
        "wheelValue",
        "wheelPicker",
        "Lcom/super_rabbit/wheel_picker/WheelPicker;",
        "value",
        "",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final centerHorizontalInRelative(Landroid/view/View;Z)V
    .locals 2
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "app:centerHorizontalInRelative"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/16 v1, 0xe

    if-eqz p1, :cond_1

    .line 107
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_1

    .line 109
    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 111
    :goto_1
    check-cast v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method

.method public static final enabledIf(Landroid/view/View;Z)V
    .locals 1
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "app:enabledIf"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public static final goneUnless(Landroid/view/View;Z)V
    .locals 1
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "app:goneUnless"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 84
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic lambda$crGOb_eyg6FLjndHr8LESO-_G0o(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->showWithTimer$lambda-5(Landroid/view/View;)V

    return-void
.end method

.method public static final setLineData(Lcom/github/mikephil/charting/charts/LineChart;Ljava/util/List;)V
    .locals 8
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "android:setLineData"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/mikephil/charting/charts/LineChart;",
            "Ljava/util/List<",
            "+",
            "Lcom/github/mikephil/charting/data/LineDataSet;",
            ">;)V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 128
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 129
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/github/mikephil/charting/data/LineDataSet;

    .line 41
    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/LineDataSet;->getEntryCount()I

    move-result v5

    if-lez v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 130
    :cond_2
    check-cast v1, Ljava/util/List;

    .line 128
    check-cast v1, Ljava/lang/Iterable;

    .line 132
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v5, -0x1

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v6, v1, 0x1

    if-gez v1, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v2, Lcom/github/mikephil/charting/data/LineDataSet;

    .line 43
    sget-object v7, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->LINEAR:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {v2, v7}, Lcom/github/mikephil/charting/data/LineDataSet;->setMode(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    .line 44
    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircles(Z)V

    .line 45
    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawValues(Z)V

    .line 47
    invoke-virtual {v2, v5}, Lcom/github/mikephil/charting/data/LineDataSet;->setCircleColor(I)V

    const/high16 v5, 0x40000000    # 2.0f

    .line 48
    invoke-virtual {v2, v5}, Lcom/github/mikephil/charting/data/LineDataSet;->setLineWidth(F)V

    const/high16 v5, 0x40400000    # 3.0f

    .line 49
    invoke-virtual {v2, v5}, Lcom/github/mikephil/charting/data/LineDataSet;->setCircleRadius(F)V

    const/16 v5, 0x41

    .line 50
    invoke-virtual {v2, v5}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillAlpha(I)V

    .line 51
    invoke-static {}, Lcom/github/mikephil/charting/utils/ColorTemplate;->getHoloBlue()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillColor(I)V

    const/16 v5, 0xf4

    const/16 v7, 0x75

    .line 52
    invoke-static {v5, v7, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/mikephil/charting/data/LineDataSet;->setHighLightColor(I)V

    .line 53
    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircleHole(Z)V

    .line 54
    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_4

    .line 55
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getContext()Landroid/content/Context;

    move-result-object v1

    const v5, 0x7f05001b

    invoke-static {v1, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->setColor(I)V

    .line 56
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/components/YAxis;->getAxisDependency()Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->setAxisDependency(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)V

    goto :goto_3

    .line 58
    :cond_4
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getContext()Landroid/content/Context;

    move-result-object v1

    const v5, 0x7f05001a

    invoke-static {v1, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->setColor(I)V

    .line 59
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/components/YAxis;->getAxisDependency()Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->setAxisDependency(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)V

    .line 62
    :goto_3
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/LineDataSet;->getValues()Ljava/util/List;

    move-result-object v1

    const-string v2, "values"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    .line 133
    instance-of v2, v1, Ljava/util/Collection;

    const/4 v5, 0x0

    if-eqz v2, :cond_6

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_5
    const/4 v1, 0x1

    goto :goto_5

    .line 134
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/mikephil/charting/data/Entry;

    .line 62
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    cmpg-float v2, v2, v5

    if-nez v2, :cond_8

    const/4 v2, 0x1

    goto :goto_4

    :cond_8
    const/4 v2, 0x0

    :goto_4
    if-nez v2, :cond_7

    const/4 v1, 0x0

    :goto_5
    if-eqz v1, :cond_9

    .line 63
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    goto :goto_6

    .line 65
    :cond_9
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/components/YAxis;->resetAxisMinimum()V

    :goto_6
    move v1, v6

    goto/16 :goto_2

    .line 71
    :cond_a
    new-instance v0, Lcom/github/mikephil/charting/data/LineData;

    invoke-direct {v0, p1}, Lcom/github/mikephil/charting/data/LineData;-><init>(Ljava/util/List;)V

    .line 72
    invoke-virtual {v0, v5}, Lcom/github/mikephil/charting/data/LineData;->setValueTextColor(I)V

    const/high16 p1, 0x41100000    # 9.0f

    .line 73
    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/data/LineData;->setValueTextSize(F)V

    .line 74
    check-cast v0, Lcom/github/mikephil/charting/data/ChartData;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/LineChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 75
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object p1

    check-cast p1, Lcom/github/mikephil/charting/data/LineData;

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineData;->setHighlightEnabled(Z)V

    .line 76
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object p1

    invoke-virtual {p1}, Lcom/github/mikephil/charting/components/XAxis;->getLimitLines()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 77
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->invalidate()V

    return-void
.end method

.method public static final setSplitsData(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitsLayoutContainer;Ljava/util/List;)V
    .locals 5
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "android:splits"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitsLayoutContainer;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitItemView;",
            ">;)V"
        }
    .end annotation

    const-string v0, "splitsView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitsLayoutContainer;->removeAllViews()V

    .line 29
    check-cast p1, Ljava/lang/Iterable;

    .line 126
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitItemView;

    .line 30
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitsLayoutContainer;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0b00d0

    .line 31
    move-object v3, p0

    check-cast v3, Landroid/view/ViewGroup;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 33
    sget v2, Lpowerwatch/matrix/com/pwgen2android/R$id;->split_title:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitItemView;->getDistance()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    sget v2, Lpowerwatch/matrix/com/pwgen2android/R$id;->split_value:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitItemView;->getDuration()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SplitsLayoutContainer;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final showWithTimer(Landroid/view/View;Z)V
    .locals 3
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "app:showWithTimer"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 95
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 96
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/-$$Lambda$BindingAdaptersKt$crGOb_eyg6FLjndHr8LESO-_G0o;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/-$$Lambda$BindingAdaptersKt$crGOb_eyg6FLjndHr8LESO-_G0o;-><init>(Landroid/view/View;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private static final showWithTimer$lambda-5(Landroid/view/View;)V
    .locals 1

    const-string v0, "$view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    .line 97
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static final swipeEnabled(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Z)V
    .locals 1
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "app:swipeEnabled"
        }
    .end annotation

    const-string v0, "swipeRefreshLayout"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    return-void
.end method

.method public static final wheelValue(Lcom/super_rabbit/wheel_picker/WheelPicker;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "app:wheelValue"
        }
    .end annotation

    const-string v0, "wheelPicker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "value"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
