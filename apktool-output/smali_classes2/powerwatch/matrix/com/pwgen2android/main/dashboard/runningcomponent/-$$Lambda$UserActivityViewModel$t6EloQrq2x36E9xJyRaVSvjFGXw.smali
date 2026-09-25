.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$UserActivityViewModel$t6EloQrq2x36E9xJyRaVSvjFGXw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$UserActivityViewModel$t6EloQrq2x36E9xJyRaVSvjFGXw;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/-$$Lambda$UserActivityViewModel$t6EloQrq2x36E9xJyRaVSvjFGXw;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    check-cast p1, Ljava/util/Calendar;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->lambda$t6EloQrq2x36E9xJyRaVSvjFGXw(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;Ljava/util/Calendar;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
