.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "ActivityHeartRateChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentHeartRateChartBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0008\u0010\u0016\u001a\u00020\rH\u0014J\u0008\u0010\u0017\u001a\u00020\u0003H\u0014J\u0008\u0010\u0018\u001a\u00020\rH\u0014J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\""
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentHeartRateChartBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;",
        "()V",
        "activityHeartRateViewModel",
        "getActivityHeartRateViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;",
        "activityHeartRateViewModel$delegate",
        "Lkotlin/Lazy;",
        "heartRateChart",
        "Lcom/github/mikephil/charting/charts/LineChart;",
        "limitLineColor",
        "",
        "getLimitLineColor",
        "()I",
        "setLimitLineColor",
        "(I)V",
        "calculateLabelCount",
        "",
        "xAxis",
        "Lcom/github/mikephil/charting/components/XAxis;",
        "getBindingVariable",
        "getViewModel",
        "layoutRes",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;


# instance fields
.field private final activityHeartRateViewModel$delegate:Lkotlin/Lazy;

.field private heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

.field private limitLineColor:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 34
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 36
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$activityHeartRateViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$activityHeartRateViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->activityHeartRateViewModel$delegate:Lkotlin/Lazy;

    const/high16 v0, -0x10000

    .line 48
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->limitLineColor:I

    return-void
.end method

.method public static final synthetic access$calculateLabelCount(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Lcom/github/mikephil/charting/components/XAxis;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->calculateLabelCount(Lcom/github/mikephil/charting/components/XAxis;)V

    return-void
.end method

.method public static final synthetic access$getActivityHeartRateViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;
    .locals 0

    .line 34
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getHeartRateChart$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)Lcom/github/mikephil/charting/charts/LineChart;
    .locals 0

    .line 34
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    return-object p0
.end method

.method private final calculateLabelCount(Lcom/github/mikephil/charting/components/XAxis;)V
    .locals 5

    .line 191
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->getLinesData()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 192
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const/4 v4, 0x5

    if-eqz v1, :cond_2

    :goto_2
    const/4 v0, 0x5

    goto :goto_3

    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/LineDataSet;->getValues()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_3
    if-le v0, v4, :cond_4

    goto :goto_4

    :cond_4
    move v4, v0

    .line 194
    :goto_4
    invoke-virtual {p1, v4, v3}, Lcom/github/mikephil/charting/components/XAxis;->setLabelCount(IZ)V

    return-void
.end method

.method private final getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;
    .locals 1

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->activityHeartRateViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    return-object v0
.end method

.method public static synthetic lambda$11uAHP2tQROkYgXNEQOi_ua8Qa4(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$lbwi2YjbpgYUCd-pkE6MCdw5KJU(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->invalidate()V

    return-void

    :cond_0
    const-string p0, "heartRateChart"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->onChartClicked()V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getLimitLineColor()I
    .locals 1

    .line 48
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->limitLineColor:I

    return v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;
    .locals 1

    .line 40
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v0

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0061

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->setRootView(Landroid/view/View;)V

    .line 55
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getViewDataBinding()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentHeartRateChartBinding;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentHeartRateChartBinding;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string p2, "viewDataBinding.heartRateChart"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string p2, "heartRateChart"

    const/4 p3, 0x0

    if-eqz p1, :cond_c

    .line 59
    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/LineChart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object p1

    const/high16 v0, 0x41300000    # 11.0f

    .line 60
    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/components/XAxis;->setTextSize(F)V

    const/4 v0, 0x1

    .line 61
    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/components/XAxis;->setAvoidFirstLastClipping(Z)V

    const/4 v1, -0x1

    .line 62
    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/components/XAxis;->setTextColor(I)V

    const/4 v1, 0x0

    .line 63
    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawGridLines(Z)V

    .line 64
    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/components/XAxis;->setDrawAxisLine(Z)V

    .line 65
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/TimeValueFormatter;

    invoke-direct {v2, p3, v0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/TimeValueFormatter;-><init>(Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {p1, v2}, Lcom/github/mikephil/charting/components/XAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    const-string v2, "xAxis"

    .line 66
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->calculateLabelCount(Lcom/github/mikephil/charting/components/XAxis;)V

    .line 67
    sget-object v2, Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;->BOTTOM:Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;

    invoke-virtual {p1, v2}, Lcom/github/mikephil/charting/components/XAxis;->setPosition(Lcom/github/mikephil/charting/components/XAxis$XAxisPosition;)V

    .line 69
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v3, 0x7f05001b

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->limitLineColor:I

    .line 72
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    .line 73
    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawGridLines(Z)V

    const/high16 v3, 0x41200000    # 10.0f

    const/4 v4, 0x0

    .line 74
    invoke-virtual {v2, v3, v3, v4}, Lcom/github/mikephil/charting/components/YAxis;->enableGridDashedLine(FFF)V

    const/4 v5, 0x5

    .line 75
    invoke-virtual {v2, v5, v0}, Lcom/github/mikephil/charting/components/YAxis;->setLabelCount(IZ)V

    .line 76
    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 77
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/high16 v7, 0x1060000

    invoke-static {v6, v7}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    .line 78
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ElevationValueFormatter;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v8

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->getUserPrefsUtils()Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    move-result-object v8

    const/4 v9, 0x2

    invoke-direct {v6, v8, p3, v9, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ElevationValueFormatter;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v6, Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;

    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setValueFormatter(Lcom/github/mikephil/charting/formatter/IAxisValueFormatter;)V

    .line 79
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v2, v6}, Lcom/github/mikephil/charting/components/YAxis;->setTypeface(Landroid/graphics/Typeface;)V

    .line 82
    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v6, :cond_a

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/LineChart;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    const/high16 v8, -0x10000

    .line 83
    invoke-virtual {v6, v8}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    .line 84
    invoke-virtual {v6, v3, v3, v4}, Lcom/github/mikephil/charting/components/YAxis;->enableGridDashedLine(FFF)V

    .line 85
    invoke-virtual {v6, v5, v0}, Lcom/github/mikephil/charting/components/YAxis;->setLabelCount(IZ)V

    .line 86
    invoke-virtual {v6, v1}, Lcom/github/mikephil/charting/components/YAxis;->setDrawAxisLine(Z)V

    .line 87
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v6, v0}, Lcom/github/mikephil/charting/components/YAxis;->setTypeface(Landroid/graphics/Typeface;)V

    .line 88
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, v7}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/github/mikephil/charting/components/YAxis;->setTextColor(I)V

    .line 90
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/LineChart;->getDescription()Lcom/github/mikephil/charting/components/Description;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/Description;->setEnabled(Z)V

    .line 91
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/LineChart;->setScaleEnabled(Z)V

    .line 92
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v0, :cond_7

    const/high16 v3, 0x41f00000    # 30.0f

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/LineChart;->setExtraTopOffset(F)V

    .line 93
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/LineChart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/Legend;->setEnabled(Z)V

    .line 94
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v0, :cond_5

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/LineChart;->setClickable(Z)V

    .line 98
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->getLinesData()Landroidx/databinding/ObservableField;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$1;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Lcom/github/mikephil/charting/components/XAxis;)V

    check-cast v1, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 104
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->getLimitLinePosition()Landroidx/databinding/ObservableField;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Lcom/github/mikephil/charting/components/XAxis;)V

    check-cast v1, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 129
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getActivityHeartRateViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->onCreateView(Landroid/content/Context;)V

    .line 131
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v0, :cond_4

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/LineChart;->getViewPortHandler()Lcom/github/mikephil/charting/utils/ViewPortHandler;

    move-result-object v1

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/components/YAxis;->getAxisDependency()Lcom/github/mikephil/charting/components/YAxis$AxisDependency;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/github/mikephil/charting/charts/LineChart;->getTransformer(Lcom/github/mikephil/charting/components/YAxis$AxisDependency;)Lcom/github/mikephil/charting/utils/Transformer;

    move-result-object v2

    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$3;

    invoke-direct {v3, p1, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$3;-><init>(Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/utils/Transformer;)V

    check-cast v3, Lcom/github/mikephil/charting/renderer/XAxisRenderer;

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/LineChart;->setXAxisRenderer(Lcom/github/mikephil/charting/renderer/XAxisRenderer;)V

    .line 179
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz p1, :cond_1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/-$$Lambda$ActivityHeartRateChartFragment$lbwi2YjbpgYUCd-pkE6MCdw5KJU;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/-$$Lambda$ActivityHeartRateChartFragment$lbwi2YjbpgYUCd-pkE6MCdw5KJU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)V

    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/charts/LineChart;->post(Ljava/lang/Runnable;)Z

    .line 183
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->heartRateChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz p1, :cond_0

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/-$$Lambda$ActivityHeartRateChartFragment$11uAHP2tQROkYgXNEQOi_ua8Qa4;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/-$$Lambda$ActivityHeartRateChartFragment$11uAHP2tQROkYgXNEQOi_ua8Qa4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)V

    invoke-virtual {p1, p2}, Lcom/github/mikephil/charting/charts/LineChart;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 186
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 183
    :cond_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 179
    :cond_1
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 131
    :cond_2
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    :cond_3
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    :cond_4
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 94
    :cond_5
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 93
    :cond_6
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 92
    :cond_7
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 91
    :cond_8
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 90
    :cond_9
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 82
    :cond_a
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 72
    :cond_b
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 59
    :cond_c
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3
.end method

.method public final setLimitLineColor(I)V
    .locals 0

    .line 48
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->limitLineColor:I

    return-void
.end method
