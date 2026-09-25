.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "PairingFailedFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPairingFailedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PairingFailedFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,42:1\n54#2,3:43\n*S KotlinDebug\n*F\n+ 1 PairingFailedFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment\n*L\n27#1:43,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;",
        "()V",
        "pairFailedModel",
        "getPairFailedModel",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;",
        "pairFailedModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;


# instance fields
.field private final pairFailedModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 19
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 27
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$pairFailedModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$pairFailedModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 43
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 45
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 27
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->pairFailedModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getPairFailedModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;
    .locals 1

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->pairFailedModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;

    move-result-object v0

    return-object v0
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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;
    .locals 1

    .line 35
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->getPairFailedModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b006c

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->setRootView(Landroid/view/View;)V

    .line 23
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const p2, 0x7f080081

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 24
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
