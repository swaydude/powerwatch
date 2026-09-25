.class public final Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "SingleGoalEditFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSingleGoalEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleGoalEditFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,127:1\n54#2,3:128\n*S KotlinDebug\n*F\n+ 1 SingleGoalEditFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment\n*L\n50#1:128,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;",
        "()V",
        "singleGoalEditViewModel",
        "getSingleGoalEditViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;",
        "singleGoalEditViewModel$delegate",
        "Lkotlin/Lazy;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

.field private static final GOAL_CONFIG_PARAM:Ljava/lang/String; = "GOAL_CONFIG_PARAM"


# instance fields
.field private final singleGoalEditViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 50
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 48
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 50
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$singleGoalEditViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$singleGoalEditViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 128
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 130
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 50
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->singleGoalEditViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getSingleGoalEditViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;
    .locals 1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->singleGoalEditViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    return-object v0
.end method

.method public static synthetic lambda$4Yt7AbqTrDrtjPdH77wDrBm_Kpw(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$UfNUKVFURGeuSy9clN0EX1krfLk(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$l1IqU7L9f1mc-KfV9ecBfiks1lY(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;)V

    return-void
.end method

.method public static final newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getContext()Landroid/content/Context;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :goto_1
    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getContext()Landroid/content/Context;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "input_method"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 105
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getContext()Landroid/content/Context;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "input_method"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 110
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->onSaveClicked()V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;
    .locals 1

    .line 54
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getSingleGoalEditViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 48
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b007a

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f080165

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const p3, 0x7f0f0060

    .line 64
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.button_save)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 68
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p3

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p3, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 79
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    if-nez p3, :cond_1

    const/4 p3, 0x0

    goto :goto_1

    :cond_1
    const-string v0, "GOAL_CONFIG_PARAM"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    :goto_1
    if-eqz p3, :cond_c

    .line 83
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    move-result-object v0

    .line 84
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    const v0, 0x7f0f019f

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(R.string.steps)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto :goto_2

    .line 85
    :cond_3
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    const v0, 0x7f0f0063

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(R.string.calories_title)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto :goto_2

    .line 86
    :cond_5
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    if-nez p2, :cond_6

    goto :goto_2

    :cond_6
    const v0, 0x7f0f0199

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(R.string.sleep_title)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    goto :goto_2

    .line 87
    :cond_7
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    if-nez p2, :cond_8

    goto :goto_2

    :cond_8
    const v0, 0x7f0f016b

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(R.string.power_title)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 91
    :cond_9
    :goto_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    move-result-object v0

    invoke-virtual {v0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->setConfig(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)V

    const p3, 0x7f080128

    .line 93
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/EditText;

    const/4 v0, 0x1

    .line 95
    invoke-virtual {p3, v0}, Landroid/widget/EditText;->setShowSoftInputOnFocus(Z)V

    .line 96
    invoke-virtual {p3, v0}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 97
    invoke-virtual {p3, v0}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 98
    invoke-virtual {p3}, Landroid/widget/EditText;->requestFocus()Z

    .line 99
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditFragment$l1IqU7L9f1mc-KfV9ecBfiks1lY;

    invoke-direct {v1, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditFragment$l1IqU7L9f1mc-KfV9ecBfiks1lY;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    if-nez p2, :cond_a

    goto :goto_3

    .line 103
    :cond_a
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditFragment$4Yt7AbqTrDrtjPdH77wDrBm_Kpw;

    invoke-direct {v0, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditFragment$4Yt7AbqTrDrtjPdH77wDrBm_Kpw;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;)V

    invoke-static {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_3
    if-nez p2, :cond_b

    goto :goto_4

    .line 108
    :cond_b
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditFragment$UfNUKVFURGeuSy9clN0EX1krfLk;

    invoke-direct {v0, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditFragment$UfNUKVFURGeuSy9clN0EX1krfLk;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;Landroid/widget/EditText;)V

    invoke-static {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_4
    return-object p1

    .line 80
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "EditGoalConfig must be provided."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
