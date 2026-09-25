.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$qCMTjxNbT_2sklQaZCvG0-gWJnM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$qCMTjxNbT_2sklQaZCvG0-gWJnM;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$qCMTjxNbT_2sklQaZCvG0-gWJnM;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->lambda$qCMTjxNbT_2sklQaZCvG0-gWJnM(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    move-result-object p1

    return-object p1
.end method
