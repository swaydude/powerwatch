.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "ControlViewFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;",
        "()V",
        "controlViewViewModel",
        "getControlViewViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;",
        "controlViewViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;


# instance fields
.field private final controlViewViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 20
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$controlViewViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$controlViewViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->controlViewViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getControlViewViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;
    .locals 1

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->controlViewViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;
    .locals 1

    .line 24
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->getControlViewViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b004f

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->setRootView(Landroid/view/View;)V

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
