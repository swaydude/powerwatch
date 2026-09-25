.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;
.super Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;
.source "MainUserActivityFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainUserActivityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainUserActivityFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,38:1\n54#2,3:39\n*S KotlinDebug\n*F\n+ 1 MainUserActivityFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment\n*L\n14#1:39,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\t\u001a\u00020\u0004H\u0014J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\rH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;",
        "()V",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$Companion;


# instance fields
.field private final userActivityViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 14
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 11
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;-><init>()V

    .line 14
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$userActivityViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$userActivityViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 39
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 41
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 14
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->userActivityViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getUserActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;
    .locals 1

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->userActivityViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;
    .locals 1

    .line 18
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->getUserActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected isMainScreen()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0065

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    .line 27
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string p3, "activityId"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 28
    :goto_0
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->getUserActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    move-result-object p3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p3, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->loadActivitySession(Ljava/lang/String;Landroid/content/Context;)V

    return-object p1
.end method
