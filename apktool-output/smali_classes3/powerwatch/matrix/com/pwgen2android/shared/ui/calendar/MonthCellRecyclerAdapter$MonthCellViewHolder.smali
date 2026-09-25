.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "CalendarView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MonthCellViewHolder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarView.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,357:1\n1849#2:358\n1849#2,2:359\n1850#2:361\n*S KotlinDebug\n*F\n+ 1 CalendarView.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder\n*L\n259#1:358\n263#1:359,2\n259#1:361\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "itemView",
        "Landroid/view/View;",
        "itemListener",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
        "Lkotlin/ParameterName;",
        "name",
        "dayCell",
        "",
        "(Landroid/view/LayoutInflater;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V",
        "weeksContainer",
        "Landroid/widget/LinearLayout;",
        "kotlin.jvm.PlatformType",
        "bind",
        "monthCell",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;",
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
.field private final inflater:Landroid/view/LayoutInflater;

.field private final itemListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final weeksContainer:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/LayoutInflater;",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 248
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->inflater:Landroid/view/LayoutInflater;

    .line 249
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->itemListener:Lkotlin/jvm/functions/Function1;

    .line 251
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->itemView:Landroid/view/View;

    const p2, 0x7f0800a0

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->weeksContainer:Landroid/widget/LinearLayout;

    return-void
.end method

.method private static final bind$lambda-2$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->itemListener:Lkotlin/jvm/functions/Function1;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public static synthetic lambda$ov_iCvQndF_oQdYjppmQCFgjOSE(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->bind$lambda-2$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final bind(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;)V
    .locals 10

    const-string v0, "monthCell"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 256
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->itemView:Landroid/view/View;

    const v2, 0x7f080176

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 257
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;->getLabel()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCell;->getWeeks()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 358
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;

    .line 261
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 263
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->getDays()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 359
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const v5, 0x7f0b0028

    const/4 v6, 0x0

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;

    .line 264
    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->inflater:Landroid/view/LayoutInflater;

    move-object v8, v2

    check-cast v8, Landroid/view/ViewGroup;

    invoke-virtual {v7, v5, v8, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    const v7, 0x7f080127

    .line 265
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f0800e2

    .line 266
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    if-eqz v4, :cond_3

    .line 268
    invoke-virtual {v8, v6}, Landroid/view/View;->setVisibility(I)V

    const v8, 0x7f0800e1

    .line 270
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 272
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->getLabel()Ljava/lang/String;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 273
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 275
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->getGoalAchieved()Z

    move-result v6

    if-eqz v6, :cond_0

    const v6, 0x7f070093

    .line 276
    invoke-static {v0, v6}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    :cond_0
    const v6, 0x7f070070

    .line 279
    invoke-static {v0, v6}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 282
    :goto_2
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday()Z

    move-result v6

    if-eqz v6, :cond_1

    const v6, 0x7f070071

    .line 283
    invoke-static {v0, v6}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    :cond_1
    const/4 v6, 0x0

    .line 285
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v6, 0x106000d

    .line 286
    invoke-static {v0, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 287
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isDayOfWeekend()Z

    move-result v6

    if-eqz v6, :cond_2

    const v6, 0x7f05008a

    .line 288
    invoke-static {v0, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_3

    :cond_2
    const v6, 0x7f050105

    .line 290
    invoke-static {v0, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 293
    :goto_3
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/-$$Lambda$MonthCellRecyclerAdapter$MonthCellViewHolder$ov_iCvQndF_oQdYjppmQCFgjOSE;

    invoke-direct {v6, p0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/-$$Lambda$MonthCellRecyclerAdapter$MonthCellViewHolder$ov_iCvQndF_oQdYjppmQCFgjOSE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_3
    const/4 v4, 0x4

    .line 297
    invoke-virtual {v8, v4}, Landroid/view/View;->setVisibility(I)V

    .line 300
    :goto_4
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_1

    .line 303
    :cond_4
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->getDays()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    rsub-int/lit8 v1, v1, 0x7

    const/4 v3, 0x1

    if-gt v3, v1, :cond_6

    :goto_5
    add-int/lit8 v4, v3, 0x1

    .line 304
    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->inflater:Landroid/view/LayoutInflater;

    move-object v8, v2

    check-cast v8, Landroid/view/ViewGroup;

    invoke-virtual {v7, v5, v8, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    if-ne v3, v1, :cond_5

    goto :goto_6

    :cond_5
    move v3, v4

    goto :goto_5

    .line 306
    :cond_6
    :goto_6
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/MonthCellRecyclerAdapter$MonthCellViewHolder;->weeksContainer:Landroid/widget/LinearLayout;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_7
    return-void
.end method
