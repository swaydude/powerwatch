.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "PWWatchFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPWWatchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PWWatchFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,103:1\n54#2,3:104\n*S KotlinDebug\n*F\n+ 1 PWWatchFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment\n*L\n32#1:104,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\r\u001a\u00020\u000eH\u0014J\u0008\u0010\u000f\u001a\u00020\u0003H\u0014J\u0008\u0010\u0010\u001a\u00020\u000eH\u0014J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0008\u0010\u001f\u001a\u00020\u0012H\u0016J\u0008\u0010 \u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0008\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\""
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "scrollView",
        "Landroid/widget/ScrollView;",
        "watchViewModel",
        "getWatchViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;",
        "watchViewModel$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onActivityResult",
        "",
        "requestCode",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroyView",
        "onResume",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$Companion;

.field private static final WATCH_SCROLL_POSITION:Ljava/lang/String; = "watch_scroll_position"


# instance fields
.field private scrollView:Landroid/widget/ScrollView;

.field private final watchViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 28
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 32
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$watchViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$watchViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 104
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 106
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 32
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->watchViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getWatchViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;
    .locals 1

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->watchViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;

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

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 28
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;
    .locals 1

    .line 36
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getWatchViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0067

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 78
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x4d2

    if-ne p1, p3, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    .line 81
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getWatchViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->authorizationSuccess()V

    goto :goto_0

    .line 83
    :cond_0
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getWatchViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->authorizationCanceled()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f0801ca

    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p3, "rootView.findViewById(R.id.pw_watch_scroll)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/ScrollView;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->scrollView:Landroid/widget/ScrollView;

    .line 49
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object p2, p3

    goto :goto_0

    :cond_0
    const-string v0, "watch_scroll_position"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_2

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->scrollView:Landroid/widget/ScrollView;

    if-eqz v0, :cond_1

    const/4 p3, 0x0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p3, p2}, Landroid/widget/ScrollView;->scrollTo(II)V

    goto :goto_1

    :cond_1
    const-string p1, "scrollView"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    :cond_2
    :goto_1
    const p2, 0x7f080165

    .line 54
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const-string p3, "toolbar"

    .line 56
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0f0136

    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.my_powerwatch_title)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 57
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->hideRightButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    .line 58
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->hideBackButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    .line 60
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getWatchViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->onCreateView(Landroid/content/Context;)V

    const p2, 0x7f080088

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/viewpager/widget/ViewPager;

    .line 63
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 65
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerAdapter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "childFragmentManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    check-cast p3, Landroidx/viewpager/widget/PagerAdapter;

    invoke-virtual {p2, p3}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    :cond_3
    return-object p1
.end method

.method public onDestroyView()V
    .locals 3

    .line 72
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroyView()V

    .line 73
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->scrollView:Landroid/widget/ScrollView;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/ScrollView;->getScrollY()I

    move-result v1

    const-string v2, "watch_scroll_position"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_0
    return-void

    :cond_1
    const-string v0, "scrollView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public onResume()V
    .locals 2

    .line 90
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onResume()V

    .line 91
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    if-eqz v1, :cond_0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showTab(Z)V

    :goto_1
    return-void
.end method
