.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;
.source "ShareActivityFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog<",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShareActivityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareActivityFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,175:1\n54#2,3:176\n*S KotlinDebug\n*F\n+ 1 ShareActivityFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment\n*L\n131#1:176,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \u001e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u000c\u001a\u00020\u0012H\u0002J\u0008\u0010\u0013\u001a\u00020\u0011H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;",
        "()V",
        "activityId",
        "",
        "rootView",
        "Landroid/view/View;",
        "viewDataBinding",
        "Landroidx/databinding/ViewDataBinding;",
        "viewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;",
        "getViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "Landroidx/lifecycle/ViewModel;",
        "layoutRes",
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
.field private static final ACTIVITY_ID:Ljava/lang/String;

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$Companion;


# instance fields
.field private activityId:Ljava/lang/String;

.field private rootView:Landroid/view/View;

.field private viewDataBinding:Landroidx/databinding/ViewDataBinding;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 131
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$Companion;

    const-string v0, "activity_id"

    .line 167
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->ACTIVITY_ID:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 129
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;-><init>()V

    .line 131
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$viewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$viewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 176
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 178
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 131
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getACTIVITY_ID$cp()Ljava/lang/String;
    .locals 1

    .line 129
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->ACTIVITY_ID:Ljava/lang/String;

    return-object v0
.end method

.method private final getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private final getViewModel()Landroidx/lifecycle/ViewModel;
    .locals 1

    .line 141
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    return-object v0
.end method

.method private final getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;
    .locals 1

    .line 131
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0077

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->layoutRes()I

    move-result p3

    const/4 v0, 0x0

    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string p2, "inflate(inflater, layoutRes(), container, false)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->viewDataBinding:Landroidx/databinding/ViewDataBinding;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 146
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->rootView:Landroid/view/View;

    .line 147
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->ACTIVITY_ID:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->activityId:Ljava/lang/String;

    .line 149
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;

    move-result-object p1

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$onCreateView$1;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->setDialogClose(Lkotlin/jvm/functions/Function1;)V

    .line 153
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;

    move-result-object p1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->activityId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;->setSessionId(Ljava/lang/String;)V

    .line 155
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->rootView:Landroid/view/View;

    return-object p1

    :cond_1
    const-string p1, "viewDataBinding"

    .line 146
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p2
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    invoke-super {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 160
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->viewDataBinding:Landroidx/databinding/ViewDataBinding;

    const/4 p2, 0x0

    const-string v0, "viewDataBinding"

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->getBindingVariable()I

    move-result v1

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->getViewModel()Landroidx/lifecycle/ViewModel;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 161
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;->viewDataBinding:Landroidx/databinding/ViewDataBinding;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    return-void

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p2

    .line 160
    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p2
.end method
