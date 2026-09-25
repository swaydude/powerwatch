.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$lfjWNb5Lx8yrUF19nqbZJvlC0xk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$lfjWNb5Lx8yrUF19nqbZJvlC0xk;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$lfjWNb5Lx8yrUF19nqbZJvlC0xk;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->lambda$lfjWNb5Lx8yrUF19nqbZJvlC0xk(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
