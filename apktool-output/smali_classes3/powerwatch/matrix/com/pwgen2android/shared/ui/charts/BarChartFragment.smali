.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;
.source "BarChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBarChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n764#2:316\n855#2,2:317\n1547#2:319\n1618#2,2:320\n1547#2:322\n1618#2,3:323\n1620#2:326\n764#2:327\n855#2,2:328\n1557#2:330\n1588#2,3:331\n1547#2:334\n1618#2,3:335\n1591#2:338\n1849#2,2:339\n1849#2,2:341\n1849#2,2:343\n*S KotlinDebug\n*F\n+ 1 BarChartFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment\n*L\n127#1:316\n127#1:317,2\n128#1:319\n128#1:320,2\n129#1:322\n129#1:323,3\n128#1:326\n143#1:327\n143#1:328,2\n144#1:330\n144#1:331,3\n145#1:334\n145#1:335,3\n144#1:338\n163#1:339,2\n193#1:341,2\n229#1:343,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;",
        "()V",
        "barChart",
        "Lcom/github/mikephil/charting/charts/BarChart;",
        "currentConfig",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;


# instance fields
.field private barChart:Lcom/github/mikephil/charting/charts/BarChart;

.field private currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;-><init>()V

    return-void
.end method

.method private static final init$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;)V
    .locals 42

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$config"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 92
    :cond_0
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-eqz v1, :cond_20

    const/4 v3, 0x0

    .line 97
    invoke-virtual {v1, v3, v3, v3, v3}, Lcom/github/mikephil/charting/charts/BarChart;->setExtraOffsets(FFFF)V

    const/4 v4, 0x1

    .line 98
    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/charts/BarChart;->setAutoScaleMinMaxEnabled(Z)V

    .line 99
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getDescription()Lcom/github/mikephil/charting/components/Description;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lcom/github/mikephil/charting/components/Description;->setEnabled(Z)V

    .line 100
    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    .line 102
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 104
    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;->hideBackgroundGridLines(Lcom/github/mikephil/charting/charts/BarChart;)V

    .line 105
    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ChartExtensionsKt;->removeTouch(Lcom/github/mikephil/charting/charts/BarChart;)V

    .line 106
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v7, 0x7f0f013e

    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/github/mikephil/charting/charts/BarChart;->setNoDataText(Ljava/lang/String;)V

    .line 107
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v5

    .line 111
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v7

    .line 112
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v8

    const/high16 v9, 0x40a00000    # 5.0f

    const/high16 v10, 0x41400000    # 12.0f

    .line 113
    invoke-virtual {v8, v10, v9, v3}, Lcom/github/mikephil/charting/components/YAxis;->enableGridDashedLine(FFF)V

    const/4 v9, -0x1

    .line 116
    invoke-virtual {v5, v9}, Lcom/github/mikephil/charting/components/XAxis;->setTextColor(I)V

    .line 117
    sget-object v11, Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;->BOTTOM:Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;

    invoke-virtual {v5, v11}, Lcom/github/mikephil/charting/components/XAxis;->setPosition(Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;)V

    .line 123
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getBarEntries()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    const-string v12, ""

    const/16 v14, 0xa

    if-lez v11, :cond_e

    const v15, 0x7f050105

    if-ne v11, v4, :cond_7

    .line 126
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getBarEntries()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .line 316
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v10, v16

    check-cast v10, Ljava/util/Collection;

    .line 317
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v17, v9

    check-cast v17, Ljava/util/List;

    .line 127
    check-cast v17, Ljava/util/Collection;

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v17

    xor-int/lit8 v17, v17, 0x1

    if-eqz v17, :cond_1

    invoke-interface {v10, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 v9, -0x1

    goto :goto_0

    .line 318
    :cond_2
    check-cast v10, Ljava/util/List;

    .line 316
    check-cast v10, Ljava/lang/Iterable;

    .line 319
    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .line 320
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 321
    check-cast v11, Ljava/util/List;

    .line 129
    move-object v13, v11

    check-cast v13, Ljava/lang/Iterable;

    .line 322
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v13, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 323
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 324
    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    .line 129
    invoke-virtual {v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;->createBarEntry()Lcom/github/mikephil/charting/data/BarEntry;

    move-result-object v13

    invoke-interface {v3, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 325
    :cond_3
    check-cast v3, Ljava/util/List;

    .line 130
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    if-nez v4, :cond_4

    const/4 v4, 0x0

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;->createBarEntry()Lcom/github/mikephil/charting/data/BarEntry;

    move-result-object v4

    :goto_3
    if-eqz v4, :cond_5

    .line 131
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/BarEntry;->isStacked()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 132
    new-instance v4, Lcom/github/mikephil/charting/data/BarDataSet;

    invoke-direct {v4, v3, v12}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/4 v3, 0x2

    new-array v3, v3, [I

    .line 133
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v11, v15}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v11

    aput v11, v3, v6

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v13, 0x7f050106

    invoke-static {v11, v13}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v11

    const/4 v13, 0x1

    aput v11, v3, v13

    invoke-virtual {v4, v3}, Lcom/github/mikephil/charting/data/BarDataSet;->setColors([I)V

    goto :goto_4

    .line 136
    :cond_5
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getMultipleColors()Z

    move-result v20

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getContext()Landroid/content/Context;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getGoalThreshold()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    move-result-object v11

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMin()I

    move-result v23

    .line 137
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getGoalThreshold()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    move-result-object v11

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->getMax()I

    move-result v24

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getBarColors()Ljava/util/List;

    move-result-object v25

    move-object/from16 v19, v4

    move-object/from16 v22, v3

    .line 136
    invoke-direct/range {v19 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalsBarDataSet;-><init>(ZLandroid/content/Context;Ljava/util/List;IILjava/util/List;)V

    check-cast v4, Lcom/github/mikephil/charting/data/BarDataSet;

    .line 131
    :goto_4
    invoke-interface {v9, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    goto/16 :goto_1

    .line 326
    :cond_6
    check-cast v9, Ljava/util/List;

    goto/16 :goto_9

    .line 142
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getBarEntries()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 327
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 328
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/util/List;

    .line 143
    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    const/4 v11, 0x1

    xor-int/2addr v10, v11

    if-eqz v10, :cond_8

    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 329
    :cond_9
    check-cast v4, Ljava/util/List;

    .line 327
    check-cast v4, Ljava/lang/Iterable;

    .line 330
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v4, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 332
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v9, 0x0

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v9, 0x1

    if-gez v9, :cond_a

    .line 333
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_a
    check-cast v10, Ljava/util/List;

    .line 145
    check-cast v10, Ljava/lang/Iterable;

    .line 334
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v13, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .line 335
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 336
    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    .line 145
    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;->createBarEntry()Lcom/github/mikephil/charting/data/BarEntry;

    move-result-object v10

    invoke-interface {v13, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 337
    :cond_b
    check-cast v13, Ljava/util/List;

    .line 146
    new-instance v6, Lcom/github/mikephil/charting/data/BarDataSet;

    invoke-direct {v6, v13, v12}, Lcom/github/mikephil/charting/data/BarDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 148
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getBarColors()Ljava/util/List;

    move-result-object v13

    if-ltz v9, :cond_c

    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v14

    if-gt v9, v14, :cond_c

    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    goto :goto_8

    .line 149
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v9, v15}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 148
    :goto_8
    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-static {v10, v9}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/github/mikephil/charting/data/BarDataSet;->setColor(I)V

    .line 150
    sget-object v9, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 147
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v9, v11

    const/4 v6, 0x0

    const/16 v14, 0xa

    goto :goto_6

    .line 338
    :cond_d
    move-object v9, v3

    check-cast v9, Ljava/util/List;

    .line 153
    :goto_9
    new-instance v3, Lcom/github/mikephil/charting/data/BarData;

    invoke-direct {v3, v9}, Lcom/github/mikephil/charting/data/BarData;-><init>(Ljava/util/List;)V

    goto :goto_a

    :cond_e
    const/4 v3, 0x0

    :goto_a
    const/4 v4, 0x0

    .line 156
    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    if-eqz v3, :cond_10

    const v4, 0x3f6e147b    # 0.93f

    .line 160
    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/data/BarData;->setBarWidth(F)V

    const/4 v4, 0x0

    .line 161
    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/data/BarData;->setHighlightEnabled(Z)V

    .line 162
    move-object v4, v3

    check-cast v4, Lcom/github/mikephil/charting/data/ChartData;

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/charts/BarChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 163
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object v4

    check-cast v4, Lcom/github/mikephil/charting/data/BarData;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/BarData;->getDataSets()Ljava/util/List;

    move-result-object v4

    const-string v6, "chart.data.dataSets"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    .line 339
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;

    const/4 v9, 0x0

    .line 164
    invoke-interface {v6, v9}, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;->setDrawValues(Z)V

    goto :goto_b

    .line 166
    :cond_f
    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/BarData;->getDataSets()Ljava/util/List;

    move-result-object v4

    const-string v6, "barData.dataSets"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;

    invoke-interface {v4}, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;->getEntryCount()I

    move-result v4

    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/XAxis;->setLabelCount(I)V

    .line 169
    :cond_10
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getYLinesEnabled()Z

    move-result v4

    const v6, 0x3e99999a    # 0.3f

    const v9, -0x777778

    if-eqz v4, :cond_11

    const/4 v4, 0x1

    .line 171
    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    .line 172
    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/components/YAxis;->setEnabled(Z)V

    const/4 v10, 0x4

    .line 173
    invoke-virtual {v8, v10}, Lcom/github/mikephil/charting/components/YAxis;->setLabelCount(I)V

    .line 174
    invoke-virtual {v8, v9}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    .line 175
    invoke-virtual {v8, v9}, Lcom/github/mikephil/charting/components/YAxis;->setGridColor(I)V

    .line 176
    invoke-virtual {v8, v6}, Lcom/github/mikephil/charting/components/YAxis;->setGridLineWidth(F)V

    .line 177
    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLabels(Z)V

    .line 178
    invoke-virtual {v8, v4}, Lcom/github/mikephil/charting/components/YAxis;->setDrawLimitLinesBehindData(Z)V

    .line 179
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 181
    :cond_11
    move-object v4, v3

    check-cast v4, Lcom/github/mikephil/charting/data/ChartData;

    invoke-virtual {v1, v4}, Lcom/github/mikephil/charting/charts/BarChart;->setData(Lcom/github/mikephil/charting/data/ChartData;)V

    .line 183
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getMode()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    move-result-object v4

    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const/high16 v11, 0x3f400000    # 0.75f

    if-ne v4, v10, :cond_13

    .line 185
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v4

    .line 186
    new-instance v5, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    const-string v18, "12A"

    const-string v19, ""

    const-string v20, ""

    const-string v21, "3"

    const-string v22, ""

    const-string v23, ""

    const-string v24, "6"

    const-string v25, ""

    const-string v26, ""

    const-string v27, "9"

    const-string v28, ""

    const-string v29, ""

    const-string v30, "12P"

    const-string v31, ""

    const-string v32, ""

    const-string v33, "3"

    const-string v34, ""

    const-string v35, ""

    const-string v36, "6"

    const-string v37, ""

    const-string v38, ""

    const-string v39, "9"

    const-string v40, ""

    const-string v41, ""

    .line 187
    filled-new-array/range {v18 .. v41}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    .line 186
    invoke-direct {v5, v6}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    check-cast v5, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    .line 185
    invoke-virtual {v4, v5}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    if-nez v3, :cond_12

    goto/16 :goto_12

    .line 188
    :cond_12
    invoke-virtual {v3, v11}, Lcom/github/mikephil/charting/data/BarData;->setBarWidth(F)V

    goto/16 :goto_12

    .line 190
    :cond_13
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getMode()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    move-result-object v4

    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    if-ne v4, v10, :cond_17

    .line 192
    new-instance v3, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    new-instance v4, Ljava/text/DateFormatSymbols;

    invoke-direct {v4}, Ljava/text/DateFormatSymbols;-><init>()V

    const/4 v6, 0x0

    const/4 v10, 0x1

    invoke-static {v4, v6, v10, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->weekDaysByLocale$default(Ljava/text/DateFormatSymbols;Ljava/util/Locale;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-direct {v3, v4}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    check-cast v3, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v5, v3}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 193
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object v3

    check-cast v3, Lcom/github/mikephil/charting/data/BarData;

    if-nez v3, :cond_14

    goto/16 :goto_12

    :cond_14
    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/BarData;->getDataSets()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_15

    goto/16 :goto_12

    :cond_15
    check-cast v3, Ljava/lang/Iterable;

    .line 341
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;

    const/4 v5, 0x1

    .line 194
    invoke-interface {v4, v5}, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;->setDrawValues(Z)V

    const/high16 v5, 0x41200000    # 10.0f

    .line 195
    invoke-interface {v4, v5}, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;->setValueTextSize(F)V

    const/4 v5, -0x1

    .line 196
    invoke-interface {v4, v5}, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;->setValueTextColor(I)V

    goto :goto_c

    .line 342
    :cond_16
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_12

    .line 200
    :cond_17
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 201
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object v5

    if-eqz v5, :cond_1c

    .line 202
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getData()Lcom/github/mikephil/charting/data/ChartData;

    move-result-object v5

    check-cast v5, Lcom/github/mikephil/charting/data/BarData;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/BarData;->getDataSets()Ljava/util/List;

    move-result-object v5

    const/4 v10, 0x0

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;

    invoke-interface {v5}, Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;->getEntryCount()I

    move-result v5

    const/4 v10, 0x1

    if-gt v10, v5, :cond_1c

    :goto_d
    add-int/lit8 v13, v10, 0x1

    const/4 v14, 0x3

    if-eq v10, v14, :cond_19

    const/16 v14, 0xa

    if-eq v10, v14, :cond_1a

    const/16 v15, 0x11

    if-eq v10, v15, :cond_1a

    const/16 v15, 0x18

    if-ne v10, v15, :cond_18

    goto :goto_e

    :cond_18
    move-object v15, v12

    goto :goto_f

    :cond_19
    const/16 v14, 0xa

    .line 203
    :cond_1a
    :goto_e
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v15

    .line 204
    :goto_f
    invoke-interface {v4, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ne v10, v5, :cond_1b

    goto :goto_10

    :cond_1b
    move v10, v13

    goto :goto_d

    .line 207
    :cond_1c
    :goto_10
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v5

    new-instance v10, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;

    check-cast v4, Ljava/util/Collection;

    invoke-direct {v10, v4}, Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;-><init>(Ljava/util/Collection;)V

    check-cast v10, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v5, v10}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    if-nez v3, :cond_1d

    goto :goto_11

    .line 208
    :cond_1d
    invoke-virtual {v3, v11}, Lcom/github/mikephil/charting/data/BarData;->setBarWidth(F)V

    .line 209
    :goto_11
    invoke-virtual {v8, v6}, Lcom/github/mikephil/charting/components/YAxis;->setGridLineWidth(F)V

    .line 213
    :goto_12
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getYMaxValue()F

    move-result v3

    const v4, 0x3f88f5c3    # 1.07f

    mul-float v3, v3, v4

    invoke-virtual {v7, v3}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaximum(F)V

    .line 214
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getYMaxValue()F

    move-result v3

    mul-float v3, v3, v4

    invoke-virtual {v8, v3}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMaximum(F)V

    const/4 v3, 0x0

    .line 215
    invoke-virtual {v7, v3}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    .line 216
    invoke-virtual {v8, v3}, Lcom/github/mikephil/charting/components/YAxis;->setAxisMinimum(F)V

    .line 218
    invoke-virtual {v7}, Lcom/github/mikephil/charting/components/YAxis;->getLimitLines()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 219
    invoke-virtual {v8}, Lcom/github/mikephil/charting/components/YAxis;->getLimitLines()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 222
    new-instance v3, Lcom/github/mikephil/charting/components/LimitLine;

    invoke-virtual {v7}, Lcom/github/mikephil/charting/components/YAxis;->getAxisMinimum()F

    move-result v4

    invoke-direct {v3, v4}, Lcom/github/mikephil/charting/components/LimitLine;-><init>(F)V

    const/4 v4, -0x1

    .line 224
    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/components/LimitLine;->setLineColor(I)V

    .line 225
    invoke-virtual {v3, v9}, Lcom/github/mikephil/charting/components/LimitLine;->setTextColor(I)V

    const/high16 v4, 0x3fc00000    # 1.5f

    .line 226
    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/components/LimitLine;->setLineWidth(F)V

    .line 227
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 222
    invoke-virtual {v7, v3}, Lcom/github/mikephil/charting/components/YAxis;->addLimitLine(Lcom/github/mikephil/charting/components/LimitLine;)V

    .line 229
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getLimitLines()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 343
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    .line 231
    new-instance v5, Lcom/github/mikephil/charting/components/LimitLine;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;->getValue()F

    move-result v4

    invoke-direct {v5, v4}, Lcom/github/mikephil/charting/components/LimitLine;-><init>(F)V

    .line 232
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getBarColors()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-nez v6, :cond_1e

    const v6, 0x7f05008a

    goto :goto_14

    :cond_1e
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :goto_14
    invoke-static {v4, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    .line 234
    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/LimitLine;->setLineColor(I)V

    .line 235
    sget-object v6, Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;->RIGHT_TOP:Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;

    invoke-virtual {v5, v6}, Lcom/github/mikephil/charting/components/LimitLine;->setLabelPosition(Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;)V

    .line 236
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v7, 0x7f0f00e1

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/github/mikephil/charting/components/LimitLine;->setLabel(Ljava/lang/String;)V

    const/high16 v6, 0x40000000    # 2.0f

    .line 237
    invoke-virtual {v5, v6}, Lcom/github/mikephil/charting/components/LimitLine;->setLineWidth(F)V

    .line 238
    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/LimitLine;->setTextColor(I)V

    const/high16 v4, 0x41400000    # 12.0f

    .line 239
    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/LimitLine;->setTextSize(F)V

    .line 242
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 231
    invoke-virtual {v8, v5}, Lcom/github/mikephil/charting/components/YAxis;->addLimitLine(Lcom/github/mikephil/charting/components/LimitLine;)V

    goto :goto_13

    .line 245
    :cond_1f
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarChart;->invalidate()V

    .line 246
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getPerformAnimation()Z

    move-result v0

    if-eqz v0, :cond_20

    const/16 v0, 0x1f4

    .line 247
    sget-object v2, Lcom/github/mikephil/charting/animation/Easing$EasingOption;->EaseOutBack:Lcom/github/mikephil/charting/animation/Easing$EasingOption;

    invoke-virtual {v1, v0, v2}, Lcom/github/mikephil/charting/charts/BarChart;->animateY(ILcom/github/mikephil/charting/animation/Easing$EasingOption;)V

    :cond_20
    return-void
.end method

.method public static synthetic lambda$EiiNNfnmNt-6u6guXu4ZWIJ1zEI(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->init$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;)V

    return-void
.end method

.method public static final newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;->newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Landroid/view/View;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 90
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$BarChartFragment$EiiNNfnmNt-6u6guXu4ZWIJ1zEI;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$BarChartFragment$EiiNNfnmNt-6u6guXu4ZWIJ1zEI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Landroid/view/View;)V
    .locals 0

    .line 66
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Landroid/view/View;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0b006f

    const/4 v0, 0x0

    .line 75
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 77
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string p3, "pedometerConfig"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    :goto_0
    const p3, 0x7f080089

    .line 79
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/github/mikephil/charting/charts/BarChart;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-eqz p2, :cond_1

    const-string p3, "rootView"

    .line 82
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Landroid/view/View;)V

    :cond_1
    return-object p1
.end method

.method public setConfig(Ljava/lang/Object;)V
    .locals 3

    .line 255
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    if-eqz v0, :cond_2

    .line 256
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 257
    :cond_0
    move-object v1, p1

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "pedometerConfig"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 260
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 261
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 262
    move-object v1, p1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    invoke-virtual {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->init(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Landroid/view/View;)V

    .line 264
    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->currentConfig:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    return-void

    .line 255
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong config type for bar chart provided!!!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
