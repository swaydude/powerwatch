.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$ATPdFFxm-EzG0Ds8-QNI6pHj3Ls;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$ATPdFFxm-EzG0Ds8-QNI6pHj3Ls;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$ATPdFFxm-EzG0Ds8-QNI6pHj3Ls;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->lambda$ATPdFFxm-EzG0Ds8-QNI6pHj3Ls(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
