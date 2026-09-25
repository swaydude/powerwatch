.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "BannerFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDeviceBannerBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBannerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,64:1\n54#2,3:65\n*S KotlinDebug\n*F\n+ 1 BannerFragment.kt\npowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment\n*L\n23#1:65,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDeviceBannerBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;",
        "()V",
        "bannerViewModel",
        "getBannerViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;",
        "bannerViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$Companion;


# instance fields
.field private final bannerViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 23
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$bannerViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$bannerViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 65
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 67
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 23
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->bannerViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getBannerViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;)Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;
    .locals 0

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getBannerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getBannerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;
    .locals 1

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->bannerViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    return-object v0
.end method

.method public static synthetic lambda$p3qvbwEHA6Ht5jShFDGVZzWu14k(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getBannerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->onClick()V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;
    .locals 1

    .line 31
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getBannerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0055

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const p2, 0x7f080087

    .line 36
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 37
    :goto_0
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getBannerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->getImageField()Landroidx/databinding/ObservableField;

    move-result-object p3

    .line 38
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$onCreateView$1;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;Landroid/widget/ImageView;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p3, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 45
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getBannerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p3, Landroid/content/Context;

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->onCreateView(Landroid/content/Context;)V

    if-nez p1, :cond_1

    goto :goto_1

    .line 47
    :cond_1
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$BannerFragment$p3qvbwEHA6Ht5jShFDGVZzWu14k;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$BannerFragment$p3qvbwEHA6Ht5jShFDGVZzWu14k;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    return-object p1
.end method

.method public onDestroyView()V
    .locals 2

    .line 55
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroyView()V

    .line 56
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getBannerViewModel()Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->onDestroyView(Landroid/content/Context;)V

    return-void
.end method
