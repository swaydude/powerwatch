.class public final Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "ChooseUnitsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChooseUnitsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseUnitsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,73:1\n54#2,3:74\n*S KotlinDebug\n*F\n+ 1 ChooseUnitsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment\n*L\n23#1:74,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;",
        "()V",
        "chooseUnitsViewModel",
        "getChooseUnitsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;",
        "chooseUnitsViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;


# instance fields
.field private final chooseUnitsViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 23
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$chooseUnitsViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$chooseUnitsViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 74
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 76
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 23
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->chooseUnitsViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getChooseUnitsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;
    .locals 1

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->chooseUnitsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    return-object v0
.end method

.method public static synthetic lambda$eG_S-OsskTLrRnJBLdqfj4liYpM(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$k87dXplMkuD9BhlCHPrClUXBxss(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getChooseUnitsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getChooseUnitsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->onSaveClicked()V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;
    .locals 1

    .line 27
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getChooseUnitsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b004d

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->setRootView(Landroid/view/View;)V

    .line 37
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const p2, 0x7f080165

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const p2, 0x7f0f0060

    .line 38
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "getString(R.string.button_save)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    .line 40
    :cond_2
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsFragment$eG_S-OsskTLrRnJBLdqfj4liYpM;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsFragment$eG_S-OsskTLrRnJBLdqfj4liYpM;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;)V

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_2
    if-nez p1, :cond_3

    goto :goto_3

    .line 44
    :cond_3
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsFragment$k87dXplMkuD9BhlCHPrClUXBxss;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsFragment$k87dXplMkuD9BhlCHPrClUXBxss;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;)V

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_3
    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    const p2, 0x7f0f01d0

    .line 48
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "getString(R.string.units)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 50
    :goto_4
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$onCreateView$3;

    invoke-direct {p3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$onCreateView$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast p3, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p2, p3}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 62
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
