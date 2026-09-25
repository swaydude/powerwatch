.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$nlXuup3rOqiQaI1w2gkUSSx-v8Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$nlXuup3rOqiQaI1w2gkUSSx-v8Y;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/-$$Lambda$CalendarViewModel$nlXuup3rOqiQaI1w2gkUSSx-v8Y;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;->lambda$nlXuup3rOqiQaI1w2gkUSSx-v8Y(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarViewModel;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/CalendarConfiguration;

    move-result-object p1

    return-object p1
.end method
