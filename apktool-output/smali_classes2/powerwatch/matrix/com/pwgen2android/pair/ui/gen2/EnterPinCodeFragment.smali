.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "EnterPinCodeFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEnterPinCodeBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEnterPinCodeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterPinCodeFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,91:1\n54#2,3:92\n*S KotlinDebug\n*F\n+ 1 EnterPinCodeFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment\n*L\n28#1:92,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEnterPinCodeBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;",
        "()V",
        "enterPidCodeViewModel",
        "getEnterPidCodeViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;",
        "enterPidCodeViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;


# instance fields
.field private final enterPidCodeViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 26
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 28
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$enterPidCodeViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$enterPidCodeViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 92
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 94
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 28
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->enterPidCodeViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getEnterPidCodeViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;
    .locals 0

    .line 26
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->getEnterPidCodeViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getEnterPidCodeViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->enterPidCodeViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;

    return-object v0
.end method

.method public static synthetic lambda$1DU_B3hYc0qqH1utkaFsEXlJfgs(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;Landroid/widget/EditText;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;Landroid/widget/EditText;)V

    return-void
.end method

.method public static synthetic lambda$7o5IrsIpqWfiJlJHjCOm6yHwxjg(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->getEnterPidCodeViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;Landroid/widget/EditText;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->getContext()Landroid/content/Context;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :goto_1
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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;
    .locals 1

    .line 36
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->getEnterPidCodeViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0058

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f0801e5

    .line 41
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const p3, 0x7f0f014f

    .line 43
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v0, 0x7f050023

    invoke-static {p3, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_1
    const p2, 0x7f08015d

    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;

    const-string p3, "loginToolbar"

    .line 47
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->removeBackground(Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;)V

    const p3, 0x7f080081

    .line 48
    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$EnterPinCodeFragment$7o5IrsIpqWfiJlJHjCOm6yHwxjg;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$EnterPinCodeFragment$7o5IrsIpqWfiJlJHjCOm6yHwxjg;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0800c4

    .line 51
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    const/4 p3, 0x1

    .line 52
    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 53
    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 54
    invoke-virtual {p2}, Landroid/widget/EditText;->requestFocus()Z

    .line 55
    new-instance p3, Landroid/os/Handler;

    invoke-direct {p3}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$EnterPinCodeFragment$1DU_B3hYc0qqH1utkaFsEXlJfgs;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$EnterPinCodeFragment$1DU_B3hYc0qqH1utkaFsEXlJfgs;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;Landroid/widget/EditText;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 59
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$onCreateView$3;

    invoke-direct {p3, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$onCreateView$3;-><init>(Landroid/widget/EditText;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;)V

    check-cast p3, Landroid/text/TextWatcher;

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-object p1
.end method
