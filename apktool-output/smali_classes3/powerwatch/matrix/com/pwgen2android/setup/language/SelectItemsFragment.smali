.class public final Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "SelectItemsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSelectItemsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelectItemsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectItemsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,113:1\n54#2,3:114\n*S KotlinDebug\n*F\n+ 1 SelectItemsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment\n*L\n28#1:114,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSelectItemsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;",
        "()V",
        "mChooseLanguageViewModel",
        "getMChooseLanguageViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;",
        "mChooseLanguageViewModel$delegate",
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
.field private static final ACTIVE_VALUE_KEY:Ljava/lang/String;

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

.field private static final TITLE_KEY:Ljava/lang/String;

.field private static final TYPE_KEY:Ljava/lang/String;


# instance fields
.field private final mChooseLanguageViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    const-string v0, "type"

    .line 99
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->TYPE_KEY:Ljava/lang/String;

    const-string v0, "active_value"

    .line 100
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->ACTIVE_VALUE_KEY:Ljava/lang/String;

    const-string v0, "title_key"

    .line 101
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->TITLE_KEY:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 26
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 28
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$mChooseLanguageViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$mChooseLanguageViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 114
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 116
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 28
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->mChooseLanguageViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getACTIVE_VALUE_KEY$cp()Ljava/lang/String;
    .locals 1

    .line 26
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->ACTIVE_VALUE_KEY:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getTITLE_KEY$cp()Ljava/lang/String;
    .locals 1

    .line 26
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->TITLE_KEY:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getTYPE_KEY$cp()Ljava/lang/String;
    .locals 1

    .line 26
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->TYPE_KEY:Ljava/lang/String;

    return-object v0
.end method

.method private final getMChooseLanguageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->mChooseLanguageViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    return-object v0
.end method

.method public static synthetic lambda$VkmM-GOr9Q8N9jQB5EebVhAib64(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$oM9se4RJyEiJFOE2hPR04SFRKRY(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Ljava/lang/String;B)Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Ljava/lang/String;B)Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getMChooseLanguageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getMChooseLanguageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->onSaveClicked(Landroid/content/Context;)V

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;
    .locals 1

    .line 32
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getMChooseLanguageViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0075

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

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object p3, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->TYPE_KEY:Ljava/lang/String;

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p3

    :goto_0
    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    if-nez p3, :cond_1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    :cond_1
    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->setType(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)V

    .line 43
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->ACTIVE_VALUE_KEY:Ljava/lang/String;

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getByte(Ljava/lang/String;)B

    move-result p3

    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    :goto_1
    invoke-virtual {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->setActiveValue(Ljava/lang/Byte;)V

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const-string p3, ""

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->TITLE_KEY:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    move-object p3, p2

    .line 46
    :goto_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->onCreateView(Landroid/content/Context;)V

    const p2, 0x7f080165

    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    if-nez p2, :cond_5

    goto :goto_3

    :cond_5
    const v0, 0x7f0f0060

    .line 49
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(R.string.button_save)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_3
    if-nez p2, :cond_6

    goto :goto_4

    .line 50
    :cond_6
    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_4
    if-nez p2, :cond_7

    goto :goto_5

    .line 52
    :cond_7
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsFragment$oM9se4RJyEiJFOE2hPR04SFRKRY;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsFragment$oM9se4RJyEiJFOE2hPR04SFRKRY;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_5
    if-nez p2, :cond_8

    goto :goto_6

    .line 56
    :cond_8
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsFragment$VkmM-GOr9Q8N9jQB5EebVhAib64;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsFragment$VkmM-GOr9Q8N9jQB5EebVhAib64;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    .line 61
    :goto_6
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p3

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$3;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p3, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 73
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->language_list:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 75
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 76
    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 77
    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 80
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->getItems()Landroidx/databinding/ObservableField;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 81
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, p3, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;-><init>(Ljava/util/List;Landroid/content/Context;Z)V

    .line 83
    move-object v0, v1

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 85
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4;

    invoke-direct {p2, p3, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4;-><init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;->setClickListener(Lkotlin/jvm/functions/Function1;)V

    return-object p1
.end method
