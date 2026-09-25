.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "CalendarViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1547#2:106\n1618#2,3:107\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel\n*L\n51#1:106\n51#1:107,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0008\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0019R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\t0\t0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "selectDate",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;",
        "selectedDateProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;",
        "userActivitySessionRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;",
        "parentFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Landroidx/fragment/app/FragmentManager;)V",
        "activityDatesDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "config",
        "Landroidx/databinding/ObservableField;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;",
        "kotlin.jvm.PlatformType",
        "getConfig",
        "()Landroidx/databinding/ObservableField;",
        "parentFragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "getSelectedDateProvider",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;",
        "defaultCalendarConfig",
        "onCreateView",
        "",
        "context",
        "Landroid/content/Context;",
        "onDestroyView",
        "onRightButtonClicked",
        "date",
        "Ljava/util/Calendar;",
        "openSecretScreen",
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


# instance fields
.field private final activityDatesDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final config:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

.field private final selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

.field private final userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Landroidx/fragment/app/FragmentManager;)V
    .locals 2

    const-string v0, "selectDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedDateProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userActivitySessionRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentFragmentManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 31
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

    .line 29
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    .line 30
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    .line 34
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 36
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->activityDatesDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 38
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->defaultCalendarConfig()Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->config:Landroidx/databinding/ObservableField;

    return-void
.end method

.method private final defaultCalendarConfig()Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;
    .locals 9

    .line 87
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/4 v0, 0x2

    const/4 v2, -0x3

    .line 89
    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->add(II)V

    const/4 v2, 0x6

    const/4 v3, 0x1

    .line 91
    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 94
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 95
    invoke-virtual {v2, v0, v3}, Ljava/util/Calendar;->add(II)V

    .line 99
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    const-string v0, "lastYear"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextYear"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;->getSelectedDate()Ljava/util/Calendar;

    move-result-object v3

    .line 100
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v4

    const-string v0, "getDefault()"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    const-string v7, "MMM"

    invoke-direct {v0, v7, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    move-object v6, v0

    check-cast v6, Ljava/text/DateFormat;

    .line 102
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    move-object v0, v8

    .line 99
    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;-><init>(Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/TimeZone;Ljava/util/Locale;Ljava/text/DateFormat;Ljava/util/List;)V

    return-object v8
.end method

.method public static synthetic lambda$l4rQl8S_oYuVEE2gLqj_ohWdf_k(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->onCreateView$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$m_3c2OzLdAJUnb2itaApgXUQFQw(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;)V

    return-void
.end method

.method public static synthetic lambda$nlXuup3rOqiQaI1w2gkUSSx-v8Y(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->defaultCalendarConfig()Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    move-result-object v1

    check-cast p1, Ljava/lang/Iterable;

    .line 106
    new-instance p0, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p0, Ljava/util/Collection;

    .line 107
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 108
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;

    .line 52
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 53
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;->getStartTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 54
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 109
    :cond_0
    move-object v8, p0

    check-cast v8, Ljava/util/List;

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 51
    invoke-static/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/TimeZone;Ljava/util/Locale;Ljava/text/DateFormat;Ljava/util/List;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->getConfig()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getConfig()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;",
            ">;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->config:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSelectedDateProvider()Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;
    .locals 1

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    return-object v0
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 48
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->config:Landroidx/databinding/ObservableField;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->defaultCalendarConfig()Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 49
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->activityDatesDisposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xf

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->activityDates(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object v0

    .line 50
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$nlXuup3rOqiQaI1w2gkUSSx-v8Y;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$nlXuup3rOqiQaI1w2gkUSSx-v8Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    .line 58
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    .line 59
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$m_3c2OzLdAJUnb2itaApgXUQFQw;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$m_3c2OzLdAJUnb2itaApgXUQFQw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$l4rQl8S_oYuVEE2gLqj_ohWdf_k;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$l4rQl8S_oYuVEE2gLqj_ohWdf_k;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 49
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 69
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->activityDatesDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public final onRightButtonClicked(Ljava/util/Calendar;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;->setDate(Ljava/util/Calendar;)V

    .line 74
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->popBackStackAllowingStateLoss(Landroidx/fragment/app/FragmentManager;)V

    :goto_0
    return-void
.end method

.method public final openSecretScreen()V
    .locals 0

    return-void
.end method
