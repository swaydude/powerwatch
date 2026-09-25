.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$yjroOViThYJKaMTLIV_D9ABwmyw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$yjroOViThYJKaMTLIV_D9ABwmyw;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$yjroOViThYJKaMTLIV_D9ABwmyw;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->lambda$yjroOViThYJKaMTLIV_D9ABwmyw(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
