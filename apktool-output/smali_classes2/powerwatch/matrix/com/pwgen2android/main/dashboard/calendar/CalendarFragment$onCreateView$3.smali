.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "CalendarFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3",
        "Landroidx/databinding/Observable$OnPropertyChangedCallback;",
        "onPropertyChanged",
        "",
        "sender",
        "Landroidx/databinding/Observable;",
        "propertyId",
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
.field final synthetic $calendarView:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

.field final synthetic $rootView:Landroid/view/View;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;->$calendarView:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;->$rootView:Landroid/view/View;

    .line 106
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 1

    .line 108
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->getConfig()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 109
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;->$calendarView:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;->configure(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;)V

    .line 110
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;->$calendarView:Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;

    const-string v0, "calendarView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$onCreateView$3;->$rootView:Landroid/view/View;

    invoke-static {p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->access$fillInWeekDays(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarView;Landroid/view/View;)V

    return-void
.end method
