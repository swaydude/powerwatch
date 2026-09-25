.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "BasePeriodsChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
        "powerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3",
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
.field final synthetic $rootView:Landroid/view/View;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment<",
            "TVIEWMODE",
            "L;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment<",
            "TVIEWMODE",
            "L;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->$rootView:Landroid/view/View;

    .line 69
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 7

    .line 71
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->getCurrentPeriodsConfiguration()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Triple;

    if-eqz p1, :cond_d

    .line 73
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getFragmentMap$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/HashMap;->isEmpty()Z

    move-result p2

    const v0, 0x7f080133

    if-eqz p2, :cond_5

    .line 74
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->getDayFragmentInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    move-result-object p2

    .line 75
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->getWeekFragmentInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    move-result-object v1

    .line 76
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->getMonthFragmentInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    move-result-object v2

    .line 78
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->$rootView:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    .line 79
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->getCurrentPeriodType()Landroidx/databinding/ObservableField;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 80
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_1

    .line 81
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object p1

    invoke-static {v3, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$fillHeader(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroid/widget/LinearLayout;Ljava/util/List;)V

    goto :goto_0

    .line 83
    :cond_1
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_2

    .line 84
    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object p1

    invoke-static {v3, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$fillHeader(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroid/widget/LinearLayout;Ljava/util/List;)V

    goto :goto_0

    .line 86
    :cond_2
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v5, :cond_3

    .line 87
    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object p1

    invoke-static {v3, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$fillHeader(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroid/widget/LinearLayout;Ljava/util/List;)V

    .line 92
    :cond_3
    :goto_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getFragmentMap$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Ljava/util/HashMap;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getFragmentMap$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Ljava/util/HashMap;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getFragmentMap$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Ljava/util/HashMap;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$PedometerPeriodPagerAdapter;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->getFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getFragmentMap$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Ljava/util/HashMap;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {p1, p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$PedometerPeriodPagerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroidx/fragment/app/FragmentManager;Ljava/util/Map;)V

    .line 96
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getPager$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    move-result-object p2

    if-eqz p2, :cond_4

    check-cast p1, Landroidx/viewpager/widget/PagerAdapter;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    goto/16 :goto_4

    :cond_4
    const-string p1, "pager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 100
    :cond_5
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getFragmentMap$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Ljava/util/HashMap;

    move-result-object p2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    .line 101
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getFragmentMap$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Ljava/util/HashMap;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    .line 102
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getFragmentMap$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Ljava/util/HashMap;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;

    .line 104
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->$rootView:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;

    .line 105
    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$getViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->getCurrentPeriodType()Landroidx/databinding/ObservableField;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 106
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_7

    .line 107
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-interface {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$fillHeader(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroid/widget/LinearLayout;Ljava/util/List;)V

    goto :goto_1

    .line 109
    :cond_7
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_8

    .line 110
    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-interface {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$fillHeader(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroid/widget/LinearLayout;Ljava/util/List;)V

    goto :goto_1

    .line 112
    :cond_8
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->ordinal()I

    move-result v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v5, :cond_9

    .line 113
    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-interface {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;->access$fillHeader(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroid/widget/LinearLayout;Ljava/util/List;)V

    :cond_9
    :goto_1
    if-nez p2, :cond_a

    goto :goto_2

    .line 118
    :cond_a
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;->setConfig(Ljava/lang/Object;)V

    :goto_2
    if-nez v1, :cond_b

    goto :goto_3

    .line 119
    :cond_b
    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;->setConfig(Ljava/lang/Object;)V

    :goto_3
    if-nez v2, :cond_c

    goto :goto_4

    .line 120
    :cond_c
    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;->setConfig(Ljava/lang/Object;)V

    :cond_d
    :goto_4
    return-void
.end method
