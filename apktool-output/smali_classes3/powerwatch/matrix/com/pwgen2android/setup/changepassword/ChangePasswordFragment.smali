.class public final Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "ChangePasswordFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChangePasswordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangePasswordFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,46:1\n54#2,3:47\n*S KotlinDebug\n*F\n+ 1 ChangePasswordFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment\n*L\n21#1:47,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;",
        "()V",
        "changePasswordViewModel",
        "getChangePasswordViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;",
        "changePasswordViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;


# instance fields
.field private final changePasswordViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 18
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 21
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$changePasswordViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$changePasswordViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 47
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 49
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 21
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->changePasswordViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getChangePasswordViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;
    .locals 1

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->changePasswordViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;

    return-object v0
.end method

.method public static synthetic lambda$5xaGLV2uAZlsr8xA_eKcxuwuGjw(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->getChangePasswordViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->onBackClicked()V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;
    .locals 1

    .line 25
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->getChangePasswordViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0048

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->setRootView(Landroid/view/View;)V

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x7f080081

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/-$$Lambda$ChangePasswordFragment$5xaGLV2uAZlsr8xA_eKcxuwuGjw;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/-$$Lambda$ChangePasswordFragment$5xaGLV2uAZlsr8xA_eKcxuwuGjw;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    const p2, 0x7f0801e5

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    :goto_1
    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    const p2, 0x7f0f0068

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    :goto_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
