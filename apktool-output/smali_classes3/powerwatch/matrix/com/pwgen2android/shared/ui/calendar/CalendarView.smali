.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "CalendarView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u0008\u0010&\u001a\u00020\u0016H\u0002J\u0008\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020(H\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\r0\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR7\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u001c\u0010\"\u001a\u0010\u0012\u000c\u0012\n $*\u0004\u0018\u00010\u001d0\u001d0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "context",
        "Landroid/content/Context;",
        "attributeSet",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "adapter",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;",
        "configuration",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;",
        "dayInWeekLabels",
        "",
        "",
        "getDayInWeekLabels",
        "()[Ljava/lang/String;",
        "listener",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
        "Lkotlin/ParameterName;",
        "name",
        "dayCell",
        "",
        "getListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "months",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;",
        "scrollChangeObservable",
        "Lio/reactivex/Observable;",
        "getScrollChangeObservable",
        "()Lio/reactivex/Observable;",
        "scrollPositionChange",
        "Lio/reactivex/subjects/ReplaySubject;",
        "kotlin.jvm.PlatformType",
        "configure",
        "configureRecycler",
        "getCurrentItemPosition",
        "",
        "scrollToSelectedMonth",
        "selectedIndex",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

.field private configuration:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

.field private listener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final months:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;",
            ">;"
        }
    .end annotation
.end field

.field private final scrollPositionChange:Lio/reactivex/subjects/ReplaySubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/ReplaySubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$Companion;

    .line 211
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributeSet"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->months:Ljava/util/List;

    const/4 p1, 0x1

    .line 37
    invoke-static {p1}, Lio/reactivex/subjects/ReplaySubject;->createWithSize(I)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p1

    const-string p2, "createWithSize<MonthCell>(1)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->scrollPositionChange:Lio/reactivex/subjects/ReplaySubject;

    .line 51
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;
    .locals 0

    .line 30
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    return-object p0
.end method

.method public static final synthetic access$getCurrentItemPosition(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)I
    .locals 0

    .line 30
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->getCurrentItemPosition()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMonths$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)Ljava/util/List;
    .locals 0

    .line 30
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->months:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getScrollPositionChange$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)Lio/reactivex/subjects/ReplaySubject;
    .locals 0

    .line 30
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->scrollPositionChange:Lio/reactivex/subjects/ReplaySubject;

    return-object p0
.end method

.method private final configureRecycler()V
    .locals 2

    .line 190
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 191
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 192
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 193
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 194
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->months:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->setItemViewCacheSize(I)V

    return-void
.end method

.method private final getCurrentItemPosition()I
    .locals 2

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 60
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    return v0
.end method

.method public static synthetic lambda$k__2qU8xJ66veLkTgHJzyzVmDMQ(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;I)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->scrollToSelectedMonth$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;I)V

    return-void
.end method

.method private final scrollToSelectedMonth(I)V
    .locals 1

    .line 199
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/-$$Lambda$CalendarView$k__2qU8xJ66veLkTgHJzyzVmDMQ;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/-$$Lambda$CalendarView$k__2qU8xJ66veLkTgHJzyzVmDMQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;I)V

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final scrollToSelectedMonth$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;I)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->months:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 201
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->TAG:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Scrolling to position "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPositionWithOffset(II)V

    .line 204
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 205
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->scrollPositionChange:Lio/reactivex/subjects/ReplaySubject;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->getCurrentItem(I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public final configure(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;)V
    .locals 34

    move-object/from16 v0, p0

    const-string v1, "configuration"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->months:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 69
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getStartDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 70
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getStartDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 72
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getEndDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 73
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getEndDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 75
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getCurrentDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 76
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getCurrentDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 79
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getStartDate()Ljava/util/Calendar;

    move-result-object v1

    .line 80
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getEndDate()Ljava/util/Calendar;

    move-result-object v3

    invoke-static {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->month(Ljava/util/Calendar;)I

    move-result v3

    .line 81
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getEndDate()Ljava/util/Calendar;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v7, 0x0

    .line 82
    :goto_0
    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->month(Ljava/util/Calendar;)I

    move-result v8

    if-le v8, v3, :cond_0

    .line 83
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v8

    if-ge v8, v4, :cond_e

    .line 84
    :cond_0
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v8

    add-int/lit8 v9, v4, 0x1

    if-ge v8, v9, :cond_e

    .line 86
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getLocale()Ljava/util/Locale;

    move-result-object v9

    invoke-static {v8, v9}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v8

    .line 88
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v14

    .line 89
    invoke-virtual {v8, v14}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v9, 0x4

    .line 92
    invoke-virtual {v8, v9}, Ljava/util/Calendar;->get(I)I

    move-result v10

    const/4 v15, 0x2

    .line 93
    invoke-virtual {v8, v15, v5}, Ljava/util/Calendar;->add(II)V

    const/4 v11, -0x1

    const/4 v12, 0x5

    .line 94
    invoke-virtual {v8, v12, v11}, Ljava/util/Calendar;->add(II)V

    .line 95
    invoke-virtual {v8, v9}, Ljava/util/Calendar;->get(I)I

    move-result v11

    .line 97
    invoke-virtual {v8, v12, v5}, Ljava/util/Calendar;->set(II)V

    sub-int/2addr v11, v10

    add-int/2addr v11, v5

    .line 102
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object v13, v10

    check-cast v13, Ljava/util/List;

    if-lez v11, :cond_c

    const/4 v10, 0x0

    :goto_1
    add-int/2addr v10, v5

    .line 107
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v6, v16

    check-cast v6, Ljava/util/List;

    const/4 v15, 0x7

    .line 109
    invoke-virtual {v8, v15}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 112
    invoke-virtual {v8}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v17

    sub-int v17, v17, v9

    .line 114
    invoke-virtual {v8}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v12

    if-ne v12, v5, :cond_1

    add-int/lit8 v17, v17, 0x1

    :cond_1
    const/4 v12, 0x0

    if-gtz v17, :cond_3

    :cond_2
    add-int/lit8 v17, v17, 0x1

    .line 119
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-lez v17, :cond_2

    :cond_3
    const-string v12, "currentMonthCalendar.time"

    if-gt v9, v15, :cond_9

    :goto_2
    add-int/2addr v9, v5

    const/4 v5, 0x5

    .line 124
    invoke-virtual {v8, v5}, Ljava/util/Calendar;->get(I)I

    move-result v15

    invoke-virtual {v8, v5}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v2

    if-ne v15, v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    const-string v5, "currentMonthCalendar"

    .line 126
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getCurrentDate()Ljava/util/Calendar;

    move-result-object v5

    invoke-static {v8, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result v24

    .line 127
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    const-string v15, "getInstance()"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result v25

    .line 129
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getFilledDates()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v15

    invoke-interface {v5, v15}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-interface {v5}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v15

    move/from16 v33, v3

    move-object v3, v15

    check-cast v3, Ljava/util/Calendar;

    .line 130
    invoke-static {v8, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v3, v33

    goto :goto_4

    :cond_6
    move/from16 v33, v3

    const/4 v15, 0x0

    :goto_5
    if-eqz v15, :cond_7

    const/16 v31, 0x1

    goto :goto_6

    :cond_7
    const/16 v31, 0x0

    .line 132
    :goto_6
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;

    const/4 v5, 0x7

    .line 135
    invoke-virtual {v8, v5}, Ljava/util/Calendar;->get(I)I

    move-result v26

    .line 136
    invoke-static {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dayOfMonth(Ljava/util/Calendar;)I

    move-result v27

    .line 137
    invoke-static {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->month(Ljava/util/Calendar;)I

    move-result v28

    .line 138
    invoke-static {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->year(Ljava/util/Calendar;)I

    move-result v29

    .line 139
    invoke-virtual {v8}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    invoke-static {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dayOfMonth(Ljava/util/Calendar;)I

    move-result v15

    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v32

    move-object/from16 v23, v3

    move-object/from16 v30, v5

    .line 132
    invoke-direct/range {v23 .. v32}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;-><init>(ZZIIIILjava/util/Date;ZLjava/lang/String;)V

    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v2, :cond_a

    const/4 v2, 0x5

    const/4 v3, 0x1

    .line 144
    invoke-virtual {v8, v2, v3}, Ljava/util/Calendar;->add(II)V

    const/4 v5, 0x7

    if-le v9, v5, :cond_8

    goto :goto_7

    :cond_8
    move-object/from16 v2, p1

    move/from16 v3, v33

    const/4 v5, 0x1

    const/4 v15, 0x7

    goto/16 :goto_2

    :cond_9
    move/from16 v33, v3

    :cond_a
    const/4 v2, 0x5

    const/4 v3, 0x1

    .line 149
    :goto_7
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;

    const/4 v9, 0x4

    invoke-virtual {v8, v9}, Ljava/util/Calendar;->get(I)I

    move-result v18

    const/4 v15, 0x3

    invoke-virtual {v8, v15}, Ljava/util/Calendar;->get(I)I

    move-result v19

    .line 150
    invoke-virtual {v8, v3}, Ljava/util/Calendar;->get(I)I

    move-result v20

    invoke-virtual {v8}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v5

    move-object/from16 v21, v3

    move-object/from16 v22, v6

    .line 149
    invoke-direct/range {v17 .. v22}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;-><init>(IIILjava/util/Date;Ljava/util/List;)V

    .line 151
    invoke-interface {v13, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-lt v10, v11, :cond_b

    goto :goto_8

    :cond_b
    move-object/from16 v2, p1

    move/from16 v3, v33

    const/4 v5, 0x1

    const/4 v12, 0x5

    const/4 v15, 0x2

    goto/16 :goto_1

    :cond_c
    move/from16 v33, v3

    .line 154
    :goto_8
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getCurrentDate()Ljava/util/Calendar;

    move-result-object v2

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isSameMonth(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result v11

    .line 157
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->months:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    .line 159
    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->month(Ljava/util/Calendar;)I

    move-result v12

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const-string v3, "currentMonthTime"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getMonthNameFormat()Ljava/text/DateFormat;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v15

    move-object v9, v2

    move-object v3, v13

    move v13, v5

    const/4 v5, 0x2

    move-object/from16 v16, v3

    .line 157
    invoke-direct/range {v9 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;-><init>(IZIILjava/util/Date;Ljava/lang/String;Ljava/util/List;)V

    .line 161
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;->isCurrentMonth()Z

    move-result v3

    if-eqz v3, :cond_d

    .line 162
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;->getIndex()I

    move-result v7

    .line 165
    :cond_d
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->months:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    .line 167
    invoke-virtual {v1, v5, v2}, Ljava/util/Calendar;->add(II)V

    move-object/from16 v2, p1

    move/from16 v3, v33

    const/4 v5, 0x1

    goto/16 :goto_0

    .line 170
    :cond_e
    invoke-direct/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->configureRecycler()V

    .line 171
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->listener:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_f

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->setListener(Lkotlin/jvm/functions/Function1;)V

    .line 172
    :cond_f
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->months:Ljava/util/List;

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->setData(Ljava/util/List;)V

    .line 174
    invoke-direct {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->scrollToSelectedMonth(I)V

    .line 176
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;

    invoke-direct {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method public final getDayInWeekLabels()[Ljava/lang/String;
    .locals 2

    .line 48
    new-instance v0, Ljava/text/DateFormatSymbols;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->configuration:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    if-eqz v1, :cond_1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;->getLocale()Ljava/util/Locale;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    :goto_0
    invoke-direct {v0, v1}, Ljava/text/DateFormatSymbols;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v0}, Ljava/text/DateFormatSymbols;->getWeekdays()[Ljava/lang/String;

    move-result-object v0

    const-string v1, "DateFormatSymbols(if (configuration != null) configuration?.locale else Locale.getDefault()).weekdays"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->listener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getScrollChangeObservable()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->scrollPositionChange:Lio/reactivex/subjects/ReplaySubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final setListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 45
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->listener:Lkotlin/jvm/functions/Function1;

    return-void
.end method
