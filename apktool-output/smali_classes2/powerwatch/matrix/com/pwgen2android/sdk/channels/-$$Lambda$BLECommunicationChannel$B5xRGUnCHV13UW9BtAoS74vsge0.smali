.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$B5xRGUnCHV13UW9BtAoS74vsge0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$B5xRGUnCHV13UW9BtAoS74vsge0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$B5xRGUnCHV13UW9BtAoS74vsge0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;

    check-cast p1, Lkotlin/Unit;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->lambda$B5xRGUnCHV13UW9BtAoS74vsge0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
