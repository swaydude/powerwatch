.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$gqs4V9xus_Bm7Uk-0UBPcG5vreo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$gqs4V9xus_Bm7Uk-0UBPcG5vreo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/-$$Lambda$Gen2AlertsCommunicator$gqs4V9xus_Bm7Uk-0UBPcG5vreo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;->lambda$gqs4V9xus_Bm7Uk-0UBPcG5vreo(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;Lkotlin/Pair;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
