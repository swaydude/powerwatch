.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "CalendarView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->configure(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1",
        "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;",
        "onScrollStateChanged",
        "",
        "recyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "newState",
        "",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    .line 176
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->access$getMonths$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 179
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 180
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->access$getCurrentItemPosition(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)I

    move-result p1

    .line 181
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->access$getAdapter$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->getItemCount()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    if-ge p1, p2, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 182
    :cond_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->access$getScrollPositionChange$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView$configure$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->access$getAdapter$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->getCurrentItem(I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
