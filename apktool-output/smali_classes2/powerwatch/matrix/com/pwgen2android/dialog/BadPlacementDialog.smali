.class public final Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;
.super Landroidx/fragment/app/DialogFragment;
.source "BadPlacementDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBadPlacementDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadPlacementDialog.kt\npowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,51:1\n54#2,3:52\n*S KotlinDebug\n*F\n+ 1 BadPlacementDialog.kt\npowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog\n*L\n18#1:52,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\r\u001a\u00020\u000eH\u0002J\u0008\u0010\t\u001a\u00020\u000fH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;",
        "Landroidx/fragment/app/DialogFragment;",
        "()V",
        "rootView",
        "Landroid/view/View;",
        "viewDataBinding",
        "Landroidx/databinding/ViewDataBinding;",
        "viewModel",
        "Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;",
        "getViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "Landroidx/lifecycle/ViewModel;",
        "onCreateView",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "",
        "view",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$Companion;


# instance fields
.field private rootView:Landroid/view/View;

.field private viewDataBinding:Landroidx/databinding/ViewDataBinding;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 18
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->Companion:Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 17
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    .line 18
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$viewModel$2;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$viewModel$2;

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 52
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 54
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 18
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private final getViewModel()Landroidx/lifecycle/ViewModel;
    .locals 1

    .line 26
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    return-object v0
.end method

.method private final getViewModel()Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;
    .locals 1

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0b003d

    const/4 v0, 0x0

    .line 30
    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string p2, "inflate(inflater, R.layout.dialog_bad_placement, container, false)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->viewDataBinding:Landroidx/databinding/ViewDataBinding;

    if-eqz p1, :cond_0

    .line 31
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->rootView:Landroid/view/View;

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;

    move-result-object p1

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$onCreateView$1;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;->setDialogClose(Lkotlin/jvm/functions/Function1;)V

    .line 37
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->rootView:Landroid/view/View;

    return-object p1

    :cond_0
    const-string p1, "viewDataBinding"

    .line 31
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/DialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 42
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->viewDataBinding:Landroidx/databinding/ViewDataBinding;

    const/4 p2, 0x0

    const-string v0, "viewDataBinding"

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->getBindingVariable()I

    move-result v1

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->getViewModel()Landroidx/lifecycle/ViewModel;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 43
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;->viewDataBinding:Landroidx/databinding/ViewDataBinding;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    return-void

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p2

    .line 42
    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p2
.end method
