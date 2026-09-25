.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "CalendarFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCalendarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n54#2,3:160\n1849#3,2:163\n*S KotlinDebug\n*F\n+ 1 CalendarFragment.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment\n*L\n38#1:160,3\n133#1:163,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0008\u0010\u0018\u001a\u00020\u0019H\u0014J\u0008\u0010\u001a\u001a\u00020\u0003H\u0014J\u0008\u0010\u001b\u001a\u00020\u0019H\u0014J&\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0008\u0010#\u001a\u00020\u0013H\u0016J\u0008\u0010$\u001a\u00020\u0013H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;",
        "()V",
        "calendarViewModel",
        "getCalendarViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;",
        "calendarViewModel$delegate",
        "Lkotlin/Lazy;",
        "configChangeListener",
        "Landroidx/databinding/Observable$OnPropertyChangedCallback;",
        "getConfigChangeListener",
        "()Landroidx/databinding/Observable$OnPropertyChangedCallback;",
        "setConfigChangeListener",
        "(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V",
        "disposable",
        "Lio/reactivex/disposables/Disposable;",
        "fillInWeekDays",
        "",
        "calendarView",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;",
        "rootView",
        "Landroid/view/View;",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onCreateView",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;


# instance fields
.field private final calendarViewModel$delegate:Lkotlin/Lazy;

.field private configChangeListener:Landroidx/databinding/Observable$OnPropertyChangedCallback;

.field private disposable:Lio/reactivex/disposables/Disposable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 38
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 34
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 38
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$calendarViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$calendarViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 160
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 162
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 38
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->calendarViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$fillInWeekDays(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;Landroid/view/View;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->fillInWeekDays(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getCalendarViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;
    .locals 0

    .line 34
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getCalendarViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final fillInWeekDays(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;Landroid/view/View;)V
    .locals 4

    .line 129
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->getDayInWeekLabels()[Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x1

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->slice([Ljava/lang/Object;Lkotlin/ranges/IntRange;)Ljava/util/List;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Integer;

    const v2, 0x7f0800e5

    .line 130
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const v2, 0x7f0800e9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const v2, 0x7f0800e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const v2, 0x7f0800e4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const v2, 0x7f0800e3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v0, v3

    const v2, 0x7f0800e7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const v2, 0x7f0800e6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v0, v3

    .line 132
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;[Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 163
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    .line 134
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final getCalendarViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;
    .locals 1

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->calendarViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    return-object v0
.end method

.method public static synthetic lambda$LRLQJs3vn0bzjozU_az43o1u5rM(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$W_5VLulmRgks0kj59zijKzrc4H8(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;Landroid/view/View;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getCalendarViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object p0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const-string v0, "getInstance()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->onRightButtonClicked(Ljava/util/Calendar;)V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;)V
    .locals 1

    const-string v0, "toolbar"

    .line 120
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;->getYear()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

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

.method public final getConfigChangeListener()Landroidx/databinding/Observable$OnPropertyChangedCallback;
    .locals 1

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->configChangeListener:Landroidx/databinding/Observable$OnPropertyChangedCallback;

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;
    .locals 1

    .line 42
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getCalendarViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0046

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f080165

    .line 54
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const-string p3, "toolbar"

    .line 55
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, ""

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 56
    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->removeBackButtonDrawable(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Z)V

    const p3, 0x7f0f01bc

    .line 57
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.today)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 60
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p3

    const-string v0, "create<Int>()"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0xc

    .line 64
    invoke-virtual {p3, v0, v1}, Lio/reactivex/subjects/PublishSubject;->take(J)Lio/reactivex/Observable;

    move-result-object p3

    .line 65
    invoke-virtual {p3}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/Completable;

    move-result-object p3

    .line 66
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1770

    invoke-virtual {p3, v1, v2, v0}, Lio/reactivex/Completable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;

    .line 85
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarFragment$LRLQJs3vn0bzjozU_az43o1u5rM;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarFragment$LRLQJs3vn0bzjozU_az43o1u5rM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    const p3, 0x7f08009f

    .line 90
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    const-string v0, "calendarView"

    .line 92
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->fillInWeekDays(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;Landroid/view/View;)V

    .line 94
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$2;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->setListener(Lkotlin/jvm/functions/Function1;)V

    .line 106
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;

    invoke-direct {v0, p0, p3, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;Landroid/view/View;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->configChangeListener:Landroidx/databinding/Observable$OnPropertyChangedCallback;

    .line 114
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->getConfig()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->configChangeListener:Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 117
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->getScrollChangeObservable()Lio/reactivex/Observable;

    move-result-object p3

    .line 118
    invoke-virtual {p3}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p3

    .line 119
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarFragment$W_5VLulmRgks0kj59zijKzrc4H8;

    invoke-direct {v1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarFragment$W_5VLulmRgks0kj59zijKzrc4H8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    invoke-virtual {p3, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p2

    .line 117
    invoke-virtual {v0, p2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 123
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->onCreateView(Landroid/content/Context;)V

    return-object p1
.end method

.method public onDestroyView()V
    .locals 2

    .line 140
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroyView()V

    .line 141
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 142
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->configChangeListener:Landroidx/databinding/Observable$OnPropertyChangedCallback;

    if-eqz v0, :cond_0

    .line 143
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->getConfig()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->configChangeListener:Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->removeOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 149
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onResume()V

    .line 150
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

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

.method public final setConfigChangeListener(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->configChangeListener:Landroidx/databinding/Observable$OnPropertyChangedCallback;

    return-void
.end method
