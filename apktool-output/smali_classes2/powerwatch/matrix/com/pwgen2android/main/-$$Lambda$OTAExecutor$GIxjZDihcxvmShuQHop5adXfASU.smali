.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$GIxjZDihcxvmShuQHop5adXfASU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$GIxjZDihcxvmShuQHop5adXfASU;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$GIxjZDihcxvmShuQHop5adXfASU;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->lambda$GIxjZDihcxvmShuQHop5adXfASU(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method
