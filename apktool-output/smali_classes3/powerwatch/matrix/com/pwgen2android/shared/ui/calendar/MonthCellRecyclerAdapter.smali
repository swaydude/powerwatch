.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "CalendarView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\r2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005J)\u0010\u001a\u001a\u00020\r2!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r0\u0008R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;",
        "()V",
        "items",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;",
        "listener",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
        "Lkotlin/ParameterName;",
        "name",
        "dayCell",
        "",
        "getCurrentItem",
        "currentItemPosition",
        "",
        "getItemCount",
        "onBindViewHolder",
        "holder",
        "position",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "setData",
        "setListener",
        "MonthCellViewHolder",
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
.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;",
            ">;"
        }
    .end annotation
.end field

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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 216
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 218
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->items:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getCurrentItem(I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;
    .locals 1

    .line 245
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 238
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 216
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->onBindViewHolder(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->bind(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 216
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 235
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;

    const-string v1, "inflater"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0b0029

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v1, "inflater.inflate(R.layout.calendar_month_cell, parent, false)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->listener:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, p2, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;-><init>(Landroid/view/LayoutInflater;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 228
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->items:Ljava/util/List;

    .line 229
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final setListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
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

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;->listener:Lkotlin/jvm/functions/Function1;

    return-void
.end method
