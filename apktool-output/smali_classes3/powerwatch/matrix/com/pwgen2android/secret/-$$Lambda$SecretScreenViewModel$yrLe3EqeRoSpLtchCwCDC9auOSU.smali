.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$yrLe3EqeRoSpLtchCwCDC9auOSU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;

.field public final synthetic f$1:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$yrLe3EqeRoSpLtchCwCDC9auOSU;->f$0:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$yrLe3EqeRoSpLtchCwCDC9auOSU;->f$1:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$yrLe3EqeRoSpLtchCwCDC9auOSU;->f$0:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$yrLe3EqeRoSpLtchCwCDC9auOSU;->f$1:Landroid/view/View;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->lambda$yrLe3EqeRoSpLtchCwCDC9auOSU(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
