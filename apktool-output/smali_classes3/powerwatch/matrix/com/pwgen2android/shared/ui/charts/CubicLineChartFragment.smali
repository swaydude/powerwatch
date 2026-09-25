.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
.source "CubicLineChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$Companion;,
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCubicLineChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CubicLineChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n25#2,3:547\n1557#3:550\n1588#3,3:551\n1547#3:554\n1618#3,2:555\n1720#3,3:558\n1620#3:561\n1591#3:562\n1557#3:563\n1588#3,3:564\n1849#3,2:567\n1591#3:569\n1358#3:570\n1444#3,5:571\n1358#3:576\n1444#3,5:577\n1895#3,14:582\n1358#3:596\n1444#3,5:597\n2190#3,14:602\n1557#3:616\n1588#3,4:617\n1849#3,2:621\n1#4:557\n*S KotlinDebug\n*F\n+ 1 CubicLineChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment\n*L\n74#1:547,3\n141#1:550\n141#1:551,3\n154#1:554\n154#1:555,2\n156#1:558,3\n154#1:561\n141#1:562\n173#1:563\n173#1:564,3\n176#1:567,2\n173#1:569\n186#1:570\n186#1:571,5\n192#1:576\n192#1:577,5\n192#1:582,14\n193#1:596\n193#1:597,5\n193#1:602,14\n255#1:616\n255#1:617,4\n294#1:621,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u0000 \u001d2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u001cH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;",
        "()V",
        "chartContainer",
        "Landroid/widget/LinearLayout;",
        "currentConfig",
        "lineChart",
        "Lcom/github/mikephil/charting/charts/LineChart;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "getRxBus",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "rxBus$delegate",
        "Lkotlin/Lazy;",
        "init",
        "",
        "config",
        "rootView",
        "Landroid/view/View;",
        "onCreateView",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "setConfig",
        "",
        "Companion",
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


# static fields
.field private static final CHART_CONFIG:Ljava/lang/String; = "cubicLineChartConfig"

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$Companion;


# instance fields
.field private chartContainer:Landroid/widget/LinearLayout;

.field private currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

.field private lineChart:Lcom/github/mikephil/charting/charts/LineChart;

.field private final rxBus$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 74
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 64
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;-><init>()V

    .line 74
    move-object v0, p0

    check-cast v0, Landroid/content/ComponentCallbacks;

    const/4 v1, 0x0

    .line 547
    move-object v2, v1

    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 548
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 549
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$special$$inlined$inject$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$special$$inlined$inject$default$1;-><init>(Landroid/content/ComponentCallbacks;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 74
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->rxBus$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getRxBus()Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;
    .locals 1

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->rxBus$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    return-object v0
.end method

.method private static final init$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "this$0"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$rootView"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$config"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v3

    if-nez v3, :cond_0

    return-void

    .line 103
    :cond_0
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const v4, 0x7f080221

    .line 105
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f08010b

    .line 106
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-nez v3, :cond_1

    return-void

    .line 111
    :cond_1
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    .line 112
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->clearValues()V

    .line 113
    invoke-virtual {v3, v6}, Lcom/github/mikephil/charting/charts/LineChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 117
    :cond_2
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getDescription()Lcom/github/mikephil/charting/components/Description;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Lcom/github/mikephil/charting/components/Description;->setEnabled(Z)V

    .line 119
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;->hideBackgroundGridLines(Lcom/github/mikephil/charting/charts/LineChart;)V

    .line 120
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;->removeTouch(Lcom/github/mikephil/charting/charts/LineChart;)V

    .line 123
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v5

    .line 124
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v8

    const/high16 v9, 0x40a00000    # 5.0f

    const/high16 v10, 0x41400000    # 12.0f

    const/4 v11, 0x0

    .line 125
    invoke-virtual {v8, v10, v9, v11}, Lcom/github/mikephil/charting/components/YAxis;->enableGridDashedLine(FFF)V

    .line 127
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v9

    const/4 v12, -0x1

    .line 129
    invoke-virtual {v5, v12}, Lcom/github/mikephil/charting/components/XAxis;->setTextColor(I)V

    .line 131
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v13

    invoke-virtual {v13, v7}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 132
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v14, 0x7f0f013e

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3, v13}, Lcom/github/mikephil/charting/charts/LineChart;->setNoDataText(Ljava/lang/String;)V

    .line 133
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    const/16 v14, 0x28

    int-to-float v14, v14

    mul-float v14, v14, v13

    .line 137
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getEntries()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    const/4 v15, 0x1

    xor-int/2addr v13, v15

    const-string v16, ""

    if-eqz v13, :cond_2a

    .line 139
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getEntries()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .line 550
    new-instance v10, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v13, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v10, Ljava/util/Collection;

    .line 552
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v13, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    const/high16 v20, 0x43160000    # 150.0f

    if-eqz v19, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    add-int/lit8 v21, v13, 0x1

    if-gez v13, :cond_3

    .line 553
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v19, Ljava/util/List;

    .line 142
    check-cast v19, Ljava/util/Collection;

    invoke-static/range {v19 .. v19}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v15

    .line 143
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v19

    if-eqz v19, :cond_4

    .line 144
    new-instance v7, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v7, v11, v11}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v15, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v11, 0x7f0700d2

    invoke-static {v7, v11}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 154
    check-cast v15, Ljava/lang/Iterable;

    .line 554
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v15, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .line 555
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 556
    check-cast v15, Ljava/util/List;

    .line 155
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getDataSetsLabels()Ljava/util/List;

    move-result-object v12

    move-object/from16 v24, v6

    if-ltz v13, :cond_5

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v6

    if-gt v13, v6, :cond_5

    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    :cond_5
    move-object/from16 v6, v16

    :goto_2
    check-cast v6, Ljava/lang/String;

    .line 156
    move-object v12, v15

    check-cast v12, Ljava/lang/Iterable;

    move-object/from16 v25, v11

    .line 558
    instance-of v11, v12, Ljava/util/Collection;

    if-eqz v11, :cond_7

    move-object v11, v12

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_7

    :cond_6
    const/4 v11, 0x1

    goto :goto_4

    .line 559
    :cond_7
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/github/mikephil/charting/data/Entry;

    .line 156
    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v12

    cmpg-float v12, v12, v20

    if-nez v12, :cond_9

    const/4 v12, 0x1

    goto :goto_3

    :cond_9
    const/4 v12, 0x0

    :goto_3
    if-nez v12, :cond_8

    const/4 v11, 0x0

    .line 157
    :goto_4
    new-instance v12, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-direct {v12, v15, v6}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/4 v6, 0x0

    .line 159
    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircles(Z)V

    .line 160
    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawCircleHole(Z)V

    .line 161
    sget-object v6, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->HORIZONTAL_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setMode(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    .line 162
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v15, 0x7f05004d

    invoke-static {v6, v15}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillColor(I)V

    const/4 v6, 0x1

    .line 164
    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawFilled(Z)V

    const/high16 v6, 0x3fc00000    # 1.5f

    .line 165
    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setLineWidth(F)V

    if-eqz v11, :cond_a

    const/high16 v6, -0x10000

    .line 166
    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setColor(I)V

    :cond_a
    const/16 v6, 0xb4

    .line 167
    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillAlpha(I)V

    const/4 v6, 0x0

    .line 168
    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setDrawValues(Z)V

    .line 169
    sget-object v6, Lcom/github/mikephil/charting/components/YAxis$AxisDependency;->RIGHT:Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    invoke-virtual {v12, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->setAxisDependency(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)V

    .line 170
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 158
    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v6, v24

    move-object/from16 v11, v25

    const/16 v12, 0xa

    goto/16 :goto_1

    :cond_b
    move-object/from16 v24, v6

    .line 561
    check-cast v7, Ljava/util/List;

    .line 154
    invoke-interface {v10, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v13, v21

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xa

    const/4 v15, 0x1

    goto/16 :goto_0

    .line 562
    :cond_c
    check-cast v10, Ljava/util/List;

    .line 550
    check-cast v10, Ljava/lang/Iterable;

    .line 563
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v10, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 565
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v10, 0x0

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v13, v10, 0x1

    if-gez v10, :cond_d

    .line 566
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_d
    check-cast v11, Ljava/util/List;

    .line 174
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;

    const/4 v12, 0x3

    move-object/from16 v24, v7

    const/4 v7, 0x0

    invoke-direct {v15, v7, v7, v12, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;-><init>(Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 175
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez v7, :cond_e

    :goto_6
    move-object/from16 v7, v16

    goto :goto_7

    :cond_e
    invoke-virtual {v7}, Lcom/github/mikephil/charting/data/LineDataSet;->getLabel()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_f

    goto :goto_6

    :cond_f
    :goto_7
    invoke-virtual {v15, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->setLabel(Ljava/lang/String;)V

    .line 176
    check-cast v11, Ljava/lang/Iterable;

    .line 567
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/github/mikephil/charting/data/LineDataSet;

    .line 177
    invoke-virtual {v15}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;

    move-object/from16 v25, v7

    mul-int/lit16 v7, v10, 0x104

    int-to-float v7, v7

    add-float v7, v7, v20

    move/from16 v26, v13

    int-to-float v13, v10

    const/high16 v27, 0x43820000    # 260.0f

    mul-float v13, v13, v27

    move/from16 v27, v10

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v2, 0x7f05004a

    invoke-static {v10, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v10

    invoke-direct {v12, v7, v13, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;-><init>(FFI)V

    check-cast v12, Lcom/github/mikephil/charting/formatter/IFillFormatter;

    .line 178
    invoke-virtual {v11, v12}, Lcom/github/mikephil/charting/data/LineDataSet;->setFillFormatter(Lcom/github/mikephil/charting/formatter/IFillFormatter;)V

    move-object/from16 v2, p2

    move-object/from16 v7, v25

    move/from16 v13, v26

    move/from16 v10, v27

    goto :goto_8

    :cond_10
    move/from16 v26, v13

    .line 182
    invoke-interface {v6, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p2

    move-object/from16 v7, v24

    move/from16 v10, v26

    goto/16 :goto_5

    .line 569
    :cond_11
    check-cast v6, Ljava/util/List;

    .line 186
    move-object v2, v6

    check-cast v2, Ljava/lang/Iterable;

    .line 570
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .line 571
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 572
    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;

    .line 186
    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .line 573
    invoke-static {v7, v11}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_9

    .line 575
    :cond_12
    check-cast v7, Ljava/util/List;

    .line 186
    new-instance v10, Lcom/github/mikephil/charting/data/LineData;

    invoke-direct {v10, v7}, Lcom/github/mikephil/charting/data/LineData;-><init>(Ljava/util/List;)V

    const/4 v7, 0x0

    .line 187
    invoke-virtual {v10, v7}, Lcom/github/mikephil/charting/data/LineData;->setHighlightEnabled(Z)V

    .line 189
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getXAxisLabels()Ljava/util/List;

    move-result-object v7

    if-nez v7, :cond_13

    const-string v24, "9"

    const-string v25, ""

    const-string v26, ""

    const-string v27, "12A"

    const-string v28, ""

    const-string v29, ""

    const-string v30, "3"

    const-string v31, ""

    const-string v32, ""

    const-string v33, "6"

    const-string v34, ""

    const-string v35, ""

    const-string v36, "9"

    const-string v37, ""

    const-string v38, ""

    const-string v39, "12P"

    .line 190
    filled-new-array/range {v24 .. v39}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 576
    :cond_13
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .line 577
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_14

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 578
    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;

    .line 192
    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .line 579
    invoke-static {v11, v13}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_a

    .line 581
    :cond_14
    check-cast v11, Ljava/util/List;

    .line 576
    check-cast v11, Ljava/lang/Iterable;

    .line 582
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    .line 583
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-nez v12, :cond_15

    const/4 v12, 0x0

    goto :goto_d

    .line 584
    :cond_15
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 585
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_16

    goto :goto_d

    .line 586
    :cond_16
    move-object v13, v12

    check-cast v13, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 192
    invoke-interface {v13}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result v13

    .line 588
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 589
    move-object/from16 v16, v15

    check-cast v16, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    move-object/from16 v20, v12

    .line 192
    invoke-interface/range {v16 .. v16}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result v12

    .line 590
    invoke-static {v13, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v16

    if-gez v16, :cond_17

    move v13, v12

    move-object v12, v15

    goto :goto_c

    :cond_17
    move-object/from16 v12, v20

    .line 594
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-nez v15, :cond_29

    .line 192
    :goto_d
    check-cast v12, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-nez v12, :cond_18

    const/4 v15, 0x0

    goto :goto_e

    :cond_18
    invoke-interface {v12}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMax()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    move-object v15, v11

    .line 596
    :goto_e
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .line 597
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_19

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 598
    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;

    .line 193
    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;->getDataSets()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .line 599
    invoke-static {v11, v13}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_f

    .line 601
    :cond_19
    check-cast v11, Ljava/util/List;

    .line 596
    check-cast v11, Ljava/lang/Iterable;

    .line 602
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    .line 603
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_1a

    const/4 v11, 0x0

    goto :goto_12

    .line 604
    :cond_1a
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 605
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-nez v12, :cond_1b

    goto :goto_12

    .line 606
    :cond_1b
    move-object v12, v11

    check-cast v12, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    .line 193
    invoke-interface {v12}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result v12

    .line 608
    :goto_10
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 609
    move-object/from16 v20, v13

    check-cast v20, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    move-object/from16 v24, v11

    .line 193
    invoke-interface/range {v20 .. v20}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result v11

    .line 610
    invoke-static {v12, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v20

    if-lez v20, :cond_1c

    move v12, v11

    move-object v11, v13

    goto :goto_11

    :cond_1c
    move-object/from16 v11, v24

    .line 614
    :goto_11
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_28

    .line 193
    :goto_12
    check-cast v11, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;

    if-nez v11, :cond_1d

    const/4 v11, 0x0

    goto :goto_13

    :cond_1d
    invoke-interface {v11}, Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;->getYMin()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    .line 195
    :goto_13
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getMode()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    move-result-object v12

    sget-object v13, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v12

    aget v12, v13, v12

    const/4 v13, 0x1

    if-eq v12, v13, :cond_25

    const/high16 v0, 0x42b40000    # 90.0f

    const/4 v1, 0x2

    if-eq v12, v1, :cond_22

    .line 251
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;

    .line 252
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getHourOffset()I

    move-result v7

    int-to-float v7, v7

    const/4 v12, 0x0

    .line 251
    invoke-direct {v4, v12, v7, v13, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;-><init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 616
    new-instance v4, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v2, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 618
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v7, 0x0

    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v12, v7, 0x1

    if-gez v7, :cond_1e

    .line 619
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1e
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;

    .line 256
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v7, v12

    goto :goto_14

    .line 620
    :cond_1f
    check-cast v4, Ljava/util/List;

    .line 616
    check-cast v4, Ljava/lang/Iterable;

    .line 257
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 259
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    invoke-virtual {v8, v4, v5}, Lcom/github/mikephil/charting/components/YAxis;->setLabelCount(IZ)V

    .line 261
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;

    move-object v5, v3

    check-cast v5, Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getAnimator()Lcom/github/mikephil/charting/animation/ChartAnimator;

    move-result-object v7

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getViewPortHandler()Lcom/github/mikephil/charting/utils/ViewPortHandler;

    move-result-object v12

    invoke-direct {v4, v5, v7, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    check-cast v4, Lcom/github/mikephil/charting/renderer/DataRenderer;

    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/charts/LineChart;->setRenderer(Lcom/github/mikephil/charting/renderer/DataRenderer;)V

    .line 263
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5, v1, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;-><init>(Ljava/util/List;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/components/YAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    const/4 v1, 0x1

    .line 264
    invoke-virtual {v8, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    const/4 v1, -0x1

    .line 265
    invoke-virtual {v8, v1}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    .line 267
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v14

    float-to-int v1, v1

    invoke-virtual {v3, v1}, Lcom/github/mikephil/charting/charts/LineChart;->setMinimumHeight(I)V

    if-eqz v15, :cond_20

    .line 270
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getMaxValue()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaximum(F)V

    :cond_20
    if-eqz v11, :cond_21

    .line 273
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v2, v0

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    :cond_21
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_15

    .line 228
    :cond_22
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;

    .line 229
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getYAxisLabels()Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x0

    .line 228
    invoke-direct {v2, v4, v7, v1, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaysYAxisValueFormatter;-><init>(Ljava/util/List;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v8, v2}, Lcom/github/mikephil/charting/components/YAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 231
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;

    .line 232
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getHourOffset()I

    move-result v2

    int-to-float v2, v2

    const/4 v4, 0x1

    .line 231
    invoke-direct {v1, v7, v2, v4, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/WeekMonthXAxisValueFormatter;-><init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v5, v1}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 235
    sget-object v1, Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;->TOP:Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;

    invoke-virtual {v5, v1}, Lcom/github/mikephil/charting/components/XAxis;->setPosition(Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;)V

    .line 236
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;

    move-object v2, v3

    check-cast v2, Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getAnimator()Lcom/github/mikephil/charting/animation/ChartAnimator;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getViewPortHandler()Lcom/github/mikephil/charting/utils/ViewPortHandler;

    move-result-object v5

    invoke-direct {v1, v2, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/CubicLineLegendRenderer;-><init>(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V

    check-cast v1, Lcom/github/mikephil/charting/renderer/DataRenderer;

    invoke-virtual {v3, v1}, Lcom/github/mikephil/charting/charts/LineChart;->setRenderer(Lcom/github/mikephil/charting/renderer/DataRenderer;)V

    .line 237
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v8, v1, v2}, Lcom/github/mikephil/charting/components/YAxis;->setLabelCount(IZ)V

    .line 238
    invoke-virtual {v8, v2}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    const/4 v1, -0x1

    .line 239
    invoke-virtual {v8, v1}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    const v1, 0x3e99999a    # 0.3f

    .line 240
    invoke-virtual {v8, v1}, Lcom/github/mikephil/charting/components/YAxis;->setGridLineWidth(F)V

    .line 241
    invoke-virtual {v3, v2}, Lcom/github/mikephil/charting/charts/LineChart;->setVerticalScrollBarEnabled(Z)V

    if-eqz v15, :cond_23

    .line 244
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getMaxValue()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaximum(F)V

    :cond_23
    if-eqz v11, :cond_24

    .line 247
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v2, v0

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    :cond_24
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_15

    :cond_25
    const/4 v2, 0x0

    .line 197
    invoke-virtual {v3, v2, v2, v2, v2}, Lcom/github/mikephil/charting/charts/LineChart;->setExtraOffsets(FFFF)V

    .line 199
    new-instance v2, Landroid/graphics/LinearGradient;

    const/16 v24, 0x0

    const/high16 v25, 0x44480000    # 800.0f

    const/16 v26, 0x0

    const/16 v27, 0x0

    .line 201
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v12, 0x7f050025

    invoke-static {v11, v12}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v28

    .line 202
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v12, 0x7f05001d

    invoke-static {v11, v12}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v29

    .line 203
    sget-object v30, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object/from16 v23, v2

    .line 199
    invoke-direct/range {v23 .. v30}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 205
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getRenderer()Lcom/github/mikephil/charting/renderer/DataRenderer;

    move-result-object v11

    invoke-virtual {v11}, Lcom/github/mikephil/charting/renderer/DataRenderer;->getPaintRender()Landroid/graphics/Paint;

    move-result-object v11

    check-cast v2, Landroid/graphics/Shader;

    invoke-virtual {v11, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    const/4 v2, 0x0

    .line 207
    invoke-virtual {v5, v2}, Lcom/github/mikephil/charting/components/XAxis;->setDrawLabels(Z)V

    .line 208
    invoke-virtual {v5, v2}, Lcom/github/mikephil/charting/components/XAxis;->setEnabled(Z)V

    .line 209
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getEntries()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v11, 0x1

    xor-int/2addr v2, v11

    if-eqz v2, :cond_26

    .line 210
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_26
    const/4 v1, 0x0

    .line 213
    invoke-virtual {v5, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 215
    new-instance v1, Lcom/github/mikephil/charting/components/LimitLine;

    invoke-virtual {v9}, Lcom/github/mikephil/charting/components/YAxis;->getAxisMinimum()F

    move-result v2

    invoke-direct {v1, v2}, Lcom/github/mikephil/charting/components/LimitLine;-><init>(F)V

    const/4 v2, -0x1

    .line 217
    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/components/LimitLine;->setLineColor(I)V

    const v2, -0x777778

    .line 218
    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/components/LimitLine;->setTextColor(I)V

    const/high16 v2, 0x3fc00000    # 1.5f

    .line 219
    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/components/LimitLine;->setLineWidth(F)V

    .line 220
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 215
    invoke-virtual {v9, v1}, Lcom/github/mikephil/charting/components/YAxis;->addLimitLine(Lcom/github/mikephil/charting/components/LimitLine;)V

    .line 222
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->chartContainer:Landroid/widget/LinearLayout;

    if-nez v1, :cond_27

    goto :goto_15

    :cond_27
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v2, 0x7f05004a

    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 279
    :goto_15
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/LineChart;->getViewPortHandler()Lcom/github/mikephil/charting/utils/ViewPortHandler;

    move-result-object v1

    const-string v2, "chart.viewPortHandler"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "yAxisRight"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Lcom/github/mikephil/charting/components/YAxis;->getAxisDependency()Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/github/mikephil/charting/charts/LineChart;->getTransformer(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)Lcom/github/mikephil/charting/utils/Transformer;

    move-result-object v2

    const-string v4, "chart.getTransformer(yAxisRight.axisDependency)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v6, v1, v8, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;-><init>(Ljava/util/List;Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V

    check-cast v0, Lcom/github/mikephil/charting/renderer/YAxisRenderer;

    .line 278
    invoke-virtual {v3, v0}, Lcom/github/mikephil/charting/charts/LineChart;->setRendererRightYAxis(Lcom/github/mikephil/charting/renderer/YAxisRenderer;)V

    .line 280
    check-cast v10, Lcom/github/mikephil/charting/data/ChartData;

    invoke-virtual {v3, v10}, Lcom/github/mikephil/charting/charts/LineChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 282
    invoke-virtual {v8}, Lcom/github/mikephil/charting/components/YAxis;->getYOffset()F

    goto :goto_16

    :cond_28
    const v18, 0x7f05004a

    const/16 v21, 0x0

    goto/16 :goto_10

    :cond_29
    const/high16 v17, 0x3fc00000    # 1.5f

    const v18, 0x7f05004a

    const/16 v19, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    goto/16 :goto_b

    .line 284
    :cond_2a
    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_16
    const/4 v0, 0x0

    .line 288
    invoke-virtual {v9, v0}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    const/4 v0, 0x1

    .line 291
    invoke-virtual {v3, v0}, Lcom/github/mikephil/charting/charts/LineChart;->setVerticalScrollBarEnabled(Z)V

    .line 294
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getLimitLines()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 621
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    .line 296
    new-instance v2, Lcom/github/mikephil/charting/components/LimitLine;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;->getValue()F

    move-result v4

    invoke-direct {v2, v4}, Lcom/github/mikephil/charting/components/LimitLine;-><init>(F)V

    const v4, -0x777778

    .line 297
    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/components/LimitLine;->setLineColor(I)V

    .line 298
    sget-object v5, Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;->RIGHT_TOP:Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;

    invoke-virtual {v2, v5}, Lcom/github/mikephil/charting/components/LimitLine;->setLabelPosition(Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;)V

    .line 299
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/components/LimitLine;->setLabel(Ljava/lang/String;)V

    const/high16 v1, 0x41200000    # 10.0f

    const/4 v5, 0x0

    .line 300
    invoke-virtual {v2, v1, v1, v5}, Lcom/github/mikephil/charting/components/LimitLine;->enableDashedLine(FFF)V

    const v1, 0x3e99999a    # 0.3f

    .line 301
    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/components/LimitLine;->setLineWidth(F)V

    .line 302
    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/components/LimitLine;->setTextColor(I)V

    const/high16 v6, 0x41400000    # 12.0f

    .line 303
    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/LimitLine;->setTextSize(F)V

    .line 304
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 296
    invoke-virtual {v8, v2}, Lcom/github/mikephil/charting/components/YAxis;->addLimitLine(Lcom/github/mikephil/charting/components/LimitLine;)V

    goto :goto_17

    .line 307
    :cond_2b
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$rEiA4rGSGxcReeMhWi9snOLFPAA;

    move-object/from16 v1, p2

    invoke-direct {v0, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$rEiA4rGSGxcReeMhWi9snOLFPAA;-><init>(Lcom/github/mikephil/charting/charts/LineChart;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V

    invoke-virtual {v3, v0}, Lcom/github/mikephil/charting/charts/LineChart;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final init$lambda-18$lambda-17(Lcom/github/mikephil/charting/charts/LineChart;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V
    .locals 1

    const-string v0, "$config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->invalidate()V

    .line 309
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;->getPerformAnimation()Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1f4

    .line 310
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingOption;->EaseOutBack:Lcom/github/mikephil/charting/animation/Easing$EasingOption;

    invoke-virtual {p0, p1, v0}, Lcom/github/mikephil/charting/charts/LineChart;->animateY(ILcom/github/mikephil/charting/animation/Easing$EasingOption;)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$0yIZylhKtPfi0WksjCmYNUrvjBU(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$rEiA4rGSGxcReeMhWi9snOLFPAA(Lcom/github/mikephil/charting/charts/LineChart;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->init$lambda-18$lambda-17(Lcom/github/mikephil/charting/charts/LineChart;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V

    return-void
.end method

.method public static synthetic lambda$sL-ta6aisOAGCJhMMKtrcQI6pF0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->init$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getRxBus()Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/SleepChartClicked;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/SleepChartClicked;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public bridge synthetic init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Landroid/view/View;)V
    .locals 0

    .line 64
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;Landroid/view/View;)V

    return-void
.end method

.method protected init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;Landroid/view/View;)V
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 100
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$sL-ta6aisOAGCJhMMKtrcQI6pF0;

    invoke-direct {v1, p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$sL-ta6aisOAGCJhMMKtrcQI6pF0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0b0051

    const/4 v0, 0x0

    .line 80
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 82
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string p3, "cubicLineChartConfig"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    :goto_0
    const p3, 0x7f080151

    .line 84
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/github/mikephil/charting/charts/LineChart;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const p3, 0x7f0800b2

    .line 86
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/LinearLayout;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->chartContainer:Landroid/widget/LinearLayout;

    .line 88
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$0yIZylhKtPfi0WksjCmYNUrvjBU;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$0yIZylhKtPfi0WksjCmYNUrvjBU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;)V

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p2, :cond_1

    .line 92
    invoke-virtual {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;Landroid/view/View;)V

    :cond_1
    return-object p1
.end method

.method public setConfig(Ljava/lang/Object;)V
    .locals 3

    .line 320
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    if-eqz v0, :cond_2

    .line 322
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 323
    :cond_0
    move-object v1, p1

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "cubicLineChartConfig"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 325
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 326
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 327
    move-object v1, p1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    invoke-virtual {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;Landroid/view/View;)V

    .line 329
    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    return-void

    .line 320
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong config type for cubic line chart provided!!!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
