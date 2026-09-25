.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$QXfUigi9C2_o_jEIHy4VijN7TJ8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$QXfUigi9C2_o_jEIHy4VijN7TJ8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$QXfUigi9C2_o_jEIHy4VijN7TJ8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->lambda$QXfUigi9C2_o_jEIHy4VijN7TJ8(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-result-object p1

    return-object p1
.end method
