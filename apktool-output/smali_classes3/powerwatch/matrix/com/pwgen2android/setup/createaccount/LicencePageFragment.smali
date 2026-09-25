.class public final Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "LicencePageFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLicencePageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicencePageFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,77:1\n54#2,3:78\n*S KotlinDebug\n*F\n+ 1 LicencePageFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment\n*L\n25#1:78,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;",
        "()V",
        "licencePageViewModel",
        "getLicencePageViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;",
        "licencePageViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;


# instance fields
.field private final licencePageViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 25
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 23
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 25
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$licencePageViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$licencePageViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 78
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 80
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 25
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->licencePageViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getLicencePageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;
    .locals 1

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->licencePageViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;
    .locals 1

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getLicencePageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0063

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->setRootView(Landroid/view/View;)V

    .line 40
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getViewDataBinding()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;->mainView:Landroid/widget/LinearLayout;

    const p2, 0x7f0801e5

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x7f0f01b8

    .line 41
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const/4 p2, 0x2

    .line 42
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setLines(I)V

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getViewDataBinding()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;->mainView:Landroid/widget/LinearLayout;

    const p2, 0x7f0800c8

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    .line 45
    new-instance p2, Landroid/widget/ProgressBar;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 47
    new-instance p3, Landroid/webkit/WebView;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 48
    move-object v0, p3

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 49
    move-object v0, p2

    check-cast v0, Landroid/view/View;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x11

    const/16 v3, 0xc8

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const p1, 0x7f0f01b9

    .line 51
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 54
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$onCreateView$1;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$onCreateView$1;-><init>(Landroid/widget/ProgressBar;)V

    check-cast p1, Landroid/webkit/WebViewClient;

    invoke-virtual {p3, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 68
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getViewDataBinding()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;->mainView:Landroid/widget/LinearLayout;

    const p2, 0x7f080081

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 70
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
