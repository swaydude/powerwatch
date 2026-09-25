.class public Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;
.source "UserActivityDetailsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUserActivityDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserActivityDetailsFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,61:1\n54#2,3:62\n*S KotlinDebug\n*F\n+ 1 UserActivityDetailsFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment\n*L\n19#1:62,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u000b\u001a\u00020\u0006H\u0014J\u0008\u0010\u000c\u001a\u00020\rH\u0014J\u0008\u0010\u000e\u001a\u00020\u000fH\u0014J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0008\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;",
        "()V",
        "activityID",
        "",
        "userActivityViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;",
        "getUserActivityViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;",
        "userActivityViewModel$delegate",
        "Lkotlin/Lazy;",
        "getViewModel",
        "isMainScreen",
        "",
        "layoutRes",
        "",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroyView",
        "",
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
.field public static final ACTIVITY_ID:Ljava/lang/String; = "activityId"

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$Companion;


# instance fields
.field private activityID:Ljava/lang/String;

.field private final userActivityViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 19
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 15
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;-><init>()V

    .line 19
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$userActivityViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$userActivityViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 62
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 64
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 19
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->userActivityViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getUserActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;
    .locals 1

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->userActivityViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    return-object v0
.end method

.method public static synthetic lambda$hBBgWsEqptqk0xnLMLAccl5zQys(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->getUserActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->onShareButtonClicked()V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;
    .locals 1

    .line 23
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->getUserActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected isMainScreen()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0080

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object p2, p3

    goto :goto_0

    :cond_0
    const-string v0, "activityId"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_5

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->activityID:Ljava/lang/String;

    .line 35
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->getUserActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    move-result-object p2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->activityID:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->loadActivitySession(Ljava/lang/String;Landroid/content/Context;)V

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const p2, 0x7f0801fe

    .line 37
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Landroid/widget/ImageView;

    :goto_1
    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    .line 38
    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    if-nez p3, :cond_3

    goto :goto_3

    .line 39
    :cond_3
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$UserActivityDetailsFragment$hBBgWsEqptqk0xnLMLAccl5zQys;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$UserActivityDetailsFragment$hBBgWsEqptqk0xnLMLAccl5zQys;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;)V

    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_3
    return-object p1

    :cond_4
    const-string p1, "activityID"

    .line 35
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 34
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Activity ID must be provided."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onDestroyView()V
    .locals 2

    .line 47
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->onDestroyView()V

    .line 48
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityDetailsFragment;->getRootView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const v1, 0x7f0801fe

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    return-void
.end method
