.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "RealTimeFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRealTimeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,103:1\n54#2,3:104\n*S KotlinDebug\n*F\n+ 1 RealTimeFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment\n*L\n25#1:104,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u000f\u001a\u00020\u0010H\u0014J\u0008\u0010\u0011\u001a\u00020\u0003H\u0014J\u0008\u0010\u0012\u001a\u00020\u0010H\u0014J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0008\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;",
        "()V",
        "caloriesCircle",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;",
        "powerCircle",
        "realTimeViewModel",
        "getRealTimeViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;",
        "realTimeViewModel$delegate",
        "Lkotlin/Lazy;",
        "sleepCircle",
        "stepsCircle",
        "getBindingVariable",
        "",
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
        "setRealtimeData",
        "",
        "realTimeData",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$Companion;


# instance fields
.field private caloriesCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

.field private powerCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

.field private final realTimeViewModel$delegate:Lkotlin/Lazy;

.field private sleepCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

.field private stepsCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 25
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 25
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$realTimeViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$realTimeViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 104
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 106
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 25
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->realTimeViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getRealTimeViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;
    .locals 0

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->getRealTimeViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setRealtimeData(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->setRealtimeData(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V

    return-void
.end method

.method private final getRealTimeViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;
    .locals 1

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->realTimeViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;

    move-result-object v0

    return-object v0
.end method

.method private final setRealtimeData(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V
    .locals 7

    if-eqz p1, :cond_8

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->powerCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const-string v1, "powerCircle"

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSolarPower()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v3

    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setMaxValue(F)V

    .line 76
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getBodyPower()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v0

    float-to-double v3, v0

    .line 77
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSolarPower()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v0

    float-to-double v5, v0

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->powerCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    if-eqz v0, :cond_6

    new-instance v1, Lkotlin/Pair;

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setDoubleCurrentValue(Lkotlin/Pair;)V

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->stepsCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const-string v1, "stepsCircle"

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getStepsData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v3

    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setMaxValue(F)V

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->stepsCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getStepsData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    float-to-double v3, v1

    invoke-virtual {v0, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setCurrentValue(D)V

    .line 84
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->caloriesCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const-string v1, "caloriesCircle"

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getCaloriesData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v3

    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setMaxValue(F)V

    .line 85
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->caloriesCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getCaloriesData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v1

    float-to-double v3, v1

    invoke-virtual {v0, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setCurrentValue(D)V

    .line 87
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->sleepCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const-string v1, "sleepCircle"

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSleepData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v3

    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setMaxValue(F)V

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->sleepCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSleepData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result p1

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setCurrentValue(D)V

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    .line 87
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    .line 85
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    .line 84
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    .line 82
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    .line 81
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    .line 79
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    .line 75
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    :cond_8
    :goto_0
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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;
    .locals 1

    .line 38
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->getRealTimeViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0073

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    const p2, 0x7f08022c

    .line 52
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p3, "view.findViewById(R.id.steps_circle)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->stepsCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const p2, 0x7f0800a3

    .line 53
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p3, "view.findViewById(R.id.calories_circle)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->caloriesCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const p2, 0x7f080206

    .line 54
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p3, "view.findViewById(R.id.sleep_circle)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->sleepCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    .line 55
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->main_inner_circle:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const-string p2, "view.main_inner_circle"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->powerCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    .line 58
    :cond_0
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->getRealTimeViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getDataField()Landroidx/databinding/ObservableField;

    move-result-object p1

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$onCreateView$1;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;)V

    check-cast p2, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p1, p2}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 67
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->getRealTimeViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    move-result-object p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->onCreateView(Landroid/content/Context;)V

    .line 69
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
