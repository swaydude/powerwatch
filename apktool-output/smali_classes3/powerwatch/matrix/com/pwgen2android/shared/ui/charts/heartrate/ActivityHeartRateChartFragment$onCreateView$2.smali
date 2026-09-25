.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "ActivityHeartRateChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2",
        "Landroidx/databinding/Observable$OnPropertyChangedCallback;",
        "onPropertyChanged",
        "",
        "sender",
        "Landroidx/databinding/Observable;",
        "propertyId",
        "",
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
.field final synthetic $xAxis:Lcom/github/mikephil/charting/components/XAxis;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Lcom/github/mikephil/charting/components/XAxis;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2;->$xAxis:Lcom/github/mikephil/charting/components/XAxis;

    .line 104
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method

.method public static synthetic lambda$Acmp1SAQpMqU14eJDkYAJaiXdvQ(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Lcom/github/mikephil/charting/components/XAxis;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2;->onPropertyChanged$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Lcom/github/mikephil/charting/components/XAxis;)V

    return-void
.end method

.method private static final onPropertyChanged$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Lcom/github/mikephil/charting/components/XAxis;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    new-instance v0, Lcom/github/mikephil/charting/components/LimitLine;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->access$getActivityHeartRateViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->getLimitLinePosition()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-direct {v0, v1}, Lcom/github/mikephil/charting/components/LimitLine;-><init>(F)V

    .line 110
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->access$getActivityHeartRateViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->getLimitLinePosition()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v2, "setting_value: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 112
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->access$getActivityHeartRateViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;->getLimitLinePosition()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/LimitLine;->setLabel(Ljava/lang/String;)V

    .line 113
    sget-object v1, Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;->RIGHT_TOP:Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/LimitLine;->setLabelPosition(Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;)V

    .line 114
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->getLimitLineColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/LimitLine;->setLineColor(I)V

    const/4 v1, -0x1

    .line 115
    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/LimitLine;->setTextColor(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 116
    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/components/LimitLine;->setLineWidth(F)V

    .line 119
    invoke-virtual {p1}, Lcom/github/mikephil/charting/components/XAxis;->getLimitLines()Ljava/util/List;

    move-result-object v1

    const-string v2, "xAxis.limitLines"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    .line 120
    invoke-virtual {p1}, Lcom/github/mikephil/charting/components/XAxis;->getLimitLines()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/components/XAxis;->addLimitLine(Lcom/github/mikephil/charting/components/LimitLine;)V

    .line 124
    :goto_0
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;->access$getHeartRateChart$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;)Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/LineChart;->invalidate()V

    return-void

    :cond_1
    const-string p0, "heartRateChart"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 2

    .line 107
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment$onCreateView$2;->$xAxis:Lcom/github/mikephil/charting/components/XAxis;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/-$$Lambda$ActivityHeartRateChartFragment$onCreateView$2$Acmp1SAQpMqU14eJDkYAJaiXdvQ;

    invoke-direct {v1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/-$$Lambda$ActivityHeartRateChartFragment$onCreateView$2$Acmp1SAQpMqU14eJDkYAJaiXdvQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateChartFragment;Lcom/github/mikephil/charting/components/XAxis;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
