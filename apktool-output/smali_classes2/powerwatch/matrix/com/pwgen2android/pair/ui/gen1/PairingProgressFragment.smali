.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "PairingProgressFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairingProgressBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPairingProgressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PairingProgressFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,52:1\n54#2,3:53\n*S KotlinDebug\n*F\n+ 1 PairingProgressFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment\n*L\n19#1:53,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairingProgressBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;",
        "()V",
        "pairingProgressViewModel",
        "getPairingProgressViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;",
        "pairingProgressViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;

.field private static final DEVICE_INFO_KEY:Ljava/lang/String; = "deviceInfoKey"


# instance fields
.field private final pairingProgressViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 19
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 17
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 19
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$pairingProgressViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$pairingProgressViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 53
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 55
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 19
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->pairingProgressViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getPairingProgressViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;
    .locals 1

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->pairingProgressViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

    return-object v0
.end method

.method public static final newInstance(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;

    move-result-object p0

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;
    .locals 1

    .line 27
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->getPairingProgressViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b006e

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string p3, "deviceInfoKey"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 35
    :goto_0
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->getPairingProgressViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

    move-result-object p3

    invoke-virtual {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->startPairing(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-object p1
.end method
