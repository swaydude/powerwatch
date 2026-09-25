.class public final Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "ChooseLanguageFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChooseLanguageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseLanguageFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,96:1\n54#2,3:97\n*S KotlinDebug\n*F\n+ 1 ChooseLanguageFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment\n*L\n27#1:97,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;",
        "()V",
        "mChooseLanguageViewModel",
        "getMChooseLanguageViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;",
        "mChooseLanguageViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;


# instance fields
.field private final mChooseLanguageViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 25
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 27
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$mChooseLanguageViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$mChooseLanguageViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 97
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 99
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 27
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->mChooseLanguageViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getMChooseLanguageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;
    .locals 1

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->mChooseLanguageViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;

    return-object v0
.end method

.method public static synthetic lambda$hagYkbB0cGXhgFg7x4um_L-ds6Y(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$oXyDKCmMQhwCOtxHWdfVDh1YIDQ(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getMChooseLanguageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getMChooseLanguageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;

    move-result-object p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;->onSaveClicked(Landroid/content/Context;)V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;
    .locals 1

    .line 31
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getMChooseLanguageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b004b

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f080165

    .line 41
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const p3, 0x7f0f0060

    .line 42
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.button_save)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    .line 44
    :cond_1
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ChooseLanguageFragment$hagYkbB0cGXhgFg7x4um_L-ds6Y;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ChooseLanguageFragment$hagYkbB0cGXhgFg7x4um_L-ds6Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_1
    if-nez p2, :cond_2

    goto :goto_2

    .line 48
    :cond_2
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ChooseLanguageFragment$oXyDKCmMQhwCOtxHWdfVDh1YIDQ;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ChooseLanguageFragment$oXyDKCmMQhwCOtxHWdfVDh1YIDQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_2
    if-nez p2, :cond_3

    goto :goto_3

    :cond_3
    const p3, 0x7f0f0102

    .line 52
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.language)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 54
    :goto_3
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p3

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$onCreateView$3;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$onCreateView$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p3, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 66
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->language_list:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 69
    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 70
    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 73
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;->getLanguagesField()Landroidx/databinding/ObservableField;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 74
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;-><init>(Ljava/util/List;Landroid/content/Context;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 76
    move-object v0, v6

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 78
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$onCreateView$4;

    invoke-direct {p2, p3, v6}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$onCreateView$4;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;->setClickListener(Lkotlin/jvm/functions/Function1;)V

    return-object p1
.end method
