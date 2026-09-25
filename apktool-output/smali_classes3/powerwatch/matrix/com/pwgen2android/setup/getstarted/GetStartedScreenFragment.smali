.class public final Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "GetStartedScreenFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGetStartedScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetStartedScreenFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,57:1\n54#2,3:58\n54#2,3:61\n*S KotlinDebug\n*F\n+ 1 GetStartedScreenFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment\n*L\n22#1:58,3\n24#1:61,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u000f\u001a\u00020\u0010H\u0014J\u0008\u0010\u0011\u001a\u00020\u0003H\u0014J\u0008\u0010\u0012\u001a\u00020\u0010H\u0014J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\n\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;",
        "()V",
        "biometricsViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        "getBiometricsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        "biometricsViewModel$delegate",
        "Lkotlin/Lazy;",
        "getStartedViewModel",
        "getGetStartedViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;",
        "getStartedViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;


# instance fields
.field private final biometricsViewModel$delegate:Lkotlin/Lazy;

.field private final getStartedViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 19
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 22
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    const/4 v1, 0x0

    .line 58
    move-object v2, v1

    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 59
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 60
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    .line 22
    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->biometricsViewModel$delegate:Lkotlin/Lazy;

    .line 24
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$getStartedViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$getStartedViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 63
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$special$$inlined$viewModel$default$2;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$special$$inlined$viewModel$default$2;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 24
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getStartedViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
    .locals 0

    .line 19
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
    .locals 1

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->biometricsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    return-object v0
.end method

.method private final getGetStartedViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getStartedViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;

    return-object v0
.end method

.method public static synthetic lambda$1YN8sJVGNklRyyx3B0xWEnam13U(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getGetStartedViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->onBackClicked()V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;
    .locals 1

    .line 29
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getGetStartedViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b005f

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f080081

    .line 37
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedScreenFragment$1YN8sJVGNklRyyx3B0xWEnam13U;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedScreenFragment$1YN8sJVGNklRyyx3B0xWEnam13U;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    const p3, 0x7f08008e

    invoke-virtual {p2, p3}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object p2

    if-nez p2, :cond_1

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    .line 42
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p2

    .line 43
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, p3, v0}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p2

    .line 44
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    :cond_1
    const p2, 0x7f0801e5

    .line 46
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    const p3, 0x7f0f00de

    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->onCreateView(Landroid/content/Context;)V

    return-object p1
.end method
