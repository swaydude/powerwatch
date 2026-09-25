.class final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$2;
.super Lkotlin/jvm/internal/Lambda;
.source "CalendarFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 94
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$2;->invoke(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 97
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->getDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 98
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->getDate()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 99
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->access$getCalendarViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object p1

    const-string v1, "calendar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->onRightButtonClicked(Ljava/util/Calendar;)V

    :cond_0
    return-void
.end method
