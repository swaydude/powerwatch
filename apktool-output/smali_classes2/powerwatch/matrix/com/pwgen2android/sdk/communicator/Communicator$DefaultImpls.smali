.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator$DefaultImpls;
.super Ljava/lang/Object;
.source "Communicator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic startScanning$default(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Ljava/util/List;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 48
    :cond_0
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->startScanning(Ljava/util/List;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: startScanning"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
