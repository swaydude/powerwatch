.class public final Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "SecretScreenFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSecretScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretScreenFragment.kt\npowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,154:1\n54#2,3:155\n*S KotlinDebug\n*F\n+ 1 SecretScreenFragment.kt\npowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment\n*L\n24#1:155,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;",
        "()V",
        "secretScreenViewModel",
        "getSecretScreenViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;",
        "secretScreenViewModel$delegate",
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
        "onResume",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$Companion;


# instance fields
.field private final secretScreenViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 22
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 24
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$secretScreenViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$secretScreenViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 155
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 157
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 24
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->secretScreenViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getSecretScreenViewModel()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->secretScreenViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;

    return-object v0
.end method

.method public static synthetic lambda$gU-rnQnRRHLYi2v5mIrQ_nCyMhg(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->getSecretScreenViewModel()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->onBackClicked()V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;
    .locals 1

    .line 28
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->getSecretScreenViewModel()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b00cc

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f080165

    .line 43
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const-string p3, "toolbar"

    .line 44
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0f0037

    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.app_secret_screen_title)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 45
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->hideRightButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    .line 46
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenFragment$gU-rnQnRRHLYi2v5mIrQ_nCyMhg;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenFragment$gU-rnQnRRHLYi2v5mIrQ_nCyMhg;-><init>(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public onResume()V
    .locals 2

    .line 53
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onResume()V

    .line 54
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

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
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showTab(Z)V

    :goto_1
    return-void
.end method
