.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "InternalLoggerFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentInternalLoggerBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInternalLoggerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalLoggerFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,101:1\n54#2,3:102\n*S KotlinDebug\n*F\n+ 1 InternalLoggerFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment\n*L\n21#1:102,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentInternalLoggerBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;",
        "()V",
        "internalLoggerViewModel",
        "getInternalLoggerViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;",
        "internalLoggerViewModel$delegate",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;


# instance fields
.field private final internalLoggerViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 19
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 21
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$internalLoggerViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$internalLoggerViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 102
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 104
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 21
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->internalLoggerViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getInternalLoggerViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;
    .locals 0

    .line 19
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;
    .locals 1

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->internalLoggerViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    return-object v0
.end method

.method public static synthetic lambda$hP6487mFVIDGn3UGXz1XFYI7-NY(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->onCreateView$lambda-0(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;Landroid/view/View;)V
    .locals 0

    const-string p2, "$adapter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;->getItemCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

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

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;
    .locals 1

    .line 30
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v0

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0062

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->logs_list:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$adapter$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$adapter$1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {p3, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;-><init>(Ljava/util/List;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 38
    move-object v0, p3

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 39
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 40
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 41
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 44
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->level_selection:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;

    const-string v1, "Select LOG LEVELS"

    .line 45
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setTitle(Ljava/lang/String;)V

    .line 46
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;->getLogLevelFilterList()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setItems(Ljava/util/List;)V

    .line 47
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;->getLogLevelFilterList()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setSelection(Ljava/util/List;)V

    .line 49
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$1;

    invoke-direct {v1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setCloseSpinnerListener(Lkotlin/jvm/functions/Function0;)V

    .line 53
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;->getLogsObservableField()Landroidx/databinding/ObservableField;

    move-result-object v1

    .line 54
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$2;

    invoke-direct {v2, p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;)V

    check-cast v2, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v1, v2}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 60
    sget v1, Lpowerwatch/matrix/com/pwgen2android/R$id;->tag_selection:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;

    const-string v2, "Select TAGS"

    .line 61
    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setTitle(Ljava/lang/String;)V

    .line 62
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;->getTagsList()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Pair;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setItems(Ljava/util/List;)V

    .line 63
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;->getTagsList()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Pair;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setSelection(Ljava/util/List;)V

    .line 65
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$3;

    invoke-direct {v2, p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setCloseSpinnerListener(Lkotlin/jvm/functions/Function0;)V

    .line 69
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;->getTagsList()Landroidx/databinding/ObservableField;

    move-result-object v0

    .line 70
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$4;

    invoke-direct {v2, v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$onCreateView$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;)V

    check-cast v2, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    const v0, 0x7f0801ea

    .line 77
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/-$$Lambda$InternalLoggerFragment$hP6487mFVIDGn3UGXz1XFYI7-NY;

    invoke-direct {v1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/-$$Lambda$InternalLoggerFragment$hP6487mFVIDGn3UGXz1XFYI7-NY;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerRecyclerAdapter;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;->onCreateView(Landroid/content/Context;)V

    return-object p1
.end method

.method public onDestroyView()V
    .locals 2

    .line 87
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroyView()V

    .line 88
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getInternalLoggerViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;->onDestroyView(Landroid/content/Context;)V

    return-void
.end method
