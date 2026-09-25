.class public final Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "EditBiometricsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEditBiometricsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditBiometricsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,79:1\n54#2,3:80\n54#2,3:83\n*S KotlinDebug\n*F\n+ 1 EditBiometricsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment\n*L\n25#1:80,3\n50#1:83,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017\u00b2\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;",
        "()V",
        "editBiometricsViewModel",
        "getEditBiometricsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;",
        "editBiometricsViewModel$delegate",
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
        "app_release",
        "biometricsViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;"
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$Companion;


# instance fields
.field private final editBiometricsViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 50
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 23
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 25
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$editBiometricsViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$editBiometricsViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 80
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 82
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 25
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->editBiometricsViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getEditBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;
    .locals 1

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->editBiometricsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    return-object v0
.end method

.method public static synthetic lambda$DWbWyWPE677ja2Dk59ORRVEtkgY(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$uHDxHDGpkIu2k102kJgwEkuQIyo(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onSaveClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-2(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;"
        }
    .end annotation

    .line 50
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    return-object p0
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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;
    .locals 1

    .line 29
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getEditBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0056

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->setRootView(Landroid/view/View;)V

    .line 37
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    move-object p1, p2

    goto :goto_0

    :cond_0
    const p3, 0x7f080165

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const p3, 0x7f0f0060

    .line 39
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.button_save)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    .line 41
    :cond_2
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsFragment$uHDxHDGpkIu2k102kJgwEkuQIyo;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsFragment$uHDxHDGpkIu2k102kJgwEkuQIyo;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;)V

    invoke-static {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_2
    if-nez p1, :cond_3

    goto :goto_3

    .line 45
    :cond_3
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsFragment$DWbWyWPE677ja2Dk59ORRVEtkgY;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsFragment$DWbWyWPE677ja2Dk59ORRVEtkgY;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;)V

    invoke-static {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_3
    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    const p3, 0x7f0f01dc

    .line 49
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.user_biometrics)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 50
    :goto_4
    move-object p3, p0

    check-cast p3, Landroidx/lifecycle/LifecycleOwner;

    .line 83
    move-object v0, p2

    check-cast v0, Lorg/koin/core/qualifier/Qualifier;

    .line 84
    check-cast p2, Lkotlin/jvm/functions/Function0;

    .line 85
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$onCreateView$$inlined$viewModel$default$1;

    invoke-direct {v1, p3, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$onCreateView$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    move-result-object p3

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->onCreateView$lambda-2(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p2

    invoke-virtual {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->setBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)V

    .line 52
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    const p3, 0x7f08008e

    invoke-virtual {p2, p3}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object p2

    if-nez p2, :cond_5

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    .line 54
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p2

    .line 55
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, p3, v0}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p2

    .line 56
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 59
    :cond_5
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$onCreateView$3;

    invoke-direct {p3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$onCreateView$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast p3, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p2, p3}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 70
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    move-result-object p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onCreateView(Landroid/content/Context;)V

    .line 71
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
